package org.example.memento.game;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-22 14:27
 **/
public class Memento {
    private int vit;
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
