package com.mcy.typesafemapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TypeSafeMapper {

	@Mappings({ 
		@Mapping(source = "strVal", target = "str"), 
		@Mapping(source = "intVal", target = "intt"),
		@Mapping(source = "intVal2", target = "int2")})
	public TestObject testDTO2TestObject(TestDTO dto);

}
