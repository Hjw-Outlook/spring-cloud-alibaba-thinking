package com.hjw.controller;

import com.hjw.service.TeacherTeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.TeacherTeachController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 下午 02:15
 */
@RestController
@RequestMapping("/teach")
public class TeacherTeachController {

    @Autowired
    private TeacherTeachService teacherTeachService;

    @GetMapping("teacherWorkingBySeata")
    public String teacherWorking() {
        return teacherTeachService.teacherWorking();
    }
}
