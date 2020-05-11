/*
package com.ssm.service.impl;

import java.util.List;

import com.mio.pojo.Ypxx;
import com.mio.util.poi.HxlsOptRowsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YpxxImportServiceImpl implements HxlsOptRowsInterface {

    @Autowired
    private YpxxMapper ypxxMapper;

    @Override
    public String optRows(int sheetIndex, int curRow, List<String> rowlist)
            throws Exception {
        try {
            //得到导入的数据
            //rowlist数据 是一行数据，按照模版解析
            String tabCode = rowlist.get(0);//通用名
            String tabName = rowlist.get(1);//剂型
            String tabOrder = rowlist.get(2);//规格
            String tabStatus = rowlist.get(3);//转换系数

            //进行校验
            //校验中标价格合法性
            //校验交易状态的合法性
            if(jyzt == null || (!jyzt.equals("1") && !jyzt.equals("2"))){
                return "交易状态输入值不对，请输入1：正常,2：暂停";
            }

            //添加唯一校验
            //校验通用名、剂型、规格、转换系数、生产企业、商品名
            //思路：根据通用名、剂型、规格、转换系数、生产企业、商品名，查询，如果查询到记录，说明 存在重复记录
            //.....

            Ypxx ypxx = new Ypxx();
            ypxx.setId(UUIDBuild.getUUID());
            ypxx.setMc(mc);
            ypxx.setJx(jx);
            ypxx.setGg(gg);
            ypxx.setZhxs(zhxs);
            ypxx.setScqymc(scqymc);
            ypxx.setSpmc(spmc);
            ypxx.setZbjg(Float.parseFloat(zbjg));
            ypxx.setJyzt(jyzt);
            //校验调用mapper
            ypxxMapper.insert(ypxx);
        } catch (Exception e) {
            e.printStackTrace();
            return "导入失败！";
        }
        return "success";
    }

}
*/
