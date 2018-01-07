package com.zhangxf.message.request;

import com.zhangxf.message.base.BaseMessage;

/**
 * ClassName: TextMessage
 * @Description: 文本消息
 */
public class TextMessage extends BaseMessage {
	// 消息内容   
    private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	} 
    
    
}
