package com.mapper;

import com.common.vo.PageVo;
import com.po.Tbcomment;
import com.po.TbcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbcommentMapper {
    int countByExample(TbcommentExample example);

    int deleteByExample(TbcommentExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(Tbcomment record);

    int insertSelective(Tbcomment record);

    List<Tbcomment> selectByExampleWithBLOBs(TbcommentExample example);

    List<Tbcomment> selectByExample(TbcommentExample example);

    Tbcomment selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") Tbcomment record, @Param("example") TbcommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Tbcomment record, @Param("example") TbcommentExample example);

    int updateByExample(@Param("record") Tbcomment record, @Param("example") TbcommentExample example);

    int updateByPrimaryKeySelective(Tbcomment record);

    int updateByPrimaryKeyWithBLOBs(Tbcomment record);

    int updateByPrimaryKey(Tbcomment record);
    
    //==============手打======
    List<com.common.vo.UserCommentsVo> selectCommentsByPage(PageVo pageVo);
}