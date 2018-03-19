package github_demo.demo.dao;

import github_demo.demo.entity.Czlog;

public interface CzlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Czlog record);

    int insertSelective(Czlog record);

    Czlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Czlog record);

    int updateByPrimaryKey(Czlog record);
}