package com.dp.creational.prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("General is Unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("reset operations not allowed");
	}
}
