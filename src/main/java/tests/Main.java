package main.java.tests;

public class Main {

	public static void main(String[] args) {
		TestClass testClass = new TestClass("Phil", 38);
		
		System.out.println("nom de TestClass: " + testClass.getNom());
		System.out.println("âge de TestClass: " + testClass.getAge());
	}

}
