package Models;

import Controllers.MainAppView;

import java.io.Serializable;

public class CaseParcours extends Case implements Serializable {


    public CaseParcours() {
        color = "#ffffff";// white
        className = "CaseParcours";
        step = 0;
        bonus = 0;

        caseVbox.setOnMouseClicked(event -> {
            MainAppView.clickedCASE = getId();
        });
    }
}
