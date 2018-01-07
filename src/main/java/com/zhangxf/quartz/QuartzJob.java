package com.zhangxf.quartz;

import org.apache.log4j.Logger;
import com.zhangxf.common.WeChatTask;

public class QuartzJob{
    private static Logger logger = Logger.getLogger(QuartzJob.class);
    /**
     * @Description: 任务执行获取token
     * @param    
     * @author dapengniao
     */
    public void workForToken() {
        try {
        	WeChatTask timer = new WeChatTask();
            timer.getToken_getTicket();
        } catch (Exception e) {
            logger.error(e, e);
        }
    }
 
 
}
