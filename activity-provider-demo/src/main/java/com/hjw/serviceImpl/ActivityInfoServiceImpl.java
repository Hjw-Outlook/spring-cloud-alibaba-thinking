package com.hjw.serviceImpl;

import com.hjw.domain.ActivityInfo;
import com.hjw.mapper.ActivityInfoMapper;
import com.hjw.service.ActivityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Random;

/**
 * @PackageClassName: com.hjw.serviceImpl.UserInfoServiceImpl
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:12
 */
@Service
public class ActivityInfoServiceImpl implements ActivityInfoService {

    @Autowired
    private ActivityInfoMapper activityInfoMapper;

    @Override
    public ActivityInfo searchTeacherInfoById(Long id) {
        return activityInfoMapper.selectById(id);
    }

    @Transactional
    @Override
    public ActivityInfo insertActivityInfo() {
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setName("课外阅读");
        activityInfo.setContext("读书");
        activityInfo.setLocaltion("图书馆");
        activityInfo.setDeletedFlag(false);
        activityInfo.setCreateBy(-1L);
        activityInfo.setCreateAt(new Date());
        activityInfo.setUpdateBy(-1L);
        activityInfo.setUpdateAt(new Date());
        activityInfoMapper.insert(activityInfo);
        return activityInfo;
    }


}
