package br.com.fiap.keep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class KeepApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeepApplication.class, args);
	}


	@GetMapping
	public String home(){
		return "index";
	}

}
