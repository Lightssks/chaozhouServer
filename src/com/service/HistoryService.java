package com.service;

import java.util.List;

import com.common.vo.HistoryVo;

public interface HistoryService {
	List<HistoryVo> queryAllHistory(String page, String count);
	HistoryVo queryHistoryVoById(String id);
}
