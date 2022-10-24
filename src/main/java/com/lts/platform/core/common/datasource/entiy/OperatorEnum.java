package com.lts.platform.core.common.datasource.entiy;

public enum OperatorEnum {
	EQ("="),
	LT("<"),
	LTE("<="),
	GT(">"),
	GTE(">="),
	NE("!="),
	LIKE("like"),
	BETWEEN("between"),
	IN("in"),
	OR("or"),
	AND("and");

	private String value;

	OperatorEnum(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
