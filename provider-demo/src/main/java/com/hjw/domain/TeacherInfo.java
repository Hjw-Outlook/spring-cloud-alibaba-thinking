package com.hjw.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hjw.model.TeacherInfoModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

/**
 * @PackageClassName: com.hjw.domain.TeacherInfo
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:08
 */
@TableName("teacher_info")
public class TeacherInfo extends TeacherInfoModel {


    public TeacherInfo getInitInstance() {
        TeacherInfo teacherInfo = new TeacherInfo();
        teacherInfo.setName(randomString(new String[]{"张三", "李四", "王五", "老六"}));
        teacherInfo.setSubject(randomString(new String[]{"语文", "数学", "英文", "物理"}));
        teacherInfo.setPosition(randomString(new String[]{"普通教师", "优秀教师", "特级教师", "模范教师"}));
        teacherInfo.setCreateAt(new Date());
        teacherInfo.setCreateBy(-1L);
        teacherInfo.setUpdateAt(new Date());
        teacherInfo.setUpdateBy(-1L);
        return teacherInfo;
    }

    private String randomString(String[] randomStr) {
        Random random = new Random();
        return randomStr[random.nextInt(randomStr.length)];
    }
}
