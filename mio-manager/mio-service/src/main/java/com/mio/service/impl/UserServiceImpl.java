package com.mio.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mio.global.CommonResultUtil;
import com.mio.global.Config;
import com.mio.mapper.MioLeftListMapper;
import com.mio.mapper.MioLeftListMapperCustom;
import com.mio.mapper.TbContentCategoryMapper;
import com.mio.pojo.MioLeftList;
import com.mio.pojo.MioLeftListExample;
import com.mio.pojo.vo.MioLeftListCustom;
import com.mio.pojo.vo.MioLeftListQueryVo;
import com.mio.result.ResultUtil;
import com.mio.service.UserService;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private MioLeftListMapper mioLeftListMapper;
    @Autowired
    private MioLeftListMapperCustom mioLeftListMapperCustom;
    @Autowired
    private TbContentCategoryMapper tbContentCategoryMapper;

    /*treetable*/
    /*树形节点表格分页及查询条件*/
    public EUDataGridResult findTableList(MioLeftListQueryVo mioLeftListQueryVo, int pageIndex, int pageSize) throws Exception {
        /*起始页，显示条数*/
        PageHelper.startPage(pageIndex + 1, pageSize);
        MioLeftListCustom mioLeftListCustom = new MioLeftListCustom();

        List<MioLeftListCustom> list = mioLeftListMapperCustom.selectTableList(mioLeftListQueryVo);
        EUDataGridResult result = new EUDataGridResult();
        result.setData(list);
        /*分页处理*/
        PageInfo<MioLeftListCustom> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    /*单个删除 删除前需验证用户是否存在*/
    public void delRow(Long id) throws Exception {
        /*根据主键查询*/
        MioLeftList mioLeftList = mioLeftListMapper.selectByPrimaryKey(id);
        /*删除前判断用户是否存在*/
        if (mioLeftList == null) {
            /*不存在抛出异常*/
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 212, null));
            
        }
        /*存在删除用户，根据主键删除*/
        mioLeftListMapper.deleteByPrimaryKey(id);
    }

    /*批量单个删除*/
    public void delRows(List<Long> ids) throws Exception {
        MioLeftListExample mioLeftListExample = new MioLeftListExample();
        MioLeftListExample.Criteria criteria = mioLeftListExample.createCriteria();
        criteria.andIdIn(ids);
        mioLeftListMapper.deleteByExample(mioLeftListExample);
    }

    /*查询某个用户信息*/
    public MioLeftListCustom findTreeId(MioLeftListQueryVo mioLeftListQueryVo) throws Exception {
        List<MioLeftListCustom> list = mioLeftListMapperCustom.selectTableList(mioLeftListQueryVo);
        /*账号不允许重复*/
        if (list != null && list.size() == 1) {
            /*返回一个用户*/
            return list.get(0);
        }
        return null;
    }

    /*修改用户提交*/
    public void updateTreeById(MioLeftListCustom mioLeftListCustom) throws Exception {
        MioLeftList mioLeftList = mioLeftListMapper.selectByPrimaryKey(mioLeftListCustom.getId());

        mioLeftList.setName(mioLeftListCustom.getName());
        mioLeftList.setStatus(mioLeftListCustom.getStatus());
        mioLeftList.setUrl(mioLeftListCustom.getUrl());

        mioLeftListMapper.updateByPrimaryKey(mioLeftList);
    }

    public void updateTreesnew(MioLeftListCustom mioLeftListCustom) throws Exception {
        mioLeftListMapperCustom.updateTree(mioLeftListCustom);
    }

    public void updateTrees(MioLeftList mioLeftList) throws Exception {
        mioLeftListMapper.updateByPrimaryKey(mioLeftList);
    }

    public void insertTree(MioLeftList mioLeftList) throws Exception {
        mioLeftListMapper.insert(mioLeftList);
    }

    /*树形节点*/
    public List<EUTreeNode> getCategoryList(Long parentId) throws Exception {
        /*根据父节点查询子节点*/
//		MioLeftListExample example = new MioLeftListExample();
//		MioLeftListExample.Criteria criteria = example.createCriteria();
//		criteria.andParentIdEqualTo(parentId);
//		List<MioLeftList> list = mioLeftListMapper.selectByExample(example);

        List<MioLeftListCustom> list = mioLeftListMapperCustom.selectTree(parentId);

        List<EUTreeNode> resultList = new ArrayList<>();

        for (MioLeftListCustom mioLeftListCustom : list) {
            //创建一个节点
            EUTreeNode node = new EUTreeNode();
            node.setId(mioLeftListCustom.getId());
            node.setText(mioLeftListCustom.getName());
            /*是否为父节点*/
            node.setIsLeaf(mioLeftListCustom.getIsParent());
            /*是否展开,懒加载设置默认值就行*/
            node.setExpanded("true");
            node.setAttributes(mioLeftListCustom.getUrl());
            resultList.add(node);
        }
        return resultList;
    }


    public List<MioLeftListCustom> findTreeExp(MioLeftListQueryVo mioLeftListQueryVo)
            throws Exception {
        return mioLeftListMapperCustom.selectTableListExp(mioLeftListQueryVo);
    }


}
