package com.hjw.model;


import java.io.Serializable;

/**
 * @PackageClassName: com.hjw.domain.LtcUserInfo
 * @Description: TODO
 * @Author: JerryH
 * @Date: 2023-07-04, 0004 上午 11:01
 */
public class LtcUserInfoModel implements Serializable {

    private static final long serialVersionUID = -6324709733120271920L;
    
    private Long id;

    private String name;

    private String username;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
