package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.common.vo.SpecShopVo;
import com.po.Tbspecialty;
import com.po.TbspecialtyExample;

public interface TbspecialtyMapper {
    int countByExample(TbspecialtyExample example);

    int deleteByExample(TbspecialtyExample example);

    int deleteByPrimaryKey(String spessthhId);

    int insert(Tbspecialty record);

    int insertSelective(Tbspecialty record);

    List<Tbspecialty> selectByExampleWithBLOBs(TbspecialtyExample example);

    List<Tbspecialty> selectByExample(TbspecialtyExample example);

    Tbspecialty selectByPrimaryKey(String spessthhId);

    int updateByExampleSelective(@Param("record") Tbspecialty record, @Param("example") TbspecialtyExample example);

    int updateByExampleWithBLOBs(@Param("record") Tbspecialty record, @Param("example") TbspecialtyExample example);

    int updateByExample(@Param("record") Tbspecialty record, @Param("example") TbspecialtyExample example);

    int updateByPrimaryKeySelective(Tbspecialty record);

    int updateByPrimaryKeyWithBLOBs(Tbspecialty record);

    int updateByPrimaryKey(Tbspecialty record);
    
    //==========手打=================
//    List<Tbspecialty> selectSpecialtyList();
    SpecShopVo selectSpecById(String id);
}