package main.java.tests;

/**
 * donne ou définit le nom et l'âge d'une personne
 * 
 * @author Phil
 *
 */
public class TestClass {
	private String nom;
	private int age;
	
	TestClass(String nom, int age) {
		this.setNom(nom);
		this.setAge(age);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
