package github_demo.demo.dao;

import github_demo.demo.entity.CzlogUp;

public interface CzlogUpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CzlogUp record);

    int insertSelective(CzlogUp record);

    CzlogUp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CzlogUp record);

    int updateByPrimaryKey(CzlogUp record);
}