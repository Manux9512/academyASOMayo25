package com.curso.v5;

public class Contenedor<T extends Transporte> {

    private T t;

	public Contenedor(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <E> void mostrarCertificado(E e) {
		System.out.println(t + ", Certificado: " + e );
	}

	@Override
	public String toString() {
		return "Contenedor [t=" + t + "]";
	}
	
	
   
}
