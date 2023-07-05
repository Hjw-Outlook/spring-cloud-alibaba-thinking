package com.hjw.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.check.CheckController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-03, 0003 下午 05:38
 */
@RestController
@RequestMapping("/check")
public class CheckProviderController {

    @ResponseBody
    @GetMapping("/checkUp")
    public String check() {
        return "provider-demo up...";
    }
}
