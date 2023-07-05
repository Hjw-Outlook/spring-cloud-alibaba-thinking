package com.hjw.feign;

import com.hjw.model.ActivityInfoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageClassName: com.hjw.feign.CheckFeignService
 * @Description: feign 接口
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 09:43
 */
@FeignClient(name = "activity-provider-demo", contextId = "activityInfoFeignService", decode404 = true)
public interface ActivityInfoFeignService {

    @GetMapping("/activityInfo/search/{id}")
    ActivityInfoModel searchActivityInfoById(@PathVariable Long id);
}
