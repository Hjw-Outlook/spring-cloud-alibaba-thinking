package com.hjw.feign;

import com.hjw.model.TeacherInfoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageClassName: com.hjw.feign.CheckFeignService
 * @Description: feign 接口
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 09:43
 */
@FeignClient(name = "provider-demo", contextId = "teacherInfoFeignService", decode404 = true)
public interface TeacherInfoFeignService {

    @GetMapping("/teacherInfo/teachStudent")
    String teachStudent(@RequestParam(required = false) Long id);

    @GetMapping("/teach/teacherWorkingBySeata")
    String teacherWorking();
}
