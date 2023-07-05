package com.hjw.model;

import com.hjw.base.BaseModel;

import java.io.Serial;
import java.io.Serializable;

/**
 * @PackageClassName: com.hjw.model.TeacherInfoModel
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:06
 */
public class TestPaperInfoModel extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -7910200700342528914L;
    
    private Long id;

    private String name;

    private String subject;

    private String position;



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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
