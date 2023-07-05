package com.hjw.serviceImpl;

import com.hjw.domain.StudentInfo;
import com.hjw.domain.TeacherInfo;
import com.hjw.mapper.StudentInfoMapper;
import com.hjw.mapper.TeacherInfoMapper;
import com.hjw.model.StudentInfoModel;
import com.hjw.service.StudentInfoService;
import com.hjw.service.TeacherInfoService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @PackageClassName: com.hjw.serviceImpl.UserInfoServiceImpl
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:12
 */
@Service
public class TeacherInfoServiceImpl implements TeacherInfoService {

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;
    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public TeacherInfo searchTeacherInfoById(Long id) {
        return teacherInfoMapper.selectById(id);
    }

    @Transactional
    @Override
    public TeacherInfo insertTeacherInfo(TeacherInfo teacherInfo) {
        teacherInfoMapper.insert(teacherInfo);
        return teacherInfo;
    }

    @Transactional
    @Override
    public String teachStudent(Long id) {
        TeacherInfo teacherInfo = null;
        if (id != null && id > 0) teacherInfo = teacherInfoMapper.selectById(id);
        if (teacherInfo == null) {
            TeacherInfo teacher = new TeacherInfo();
            teacherInfo = insertTeacherInfo(teacher.getInitInstance());
        }


        try {
            StudentInfo student = new StudentInfo();
            student = student.getInitInstance();
            student.setTeacherId(teacherInfo.getId());
            //studentInfoService.insertStudentInfo(student);
        TeacherInfoService teacherInfoService = (TeacherInfoService)AopContext.currentProxy();
        teacherInfoService.insertStudentInfo(student);
        } catch (Exception e) {}

        int i = 1/0;

        return "1";
    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public void insertStudentInfo(StudentInfo studentInfo) {
        studentInfoMapper.insert(studentInfo);

    }

}
