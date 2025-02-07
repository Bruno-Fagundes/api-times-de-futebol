package com.company.nomeprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicializa a aplicação Spring Boot.
 * @SpringBootApplication combina as anotações:
 * - @Configuration: Indica que a classe pode conter beans de configuração
 * - @EnableAutoConfiguration: Habilita a configuração automática do Spring Boot
 * - @ComponentScan: Habilita a varredura de componentes no pacote atual e subpackages
 */

@SpringBootApplication
public class ApplicationApi {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationApi.class, args);
    }
}
