package github_demo.demo.dao;

import github_demo.demo.entity.YwSub2record;
import github_demo.demo.entity.YwSub2recordKey;

public interface YwSub2recordMapper {
    int deleteByPrimaryKey(YwSub2recordKey key);

    int insert(YwSub2record record);

    int insertSelective(YwSub2record record);

    YwSub2record selectByPrimaryKey(YwSub2recordKey key);

    int updateByPrimaryKeySelective(YwSub2record record);

    int updateByPrimaryKey(YwSub2record record);
}