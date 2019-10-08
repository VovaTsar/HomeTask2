package com.task.homework11.proxy.dynamic;

import com.task.homework11.proxy.dynamic.http.Response;
import com.task.homework11.proxy.dynamic.service.UserService;
import com.task.homework11.proxy.dynamic.service.UserServiceImpl;

import java.lang.reflect.Method;
public class ConsoleApplication {
    public static void main(String[] args) throws Throwable {

        // user is not null -> 200 , "alex"
        // user is not found ->404
        // if id null -> 500
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        UserService userService = new UserServiceImpl();
        Class<? extends UserService> clazz = userService.getClass();
        Method method = clazz.getMethod("findById", Long.class);


        Response response =
                exceptionHandler.invoke(userService, method, new Object[]{3l});
        System.out.println(response);
    }
}
