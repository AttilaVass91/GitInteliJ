package com.skillbrain.Ex3;

public class Wizard extends Fighter{
    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared; // Wizard is vulnerable if no spell is prepared
    }

    @Override
    public int damagePoints(Fighter target) {
        return spellPrepared ? 12 : 3; // 12 if spell prepared , 3 otherwise
    }


}
