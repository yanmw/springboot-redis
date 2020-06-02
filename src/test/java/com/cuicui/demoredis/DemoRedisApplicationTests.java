package com.cuicui.demoredis;

import com.cuicui.demoredis.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoRedisApplicationTests {

	@Autowired
	private RedisUtils redisUtils;

	/**
	*@Description 测试存
	*@author Cuicui
	*@date 2020/6/2 14:25
	*/
	@Test
	public void testRedisSet() {
		boolean b = redisUtils.set("key","value");
		if (b) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
	}

	/**
	*@Description 测试取
	*@author Cuicui
	*@date 2020/6/2 14:26
	*/
	@Test
	public void testRedisGet() {
		System.out.println(redisUtils.get("key"));
	}

}
