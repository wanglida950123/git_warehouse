package github_demo.demo.dao;

import github_demo.demo.entity.Pbcattbl;

public interface PbcattblMapper {
    int insert(Pbcattbl record);

    int insertSelective(Pbcattbl record);
}