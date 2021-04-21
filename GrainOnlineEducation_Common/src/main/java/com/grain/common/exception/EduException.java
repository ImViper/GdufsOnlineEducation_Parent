package com.grain.common.exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @description：自定义异常
 * @modified By：
 * @version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "全局异常")
public class EduException extends RuntimeException {

    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "异常消息")
    private String msg;

    @Override
    public String toString() {
        return "EduException{" +
                "message=" + this.getMsg() +
                ", code=" + code +
                '}';
    }

}
