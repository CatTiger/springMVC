package com.team4.base.core.exception;

/**
 * 异常类
 * @author {guozichen}
 * 2014年11月3日
 */
public class AppException extends Exception{

	private static final long serialVersionUID = -6866265499195848091L;
	
	private String msg;

	public AppException(String msg) {
		super();
		this.msg = msg;
	}

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppException(Exception exp, String msg) {
		super(exp);
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
	

}
