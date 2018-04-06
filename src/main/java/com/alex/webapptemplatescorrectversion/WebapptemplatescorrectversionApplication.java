package com.alex.webapptemplatescorrectversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class WebapptemplatescorrectversionApplication {

    // Set up home page
	@RequestMapping("/")
	public String home(Model model) {
	    List favoriteFoods = Arrays.asList("pizza", "tacos", "hamburgers");
        model.addAttribute("author", "Alex");
	    model.addAttribute("favoriteFoods", favoriteFoods);
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebapptemplatescorrectversionApplication.class, args);
	}
}
