package com.mcy.typeconvertmapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ConvertMapper {
	
	@Mappings({
		  @Mapping(target="strVal", source = "inst",
		           dateFormat = "dd-MM-yyyy HH:mm:ss")})
	public ConvertObject typeConvertDto2Object(ConvertDTO dto);
}
