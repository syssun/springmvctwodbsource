package com.sys.slave.modules.jobs;

import com.sys.commons.utils.SpringContextHolder;
import com.sys.main.test.TestServiceImpl;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 */
public class TestJob implements Job {
    com.sys.main.test.testDao testDao = SpringContextHolder.getBean(com.sys.main.test.testDao.class);
    TestServiceImpl testService = SpringContextHolder.getBean(TestServiceImpl.class);
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
       // System.out.println(testDao.getUser().toString());
      //  testService.upd();
    }
}
