package com.common.vo;

import javax.servlet.http.HttpServletRequest;

public class PageVo {
	private String id;
	private String cursor;
	private int pageSize;
	
	public PageVo() { }
	
	public PageVo(HttpServletRequest request) {
		cursor = request.getParameter("cursor");
		String size =  request.getParameter("pageSize");
		
		if(cursor == null || "".equals(cursor)) {
			cursor = "0";
		}
		if(size == null || "".equals(size)) {
			pageSize = 10;
		} else {
			pageSize = Integer.parseInt(size);
		}
	}
	public PageVo(HttpServletRequest request, String id) {
		this(request);
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCursor() {
		return cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
