package com.form.demo.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RestController;
import lombok.*;
@RestController
@Document(collection="response")
@Getter
@Setter
public class formModel {
	private String fisrtname;
	private String lastname;
	private String email;  
	private String phoneNumber;
	private String aadhar;
	private String fatherName;
	private String motherName;
	private String pincode;
	private String label9;
	private String label10;
	@Override
	public String toString() {
		return "formModel [fisrtname=" + fisrtname + ", lastname=" + lastname + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", aadhar=" + aadhar + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", pincode=" + pincode + ", label9=" + label9 + ", label10=" + label10 + "]";
	}
	public String getFisrtname() {
		return fisrtname;
	}
	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLabel9() {
		return label9;
	}
	public void setLabel9(String label9) {
		this.label9 = label9;
	}
	public String getLabel10() {
		return label10;
	}
	public void setLabel10(String label10) {
		this.label10 = label10;
	}
	
	
	
}
