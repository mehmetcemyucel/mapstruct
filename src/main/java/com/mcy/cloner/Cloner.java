package com.mcy.cloner;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Cloner {

	public CloneDTO clone(CloneDTO dto);

}
