/*
 * Copyright (c) SSI Schaefer IT Solutions GmbH
 */
package application.wrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import application.pages.Eintrag;

@XmlRootElement
public class EintragListWrapper {

    private List<Eintrag> eintragList;

    public EintragListWrapper() {
        eintragList = new ArrayList<>();
    }

    @XmlElement(name = "Eitrag")
    public List<Eintrag> getEintragList() {
        return eintragList;
    }

    public void setEintragList(List<Eintrag> eintragList) {
        this.eintragList = eintragList;
    }

    public void addEintrag(Eintrag eintrag) {
        eintragList.add(eintrag);
    }
    
    public void clear() {
    	eintragList = new ArrayList<>();
    }
}
