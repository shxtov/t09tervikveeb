package app;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main{


	Toode arvuti = new Toode("Arvuti", 1, 599);
	Toode telefon = new Toode("Telefon", 1, 299);
	
	List<Toode> tooted = new ArrayList<Toode>(){{
		add(arvuti);
		add(telefon);
	}};

	@RequestMapping("/increment")
	public String increment(String toode){
		
		for(Toode f: tooted){
			if(f.getName().equals(toode)){
				f.increment();
				return "Number of "+f.getName()+"s: "+f.amount+".";
			}
		}
		return "error";
	}
	
	@RequestMapping("/sum")
	public String calculateSum(String toode){
		
		for(Toode f: tooted){
			if(f.getName().equals(toode)){
				return "Sum: "+f.sum();
			}
		}
		return "Error";
	}
	
	public static void main(String[] args){
		
		System.getProperties().put("server.port", 4215);
		SpringApplication.run(Main.class, args);
	
	}
}