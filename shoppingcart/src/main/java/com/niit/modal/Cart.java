package com.niit.modal;

public class Cart {
	
	private int userid;
	private int productid;
	private int quantity;
	private int price ; 
	
	public int getUserId() {
		 return userid;
		}
		public void setUserId(int userid) {
			this.userid = userid;
		}
	public int getProductId() {
		 return productid;
		}
		public void setProductId(int productid) {
			this.productid = productid;
		}
		public int getQuantity() {
			 return quantity;
			}
			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}
			public int getPrice() {
				 return price;
				}
				public void setPrice(int price) {
					this.price = price;
				}
}
