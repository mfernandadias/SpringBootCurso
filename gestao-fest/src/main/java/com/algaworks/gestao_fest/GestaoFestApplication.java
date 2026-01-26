package com.algaworks.gestao_fest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//essa anotação diz que a classe faz parte da configuração do Spring
/*
Poderíamos adicionar configurações customizadas, como por exemplos, definir o idioma ou até fazer
redirecianamentos, caso não encontra uma página, mas como já vimos o PSirng Boot define muitos
comportamentos padronizados, e não precisaremos alterar nada para ter a aplicação funcionando

 */
@SpringBootApplication
public class GestaoFestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoFestApplication.class, args);
	}

}
