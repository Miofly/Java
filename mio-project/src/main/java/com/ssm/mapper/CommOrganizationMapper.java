package com.ssm.mapper;

import com.ssm.pojo.CommOrganization;
import com.ssm.pojo.CommOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommOrganizationMapper {
    int countByExample(CommOrganizationExample example);

    int deleteByExample(CommOrganizationExample example);

    int insert(CommOrganization record);

    int insertSelective(CommOrganization record);

    List<CommOrganization> selectByExample(CommOrganizationExample example);

    int updateByExampleSelective(@Param("record") CommOrganization record, @Param("example") CommOrganizationExample example);

    int updateByExample(@Param("record") CommOrganization record, @Param("example") CommOrganizationExample example);
}