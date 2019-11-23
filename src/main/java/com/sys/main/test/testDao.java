package com.sys.main.test;


import com.sys.commons.common.MyBatisDao;

import java.util.List;
import java.util.Map;
@MyBatisDao
public interface testDao {
    List<Map<String,Object>> getUser();
    int upd();
}
