package com.ssm.mapper;

import com.ssm.pojo.CommUserOrg;
import com.ssm.pojo.CommUserOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommUserOrgMapper {
    int countByExample(CommUserOrgExample example);

    int deleteByExample(CommUserOrgExample example);

    int insert(CommUserOrg record);

    int insertSelective(CommUserOrg record);

    List<CommUserOrg> selectByExample(CommUserOrgExample example);

    int updateByExampleSelective(@Param("record") CommUserOrg record, @Param("example") CommUserOrgExample example);

    int updateByExample(@Param("record") CommUserOrg record, @Param("example") CommUserOrgExample example);
}