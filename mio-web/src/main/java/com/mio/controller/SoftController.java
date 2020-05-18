package com.mio.controller;

import com.mio.global.Config;
import com.mio.pojo.SoftwareBaseinfo;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.service.SoftService;
import com.mio.util.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sts")
public class SoftController {

    @Autowired
    private SoftService softService;

    @RequestMapping("/softs")
    @ResponseBody
    public EUDataGridResult selectSoftInfos(String type,int pageIndex, int pageSize) throws Exception{
        EUDataGridResult result = softService.selectSoftInfos(type, pageIndex, pageSize);
        return result;
    }

    @RequestMapping("/addSoft")
    public @ResponseBody
    SubmitResultInfo addSoft(SoftwareBaseinfo softwareBaseinfo)  throws Exception{
        softService.addSoft(softwareBaseinfo);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/addRel")
    public @ResponseBody
    SubmitResultInfo addSofts(String id,String type)  throws Exception{

        softService.addRel(Integer.parseInt(id),type);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/upSoft")
    public @ResponseBody
    SubmitResultInfo upSoft(SoftwareBaseinfo softwareBaseinfo)  throws Exception{

        softService.upSoft(softwareBaseinfo);

        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/queryByid")
    public  String queryById(Model model, String id)  throws Exception{

        SoftwareBaseinfo softwareBaseinfo = softService.queryById(Integer.parseInt(id));
        model.addAttribute("softwareBaseinfo",softwareBaseinfo);
        return  "/st/upSoft";
    }

    @RequestMapping("/upSoftRel")
    public @ResponseBody
    SubmitResultInfo upSoftRel(String id,String type)  throws Exception{
        softService.upSoftRel(Integer.parseInt(id),type);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/delSoft")
    public @ResponseBody
    SubmitResultInfo delSoft(String id)  throws Exception{
        softService.delSoft(Integer.parseInt(id));
        softService.delSoftRel(Integer.parseInt(id));
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }


    @RequestMapping("/tName")
    @ResponseBody
    public List<SoftwareTab> selectTypeName() throws Exception{
        return softService.selectTypeName();
    }

    @RequestMapping("/tNameA")
    @ResponseBody
    public List<SoftwareTab> selectTypeNames() throws Exception{
        return softService.selectTypeNameA();
    }

    @RequestMapping("/tNameB")
    @ResponseBody
    public List<SoftwareTab> selectTypeNameA(String tabCode) throws Exception{
        return softService.selectTypeNameB(tabCode);
    }

    @RequestMapping("/tNameC")
    @ResponseBody
    public List<SoftwareTab> selectTypeNameB(String tabCode) throws Exception{
        return softService.selectTypeNameC(tabCode);
    }


    @RequestMapping("/maxId")
    @ResponseBody
    public int selectMaxId() throws Exception{
        return softService.selectMaxId();
    }
}
