package com.niit.modal;

public class Shipping {
	private int productid;
	private String username ; 
	private int price ; 
	private String address;
   
	
	public int getProductId() {
		 return productid;
		}
		public void setProductId(int productid) {
			this.productid = productid;
		}
		public String getUserName() {
		 return username;
		}
		public void setUserName(String username) {
		    this.username = username;
		}
		public int getPrice() {
			 return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getAddress() {
				 return address;
				}
				public void setAddress(String address) {
				 this.address = address;
				}

}
