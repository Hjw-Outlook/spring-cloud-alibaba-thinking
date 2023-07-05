package com.hjw.model;

import com.hjw.base.BaseModel;

import java.io.Serializable;

/**
 * @PackageClassName: com.hjw.model.TeacherInfoModel
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:06
 */
public class ActivityInfoModel extends BaseModel implements Serializable {

    private static final long serialVersionUID = 6002763942708065676L;

    private Long id;

    private String name;

    private String context;

    private String localtion;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }
}
