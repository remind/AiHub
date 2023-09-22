package com.aihub.service.entity;

import com.aihub.service.entity.common.Entity;
import lombok.Data;

/**
 * 业务场景
 */
@Data
public class BizScene extends Entity {

    /**
     * 场景编码
     */
    private String code;

    /**
     * 场景名称
     */
    private String name;

    /**
     * 角色指令
     */
    private String rolePrompt;

    /**
     * 场景描述
     */
    private String desc;

}
