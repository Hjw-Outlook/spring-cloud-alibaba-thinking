package com.hjw.controller;

import com.hjw.feign.TestPaperInfoFeignService;
import com.hjw.model.TestPaperInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageClassName: com.hjw.controller.TeacherInfoController
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:44
 */
@RestController
@RequestMapping("/testPaperInfo")
public class TestPaperInfoController {

    @Autowired
    private TestPaperInfoFeignService testPaperInfoFeignService;

    @GetMapping("search/{id}")
    public TestPaperInfoModel searchTestPaperInfoById(@PathVariable Long id) {
        return testPaperInfoFeignService.searchTestPaperInfoById(id);
    }
}
