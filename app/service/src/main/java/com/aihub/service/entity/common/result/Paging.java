package com.aihub.service.entity.common.result;

import lombok.Data;

/**
 * 分页信息
 */
@Data
public class Paging {

    /**
     * 分页大小，每页条数
     */
    private Integer size = 20;

    /**
     * 页数
     */
    private Integer num = 1;

    /**
     * 获取sql查询limit开始值
     * @return
     */
    public Integer getLimitStart() {
        if (num > 0) {
            return size * (num - 1);
        } else {
            return 0;
        }
    }
}
