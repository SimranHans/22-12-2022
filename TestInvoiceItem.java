package com.exercises.pll;
import  com.exercises.bll.InvoiceItem;


public class TestInvoiceItem {

	public static void main(String[] args) {
		
        InvoiceItem i1=new InvoiceItem();
        InvoiceItem i2=new InvoiceItem("111","Activa 6g",1,960000);
        InvoiceItem i3=new InvoiceItem("122","iphone 12",2,2000000);
        InvoiceItem i4=new InvoiceItem();
        System.out.println("\nDisplaying details of i2 object : ");
        System.out.println("\nId : "+i2.getId());
        System.out.println("Description : "+i2.getDesc());
        System.out.println("quantity : "+i2.getQty());
        System.out.println("UnitPrice : "+i2.getUnitPrice());
        System.out.println("Total "+i2.getTotal());
        System.out.println("\nsetting and displaying details of i4 object : ");
        i4.setQty(10);
        i4.setUnitPrice(123000.0);
        System.out.println("quantity : "+i4.getQty());
        System.out.println("unitPrice : "+i4.getUnitPrice());
        
        
	}

}
