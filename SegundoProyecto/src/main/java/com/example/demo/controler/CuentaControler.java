package com.example.demo.controler;

import com.example.demo.model.Cuenta;

public class CuentaControler {
	public void operarConCuenta() {
		Cuenta nuevaCuenta = new Cuenta();
		
		int numCuenta =1;
		int dni= 2910312;
		int saldo= 0;
		Cuenta otraCuenta = new Cuenta(numCuenta,dni,saldo);
		
		System.out.println("Valor nombre de nuevaCuenta "+ nuevaCuenta.getNombre());
		
		System.out.println("Valor dni de otraCuenta "+ otraCuenta.getDni());
		
		System.out.println("Valor del saldo"+ otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(2000);
		
		System.out.println("Valor del saldo"+ otraCuenta.getSaldo());
		
		otraCuenta.extrear(100);
		
		if(otraCuenta.getSaldo()<0) {
			System.out.println("Saldo insuficiente");
			otraCuenta.depositar(100);
		}
		System.out.println("Valor del saldo"+ otraCuenta.getSaldo());
	}
}
