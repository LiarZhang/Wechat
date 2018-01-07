package com.zhangxf.message.menu;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhangxf.constants.GlobalConstants;
import com.zhangxf.utils.HttpUtil;

 
public class MenuMain {
 
    public static void main(String[] args) {
     
        ClickButton cbt=new ClickButton();
        cbt.setKey("image");
        cbt.setName("回复图片");
        cbt.setType("click");
         
         
        ViewButton vbt=new ViewButton();
        vbt.setUrl("http://www.cuiyongzhi.com");
        vbt.setName("博客");
        vbt.setType("view");
         
        com.alibaba.fastjson.JSONArray sub_button=new JSONArray();
        sub_button.add(cbt);
        sub_button.add(vbt);
         
         
        JSONObject buttonOne=new JSONObject();
        buttonOne.put("name", "菜单");
        buttonOne.put("sub_button", sub_button);
         
        JSONArray button=new JSONArray();
        button.add(vbt);
        button.add(buttonOne);
        button.add(cbt);
         
        JSONObject menujson=new JSONObject();
        menujson.put("button", button);
        System.out.println("788888888888888888");
        System.out.println(menujson);
        String access_token= GlobalConstants.interfaceUrlProperties.getProperty("access_token");
        System.out.println(access_token);
        //这里为请求接口的url   +号后面的是token
        String url="https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+"LZ7i79tM8_iJh7m0Ehgyxm8NpU4DPlOPIapKwtYowUpEFfmUh4VOvTXNUKVr4bdd7MedxtlitcxVU6eoS22EE_VPFwHf9X72rTZRaTNrM91xsIv08cFTGqNkIYRulCejWRJcAAACXP";
        try{
            String rs=HttpUtil.sendPostBuffer(url, menujson.toJSONString());
            System.out.println(rs);
        }catch(Exception e){
            System.out.println("请求错误！");
        }
     
    }
 
}
