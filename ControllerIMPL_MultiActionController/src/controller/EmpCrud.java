package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpCrud extends MultiActionController{
	
	
	/*public ModelAndView empSave(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return  new ModelAndView("saveSuccess");
	}
	
	public ModelAndView empUpdate(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return  new ModelAndView("updateSuccess");
	}*/
	
public ModelAndView DurgaempSaveCrud(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return  new ModelAndView("saveSuccess");
	}
	
	public ModelAndView DurgaempUpdateCrud(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return  new ModelAndView("updateSuccess");
	}

}
