package com.sys.slave.modules.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TestSlaveDao {
    public List<Map<String,Object>> getUser();
    int upds();
}
