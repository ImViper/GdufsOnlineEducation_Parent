package com.grain.common.result;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @description：返回结果状态码
 * @modified By：
 * @version: $
 */
public interface ResultCode {

    int OK = 20000;//成功
    int ERROR = 20001;//失败

    int SQL_ERROR = 20006;//sql错误

}
