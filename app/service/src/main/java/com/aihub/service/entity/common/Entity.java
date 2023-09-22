package com.aihub.service.entity.common;

import lombok.Data;

import java.util.Date;

@Data
public class Entity {

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;
}
