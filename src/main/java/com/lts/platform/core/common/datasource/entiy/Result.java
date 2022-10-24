package com.lts.platform.core.common.datasource.entiy;

import java.io.Serializable;

import com.lts.platform.core.constant.CommonCode;

import lombok.Data;

@Data
public class Result<T> implements Serializable {

	private Integer code;

	private String message;

	private boolean success = true;

	private T data;

	private long timestamp = System.currentTimeMillis();

	public Result() {
	}

	public Result(Integer code,String message) {
		this.code = code;
		this.message = message;
	}

	public static<T> Result<T> OK() {
		Result<T> r = new Result<T>();
		r.setSuccess(true);
		r.setCode(CommonCode.R_OK_200);
		return r;
	}

	public static<T> Result<T> OK(T data) {
		Result<T> r = new Result<T>();
		r.setSuccess(true);
		r.setCode(CommonCode.R_OK_200);
		r.setData(data);
		return r;
	}

	public static<T> Result<T> error(String msg) {
		return error(CommonCode.R_ERROR_500, msg);
	}

	public static<T> Result<T> error(int code, String msg) {
		Result<T> r = new Result<T>();
		r.setCode(code);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}
}
