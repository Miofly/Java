package com.mio.service.impl;

import com.mio.service.JedisClient;
import com.mio.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private JedisClient jedisClient;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	
	@Override
	public String syncContent(long contentCid)  throws Exception{

		jedisClient.hdel(INDEX_CONTENT_REDIS_KEY, contentCid + "");
		return "successs";
	}

}
