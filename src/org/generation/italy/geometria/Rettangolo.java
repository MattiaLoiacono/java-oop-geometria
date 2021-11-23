package org.generation.italy.geometria;

public class Rettangolo {
	int base, altezza;
	
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	int calcolaArea() {
		return this.base * this.altezza;
	}
	
	int calcolaPerimetro() {
		return this.base*2 + this.altezza*2;
	}
}
