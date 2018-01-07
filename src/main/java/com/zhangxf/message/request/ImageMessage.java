package com.zhangxf.message.request;

import com.zhangxf.message.base.BaseMessage;

/**
 * ClassName: ImageMessage
 * @Description: 图片消息
 */
public class ImageMessage extends BaseMessage{
	// 图片链接
    private String PicUrl;
 
    
    //setter getter
    public String getPicUrl() {
        return PicUrl;
    }
 
    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }
}
