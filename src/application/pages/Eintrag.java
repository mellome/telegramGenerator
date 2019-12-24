/*
 * Copyright (c) SSI Schaefer IT Solutions GmbH
 */
package application.pages;

import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.SimpleStringProperty;

@XmlRootElement
public class Eintrag {

    private SimpleStringProperty articleStr;
    private SimpleStringProperty materialStr;
    private SimpleStringProperty batchStr;
    private SimpleStringProperty quantityStr;
    private SimpleStringProperty locationStr;

    public Eintrag(String articleStr, String materialStr, String batchStr, String quantityStr, String locationStr) {
        this.articleStr = new SimpleStringProperty(articleStr);
        this.materialStr = new SimpleStringProperty(materialStr);
        this.batchStr = new SimpleStringProperty(batchStr);
        this.quantityStr = new SimpleStringProperty(quantityStr);
        this.locationStr = new SimpleStringProperty(locationStr);
    }
    
    public Eintrag() {}

    public String getArticleStr() {
        return articleStr.get();
    }

    public String getMaterialStr() {
        return materialStr.get();
    }

    public String getBatchStr() {
        return batchStr.get();
    }

    public String getQuantityStr() {
        return quantityStr.get();
    }

    public String getLocationStr() {
        return locationStr.get();
    }

    public void setArticleStr(String articleStr) {
        this.articleStr.set(articleStr);
    }

    public void setMaterialStr(String materialStr) {
        this.materialStr.set(materialStr);
        ;
    }

    public void setBatchStr(String batchStr) {
        this.batchStr.set(batchStr);
    }

    public void setQuantityStr(String quantityStr) {
        this.quantityStr.set(quantityStr);
    }

    public void setLocationStr(String locationStr) {
        this.locationStr.set(locationStr);
    }

}
