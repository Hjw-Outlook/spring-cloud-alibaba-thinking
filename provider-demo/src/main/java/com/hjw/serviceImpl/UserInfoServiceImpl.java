package com.hjw.serviceImpl;

import com.hjw.domain.LtcUserInfo;
import com.hjw.mapper.UserInfoMapper;
import com.hjw.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageClassName: com.hjw.serviceImpl.UserInfoServiceImpl
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:12
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public LtcUserInfo searchUserInfoById(Long id) {
        return userInfoMapper.selectById(id);
    }
}
