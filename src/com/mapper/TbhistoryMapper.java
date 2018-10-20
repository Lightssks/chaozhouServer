package com.mapper;

import com.common.vo.HistoryVo;
import com.po.Tbhistory;
import com.po.TbhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbhistoryMapper {
    int countByExample(TbhistoryExample example);

    int deleteByExample(TbhistoryExample example);

    int deleteByPrimaryKey(String hisssthhId);

    int insert(Tbhistory record);

    int insertSelective(Tbhistory record);

    List<Tbhistory> selectByExampleWithBLOBs(TbhistoryExample example);

    List<Tbhistory> selectByExample(TbhistoryExample example);

    Tbhistory selectByPrimaryKey(String hisssthhId);

    int updateByExampleSelective(@Param("record") Tbhistory record, @Param("example") TbhistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Tbhistory record, @Param("example") TbhistoryExample example);

    int updateByExample(@Param("record") Tbhistory record, @Param("example") TbhistoryExample example);

    int updateByPrimaryKeySelective(Tbhistory record);

    int updateByPrimaryKeyWithBLOBs(Tbhistory record);

    int updateByPrimaryKey(Tbhistory record);
    
    //====================手打====================
    List<HistoryVo> selectAllHistory();
    HistoryVo selectHistoryById(String id);
}