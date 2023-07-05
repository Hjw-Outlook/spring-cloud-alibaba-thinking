package com.hjw.feign;

import com.hjw.model.TestPaperInfoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PackageClassName: com.hjw.feign.CheckFeignService
 * @Description: feign 接口
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 09:43
 */
@FeignClient(name = "test-paper-provider-demo", contextId = "testPaperInfoFeignService", decode404 = true)
public interface TestPaperInfoFeignService {

    @GetMapping("/testPaperInfo/search/{id}")
    TestPaperInfoModel searchTestPaperInfoById(@PathVariable Long id);
}
