package com.ivm.bupazu.confirm;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class testModel {
	@NotNull(message="{username.not.empty}") 
	private String name; 
	@Length(min=5, max=20, message="{username.not.empty}")
	private String psw;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	} 
}
