package com.dao.mongodb;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.mongodb.dao.IMainErrorDao;

/**
 * MainErrorDaoImpl单元测试
 * @author huanghu
 * @date 2013-11-7
 */

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring/spring_hh/springmvc-servlet.xml"}) 
public class TestMainErrorDaoImpl {
	
	@Autowired
	private IMainErrorDao mainErrorDao;
	private String wfName;
	
	@Before
	public void before(){
		wfName = "INT-040-settlementWarrantExt-W";
	}
	
	@Test
	public void findErrorLogByEbsLogTest(){
		int limit = 2;
		int skip = 5;
		mainErrorDao.findErrorLogByEbsLog(wfName ,limit ,skip);
	}
}
