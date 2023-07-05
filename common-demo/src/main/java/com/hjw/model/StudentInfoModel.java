package com.hjw.model;

import com.hjw.base.BaseModel;

import java.io.Serializable;

/**
 * @PackageClassName: com.hjw.model.TeacherInfoModel
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 下午 02:06
 */
public class StudentInfoModel extends BaseModel implements Serializable {

    private static final long serialVersionUID = -6249077613709462017L;
    
    private Long id;

    private Long teacherId;

    private String name;

    private String hobby;

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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
