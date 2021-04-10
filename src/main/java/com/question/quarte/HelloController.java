package com.question.quarte;

import java.util.Random;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "<form method='post' action='/resultado'><input type='text' name='nome' placeholder='Digite Seu Nome'><input type='submit'></form>";
	}
	
	
	
 @PostMapping("/resultado")
 public String olaPessoa(@RequestBody String nome) {
	 nome=nome.substring(5);
	String msg="";
	
	for(int i=nome.length()-1;i>=0;i--) {
		msg+=nome.charAt(i);	
	}
	        return "NOME APRESENTADO: " + msg+"<BR>  <a href=\"http://localhost:8080/\">Retornar</a>";
 }
	
	
	
	

}