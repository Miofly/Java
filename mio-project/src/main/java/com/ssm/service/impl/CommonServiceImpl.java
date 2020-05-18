package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mio.pojo.MioTreeList;
import com.mio.pojo.MioTreeListExample;
import com.mio.pojo.vo.*;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;
import com.mio.util.JsonUtils;
import com.ssm.mapper.InfoMapperCustom;
import com.ssm.mapper.MioTreeListMapper;
import com.ssm.mapper.MioTreeListMapperCustom;
import com.ssm.service.CommonService;
import com.ssm.service.JedisClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private MioTreeListMapper mioTreeListMapper;
    @Autowired
    private MioTreeListMapperCustom mioTreeListMapperCustom;
    @Autowired
    private JedisClient jedisClient;
    @Autowired
    private InfoMapperCustom infoMapperCustom;

    @Value("${INDEX_CONTENT_REDIS_KEY}")
    private String INDEX_CONTENT_REDIS_KEY;

    @Value("${SSYTH}")
    private String SSYTH;

    /*传入sql字符串*/
    public List<Map<String, Object>> superManagerSelect(String value) throws Exception {
        return mioTreeListMapperCustom.selectPublicItemList(value);
    }

    /*树形列表mysql 逆向工程单表查询*/
    public List<EUTreeNode> getTreeList(Long parentId) throws Exception {

        MioTreeListExample example = new MioTreeListExample();
        MioTreeListExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<MioTreeList> list = mioTreeListMapper.selectByExample(example);

        List<EUTreeNode> resultList = new ArrayList<>();
        for (MioTreeList mioTreeList : list) {
            //创建一个节点
            EUTreeNode node = new EUTreeNode();
            node.setId(mioTreeList.getId());
            node.setText(mioTreeList.getName());
            /*是否为父节点*/
            node.setIsLeaf(mioTreeList.getIsParent() ? "false" : "true");
            /*是否展开,懒加载设置默认值就行*/
            node.setExpanded("true");
            /*地址*/
            node.setAttributes(mioTreeList.getAttribute());
            resultList.add(node);
        }
        return resultList;
    }

    /*表格 逆向工程单表查询*/
    public EUDataGridResult queryTableList(int pageIndex, int pageSize) throws Exception {
        /*起始页，显示条数*/
        PageHelper.startPage(pageIndex + 1, pageSize);

        MioTreeListExample example = new MioTreeListExample();
        List<MioTreeList> list = mioTreeListMapper.selectByExample(example);

        EUDataGridResult result = new EUDataGridResult();
        result.setData(list);
        /*分页处理*/
        PageInfo<MioTreeList> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    /*表格 逆向工程单表查询*/
    public EUDataGridResult queryTableLists(MioTreeListQueryVo mioTreeListQueryVo, int pageIndex, int pageSize) throws Exception {
        /*起始页，显示条数*/
        PageHelper.startPage(pageIndex + 1, pageSize);
        MioTreeListCustom mioTreeListCustom = new MioTreeListCustom();
        List<MioTreeListCustom> list = mioTreeListMapperCustom.selectTreeTable(mioTreeListQueryVo);


        EUDataGridResult result = new EUDataGridResult();
        result.setData(list);
        /*分页处理*/
        PageInfo<MioTreeListCustom> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }


    public List<MioTreeList> getTreeListtest(Long parentId) throws Exception {
//从缓存中取内容
        try {
            String result = jedisClient.hget(INDEX_CONTENT_REDIS_KEY, parentId + "");
            if (!StringUtils.isBlank(result)) {
                //把字符串转换成list
                List<MioTreeList> resultList = JsonUtils.jsonToList(result, MioTreeList.class);
                return resultList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        MioTreeListExample example = new MioTreeListExample();
        MioTreeListExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<MioTreeList> list = mioTreeListMapper.selectByExample(example);
//向缓存中添加内容
        try {
            //把list转换成字符串
            String cacheString = JsonUtils.objectToJson(list);
            jedisClient.hset(INDEX_CONTENT_REDIS_KEY, parentId + "", cacheString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<InfoCustom> selectInfo(InfoQueryVo infoQueryVo) throws Exception {
        return infoMapperCustom.selectInfo(infoQueryVo);
    }

    public List<InfosCustom> selectInfos(InfosQueryVo infosQueryVo) throws Exception {

        try {
            String result = jedisClient.hget(INDEX_CONTENT_REDIS_KEY, infosQueryVo + "");
            if (!StringUtils.isBlank(result)) {
                //把字符串转换成list
                List<InfosCustom> resultList = JsonUtils.jsonToList(result, InfosCustom.class);
                return resultList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<InfosCustom> list = infoMapperCustom.selectInfos(infosQueryVo);

        try {
            //把list转换成字符串
            String cacheString = JsonUtils.objectToJson(list);
            jedisClient.hset(INDEX_CONTENT_REDIS_KEY, infosQueryVo + "", cacheString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<InfosCustom> selectInfoss(String departName) throws Exception {

        try {
            String result = jedisClient.hget(SSYTH, departName + "");
            if (!StringUtils.isBlank(result)) {
                //把字符串转换成list
                List<InfosCustom> resultList = JsonUtils.jsonToList(result, InfosCustom.class);
                return resultList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<InfosCustom> list = infoMapperCustom.selectInfoss(departName);

        try {
            //把list转换成字符串
            String cacheString = JsonUtils.objectToJson(list);
            jedisClient.hset(SSYTH, departName + "", cacheString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public EUDataGridResult selectInfosss(String departNames, int pageIndex, int pageSize) throws Exception {
        /*起始页，显示条数*/
        PageHelper.startPage(pageIndex + 1, pageSize);
        InfosCustom infosCustom = new InfosCustom();
        List<InfosCustom> list = infoMapperCustom.selectInfosss(departNames);

        EUDataGridResult result = new EUDataGridResult();
        result.setData(list);
        /*分页处理*/
        PageInfo<InfosCustom> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

}
