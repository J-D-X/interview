package com.hfk;

/**
 * @author HFKKK
 */
public interface SmsService {
    /**
     *
     * @param message:发送的消息
     * @return 返回发送的消息
     */
    String send(String message);
}
