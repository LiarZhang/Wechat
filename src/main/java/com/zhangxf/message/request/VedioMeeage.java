package com.zhangxf.message.request;

import com.zhangxf.message.base.BaseMessage;

/**
 * 视频信息
 * @author Liar
 *
 */
public class VedioMeeage extends BaseMessage {
	private String MediaId; // 视频消息媒体id，可以调用多媒体文件下载接口拉取数据
    private String ThumbMediaId; // 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
    
}
