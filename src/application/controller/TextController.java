/*
 * Copyright (c) SSI Schaefer IT Solutions GmbH
 */
package application.controller;

import java.util.Arrays;

import javafx.scene.control.TextField;

public class TextController {

    //Path P = Paths.get(GeneralCons.LOCALPATH);
    //Text text = new Text();

    private final String[] textArr = { " ", " ", " ", " ", " " };

    private final TextField articleID;
    private final TextField materialID;
    private final TextField batchID;
    private final TextField quantityID;
    private final TextField locationID;
    
    public TextController(TextField articleID, TextField materialID, TextField batchID, TextField quantityID, TextField locationID) {
        this.articleID = articleID;
        this.materialID = materialID;
        this.batchID = batchID;
        this.quantityID = quantityID;
        this.locationID = locationID;

        if (articleID != null) {
            textArr[0] = articleID.getText();
        }
        if (materialID != null) {
            textArr[1] = materialID.getText();
        }
        if (batchID != null) {
            textArr[2] = batchID.getText();
        }
        if (quantityID != null) {
            textArr[3] = quantityID.getText();
        }
        if (locationID != null) {
            textArr[4] = locationID.getText();
        }
    }
    
    public String[] getArr() {
        return textArr;
    }

    public String getText() {
        return Arrays.toString(textArr);
    }

    public boolean isNull() {
        return (articleID == null & materialID == null & batchID == null & locationID == null) || (articleID.getText().isEmpty()
                & articleID.getText().trim().isEmpty() & materialID.getText().isEmpty() & materialID.getText().trim().isEmpty()
                & batchID.getText().isEmpty() & batchID.getText().trim().isEmpty() & quantityID.getText().isEmpty()
                & quantityID.getText().trim().isEmpty() & locationID.getText().isEmpty() & locationID.getText().trim().isEmpty());
    }

}
