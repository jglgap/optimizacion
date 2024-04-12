package com.example.project;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramaTest {
	Anagrama a1= new Anagrama("amor","casa");//tiene que dar false
	Anagrama a2= new Anagrama("amor","omar");//tiene que dar true
	Anagrama a3= new Anagrama("casa","saca");//tiene que dar true
	Anagrama a4= new Anagrama("Loba","Abol");//tiene que dar false
	Anagrama a5= new Anagrama("pescaderia","pescao");//tiene que dar false
	Anagrama a6= new Anagrama("ABROL","ARBOL");//tiene que dar true
	Anagrama a7= new Anagrama("suka","KASu");//tiene que dar false
	
	@Test
	public void testAnagrama(){
		assertFalse(a1.validarAnagrama());
		assertTrue(a2.validarAnagrama());
		assertTrue(a3.validarAnagrama());
		assertFalse(a4.validarAnagrama());
		assertFalse(a5.validarAnagrama());
		assertTrue(a6.validarAnagrama());
		assertFalse(a7.validarAnagrama());
	}
	
}
