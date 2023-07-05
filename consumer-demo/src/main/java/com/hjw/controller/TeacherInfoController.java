package com.hjw.controller;

import com.hjw.feign.TeacherInfoFeignService;
import com.hjw.model.TeacherInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/teacherInfo")
public class TeacherInfoController {

    @Autowired
    private TeacherInfoFeignService teacherInfoFeignService;

    @GetMapping("teachStudent")
    public String teachStudent(@RequestParam(required = false) Long id) {
        return teacherInfoFeignService.teachStudent(id);
    }
}
