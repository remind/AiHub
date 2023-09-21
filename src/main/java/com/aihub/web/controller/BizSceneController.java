package com.aihub.web.controller;

import com.aihub.common.result.PageResult;
import com.aihub.common.result.Result;
import com.aihub.entity.BizScene;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务场景
 */
@RestController
@RequestMapping("/biz-scene")
public class BizSceneController {

    @RequestMapping("/query")
    public Result<BizScene> query() {
        return Result.success(new BizScene());
    }
}
