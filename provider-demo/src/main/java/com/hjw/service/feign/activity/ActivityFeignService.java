package com.hjw.service.feign.activity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @PackageClassName: com.hjw.service.feign.activity.AcivityFeignService
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 下午 02:34
 */
@FeignClient(name = "activity-provider-demo", contextId = "activityFeignService", decode404 = true)
public interface ActivityFeignService {

    @GetMapping("/activityInfo/insertActivityInfo")
    void insertActivityInfo();
}
