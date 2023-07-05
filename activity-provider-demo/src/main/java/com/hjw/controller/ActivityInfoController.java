package com.hjw.controller;

import com.hjw.domain.ActivityInfo;
import com.hjw.service.ActivityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.UserInfoController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:07
 */
@RestController
@RequestMapping("/activityInfo")
public class ActivityInfoController {

    @Autowired
    private ActivityInfoService activityInfoService;

    @GetMapping("search/{id}")
    public ActivityInfo searchTeacherInfoById(@PathVariable Long id) {
        return activityInfoService.searchTeacherInfoById(id);
    }

    @GetMapping("insertActivityInfo")
    public ActivityInfo insertActivityInfo() {
        return activityInfoService.insertActivityInfo();
    }


}
