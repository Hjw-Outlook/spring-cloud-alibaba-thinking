package com.hjw.serviceImpl;

import com.hjw.domain.TestPaperInfo;
import com.hjw.mapper.TestPaperInfoMapper;
import com.hjw.service.TestPaperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    @Transactional
    @Override
    public TestPaperInfo insertTestPaperInfo() {
        TestPaperInfo testPaperInfo = new TestPaperInfo();
        testPaperInfo.setName("语文卷");
        testPaperInfo.setContext("作文题");
        testPaperInfo.setPaperRange("高中语文");
        testPaperInfo.setDeletedFlag(false);
        testPaperInfo.setCreateBy(-1L);
        testPaperInfo.setCreateAt(new Date());
        testPaperInfo.setUpdateBy(-1L);
        testPaperInfo.setUpdateAt(new Date());
        testPaperInfoMapper.insert(testPaperInfo);
        int i = 1/0;
        return testPaperInfo;
    }


}
