package com.example.demo.controler;

import com.example.demo.model.Calculadora;

public class CalculadoraControler {
	public void resolverSuma() {
		float a=10, b=2;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		System.out.println("El resultado de la suma es "+ nuevaCalculadora.sumarDosNumeros());
		System.out.println("El resultado de la division es "+ nuevaCalculadora.dividirDosNumeros());
	}
}
