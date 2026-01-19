package com.lzy.infrastructure.persistent.dao;

import com.lzy.infrastructure.persistent.po.Award;
import com.lzy.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lzy
 * @date 2026/1/19 20:51
 * @project big-market
 * @description 策略规则
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();
}
