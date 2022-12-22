package com.exercises.bll;

public class InvoiceItem {

	private String id;
	private String desc;
	private int  quantity;
	private double unitPrice;
	
	public InvoiceItem() {
		
	}
	
	public InvoiceItem(String id,String desc,int quantity,double unitPrice) {
		this.id=id;
		this.desc=desc;
		this.quantity=quantity;
		this.unitPrice=unitPrice;
	}
	public String getId() {
		return this.id;
	}
	public String getDesc() {
		return this.desc;
	}
	public int getQty() {
		return this.quantity;
	}
	public void setQty(int qty) {
		this.quantity=qty;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(double unitPrice){
	 this.unitPrice=unitPrice;
	}
	public double getTotal() {
		return unitPrice*quantity;
	}
	@Override
	public String toString() {
		return "InvoiceItem Id : "+id+"description : "+desc+"qty : "+quantity+"unitPrice : "+unitPrice;
	}
	
	
}
