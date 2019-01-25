package com.degin.pattern.visitor;


/**
 * @Description 访问者模式
 **/
public class test {
    public static void main(String[] args){
        NewEmploy newEmploy=new NewEmploy();
        Part part=new HRPart();
        part.accept(newEmploy);
    }
}
