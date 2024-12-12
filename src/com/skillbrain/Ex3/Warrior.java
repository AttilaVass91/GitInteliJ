package com.skillbrain.Ex3;

public class Warrior extends Fighter {

    @Override
    public boolean isVulnerable() {
        return false; // Warriors are never vulnerable
    }

    @Override
    public int damagePoints(Fighter target) {
        return target.isVulnerable() ? 10 : 6; // 10 if target is vulnerable , 6 otherwise
    }
}
