package com.direct.oto.entity;

import java.io.Serializable;
import java.util.Date;

public class Addmission implements Serializable {
	protected int addmissionNum;
	protected Date dateOfAddmission;
	protected String candidateName;
	protected String degree;
	protected String college;
	protected ScholarShip scholarShip;
	@Override
	public String toString() {
		return "Addmission [addmissionNum=" + addmissionNum + ", dateOfAddmission=" + dateOfAddmission
				+ ", candidateName=" + candidateName + ", degree=" + degree + ", college=" + college + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addmissionNum;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + ((dateOfAddmission == null) ? 0 : dateOfAddmission.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
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
		Addmission other = (Addmission) obj;
		if (addmissionNum != other.addmissionNum)
			return false;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (college == null) {
			if (other.college != null)
				return false;
		} else if (!college.equals(other.college))
			return false;
		if (dateOfAddmission == null) {
			if (other.dateOfAddmission != null)
				return false;
		} else if (!dateOfAddmission.equals(other.dateOfAddmission))
			return false;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		return true;
	}
	public int getAddmissionNum() {
		return addmissionNum;
	}
	public void setAddmissionNum(int addmissionNum) {
		this.addmissionNum = addmissionNum;
	}
	public Date getDateOfAddmission() {
		return dateOfAddmission;
	}
	public void setDateOfAddmission(Date dateOfAddmission) {
		this.dateOfAddmission = dateOfAddmission;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public ScholarShip getScholarShip() {
		return scholarShip;
	}
	public void setScholarShip(ScholarShip scholarShip) {
		this.scholarShip = scholarShip;
	}

	
}
