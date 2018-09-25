package com.easy.user.controller;


import com.easy.user.entity.EUser;
import com.easy.user.service.IEUserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.easy.base.ctrl.BaseController;

import java.util.Objects;

/**
 * <p>
 * 用户表(注册、登录信息) 前端控制器
 * </p>
 *
 * @author jp
 * @since 2018-09-25
 */
@RestController
@RequestMapping("/user/eUser")
public class EUserController extends BaseController {

    private IEUserService userService;

    @RequestMapping("/{id}")
    public EUser getUser(Long id){
        if (Objects.isNull(id)) {
            return null;
        } else {
            return userService.getById(1);
        }
    }

}