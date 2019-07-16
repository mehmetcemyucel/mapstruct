package com.mcy.cloner;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClonerTests {

	@Autowired
	Cloner mapper;

	@Test
	public void contextLoads() {

		CloneDTO dto = new CloneDTO("1", 2, 3);

		CloneDTO obj = mapper.clone(dto);

		assertThat(obj.getStrVal()).isEqualTo("1");
		assertThat(obj.getIntVal()).isEqualTo(2);
		assertThat(obj.getIntVal2()).isEqualTo(3);
		assertThat(dto.hashCode()).isNotEqualTo(obj.hashCode());
	}

}
