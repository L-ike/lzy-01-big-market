package com.lzy.infrastructure.persistent.dao;

import com.lzy.infrastructure.persistent.po.Award;
import com.lzy.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyAwardDao {
    List<StrategyRule> queryStrategyAwardList();
}
