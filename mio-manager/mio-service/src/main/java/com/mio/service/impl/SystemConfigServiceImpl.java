package com.mio.service.impl;

import com.mio.mapper.BasicinfoMapper;
import com.mio.mapper.MioDictinfoMapper;
import com.mio.pojo.Basicinfo;
import com.mio.pojo.MioDictinfo;
import com.mio.pojo.MioDictinfoExample;
import com.mio.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemConfigServiceImpl implements SystemConfigService {

	@Autowired
    MioDictinfoMapper mioDictinfoMapper;
	@Autowired
	BasicinfoMapper basicinfoMapper;
	//根据数据字典typecode获取字典明细信息
	@Override
	public List findDictinfoByType(String typecode) throws Exception {

		MioDictinfoExample mioDictinfoExample = new MioDictinfoExample();
		MioDictinfoExample.Criteria criteria = mioDictinfoExample.createCriteria();
		
		criteria.andTypecodeEqualTo(typecode);
		
		return mioDictinfoMapper.selectByExample(mioDictinfoExample);
		
	}
	//根据typeocde和dictcode获取单个字典明细
	public MioDictinfo findDictinfoByDictcode(String typecode, String dictcode) throws Exception{
		MioDictinfoExample mioDictinfoExample = new MioDictinfoExample();
		MioDictinfoExample.Criteria criteria = mioDictinfoExample.createCriteria();
		criteria.andDictcodeEqualTo(dictcode);
		criteria.andTypecodeEqualTo(typecode);
		List<MioDictinfo> list = mioDictinfoMapper.selectByExample(mioDictinfoExample);
		if(list!=null && list.size()==1){
			return list.get(0);
		}
		return null;
		
	}
	/**
	 * 根据id获取系统配置信息
	 */
	@Override
	public Basicinfo findBasicinfoById(String id) throws Exception {
		return basicinfoMapper.selectByPrimaryKey(id);
	}

}
