package github_demo.demo.dao;

import github_demo.demo.entity.Pbcatcol;

public interface PbcatcolMapper {
    int insert(Pbcatcol record);

    int insertSelective(Pbcatcol record);
}