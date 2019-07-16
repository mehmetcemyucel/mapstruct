package com.mcy.inheritmapper;

public class InheritObject {

	private Integer intVal;
	private int intVal2;
	private String strVal;

	public InheritObject(Integer intVal, int intVal2, String strVal) {
		super();
		this.intVal = intVal;
		this.intVal2 = intVal2;
		this.strVal = strVal;
	}

	public InheritObject() {
		super();
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

	public String getStrVal() {
		return strVal;
	}

	public void setStrVal(String strVal) {
		this.strVal = strVal;
	}

}
