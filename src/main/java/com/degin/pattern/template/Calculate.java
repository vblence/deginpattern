package com.degin.pattern.template;

public abstract class Calculate {
    public abstract void getdata();
    public abstract void CalculateData();
    public abstract void returndata();

    final  void excute(){
        this.getdata();
        this.CalculateData();
        this.returndata();
    }
}
