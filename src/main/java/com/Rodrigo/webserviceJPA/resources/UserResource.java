package com.Rodrigo.webserviceJPA.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rodrigo.webserviceJPA.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {//Nome da respectiva classe + resource
	
	/*
	 * Classes Resources sao ocntroladores da camada rest, dependem de servicos que dependem de repositories
	 * @RestController -> Recurso web que eh implementado por um controlador rest 
	 * @RequestMapping(value = "/users") -> Nome do recurso, passando um caminho "/.."
	 * @GetMapping -> Metodo que responde a requisicao do tipo "GET" do HTTP
	 * ResponseEntity<T> Tipo generics que retorna resposta de requisicoes web do tipo informado
	 * .ok() -> Retorna resposta com sucesso no HTTP
	 * .body() -> Retorna o corpo da resposta, esse usuario passado como parametro "u" que foi instanciado
	 * **Esse eh o controlador rest que reposnde no caminho localhost:9080/users
	 */
	
	@GetMapping//*Annotation*
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Rodrigo", "rmarno@gmail", "91070678", "666");
		return ResponseEntity.ok().body(u);
	}
	
}
