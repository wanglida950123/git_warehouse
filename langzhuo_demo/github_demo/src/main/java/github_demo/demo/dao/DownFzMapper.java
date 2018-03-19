package github_demo.demo.dao;

import github_demo.demo.entity.DownFz;

public interface DownFzMapper {
    int deleteByPrimaryKey(Long fzjhId);

    int insert(DownFz record);

    int insertSelective(DownFz record);

    DownFz selectByPrimaryKey(Long fzjhId);

    int updateByPrimaryKeySelective(DownFz record);

    int updateByPrimaryKey(DownFz record);
}