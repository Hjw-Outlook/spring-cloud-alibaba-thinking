package com.hjw.controller;

import com.hjw.domain.TestPaperInfo;
import com.hjw.service.TestPaperInfoService;
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
@RequestMapping("/testPaperInfo")
public class TestPaperInfoController {

    @Autowired
    private TestPaperInfoService testPaperInfoService;

    @GetMapping("search/{id}")
    public TestPaperInfo searchTestPaperInfoById(@PathVariable Long id) {
        return testPaperInfoService.searchTestPaperInfoById(id);
    }

}
