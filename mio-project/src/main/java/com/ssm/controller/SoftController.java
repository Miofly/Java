package com.ssm.controller;

import com.google.gson.Gson;
import com.mio.global.Config;
import com.mio.pojo.CommonRegionIp;
import com.mio.pojo.SoftwareBaseinfo;
import com.mio.pojo.vo.Software;
import com.mio.result.ResultUtil;
import com.mio.result.SimpleResult;
import com.mio.result.SubmitResultInfo;
import com.mio.util.*;
import com.mio.util.poi.ExcelExportXSSF;
import com.ssm.pojo.SoftwareFilecheckinfo;
import com.ssm.pojo.SoftwareTab;
import com.ssm.service.SoftService;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sts")
public class SoftController {

    @Autowired
    private SoftService softService;

    @Value("${SOFT_DOWN_PATH}")
    private String SOFT_DOWN_PATH;

    @RequestMapping("/export")
    public @ResponseBody
    SubmitResultInfo export(HttpServletResponse response, String beginTime, String endTime, String tabName, String region) throws Exception {
        ExcelExportXSSF export = new ExcelExportXSSF();
        // 表格输出路径
        String filePath = SOFT_DOWN_PATH;

        // 导出文件的前缀
        String filePrefix = "软件详情";
        // 文件完整名称加上日期
        String filename = filePrefix + "_" + DateUtil.getCurrentDatess() + ".xlsx";
        // tomcat虚拟路径
        String fileWebPath = "/upload/";
        // 输出的文件地址及名称
        OutputStream out = new FileOutputStream(filePath + filename);

        // 创建workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // 首个sheet页
        // sheet表中的标题行内容
        String[] customName = {"软件类别", "下载数量"};
        // 数据库映射字段
        String[] pojoName = {"tabName", "sl"};
        // list数据集合
        List<Software> list = softService.selectStDownSl(beginTime, endTime, tabName, region);

        // 第二个sheet页
        String[] customName1 = {"时间", "下载数量"};
        String[] pojoName1 = {"time", "sl"};
        List<Software> list1 = softService.selectStQsu(beginTime, endTime, tabName, region);

        // 第三个sheet页
        String[] customName2 = {"软件名称", "下载数量"};
        String[] pojoName2 = {"softName", "sl"};
        List<Software> list2 = softService.selectStRanksdc(beginTime, endTime, tabName, region);

        //第一个表格内容
        export.exportExcel(workbook, 0, "软件下载统计",
                list, pojoName, customName, out);
        // 第二个表格内容
        export.exportExcel(workbook, 1, "下载趋势",
                list1, pojoName1, customName1, out);
        // 第三个表格内容
        export.exportExcel(workbook, 2, "下载排行TOP10",
                list2, pojoName2, customName2, out);
        // 将所有的数据一起写入，然后再关闭输入流。
        workbook.write(out);
        out.flush();
        out.close();
        /*提供下载*/
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
                Config.MESSAGE, 312, new Object[]{
//                        list.size(),
                        fileWebPath + filename//下载地址
                }));
    }

    @RequestMapping(value = "/softs")
    @ResponseBody
    public EUDataGridResult selectSoftInfos(String type, int pageIndex, int pageSize) throws Exception {
        EUDataGridResult result = softService.selectSoftInfos(type, pageIndex, pageSize);
        return result;
    }

    @RequestMapping(value = "/mytestpost", method = RequestMethod.POST)
    @ResponseBody
    public EUDataGridResult selectSoftInfoss(String type, int pageIndex, int pageSize) throws Exception {
        EUDataGridResult result = softService.selectSoftInfos(type, pageIndex, pageSize);
        return result;
    }

    @RequestMapping("/addSoft")
    public @ResponseBody
    SubmitResultInfo addSoft(SoftwareBaseinfo softwareBaseinfo) throws Exception {
        softService.addSoft(softwareBaseinfo);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/addRel")
    public @ResponseBody
    SubmitResultInfo addSofts(String id, String type) throws Exception {

        softService.addRel(Integer.parseInt(id), type);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/upSoft")
    public @ResponseBody
    SubmitResultInfo upSoft(SoftwareBaseinfo softwareBaseinfo) throws Exception {

        softService.upSoft(softwareBaseinfo);

        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/queryByid")
    public String queryById(Model model, String id) throws Exception {

        SoftwareBaseinfo softwareBaseinfo = softService.queryById(Integer.parseInt(id));
        model.addAttribute("softwareBaseinfo", softwareBaseinfo);
        return "/st/upSoft";
    }

    @RequestMapping("/upSoftRel")
    public @ResponseBody
    SubmitResultInfo upSoftRel(String id, String type) throws Exception {
        softService.upSoftRel(Integer.parseInt(id), type);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/delSoft")
    public @ResponseBody
    SubmitResultInfo delSoft(String id) throws Exception {
        softService.delSoft(Integer.parseInt(id));
        softService.delSoftRel(Integer.parseInt(id));
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }


    @RequestMapping("/tName")
    @ResponseBody
    public List<SoftwareTab> selectTypeName() throws Exception {
        return softService.selectTypeName();
    }

    @RequestMapping("/tNames")
    @ResponseBody
    public SimpleResult selectTypeNamess() throws Exception {
        return softService.selectTypeNames();
    }

    @RequestMapping("/tNameA")
    @ResponseBody
    public List<SoftwareTab> selectTypeNames() throws Exception {
        return softService.selectTypeNameA();
    }

    @RequestMapping("/tNameB")
    @ResponseBody
    public List<SoftwareTab> selectTypeNameA(String tabCode) throws Exception {
        return softService.selectTypeNameB(tabCode);
    }

    @RequestMapping("/tNameC")
    @ResponseBody
    public List<SoftwareTab> selectTypeNameB(String tabCode) throws Exception {
        return softService.selectTypeNameC(tabCode);
    }


    @RequestMapping("/maxId")
    @ResponseBody
    public int selectMaxId() throws Exception {
        return softService.selectMaxId();
    }

    @RequestMapping("/rank")
    @ResponseBody
    public List<Map<String, Long>> selectStRank(String beginTime, String endTime, String tabName, String region) throws Exception {
        List<Map<String, Long>> result = softService.selectStRank(beginTime, endTime, tabName, region);
        return result;
    }

    @RequestMapping("/ranks")
    @ResponseBody
    public List<Software> selectStRanks(String beginTime, String endTime, String tabName, String region) throws Exception {
        List<Software> result = softService.selectStRanks(beginTime, endTime, tabName, region);
        return result;
    }


    @RequestMapping("/down")
    @ResponseBody
    public List<Software> selectStDownSl(String beginTime, String endTime, String tabName, String region) throws Exception {
        List<Software> result = softService.selectStDownSl(beginTime, endTime, tabName, region);
        return result;
    }

    @RequestMapping("/qst")
    @ResponseBody
    public List<Software> selectStQsu(String beginTime, String endTime, String tabName, String region) throws Exception {
        List<Software> result = softService.selectStQsu(beginTime, endTime, tabName, region);
        return result;
    }

    /*地市类型*/
    @RequestMapping("/dslx")
    @ResponseBody
    public List<CommonRegionIp> selectAll() throws Exception {
        List<CommonRegionIp> result = softService.selectAll();
        return result;
    }

    /*两个接口*/
    @RequestMapping("/regedit")
    @ResponseBody
    public SimpleResult selectRegedit() throws Exception {
        return softService.selectRegedit();
    }

    @RequestMapping("/rtDetail")
    @ResponseBody
    public SimpleResult selectRegeditDetail(Integer stepId) throws Exception {
        return softService.selectRegeditDetail(stepId);
    }

    @RequestMapping("/fileinfolog")
    @ResponseBody
    public SubmitResultInfo insertSoftInfos(SoftwareFilecheckinfo softwareFilecheckinfo) throws Exception {
        softService.insertSoftInfos(softwareFilecheckinfo);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/sort")
    @ResponseBody
    public SubmitResultInfo addSort(SoftwareTab softwareTab) throws Exception {
//    public SubmitResultInfo addSort(String name, String desc, String order) throws Exception {
        softService.addSort(softwareTab);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/tab")
    @ResponseBody
    public List<SoftwareTab> selectTab() throws Exception {
        List<SoftwareTab> result = softService.selectTab();
        return result;
    }


    @RequestMapping("/uptab")
    public @ResponseBody
    SubmitResultInfo upTab(SoftwareTab softwareTab) throws Exception {

        softService.upTab(softwareTab);

        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    @RequestMapping("/queryByCodeId")
    public String queryByCodeId(Model model, String codeId) throws Exception {
        List softwareBaseinfo = softService.queryByTabCode(codeId);
        System.out.println(new Gson().toJson(softwareBaseinfo));
        model.addAttribute("softwareBaseinfo", new Gson().toJson(softwareBaseinfo));

        return "/st/upTab";
    }
}
