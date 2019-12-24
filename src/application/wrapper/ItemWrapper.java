package application.wrapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import application.pages.Item;

@XmlRootElement
public class ItemWrapper {

    private Item item;

    public ItemWrapper() {
    	item = new Item();
    }
    
    @XmlElement(name = "ITEM")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
  
    public void clear() {
    	item = new Item();
    }
    
    public void show() {
    	System.out.println(item.toString());
    }
}
