package com.niit.modal;

public class Card {

	private String cardholdername;
	private int cardnumber ; 
	private int cvvnumber ; 
	private String cardtype;
	
	public String getCardHolderName() {
		 return cardholdername;
		}
		public void setCardHolderName(String cardholdername) {
		 this.cardholdername = cardholdername;
		}
		public int getCardNumber() {
		 return cardnumber;
		}
		public void setCardNumber(int cardnumber) {
		 this.cardnumber = cardnumber;
		}
		public int getCvvNumber() {
		 return cvvnumber;
		}
		public void setcvvnumber(int cvvnumber) {
		 this.cvvnumber = cvvnumber;
		}
		
		public String getCardType() {
			 return cardtype;
		}
		public void setCardType(String cardtype) {
		 this.cardtype = cardtype;
		}
}
