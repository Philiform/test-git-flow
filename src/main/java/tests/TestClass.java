package main.java.tests;

public class TestClass {
	private String nom;
	
	TestClass(String nom) {
		this.setNom(nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
