package com.mcy.inheritmapper;

public class InheritDTO {

	private Integer intVal;
	private int intVal2;

	public InheritDTO(Integer intVal, int intVal2) {
		super();
		this.intVal = intVal;
		this.intVal2 = intVal2;
	}

	public Integer getIntVal() {
		return intVal;
	}

	public void setIntVal(Integer intVal) {
		this.intVal = intVal;
	}

	public int getIntVal2() {
		return intVal2;
	}

	public void setIntVal2(int intVal2) {
		this.intVal2 = intVal2;
	}

}
