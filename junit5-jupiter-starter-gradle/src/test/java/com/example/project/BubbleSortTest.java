package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

	BubbleSort bs = new BubbleSort();

	@Test
	public void testSortWithANegative() {
		int[] array = { 3, 1, 4, 78, 12, 44, -3 };
		bs.bubbleSort(array);
		int[] arrayEsperado = { -3, 1, 3, 4, 12, 44, 78 };
		assertArrayEquals(arrayEsperado, array);
	}

	@Test
	public void testArrayWithArepeated() {
		int[] array = { 3, 1, 4, 78, 12, 44, 3 };
		bs.bubbleSort(array);
		int[] arrayEsperado = { 1, 3, 3, 4, 12, 44, 78 };
		assertArrayEquals(arrayEsperado, array);
	}

	@Test
	public void testOnlyNegatives() {
		int[] array = { -3, -1, -4, -78, -12, -44, -3 };
		bs.bubbleSort(array);
		int[] arrayEsperado = { -78, -44, -12, -4, -3, -3, -1 };
		assertArrayEquals(arrayEsperado, array);
	}

	@Test
	public void testAnAlradyOrganized() {
		int[] array = { 1, 2, 3, 4 };
		bs.bubbleSort(array);
		int[] arrayEsperado = { 1, 2, 3, 4 };
		assertArrayEquals(arrayEsperado, array);
	}

	@Test
	public void testAnormalDesorganizedArray() {
		int[] array = { 64, 34, 25, 12, 22, 11, 90 };
		bs.bubbleSort(array);
		int[] arrayEsperado = { 11, 12, 22, 25, 34, 64, 90 };
		assertArrayEquals(arrayEsperado, array);
	}
}
