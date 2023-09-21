package com.aihub.common.result;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class PageResult<T> {

    /**
     * 总条数
     */
    private Integer total;

    /**
     * 分页信息
     */
    private Paging paging;

    /**
     * 内容
     */
    private List<T> content;

}
