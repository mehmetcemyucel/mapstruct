package com.mcy.inheritmapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InheritMapper {

	@InheritInverseConfiguration
	public InheritObject inheritDto2Object(InheritDTO dto);

}
