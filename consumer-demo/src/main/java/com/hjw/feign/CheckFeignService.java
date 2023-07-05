package com.hjw.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @PackageClassName: com.hjw.feign.CheckFeignService
 * @Description: feign 接口
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 09:43
 */
@FeignClient(name = "provider-demo", contextId = "checkFeignService", decode404 = true)
public interface CheckFeignService {

    @GetMapping("/check/checkUp")
    String check();
}
