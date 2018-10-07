package com.direct.oto.entity;

import java.io.Serializable;

public class ScholarShip implements Serializable {
	protected int addmissionNum;
	protected String bankaccNum;
	protected String category;
	protected String amount;
	protected Addmission addmission;
	@Override
	public String toString() {
		return "ScholarShip [addmissionNum=" + addmissionNum + ", bankaccNum=" + bankaccNum + ", category=" + category
				+ ", amount=" + amount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addmissionNum;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((bankaccNum == null) ? 0 : bankaccNum.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScholarShip other = (ScholarShip) obj;
		if (addmissionNum != other.addmissionNum)
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (bankaccNum == null) {
			if (other.bankaccNum != null)
				return false;
		} else if (!bankaccNum.equals(other.bankaccNum))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		return true;
	}
	public int getAddmissionNum() {
		return addmissionNum;
	}
	public void setAddmissionNum(int addmissionNum) {
		this.addmissionNum = addmissionNum;
	}
	public String getBankaccNum() {
		return bankaccNum;
	}
	public void setBankaccNum(String bankaccNum) {
		this.bankaccNum = bankaccNum;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Addmission getAddmission() {
		return addmission;
	}
	public void setAddmission(Addmission addmission) {
		this.addmission = addmission;
	}
	
		
}
