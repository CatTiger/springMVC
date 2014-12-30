package com.team4.base.core.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.team4.base.core.service.IBaseService;
import com.team4.platform.model.BaseUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-context.xml",
		"classpath:web-context.xml" })
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class TestBase {
	
	@Autowired
	@Qualifier("iBaseService")
	private IBaseService baseService;
	
	@Before //在每个测试用例方法之前都会执行  
    public void init(){
    }  
      
    @After //在每个测试用例执行完之后执行  
    public void destory(){  
    } 
	
    /**
     * 添加测试
     * @throws Exception
     */
	@Test
	@Ignore
	public void baseInsertTest() throws Exception {
		BaseUser baseUser = new BaseUser();
		baseUser.setUsername("aaa");
		baseUser.setPwd("123");
		baseUser.setEmail("gzc@qq.com");
		baseUser.setTelphone("12312312312");
		baseUser.setContactName("照明");
		baseUser.setRegistTime(new Date());
		baseUser.setContactAddress("老2-113");
		baseService.insert(baseUser);
	}
	
	/**
	 * 单个对象删除操作
	 * @throws Exception
	 */
	@Test
	@Ignore
	public void baseDeleteModelTest() throws Exception {
		BaseUser baseUser = new BaseUser();
		baseUser.setUserId("1");
		baseService.deleteModel(baseUser);
	}
	
	@Test
	@Ignore
	public void baseDeleteModelsTest() throws Exception {
		BaseUser user1 = new BaseUser();
		BaseUser user2 = new BaseUser();
		user1.setUserId("40281a814a0ef6df014a0ef7ce2e0000");
		user2.setUserId("40281a814a1f796f014a1f7a02f80000");
		List<BaseUser> lists = new ArrayList<BaseUser>();
		lists.add(user1);
		lists.add(user2);
		baseService.deleteModels(lists);
	}
	
	@Test
	@Ignore
	public void baseUpdateTest() throws Exception {
		BaseUser baseUser = new BaseUser();
		baseUser.setUserId("40281a814a51f871014a51f875db0000");
		baseUser.setUsername("123123");
		baseUser.setPwd("123");
		baseUser.setEmail("gzc@qq.com");
		baseUser.setTelphone("12312312312");
		baseUser.setContactName("照明");
		baseUser.setRegistTime(new Date());
		baseUser.setContactAddress("老2-113");
		baseService.update(baseUser);
	}
	
	@Test
	@Ignore
	public void baseSearchByIdTest() throws Exception {
		BaseUser user = baseService.searchById("40281a814a51f871014a51f875db0000", new BaseUser());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
