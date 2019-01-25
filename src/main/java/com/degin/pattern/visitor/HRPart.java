package com.degin.pattern.visitor;

public class HRPart implements Part{
    @Override
    public void accept(NewEmploy newEmploy) {
        System.out.println("new HR");
    }

    @Override
    public void accept(ZhengShiEmploy zhengShiEmploy) {
        System.out.println("zhengshi HR");
    }

    @Override
    public void accept(LinShiEmploy linShiEmploy) {
        System.out.println("linshi HR");
    }
}
