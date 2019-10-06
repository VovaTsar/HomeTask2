package com.task.homework11.proxy.dynamic.service;

import com.task.homework11.proxy.dynamic.domain.User;
import com.task.homework11.proxy.dynamic.exception.EntityNotFoundRuntimeException;
import com.task.homework11.proxy.dynamic.exception.ServerErrorRuntimeException;

public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        if (id == null) {
            throw new ServerErrorRuntimeException("Server Error");
        }
        if (id == 1) {
            return new User();
        }
        throw new EntityNotFoundRuntimeException("NOT FOUND");
    }
}