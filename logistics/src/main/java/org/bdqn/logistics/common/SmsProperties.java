package org.bdqn.logistics.common;

import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsProperties {
    @Value("${user.smsCode.accountSid}")
    private String accountSid;
    @Value("${user.smsCode.accountToken}")
    private String accountToken;
    @Value("${user.smsCode.appId}")
    private String appId;
    @Value("${user.smsCode.serverIp}")
    private String serverIp;
    @Value("${user.smsCode.serverPort}")
    private String serverPort;

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAccountToken() {
        return accountToken;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    @Bean
    public CCPRestSmsSDK createPhoneClient(){
        CCPRestSmsSDK ccpRestSmsSDK = new CCPRestSmsSDK();
        ccpRestSmsSDK.setAppId(appId);
        ccpRestSmsSDK.setAccount(accountSid,accountToken);
        ccpRestSmsSDK.init(serverIp,serverPort);
        return ccpRestSmsSDK;
    }
}
