package com.mcy.typeconvertmapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeConvertTests {

	@Autowired
	ConvertMapper mapper;

	@Test
	public void contextLoads() {
		ConvertDTO dto = new ConvertDTO(Instant.now());
		ConvertObject obj = mapper.typeConvertDto2Object(dto);
		assertThat(obj.getStrVal()).isNotEmpty();
	}

}
