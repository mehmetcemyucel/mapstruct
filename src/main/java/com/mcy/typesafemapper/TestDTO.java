package com.mcy.typesafemapper;

public class TestDTO {

	private String strVal;
	private Integer intVal;
	private int intVal2;

	public TestDTO(String strVal, Integer intVal, int intVal2) {
		super();
		this.strVal = strVal;
		this.intVal = intVal;
		this.intVal2 = intVal2;
	}

	public String getStrVal() {
		return strVal;
	}

	public void setStrVal(String strVal) {
		this.strVal = strVal;
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
