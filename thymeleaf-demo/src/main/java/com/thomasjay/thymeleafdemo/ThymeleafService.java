package com.thomasjay.thymeleafdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service
public class ThymeleafService {

	@Autowired
	SpringTemplateEngine templateEngine;
	
	
	public String processTemplate(String templateName, Context ctx) {
				
		return (templateEngine.process(templateName, ctx));
		
	}
	    
	    
}
