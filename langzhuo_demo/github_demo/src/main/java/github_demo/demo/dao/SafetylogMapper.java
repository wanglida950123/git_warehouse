package github_demo.demo.dao;

import github_demo.demo.entity.Safetylog;

public interface SafetylogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Safetylog record);

    int insertSelective(Safetylog record);

    Safetylog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Safetylog record);

    int updateByPrimaryKey(Safetylog record);
}