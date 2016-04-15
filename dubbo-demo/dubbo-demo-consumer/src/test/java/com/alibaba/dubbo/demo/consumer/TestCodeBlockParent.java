package com.alibaba.dubbo.demo.consumer;

/**
 * Created with dubbo-parent
 *
 * @author lipengfei
 * @date 2016-03-27
 * @time 00:38
 */
public class TestCodeBlockParent {

    static{
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类普通代码块");
    }

     TestCodeBlockParent(){
         System.out.println("父类构造函数");
     }


    TestCodeBlockParent(String fefei){
        System.out.println("fefei父类构造函数");
    }
}
