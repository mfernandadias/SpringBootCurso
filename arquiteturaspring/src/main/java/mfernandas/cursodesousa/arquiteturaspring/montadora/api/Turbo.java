package mfernandas.cursodesousa.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Qualifier("motorTurbo")
public @interface Turbo {

}

/*
Antes (sem @Turbo)
@Autowired
@Qualifier("motorTurbo")
private Motor motor;

Depois (com @Turbo)
@Autowired
@Turbo
private Motor motor;

Muito mais limpo e sem repetir a string "motorTurbo"
 */
