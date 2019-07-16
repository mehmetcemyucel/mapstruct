package com.mcy.inheritmapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InheritTests {

	@Autowired
	InheritMapper mapper;

	@Test
	public void contextLoads() {

		InheritDTO dto = new InheritDTO(2, 3);

		InheritObject obj = mapper.inheritDto2Object(dto);

		assertThat(obj.getStrVal()).isNull();
		assertThat(obj.getIntVal()).isEqualTo(2);
		assertThat(obj.getIntVal2()).isEqualTo(3);
		
	}

}
