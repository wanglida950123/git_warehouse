package github_demo.demo.dao;

import github_demo.demo.entity.SysdownJcba;

public interface SysdownJcbaMapper {
    int deleteByPrimaryKey(String xh);

    int insert(SysdownJcba record);

    int insertSelective(SysdownJcba record);

    SysdownJcba selectByPrimaryKey(String xh);

    int updateByPrimaryKeySelective(SysdownJcba record);

    int updateByPrimaryKey(SysdownJcba record);
}