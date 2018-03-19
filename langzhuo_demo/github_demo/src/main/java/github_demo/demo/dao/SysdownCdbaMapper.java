package github_demo.demo.dao;

import github_demo.demo.entity.SysdownCdba;

public interface SysdownCdbaMapper {
    int deleteByPrimaryKey(String xh);

    int insert(SysdownCdba record);

    int insertSelective(SysdownCdba record);

    SysdownCdba selectByPrimaryKey(String xh);

    int updateByPrimaryKeySelective(SysdownCdba record);

    int updateByPrimaryKey(SysdownCdba record);
}