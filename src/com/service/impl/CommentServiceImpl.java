package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.vo.PageVo;
import com.common.vo.UserCommentsVo;
import com.mapper.TbcommentMapper;
import com.po.Tbcomment;
import com.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	TbcommentMapper commentMapper;
	@Override
	public int insertHotelComment(Tbcomment comment) {
		return commentMapper.insert(comment);
	}
	
	public List<UserCommentsVo> queryCommentByCssthhId(PageVo pageVo) {
		return commentMapper.selectCommentsByPage(pageVo);
	}

}
