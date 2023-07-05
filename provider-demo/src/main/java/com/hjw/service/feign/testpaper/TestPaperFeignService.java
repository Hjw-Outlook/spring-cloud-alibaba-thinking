package com.hjw.service.feign.testpaper;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @PackageClassName: com.hjw.service.feign.testpaper.TestPaperFeignService
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-05, 0005 下午 02:41
 */
@FeignClient(name = "test-paper-provider-demo", contextId = "testPaperFeignService", decode404 = true)
public interface TestPaperFeignService {

    @GetMapping("testPaperInfo/insertTestPaperInfo")
    void insertTestPaperInfo();
}
