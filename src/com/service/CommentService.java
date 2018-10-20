package com.service;

import java.util.List;

import com.common.vo.PageVo;
import com.common.vo.UserCommentsVo;
import com.po.Tbcomment;

public interface CommentService {
	int insertHotelComment(Tbcomment comment);
	List<UserCommentsVo> queryCommentByCssthhId(PageVo pageVo);
}
