package github_demo.demo.dao;

import github_demo.demo.entity.Monitorlog;

public interface MonitorlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Monitorlog record);

    int insertSelective(Monitorlog record);

    Monitorlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Monitorlog record);

    int updateByPrimaryKey(Monitorlog record);
}