package com.mio.search.controller;

import com.mio.global.CommonResultUtil;
import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.search.service.SearchDao;
import com.mio.search.service.SearchService;
import com.mio.util.EUDataGridResults;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;
    @Autowired
    private SearchDao searchDao;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public @ResponseBody
    EUDataGridResults search(@RequestParam("q") String queryString,
//							Integer pageIndex,
                             @RequestParam(defaultValue = "1") Integer pageIndex, @RequestParam(defaultValue = "20") Integer pageSize) throws Exception {
        //查询条件不能为空
        if (StringUtils.isBlank(queryString)) {
            CommonResultUtil.throwExcepion(CommonResultUtil.createInfo(Config.MESSAGE, null, 222, null));
            
        }
        EUDataGridResults results = null;

        queryString = new String(queryString.getBytes("iso8859-1"), "utf-8");
        results = searchService.search(queryString, pageIndex, pageSize);

        return results;

    }

    /*删除所有索引*/
    @RequestMapping(value = "/deleteAll")
    public @ResponseBody
    SubmitResultInfo deleteAll() throws Exception {
        searchDao.deleteAll();
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*根据id删除索引*/
    @RequestMapping(value = "/deleteId")
    public @ResponseBody
    SubmitResultInfo deleteById(@RequestParam("id") String id) throws Exception {
        searchDao.deleteById(id);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*根据id批量删除索引*/
    @RequestMapping(value = "/deleteIds")
    public @ResponseBody
    SubmitResultInfo deleteByIds(String ids) throws Exception {
        /*String类型转换成List<String>*/
        List<String> list = Arrays.asList(ids.split(","));
        searchDao.deleteByIds(list);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }
}
