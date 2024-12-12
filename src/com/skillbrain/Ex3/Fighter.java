package com.skillbrain.Ex3;

public abstract class Fighter {
    public abstract boolean isVulnerable();
    public abstract int damagePoints(Fighter target);

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}
