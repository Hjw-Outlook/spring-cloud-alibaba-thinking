package com.hjw.service;

import com.hjw.domain.LtcUserInfo;

/**
 * @PackageClassName: com.hjw.service.UserInfoService
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:11
 */
public interface UserInfoService {

    LtcUserInfo searchUserInfoById(Long id);
}
