package application.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import application.wrapper.EintragListWrapper;
import application.wrapper.ItemWrapper;

@XmlRootElement(name = "message")
//@XmlType(propOrder= {"xhc", "eintragListWrapper"})

public class CreateXMLController {
	
	private XmlHeaderController xhc;
	private ItemWrapper itemWrapper=null;
	private EintragListWrapper eintragListWrapper=null;
	
	 public CreateXMLController() {
		 xhc = new XmlHeaderController();
	 }
	 
	 public CreateXMLController(Object wrapper) {
		 
		 xhc = new XmlHeaderController();
		 
		 if( wrapper instanceof ItemWrapper ) {
			 itemWrapper = (ItemWrapper) wrapper;
		 }
		 
		 if( wrapper instanceof EintragListWrapper ){
			 eintragListWrapper = (EintragListWrapper) wrapper;
		 }

	 }
	 
	 @XmlElement(name="header")
	 public XmlHeaderController getXhc() {
			return xhc;
		}

	 public void setXhc(XmlHeaderController xhc) {
		this.xhc = xhc;
	 }
	 
	 @XmlElement(name="body")
	 public ItemWrapper getItemListWrapper() {
		return itemWrapper;
	 }

	 public void setItemListWrapper(ItemWrapper itemListWrapper) {
		this.itemWrapper = itemListWrapper;
	 }
	 
	 @XmlElement(name="body")
	 public EintragListWrapper getEintragListWrapper() {
		return eintragListWrapper;
	 }

	 public void setEintragListWrapper(EintragListWrapper eintragListWrapper) {
		this.eintragListWrapper = eintragListWrapper;
	 }
    
}
