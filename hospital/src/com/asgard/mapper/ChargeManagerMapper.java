package com.asgard.mapper;

import com.asgard.pojo.ChargeManager;
import com.asgard.pojo.ChargeManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeManagerMapper {
    int countByExample(ChargeManagerExample example);

    int deleteByExample(ChargeManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargeManager record);

    int insertSelective(ChargeManager record);

    List<ChargeManager> selectByExample(ChargeManagerExample example);

    ChargeManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargeManager record, @Param("example") ChargeManagerExample example);

    int updateByExample(@Param("record") ChargeManager record, @Param("example") ChargeManagerExample example);

    int updateByPrimaryKeySelective(ChargeManager record);

    int updateByPrimaryKey(ChargeManager record);
}