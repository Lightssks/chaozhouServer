package com.mapper;

import com.po.Tbsetup;
import com.po.TbsetupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbsetupMapper {
    int countByExample(TbsetupExample example);

    int deleteByExample(TbsetupExample example);

    int deleteByPrimaryKey(Long setuid);

    int insert(Tbsetup record);

    int insertSelective(Tbsetup record);

    List<Tbsetup> selectByExample(TbsetupExample example);

    Tbsetup selectByPrimaryKey(Long setuid);

    int updateByExampleSelective(@Param("record") Tbsetup record, @Param("example") TbsetupExample example);

    int updateByExample(@Param("record") Tbsetup record, @Param("example") TbsetupExample example);

    int updateByPrimaryKeySelective(Tbsetup record);

    int updateByPrimaryKey(Tbsetup record);
}