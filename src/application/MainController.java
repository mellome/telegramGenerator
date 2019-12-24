package application;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import application.pages.Eintrag;
import application.wrapper.*;
import application.common.Constants;
import application.controller.CreateXMLController;
import application.pages.Item;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

public class MainController {

    private static EintragListWrapper einTragWrapper = new EintragListWrapper();
    private static ItemWrapper itemWrapper = new ItemWrapper();
    private static CreateXMLController cxc;
    private static File outFile;
    
    @FXML
    private AnchorPane anchorPaneId;

    @FXML
    private TextField articleID;
    @FXML
    private TextField materialID;
    @FXML
    private TextField batchID;
    @FXML
    private TextField quantityID;
    @FXML
    private TextField locationID;
    @FXML
    private TextField filePathID;
    @FXML
    private Button submit;
    @FXML
    private Button addButton;
    @FXML
    private Button addToXML;
    @FXML
    private Button addToXML1;
    @FXML
    private TableView<Eintrag> tableView;
    
    /********************** items of page1 ***************************/
    @FXML
    private TextField item_material_ID;
    @FXML
    private TextField materialCodeEANID;
    @FXML
    private TextField sku_t1ID;
    @FXML
    private TextField sku_t2ID;
    @FXML
    private TextField quantitySKUID;
    @FXML
    private CheckBox  softID;
    @FXML
    private TextField descriptionID;
    @FXML
    private TextField lengthID;
    @FXML
    private TextField widthID;
    @FXML
    private TextField heightID;
    @FXML
    private TextField gross_weightID;
   
    /****************************************************************/

    @FXML
    public void startEnter(Event e) {
        boolean isDisable = isNull();
        addButton.setDisable(isDisable);
    }

    @FXML
    public void buttonAdd(Event e) {
        Eintrag tempEintrag = new Eintrag(articleID.getText(), materialID.getText(), batchID.getText(), quantityID.getText(), locationID.getText());
        tableView.getItems().add(tempEintrag);
        einTragWrapper.addEintrag(tempEintrag);
        cxc = new CreateXMLController(einTragWrapper);
    }

    @FXML
    public void createXML(Event e) throws JAXBException {
    	//testLocalFile();
    	if(outFile != null) {
    		MainController.saveDataToFile(outFile);
    	}else {
    		MainController.saveDataToFile(new File(Constants.LOCALFILE));
    	}
    }
    
    /********************** create XML for page1 ***************************/
    @FXML
    public void startPage1(Event e) {
    	Item tempItem = new Item(item_material_ID.getText(), materialCodeEANID.getText(),sku_t1ID.getText(),sku_t2ID.getText(),
    			quantitySKUID.getText(), 
    			softID.isSelected(),
    			null,
    			descriptionID.getText(), lengthID.getText(), widthID.getText(),heightID.getText(),
    			null, null, null, 
    			gross_weightID.getText(), 
    			null);
    	System.out.println(tempItem.toString());
    	System.out.println("itemWrapper hier: ");
    	itemWrapper.setItem(tempItem);
    	itemWrapper.show();
    	cxc = new CreateXMLController(itemWrapper);
    }

    /*******************************************************************/
    
    @FXML
    public void selectFilePath(Event e) {
    	boolean isDisable = false;
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Select File");
    	File selectedFile = fileChooser.showSaveDialog(null);
    	
    	if(selectedFile!=null) {
    		if(!selectedFile.getPath().endsWith(".xml")) {
    			selectedFile = new File(selectedFile.getPath()+".xml");
    		}
    		outFile = selectedFile;
    		addToXML.setDisable(isDisable);
    		addToXML1.setDisable(isDisable);
    	}
    }
    
    @FXML
    public void writeFilePath(Event e) {
    	// entered address includes the file name which ends with .xml
    	String pathStr = filePathID.getText();
    	boolean isDisable = nullPath(pathStr);
    	if(pathStr.isEmpty()) {
    		System.out.println("sorry, you entered an invalid address. please try it again!");
    	}else {
    		outFile = new File(pathStr);
    	}
    	addToXML.setDisable(isDisable);
    	addToXML1.setDisable(isDisable);
    }
    
    
    /****************************** Hilfsmittel ***********************************/

    public static void saveDataToFile(File file) {
    	
        try {
			JAXBContext context = JAXBContext.newInstance(CreateXMLController.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			System.out.println("********** XML ***********");
			cxc.toString();
			marshaller.marshal(cxc, System.out);
			marshaller.marshal(cxc, file);
			System.out.print("filePath:\n" + file.getPath());
		} catch (Exception e) {
			 System.out.print("Could not save data to file:\n" + file.getPath());
		}
    }
    
    private boolean isNull() {
    	  return (articleID == null & materialID == null & batchID == null & locationID == null) || (articleID.getText().isEmpty()
                  & articleID.getText().trim().isEmpty() & materialID.getText().isEmpty() & materialID.getText().trim().isEmpty()
                  & batchID.getText().isEmpty() & batchID.getText().trim().isEmpty() & quantityID.getText().isEmpty()
                  & quantityID.getText().trim().isEmpty() & locationID.getText().isEmpty() & locationID.getText().trim().isEmpty());
    }
    
    private boolean nullPath(String pathStr) {
    	return pathStr.trim().isEmpty();
    }
    
}
