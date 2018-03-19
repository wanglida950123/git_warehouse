package github_demo.demo.dao;

import github_demo.demo.entity.SysdownClba;

public interface SysdownClbaMapper {
    int deleteByPrimaryKey(String xh);

    int insert(SysdownClba record);

    int insertSelective(SysdownClba record);

    SysdownClba selectByPrimaryKey(String xh);

    int updateByPrimaryKeySelective(SysdownClba record);

    int updateByPrimaryKey(SysdownClba record);
}