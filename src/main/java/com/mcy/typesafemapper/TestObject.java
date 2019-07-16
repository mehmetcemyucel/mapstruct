package com.mcy.typesafemapper;

public class TestObject {

	private String str;
	private Integer intt;
	private int int2;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Integer getIntt() {
		return intt;
	}

	public void setIntt(Integer intt) {
		this.intt = intt;
	}

	public int getInt2() {
		return int2;
	}

	public void setInt2(int int2) {
		this.int2 = int2;
	}

	@Override
	public String toString() {
		return "TestObject [str=" + str + ", intt=" + intt + ", int2=" + int2 + "]";
	}

}
