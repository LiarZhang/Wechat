package com.zhangxf.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhangxf.dispatcher.EventDispatcher;
import com.zhangxf.dispatcher.MessageDispatcher;
import com.zhangxf.utils.MessageUtil;
import com.zhangxf.utils.SignUtil;
@Controller
@RequestMapping("/wechat")
public class WecahtController {
	private static Logger logger = Logger.getLogger(WecahtController.class);

	/**
	 * 
	 * @Description: 用于接收get参数，返回验证参数
	 * @param @param
	 *            request
	 * @param @param
	 *            response
	 * @param @param
	 *            signature
	 * @param @param
	 *            timestamp
	 * @param @param
	 *            nonce
	 * @param @param
	 *            echostr
	 * @author dapengniao
	 * @date 2016年3月4日 下午6:20:00
	 */
	@RequestMapping(value = "security", method = RequestMethod.GET)
	public void doGet(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "signature", required = true) String signature,
			@RequestParam(value = "timestamp", required = true) String timestamp,
			@RequestParam(value = "nonce", required = true) String nonce,
			@RequestParam(value = "echostr", required = true) String echostr) {
		try {
			if (SignUtil.checkSignature(signature, timestamp, nonce)) {
				PrintWriter out = response.getWriter();
				out.print(echostr);
				out.close();
			} else {
				logger.info("这里存在非法请求！");
			}
		} catch (Exception e) {
			logger.error(e, e);
		}
	}

	@RequestMapping(value = "security", method = RequestMethod.POST)
    // post方法用于接收微信服务端消息,微信服务器post消息体的接收
    public void DoPost(HttpServletRequest request,HttpServletResponse response) {
        System.out.println("进入了post方法！");
        try{
        	 // 消息的接收、处理、响应
            // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            
            Map<String, String> map=MessageUtil.parseXml(request);
            String msgtype=map.get("MsgType");
            if(MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)){
                EventDispatcher.processEvent(map); //进入事件处理
            }else{
                MessageDispatcher.processMessage(map); //进入消息处理
                PrintWriter out = response.getWriter();
                out.print(MessageDispatcher.processMessage(map));
                out.close();
            }
        }catch(Exception e){
            logger.error(e,e);
        }
    }
}
