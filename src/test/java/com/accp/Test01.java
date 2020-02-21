package com.accp;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.*;
import com.accp.dao.*;

/**
 * Biz测试&检测
 * @author ASUS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class Test01 {

	@Resource
	private Biz biz;
	
	/**
	 * 登录
	 */
	@Test
	public void test01() {
		System.out.println(biz.selectEmp(1001, "aaa12345"));
	}
}
