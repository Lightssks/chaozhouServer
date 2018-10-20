package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.common.vo.InfoVo;
import com.common.vo.PageVo;
import com.common.vo.ShareVo;
import com.po.Tbshare;
import com.po.TbshareExample;

public interface TbshareMapper {
    int countByExample(TbshareExample example);

    int deleteByExample(TbshareExample example);

    int deleteByPrimaryKey(String shassthhId);

    int insert(Tbshare record);

    int insertSelective(Tbshare record);

    List<Tbshare> selectByExampleWithBLOBs(TbshareExample example);

    List<Tbshare> selectByExample(TbshareExample example);

    Tbshare selectByPrimaryKey(String shassthhId);

    int updateByExampleSelective(@Param("record") Tbshare record, @Param("example") TbshareExample example);

    int updateByExampleWithBLOBs(@Param("record") Tbshare record, @Param("example") TbshareExample example);

    int updateByExample(@Param("record") Tbshare record, @Param("example") TbshareExample example);

    int updateByPrimaryKeySelective(Tbshare record);

    int updateByPrimaryKeyWithBLOBs(Tbshare record);

    int updateByPrimaryKey(Tbshare record);
    
    //==============手打=======================
    List<ShareVo> selectAllShare(PageVo vo);
    List<ShareVo> selectAllShareById(PageVo vo);
    List<InfoVo> selectAllInfoById(int id);
    List<InfoVo> selectAllInfoByIdWithComments(int id);
    ShareVo selectShareById(String id);
}