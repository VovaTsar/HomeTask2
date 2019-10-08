package com.task.homework11.proxy.dynamic;

import com.task.homework11.proxy.dynamic.exception.EntityNotFoundRuntimeException;
import com.task.homework11.proxy.dynamic.exception.ServerErrorRuntimeException;
import com.task.homework11.proxy.dynamic.http.Response;
import com.task.homework11.proxy.dynamic.http.Status;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static com.task.homework11.proxy.dynamic.http.Status.*;

public class ExceptionHandler implements InvocationHandler {

    private Map<Class<? extends Exception>, Status> exceptionToStatus = new HashMap<>();

    public ExceptionHandler() {
        exceptionToStatus.put(EntityNotFoundRuntimeException.class,NOT_FOUND);
        exceptionToStatus.put(ServerErrorRuntimeException.class,SERVER_ERROR);
    }

    @Override
    public Response invoke(Object proxy, Method method, Object[] args){
        try {
            Object invoke = method.invoke(proxy, args);
            return new Response(OK, invoke.toString());
        } catch (InvocationTargetException e) {
            Class<? extends Exception> clazz = (Class<? extends Exception>) e.getCause().getClass();
            System.out.println(clazz);
            Status status = exceptionToStatus.get(clazz);
            return new Response(status, "Id is not correct");
        } catch (Exception e) {
            return new Response(null, "New Error");
        }
    }
}