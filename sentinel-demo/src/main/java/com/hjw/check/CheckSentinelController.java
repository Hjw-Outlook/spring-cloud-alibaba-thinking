package com.hjw.check;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
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
public class CheckSentinelController {

    @ResponseBody
    @GetMapping("/checkUp")
    @SentinelResource(value = "check", blockHandler = "checkBlockHandler", fallback = "checkFallback")
    public String check() {
        return "sentinel-demo up...";
    }

    public String checkBlockHandler() {
        return "checkBlockHandler()...";
    }

    public String checkFallback() {
        return "checkFallback()...";
    }
}
