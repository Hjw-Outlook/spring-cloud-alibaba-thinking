package com.hjw.controller;

import com.hjw.feign.UserInfoFeignService;
import com.hjw.model.LtcUserInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.UserInfoController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:34
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoFeignService userInfoFeignService;

    @GetMapping("searchUser/{id}")
    public LtcUserInfoModel searchUerInfoById(@PathVariable Long id) {
        return userInfoFeignService.searchUserInfoById(id);
    }

}
