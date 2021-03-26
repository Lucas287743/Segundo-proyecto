package com.example.demo.model;

public class Cuenta {
	private Integer numCuenta;
	private int dni;
	private int saldo;
	private String nombre;
	
	//constructor sin parametros
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	
	//constructor con parametros
	public Cuenta(int numCuenta, int dni, int saldo) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}

	public void extraer(double monto) {
		saldo=saldo-monto;
	}
	
	public void depositar(double monto) {
		saldo=saldo+monto;
	}

	public Integer getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(Integer numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
