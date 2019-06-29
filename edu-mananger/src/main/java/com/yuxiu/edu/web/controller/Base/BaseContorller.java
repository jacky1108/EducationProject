package com.yuxiu.edu.web.controller.Base;
/**
 * 抽取Controller基类
 */

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract  class BaseContorller<T> {
    //manage页面
    public static String MANAGE_PAGE;
    //info页面
    public static String INFO_PAGE;
    //edit页面
    public static String EDIT_PAGE;



    public BaseContorller(){
        try {
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            //1.获取泛型真实类型
            Type[] types = pt.getActualTypeArguments();
            //2.把type类型赋值给Class类型
            Class<T> clz = (Class<T>) types[0];  //User
            //3.定义页面的静态变量
            String modelName = clz.getSimpleName().toLowerCase();
            EDIT_PAGE = modelName + "/edit";
            INFO_PAGE = modelName + "/info";
            MANAGE_PAGE = modelName + "/manage";
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
