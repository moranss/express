package org.bdqn.logistics.service;

import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.bdqn.logistics.common.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("RonglianSmsCodeService")
public class RonglianSmsCodeServiceImpl implements  RonglianSmsCodeService{

    @Autowired
    private CCPRestSmsSDK smsSDK ;

    @Value("${user.smsCode.expires}")
    private int expires;

    @Value("${user.smsCode.smsCodelen}")
    private int smsCodelen;

    @Override
    public void send(String to, String templateId) throws Exception{
        String code = MD5.getRandom(smsCodelen);
        HashMap<String,Object> result = smsSDK.sendTemplateSMS(to,templateId,new String[]{code,String.valueOf(expires/60)});
        if ("000000".equals(result.get("statusCode"))){
            System.out.println("发送成功");
        }else {
            throw  new Exception(result.get("statusCode").toString());
        }
    }
}
