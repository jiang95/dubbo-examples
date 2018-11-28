package com.dubbo.provider;

import com.dubbo.api.domain.dto.PageDTO;
import com.dubbo.api.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboProviderApplicationTests {

	@Autowired
	private DemoService demoService;

	@Test
	public void contextLoads() {
		PageDTO pageDTO = new PageDTO();
		pageDTO.setStart(0);
		pageDTO.setSize(10);

		System.out.println(demoService.findUserList(pageDTO));
	}

}
