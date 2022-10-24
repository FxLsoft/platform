package com.lts.platform.core.common.datasource.entiy;

public enum OrderByEnum {
	DEFAULT(""),
	ASC("asc"),
	DESC("desc");

	private String value;

	OrderByEnum(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
