package com.hemant.struts1.form;

import org.apache.struts.action.ActionForm;

/**
 * 
 * @author hemant
 * This is a 'Form Backing Object'. This POJO will map to the fields in the
 * UI form.
 */
public class HelloForm extends ActionForm{

	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
