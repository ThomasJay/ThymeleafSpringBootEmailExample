package com.thomasjay.thymeleafdemo;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.context.Context;


@SpringBootApplication
public class ThymeleafDemoApplication implements CommandLineRunner {

	@Autowired
	ThymeleafService thymeleafService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ThymeleafDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Lets do it");
		
		
		   final Context ctx = new Context();
		    ctx.setVariable("name", "Tom Jay");
//		    ctx.setVariable("subscriptionDate", new Date());
		    ctx.setVariable("tasks", Arrays.asList("Create Web Site", "Cleam up CSS", "Send emails"));
//		    ctx.setVariable("imageResourceName", imageResourceName); // so that we can reference it from HTML

		    
		String html = thymeleafService.processTemplate("welcome", ctx);
		
		System.out.println("Returned HTML: " + html);
		
	}


}
