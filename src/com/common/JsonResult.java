package com.common;

public class JsonResult {
	//响应状态码
	private Integer  status;
	
	//响应数据
    private Object data;
    
    // 响应消息
    private String msg;
    
    public JsonResult() { 	
    }
    
    public JsonResult(Integer  status) {
    	this.status = status;
    }
    
    public JsonResult(Integer  status, Object data) {
    	this.status = status;
    	this.data = data;
    }
     
    public static JsonResult error(Integer  status) {
    	return new JsonResult(status);
    }
    
    public static JsonResult ok(Object data) {
    	return new JsonResult(0, data);
    }
    

	public Integer  getStatus() {
		return status;
	}

	public void setStatus(Integer  status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
