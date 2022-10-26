package com.example.springcloud.core.response;
/**
 * 
 * @author huangzhihua
 * @time   2018-11-02 21:50
 * @param <T> 返回的数据类型
 * 
 * rest接口返回值包装类。
 */
public class Result<T> {
	
	/**
	 * 接口返回的状态码
	 */
	private int code;
	
	/**
	 * 接口返回的状态信息
	 */
	private String message;
	
	/**
	 * 接口返回的数据
	 */
	private T data;
	
	/**
	 * 无参构造函数，接口调用成功，无返回数据。
	 */
	public Result(){
		this.code=200;
		this.message="success";
	}
	/**
	 * 接口调用异常，只返回状态码和信息，无返回数据。
	 * 
	 * @param code 状态码
	 * @param message 状态信息
	 */
	public Result(int code,String message){
		this.code=code;
		this.message=message;
	}
	/**
	 * 接口调用成功，采用默认状态码及信息,返回数据。
	 * @param t 返回数据
	 */
	public Result(T t) {
		this.code=200;
		this.message="success";
		this.data=t;
	}
	
	/**
	 * 全参构造函数
	 * @param t 返回数据
	 */
	public Result(int code,String message,T t) {
		this.code=code;
		this.message=message;
		this.data=t;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	} 
	public  void setData(T t) {
		this.data=t;
	}
	
}
