package com.mapper;

import com.po.Tbinformation;
import com.po.TbinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbinformationMapper {
    int countByExample(TbinformationExample example);

    int deleteByExample(TbinformationExample example);

    int deleteByPrimaryKey(Long intid);

    int insert(Tbinformation record);

    int insertSelective(Tbinformation record);

    List<Tbinformation> selectByExampleWithBLOBs(TbinformationExample example);

    List<Tbinformation> selectByExample(TbinformationExample example);

    Tbinformation selectByPrimaryKey(Long intid);

    int updateByExampleSelective(@Param("record") Tbinformation record, @Param("example") TbinformationExample example);

    int updateByExampleWithBLOBs(@Param("record") Tbinformation record, @Param("example") TbinformationExample example);

    int updateByExample(@Param("record") Tbinformation record, @Param("example") TbinformationExample example);

    int updateByPrimaryKeySelective(Tbinformation record);

    int updateByPrimaryKeyWithBLOBs(Tbinformation record);

    int updateByPrimaryKey(Tbinformation record);
}