package com.example.project;

import java.util.Arrays;

public class Anagrama {

	String s1;
	String s2;

	public Anagrama(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public boolean validarAnagrama() {
		if (s1.length() == s2.length()) {
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			return Arrays.equals(charArray1, charArray2);
			
		} else {
			return false;
		}
	}
	public void mostrarMensaje() {
		if (validarAnagrama()) {
			System.out.println(s1 + " and " + s2 + " are anagram.");  
		}else {
			 System.out.println(s1 + " and " + s2 + " are not anagram.");  
		}
	}
	
}