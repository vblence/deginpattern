package com.degin.pattern.state;

/**
 * @Description 状态模式
 **/
public class test {
    public static void main(String[] args) {
        Context context=new Context();
        context.setNum(55);

        context.request();
    }
}
