package com.degin.pattern.memento;

/**
 * @Description 备忘录模式
 **/
public class test{
   public static void main(String[] args){
       //person 原生者
       //memoto 备份者
       //caretaker 管理者
       Person per=new Person("123","nan");

       //备份
       Caretaker caretaker=new Caretaker();
       caretaker.setMemoto(per.createMemoto());

       //还原
       per.setMemoto(caretaker.getMemoto());

   }
}
