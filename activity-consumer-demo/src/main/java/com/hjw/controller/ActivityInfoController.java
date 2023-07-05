package com.hjw.controller;

import com.hjw.feign.ActivityInfoFeignService;
import com.hjw.model.ActivityInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.TeacherInfoController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:44
 */
@RestController
@RequestMapping("/activityInfo")
public class ActivityInfoController {

    @Autowired
    private ActivityInfoFeignService activityInfoFeignService;

    @GetMapping("search/{id}")
    public ActivityInfoModel searchActivityInfoById(@PathVariable Long id) {
        return activityInfoFeignService.searchActivityInfoById(id);
    }


}
