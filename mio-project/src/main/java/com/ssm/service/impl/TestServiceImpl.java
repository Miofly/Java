package com.ssm.service.impl;

import com.mio.pojo.SoftwareRegeditupdateDetail;
import com.mio.pojo.SoftwareRegeditupdateDetailExample;
import com.ssm.mapper.SoftwareRegeditupdateDetailMapper;
import com.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/05/14
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private SoftwareRegeditupdateDetailMapper softwareRegeditupdateDetailMapper;


    public List<SoftwareRegeditupdateDetail> selectRegeditDetail(Integer stepId) throws Exception {
        SoftwareRegeditupdateDetailExample example = new SoftwareRegeditupdateDetailExample();
        SoftwareRegeditupdateDetailExample.Criteria criteria = example.createCriteria();
        criteria.andStepIdEqualTo(stepId);
        return softwareRegeditupdateDetailMapper.selectByExample(example);
    }

    public List<SoftwareRegeditupdateDetail> selectRegeditDetails(Integer stepId) throws Exception {
        SoftwareRegeditupdateDetailExample example = new SoftwareRegeditupdateDetailExample();
        SoftwareRegeditupdateDetailExample.Criteria criteria = example.createCriteria();
        criteria.andStepIdEqualTo(stepId);
        return softwareRegeditupdateDetailMapper.selectByExample(example);
    }

}
