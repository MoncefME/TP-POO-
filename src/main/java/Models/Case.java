package Models;


import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.Serializable;

public abstract class Case implements Serializable {
    protected int id;
    protected String color;
    protected int step;
    protected int bonus;
    public String className;


    /******Getter and setters************/
    public String getClassName() {
        return className;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    protected VBox caseVbox = new VBox();
    public VBox getCaseVbox() {
        return caseVbox;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getStep() {
        return step;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
