package com.degin.pattern.memento;

public class Caretaker {
    private Memoto memoto;

    public Caretaker() {
    }

    public Memoto getMemoto() {
        return memoto;
    }

    public void setMemoto(Memoto memoto) {
        this.memoto = memoto;
    }
}
