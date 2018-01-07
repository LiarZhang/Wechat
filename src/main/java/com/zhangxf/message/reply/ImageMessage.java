package com.zhangxf.message.reply;

import com.zhangxf.message.base.BaseMessage;

/**
 * 图片回复消息体
 * @author Liar
 *
 */
/**
 * ClassName: ImageMessage
 * @Description: 图片消息
 * @author dapengniao
 * @date 2016年3月8日 下午5:58:10
 */
public class ImageMessage extends BaseMessage{
     
    private Image Image;
 
    public Image getImage() {
        return Image;
    }
 
    public void setImage(Image image) {
        Image = image;
    }
     
 
}