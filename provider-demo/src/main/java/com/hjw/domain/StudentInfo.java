package com.hjw.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hjw.model.StudentInfoModel;
import com.hjw.model.TeacherInfoModel;

import java.util.Date;
import java.util.Random;

/**
 * @PackageClassName: com.hjw.domain.TeacherInfo
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:08
 */
@TableName("student_info")
public class StudentInfo extends StudentInfoModel {

    public StudentInfo getInitInstance() {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName(randomString(new String[]{"张三三", "李四四", "王五五", "老六六"}));
        studentInfo.setHobby(randomString(new String[]{"篮球", "足球", "羽毛球", "乒乓球"}));
        studentInfo.setPosition(randomString(new String[]{"普通", "优秀"}));
        studentInfo.setCreateAt(new Date());
        studentInfo.setCreateBy(-1L);
        studentInfo.setUpdateAt(new Date());
        studentInfo.setUpdateBy(-1L);
        return studentInfo;
    }

    private String randomString(String[] randomStr) {
        Random random = new Random();
        return randomStr[random.nextInt(randomStr.length)];
    }
}
