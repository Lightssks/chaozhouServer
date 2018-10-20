package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.common.vo.MapContrastVo;
import com.common.vo.YSMap;
import com.po.Tbmap;
import com.po.TbmapExample;

public interface TbmapMapper {
    int countByExample(TbmapExample example);

    int deleteByExample(TbmapExample example);

    int deleteByPrimaryKey(Long mid);

    int insert(Tbmap record);

    int insertSelective(Tbmap record);

    List<Tbmap> selectByExample(TbmapExample example);

    Tbmap selectByPrimaryKey(Long mid);

    int updateByExampleSelective(@Param("record") Tbmap record, @Param("example") TbmapExample example);

    int updateByExample(@Param("record") Tbmap record, @Param("example") TbmapExample example);

    int updateByPrimaryKeySelective(Tbmap record);

    int updateByPrimaryKey(Tbmap record);
    
    //==================手打====================
    List<YSMap> selectAllMaps();
    MapContrastVo selectShopByMap(long id);
    MapContrastVo selectTourByMap(long id);
    MapContrastVo selectHotelByMap(long id);
}