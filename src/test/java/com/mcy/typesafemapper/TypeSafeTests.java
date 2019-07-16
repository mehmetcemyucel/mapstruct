package com.mcy.typesafemapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mcy.typesafemapper.TestDTO;
import com.mcy.typesafemapper.TestObject;
import com.mcy.typesafemapper.TypeSafeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeSafeTests {

	@Autowired
	TypeSafeMapper mapper;

	@Test
	public void contextLoads() {

		TestDTO dto = new TestDTO("1", 2, 3);

		TestObject obj = mapper.testDTO2TestObject(dto);

		assertThat(obj.getStr()).isEqualTo("1");
		assertThat(obj.getIntt()).isEqualTo(2);
		assertThat(obj.getInt2()).isEqualTo(3);
	}

}
