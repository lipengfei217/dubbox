package com.alibaba.dubbo.demo.consumer;

/**
 * Created with dubbo-parent
 *
 * @author lipengfei
 * @date 2016-03-27
 * @time 00:30
 */
public class TestCodeBlock extends TestCodeBlockParent{


    static{
        System.out.println("静态代码块");
    }

    {
        System.out.println("普通代码块");
    }

    public TestCodeBlock(){
        System.out.println("构造函数");
    }



}
