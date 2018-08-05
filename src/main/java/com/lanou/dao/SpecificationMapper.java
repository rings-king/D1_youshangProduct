package com.lanou.dao;

import com.lanou.model.Specification;

public interface SpecificationMapper {
    int deleteByPrimaryKey(Integer sfId);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectByPrimaryKey(Integer sfId);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);
}