package com.hjw.serviceImpl;

import com.hjw.domain.LtcUserInfo;
import com.hjw.domain.StudentInfo;
import com.hjw.mapper.StudentInfoMapper;
import com.hjw.mapper.UserInfoMapper;
import com.hjw.service.StudentInfoService;
import com.hjw.service.UserInfoService;
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
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public StudentInfo searchStudentInfoById(Long id) {
        return studentInfoMapper.selectById(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void insertStudentInfo(StudentInfo studentInfo) {
        studentInfoMapper.insert(studentInfo);
    }
}
