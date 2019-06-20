package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Mr.Yuxd
 * @Date 2019/6/18
 * @Version 1.0
 */
@Component
@JobHandler("testJobHandler")
@Slf4j
public class TestJobjHandler extends IJobHandler {
    private int i = 0;
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        ReturnT<String> returnT = new ReturnT<>();
        //log.info("执行TestJobjHandler "+i);
        i++;
        if (i % 5 == 0) {
            returnT.setMsg("执行失败"+i);
            returnT.setContent("内容xxxx");
            returnT.setCode(500);
            return returnT;
        }
        return ReturnT.SUCCESS;
    }
}