package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.JsonResult;
import com.common.vo.PageVo;
import com.common.vo.UserCommentsVo;
import com.google.gson.Gson;
import com.po.Tbcomment;
import com.service.CommentService;

@RestController
@RequestMapping("comments")
public class CommentsController {
	@Autowired
	CommentService commentService;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping("subComments")
	public String subComment(HttpServletRequest request, Tbcomment comment) {
		//String commentString = request.getParameter("comment");
		// 把字符串转换成对象		
		
		//Tbcomment comment = gson.fromJson(commentString, Tbcomment.class);
		if(comment == null || comment.getCssthhId() == null || comment.getCssthhId()==null 
				|| comment.getCtext()==null) {
			return "-1";
		}
		comment.setCtime(new Date());
		commentService.insertHotelComment(comment);
		JsonResult result = new JsonResult();
		result.setStatus(0);
		return gson.toJson(result);
	}
	
	@RequestMapping(value="commentsList/{id}", produces="application/json; charset=utf-8")
	public String getComments(HttpServletRequest request, @PathVariable("id") String id) {
		String cursor = request.getParameter("cursor");
		String pageSize = request.getParameter("pageSize");
		if(cursor == null || cursor.equals("")) {
			cursor = "0";
		}
		if(pageSize == null || pageSize.equals("")) {
			pageSize = "10";
		}
		PageVo pageVo = new PageVo();
		pageVo.setId(id);
		pageVo.setCursor(cursor);
		pageVo.setPageSize(Integer.parseInt(pageSize));
		List<UserCommentsVo> list = commentService.queryCommentByCssthhId(pageVo);
		return gson.toJson(list);
	}
}
