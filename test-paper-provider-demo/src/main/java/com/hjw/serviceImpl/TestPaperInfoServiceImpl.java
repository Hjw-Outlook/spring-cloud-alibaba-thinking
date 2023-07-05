package com.hjw.serviceImpl;

import com.hjw.domain.TestPaperInfo;
import com.hjw.mapper.TestPaperInfoMapper;
import com.hjw.service.TestPaperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageClassName: com.hjw.serviceImpl.UserInfoServiceImpl
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:12
 */
@Service
public class TestPaperInfoServiceImpl implements TestPaperInfoService {

    @Autowired
    private TestPaperInfoMapper testPaperInfoMapper;

    @Override
    public TestPaperInfo searchTestPaperInfoById(Long id) {
        return testPaperInfoMapper.selectById(id);
    }


}
