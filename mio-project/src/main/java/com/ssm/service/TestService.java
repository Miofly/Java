package com.ssm.service;

import com.mio.pojo.SoftwareRegeditupdateDetail;

import java.util.List;

/**
 * describe: 测试接口
 *
 * @author wfd
 * @date 2019/05/14
 */
public interface TestService {

    List<SoftwareRegeditupdateDetail> selectRegeditDetail(Integer stepId) throws Exception;

    List<SoftwareRegeditupdateDetail> selectRegeditDetails(Integer stepId) throws Exception;
}
