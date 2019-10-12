package com.asgard.mapper;

import com.asgard.pojo.CertificateType;
import com.asgard.pojo.CertificateTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateTypeMapper {
    int countByExample(CertificateTypeExample example);

    int deleteByExample(CertificateTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertificateType record);

    int insertSelective(CertificateType record);

    List<CertificateType> selectByExample(CertificateTypeExample example);

    CertificateType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertificateType record, @Param("example") CertificateTypeExample example);

    int updateByExample(@Param("record") CertificateType record, @Param("example") CertificateTypeExample example);

    int updateByPrimaryKeySelective(CertificateType record);

    int updateByPrimaryKey(CertificateType record);
}