package com.tzb.rabbitmq.common.api;

/**
 * Create by zhatang on 2021/1/20.
 */
/**
 * 封装API的错误码
 * Created by macro on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}