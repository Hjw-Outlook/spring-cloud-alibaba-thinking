package com.hjw.service;

import com.hjw.domain.ActivityInfo;

/**
 * @PackageClassName: com.hjw.service.UserInfoService
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:11
 */
public interface ActivityInfoService {

    ActivityInfo searchTeacherInfoById(Long id);


    ActivityInfo insertActivityInfo();
}
