package org.bdqn.logistics.service;





public interface RonglianSmsCodeService {
    void send(String to,String templateId)  throws Exception;
}
