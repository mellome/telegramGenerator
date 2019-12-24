package application.pages;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Item {
//
//  private final SimpleIntegerProperty MATERIAL;
//  private final SimpleIntegerProperty MaterialCodeEAN;
//  private final SimpleIntegerProperty SKU_T1;
//  private final SimpleIntegerProperty SKU_T2;
//  private final SimpleIntegerProperty QuantitySKU = new SimpleIntegerProperty(10);
//  private final SimpleBooleanProperty SOFT;
//  private final SimpleStringProperty UnitOfMeasure = new SimpleStringProperty("PCS");
//  private final SimpleStringProperty Description;
//  private final SimpleIntegerProperty Length;
//  private final SimpleIntegerProperty Width;
//  private final SimpleIntegerProperty Height;
//  private final SimpleStringProperty DimensionUnit_ISO = new SimpleStringProperty("cm");
//  private final SimpleIntegerProperty Gross_Weight;
//  private final SimpleStringProperty WeightUnit_ISO = new SimpleStringProperty("g");
//  
//
//  public Item( int MATERIAL, int MaterialCodeEAN, int SKU_T1, int SKU_T2, int QuantitySKU, boolean SOFT, String UnitOfMeasure, 
//		  String Description, int Length, int Width, int Height, String DimensionUnit_ISO, int Gross_Weight, String WeightUnit_ISO) {
//	  this.MATERIAL = new SimpleIntegerProperty(MATERIAL);
//	  this.MaterialCodeEAN = new SimpleIntegerProperty(MaterialCodeEAN);
//	  this.SKU_T1 = new SimpleIntegerProperty(MATERIAL);
//	  this.SKU_T2 = new SimpleIntegerProperty(MATERIAL);
//	  //QuantitySKU;
//	  this.SOFT = new SimpleBooleanProperty(SOFT);
//	  //UnitOfMeasure 
//	  this.Description = new SimpleStringProperty(Description);
//	  this.Length = new SimpleIntegerProperty(Length);
//	  this.Width = new SimpleIntegerProperty(Width);
//	  this.Height = new SimpleIntegerProperty(Height);
//	  //DimensionUnit_ISO 
//	  this.Gross_Weight = new SimpleIntegerProperty(Gross_Weight);
//	  //WeightUnit_ISO 
//  }
  
  private SimpleStringProperty MATERIAL;
  private SimpleStringProperty MaterialCodeEAN;
  private SimpleStringProperty SKU_T1;
  private SimpleStringProperty SKU_T2;
  private SimpleStringProperty QuantitySKU = new SimpleStringProperty("10");
  private SimpleBooleanProperty SOFT;
  private SimpleStringProperty UnitOfMeasure = new SimpleStringProperty("PCS");
  private SimpleStringProperty Description;
  private SimpleStringProperty Length;
  private SimpleStringProperty Width;
  private SimpleStringProperty Height;
  private SimpleStringProperty DimensionUnit_ISO = new SimpleStringProperty("cm");
  private SimpleStringProperty Volume_SKU = new SimpleStringProperty("1000");
  private SimpleStringProperty VolumeUnit_ISO = new SimpleStringProperty("qcm");
  private SimpleStringProperty Gross_Weight;
  private SimpleStringProperty WeightUnit_ISO = new SimpleStringProperty("g");
  

  public Item( String MATERIAL, String MaterialCodeEAN, String SKU_T1, String SKU_T2, 
				String QuantitySKU, boolean SOFT, String UnitOfMeasure, String Description,
				String Length, String Width, String Height, String DimensionUnit_ISO, 
		  		String Volume_SKU, String VolumeUnit_ISO, String Gross_Weight, 
		  		String WeightUnit_ISO) {
	  this.MATERIAL = new SimpleStringProperty(MATERIAL);
	  this.MaterialCodeEAN = new SimpleStringProperty(MaterialCodeEAN);
	  this.SKU_T1 = new SimpleStringProperty(MATERIAL);
	  this.SKU_T2 = new SimpleStringProperty(MATERIAL);
	  //QuantitySKU 
	  this.SOFT = new SimpleBooleanProperty(SOFT);
	  //UnitOfMeasure 
	  this.Description = new SimpleStringProperty(Description);
	  this.Length = new SimpleStringProperty(Length);
	  this.Width = new SimpleStringProperty(Width);
	  this.Height = new SimpleStringProperty(Height);
	  //DimensionUnit_ISO 
	  //Volume_SKU
	  //VolumeUnit_ISO
	  this.Gross_Weight = new SimpleStringProperty(Gross_Weight);
	  //WeightUnit_ISO 
  }
  
  public Item() {}
  
  @Override
  public String toString() {
  	return "Item [MATERIAL=" + MATERIAL + ", MaterialCodeEAN=" + MaterialCodeEAN + ", SKU_T1=" + SKU_T1 + ", SKU_T2="
  			+ SKU_T2 + ", QuantitySKU=" + QuantitySKU + ", SOFT=" + SOFT + ", UnitOfMeasure=" + UnitOfMeasure
  			+ ", Description=" + Description + ", Length=" + Length + ", Width=" + Width + ", Height=" + Height
  			+ ", DimensionUnit_ISO=" + DimensionUnit_ISO + ", Volume_SKU=" + Volume_SKU + ", VolumeUnit_ISO="
  			+ VolumeUnit_ISO + ", Gross_Weight=" + Gross_Weight + ", WeightUnit_ISO=" + WeightUnit_ISO + "]";
  }
  
	public String getMATERIAL() {
		return MATERIAL.get();
	}
	
	
	public String getMaterialCodeEAN() {
		return MaterialCodeEAN.get();
	}
	
	
	public String getSKU_T1() {
		return SKU_T1.get();
	}
	
	
	public String getSKU_T2() {
		return SKU_T2.get();
	}
	
	
	public String getQuantitySKU() {
		return QuantitySKU.get();
	}
	
	
	public boolean getSOFT() {
		return SOFT.get();
	}
	
	
	public String getUnitOfMeasure() {
		return UnitOfMeasure.get();
	}
	
	
	public String getDescription() {
		return Description.get();
	}
	
	
	public String getLength() {
		return Length.get();
	}
	
	
	public String getWidth() {
		return Width.get();
	}
	
	
	public String getHeight() {
		return Height.get();
	}
	
	
	public String getDimensionUnit_ISO() {
		return DimensionUnit_ISO.get();
	}
	
	
	public String getGross_Weight() {
		return Gross_Weight.get();
	}
	
	
	public String getWeightUnit_ISO() {
		return WeightUnit_ISO.get();
	}
	
	public String getVolume_SKU() {
		return Volume_SKU.get();
	}

	public String getVolumeUnit_ISO() {
		return VolumeUnit_ISO.get();
	}
	
	public void setMATERIAL(String mATERIAL) {
		MATERIAL.set(mATERIAL);
	}



	public void setMaterialCodeEAN(String materialCodeEAN) {
		MaterialCodeEAN.set(materialCodeEAN);
	}



	public void setSKU_T1(String sKU_T1) {
		SKU_T1.set(sKU_T1);
	}



	public void setSKU_T2(String sKU_T2) {
		SKU_T2.set(sKU_T2);
	}



	public void setQuantitySKU(String quantitySKU) {
		QuantitySKU.set(quantitySKU);
	}



	public void setSOFT(boolean sOFT) {
		SOFT.set(sOFT);
	}



	public void setUnitOfMeasure(String unitOfMeasure) {
		UnitOfMeasure.set(unitOfMeasure);
	}



	public void setDescription(String description) {
		Description.set(description);
	}



	public void setLength(String length) {
		Length.set(length);
	}



	public void setWidth(String width) {
		Width.set(width);
	}



	public void setHeight(String height) {
		Height.set(height);
	}



	public void setDimensionUnit_ISO(String dimensionUnit_ISO) {
		DimensionUnit_ISO.set(dimensionUnit_ISO);
	}



	public void setVolume_SKU(String volume_SKU) {
		Volume_SKU.set(volume_SKU);
	}



	public void setVolumeUnit_ISO(String volumeUnit_ISO) {
		VolumeUnit_ISO.set(volumeUnit_ISO);
	}



	public void setGross_Weight(String gross_Weight) {
		Gross_Weight.set(gross_Weight);
	}



	public void setWeightUnit_ISO(String weightUnit_ISO) {
		WeightUnit_ISO.set(weightUnit_ISO);
	}


  

}