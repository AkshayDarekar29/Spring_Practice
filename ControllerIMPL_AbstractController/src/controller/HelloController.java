package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController extends AbstractController {

	/*@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		Map m = new HashMap();
		m.put("msg" , "Hello " + req.getParameter("name"));
		return new ModelAndView("success", m);
	}*/

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Map m = new HashMap();
		m.put("msg" , "Hello " + req.getParameter("name"));
		
		return new ModelAndView("success", m);
	}

}
