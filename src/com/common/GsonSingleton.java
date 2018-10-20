package com.common;

import com.google.gson.Gson;

//双重校验锁法
public class GsonSingleton {
	private volatile static Gson instance;

    public static Gson getInstance(){
        if(instance==null){
            synchronized (GsonSingleton.class){
                if(instance==null){
                    instance=new Gson();
                }
            }
        }
        return instance;
    }
}
