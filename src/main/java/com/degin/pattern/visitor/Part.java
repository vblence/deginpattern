package com.degin.pattern.visitor;

public interface Part{
    void accept(ZhengShiEmploy zhengShiEmploy);
    void accept(LinShiEmploy linShiEmploy);
    void accept(NewEmploy newEmploy);
}
