package com.mapper;

import com.po.Tbss;
import com.po.TbssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbssMapper {
    int countByExample(TbssExample example);

    int deleteByExample(TbssExample example);

    int deleteByPrimaryKey(Long ssid);

    int insert(Tbss record);

    int insertSelective(Tbss record);

    List<Tbss> selectByExample(TbssExample example);

    Tbss selectByPrimaryKey(Long ssid);

    int updateByExampleSelective(@Param("record") Tbss record, @Param("example") TbssExample example);

    int updateByExample(@Param("record") Tbss record, @Param("example") TbssExample example);

    int updateByPrimaryKeySelective(Tbss record);

    int updateByPrimaryKey(Tbss record);
}