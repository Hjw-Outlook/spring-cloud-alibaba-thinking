package com.hjw.serviceImpl;

import com.hjw.service.TeacherInfoService;
import com.hjw.service.TeacherTeachService;
import com.hjw.service.feign.activity.ActivityFeignService;
import com.hjw.service.feign.testpaper.TestPaperFeignService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @PackageClassName: com.hjw.service.TeacherTeachService
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 下午 02:16
 */
@Service
public class TeacherTeachServiceImpl implements TeacherTeachService {

    @Autowired
    private TeacherInfoService teacherInfoService;
    @Autowired
    private ActivityFeignService activityFeignService;
    @Resource
    private TestPaperFeignService testPaperFeignService;

    // 全局事务需要其他服务也要开启全局事务才能够识别
    @GlobalTransactional
    @Override
    public String teacherWorking() {
        teacherInfoService.teachStudent(null);
        activityFeignService.insertActivityInfo();
        testPaperFeignService.insertTestPaperInfo();
        // int i = 1/0;
        return "success";
    }

}
