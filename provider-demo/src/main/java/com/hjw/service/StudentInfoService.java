package com.hjw.service;

import com.hjw.domain.LtcUserInfo;
import com.hjw.domain.StudentInfo;

/**
 * @PackageClassName: com.hjw.service.UserInfoService
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:11
 */
public interface StudentInfoService {

    StudentInfo searchStudentInfoById(Long id);

    void insertStudentInfo(StudentInfo studentInfo);
}
