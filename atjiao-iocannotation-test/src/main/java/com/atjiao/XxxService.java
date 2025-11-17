package com.atjiao;

import org.springframework.stereotype.Service;

/**
 * projectName: com.atguigu.components
 *
 * description: service类型组件
 */
//加上注解实际就是添加了一个Bean标签
@Service
public class XxxService {

    public void show(){
        System.out.println("Service show():");
    }
}