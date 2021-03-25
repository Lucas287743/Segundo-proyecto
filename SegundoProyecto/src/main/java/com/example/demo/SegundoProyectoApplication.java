package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controler.CalculadoraControler;

@SpringBootApplication
public class SegundoProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoApplication.class, args);
		
		CalculadoraControler nuevoControler = new CalculadoraControler();
		nuevoControler.resolverSuma();
	}
}
