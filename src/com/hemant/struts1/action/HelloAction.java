package com.hemant.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.hemant.struts1.form.HelloForm;

/**
 * 
 * @author hemant
 * This is an action class. 'Action' classes are simply the 'controller' class.
 * This class will control the flow. 
 */
public class HelloAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		HelloForm helloForm = (HelloForm) form;
		ActionForward actionForward = mapping.getInputForward();
		
		if(helloForm != null && helloForm.getName().equalsIgnoreCase("mike")) {
			actionForward = mapping.findForward("success");
		} else {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("", new ActionMessage("hello.msg.error"));
			saveErrors(request, actionErrors);
		}
		
		return actionForward;
	}
	
	
}
