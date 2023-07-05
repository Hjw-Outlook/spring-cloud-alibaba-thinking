package com.hjw.controller;

import com.hjw.feign.CheckFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.CheckFeignController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 09:46
 */
@RestController
@RequestMapping("/checkConsumerFeign")
public class CheckFeignController {

    @Autowired
    private CheckFeignService checkFeignService;

    @ResponseBody
    @GetMapping("checkFeign")
    public String checkFeign() {
        return checkFeignService.check();
    }

}
