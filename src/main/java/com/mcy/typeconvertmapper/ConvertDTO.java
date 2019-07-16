package com.mcy.typeconvertmapper;

import java.time.Instant;

public class ConvertDTO {

	private Instant inst;

	public ConvertDTO(Instant inst) {
		super();
		this.inst = inst;
	}

	public ConvertDTO() {
		super();
	}

	public Instant getInst() {
		return inst;
	}

	public void setInst(Instant inst) {
		this.inst = inst;
	}

}
