package com.street;

import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.teaopenapi.models.Config;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/20 23:42
 * @desc:
 */
public class test {
    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                .setAccessKeyId(accessKeyId)
                .setAccessKeySecret(accessKeySecret);
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    public static void main(String[] args_) throws Exception {
        java.util.List<String> args = java.util.Arrays.asList(args_);
        com.aliyun.dysmsapi20170525.Client client = createClient("LTAI5tLLpwV6Z2pK6LFLrQrt", "WbGyP7fdtiI0kbkfSkxKM4AOlVVKqd");
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers("15960688512")
                .setSignName("我爱学习")
                .setTemplateCode("SMS_219749033")
                .setTemplateParam("{\"code\":\"1123\"}");
        client.sendSms(sendSmsRequest);

    }
}
