package com.hjw.controller;

import com.hjw.domain.LtcUserInfo;
import com.hjw.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.UserInfoController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:07
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("search/{id}")
    public LtcUserInfo searchUserInfoById(@PathVariable Long id) {
        return userInfoService.searchUserInfoById(id);
    }
}
