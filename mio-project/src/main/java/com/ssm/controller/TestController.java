package com.ssm.controller;

import com.mio.global.Config;
import com.mio.pojo.SoftwareRegeditupdateDetail;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.global.CommonResultInfo;
import com.mio.global.CommonResultUtil;
import com.mio.global.CommonSubmitResultInfo;
import com.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.List;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/05/14
 */
@Controller
@RequestMapping("/test")
public class TestController implements Serializable {

    @Autowired
    private TestService testService;

    @RequestMapping("/infos")
    @ResponseBody
    public CommonSubmitResultInfo selectRegeditDetail(Integer stepId) throws Exception {
        List<SoftwareRegeditupdateDetail> result = testService.selectRegeditDetails(stepId);
        return CommonResultUtil.createSubmitResult(CommonResultUtil.createSuccess(
                Config.MESSAGE, result, 118, null)
        );
    }

    @RequestMapping("/infoss")
    @ResponseBody
    public SubmitResultInfo selectRegeditDetails(Integer stepId) throws Exception {
        List<SoftwareRegeditupdateDetail> result = testService.selectRegeditDetails(stepId);
        return ResultUtil.createSubmitResult(ResultUtil.createInfos(
                Config.MESSAGE, 118,
                null, result)
        );
    }

    @RequestMapping("/myinfos")
    @ResponseBody
    public CommonResultInfo selectRegeditDetailS(Integer stepId) throws Exception {
        List<SoftwareRegeditupdateDetail> result = testService.selectRegeditDetails(stepId);
        return CommonResultUtil.createInfo(Config.MESSAGE, result, 118, null);
    }


}
