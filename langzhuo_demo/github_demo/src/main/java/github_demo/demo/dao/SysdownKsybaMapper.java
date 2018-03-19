package github_demo.demo.dao;

import github_demo.demo.entity.SysdownKsyba;

public interface SysdownKsybaMapper {
    int deleteByPrimaryKey(String xh);

    int insert(SysdownKsyba record);

    int insertSelective(SysdownKsyba record);

    SysdownKsyba selectByPrimaryKey(String xh);

    int updateByPrimaryKeySelective(SysdownKsyba record);

    int updateByPrimaryKey(SysdownKsyba record);
}