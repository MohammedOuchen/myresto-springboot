package com.myresto.domaine;

public class Commande {
	
	private String date;
	private  State state;
	private Customer custommer;
	
	public Commande(String date, State state, Customer custommer) {
		super();
		this.date = date;
		this.state = state;
		this.custommer = custommer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Customer getCustommer() {
		return custommer;
	}

	public void setCustommer(Customer custommer) {
		this.custommer = custommer;
	}
	
	

}
