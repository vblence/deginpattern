package com.degin.pattern.visitor;

public class FinancePart implements Part {
    @Override
    public void accept(ZhengShiEmploy zhengShiEmploy) {
        System.out.println("zhengshi finance");
    }

    @Override
    public void accept(LinShiEmploy linShiEmploy) {
        System.out.println("linshi finance");
    }

    @Override
    public void accept(NewEmploy newEmploy) {
        System.out.println("new Finance");
    }
}
