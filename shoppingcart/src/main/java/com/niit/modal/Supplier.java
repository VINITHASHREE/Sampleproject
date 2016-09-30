package com.niit.modal;

public class Supplier {
	
	private int supplierid; 
	private String suppliername;
	private String emailaddress;
	private int mobilenumber;
	private String address;


	public int getSupplierId() {
	 return supplierid;
	}
	public void setSupplierId(int supplierid) {
	 this.supplierid = supplierid;
	}
	public String getSupplierName() {
	 return suppliername;
	}
	public void setSupplierName(String suppliername) {
	 this.suppliername = suppliername;
	}
	public String getEmailAddress() {
	 return emailaddress;
	}
	public void setEmailAddress(String emailaddress) {
	 this.emailaddress = emailaddress;
	}
	
	public int getMobileNumber() {
		 return mobilenumber;
	}
	public void setMobileNumber(int mobilenumber) {
	 this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
	 return address;
	}
	public void setAddress(String address) {
	 this.address = address;
	}


}
