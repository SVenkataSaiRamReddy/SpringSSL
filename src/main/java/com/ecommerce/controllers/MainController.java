package com.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

         @Autowired
         private Repository repository;
         
         @GetMapping("/")
          @ResponseBody
          public String index() {
               

            return "This is running under SSL";
          }

		public Repository getRepository() {
			return repository;
		}

		public void setRepository(Repository repository) {
			this.repository = repository;
		}
         
        
}
