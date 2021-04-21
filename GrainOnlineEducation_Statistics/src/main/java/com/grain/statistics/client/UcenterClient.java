package com.grain.statistics.client;

import com.grain.common.result.Result;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author：Viper
 * @email：756627124@qq.com
 * @date：Created in 2020/11/10 10:25
 * @description：
 * @modified By：
 * @version: $
 */
@Component
@FeignClient("grain-ucenter")
public interface UcenterClient {

    @GetMapping(value = "/ucenter/member/count-register/{day}")
    public Result registerCount(@PathVariable String day);
}
