package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;
public class VectorTest {

	@Test
	public void IndexOf() {
		int[] v=new int[] {9,15,7,12,6};
		assertEquals(0, vector.indexOf(v, 9));
		assertEquals(2, vector.indexOf(v, 7));
		assertEquals(4, vector.indexOf(v, 6));
		//assertEquals(-1, vector.indexOf(v, 33));
	}
	@Test
	public void indexOfEmpty() {
		int[] v=new int[] {};
		assertEquals(-1, vector.indexOf(v, 7));
	}
	@Test
	public void min() {
		assertEquals(6, vector.min(new int[] {9,15,7,12,6}));
		assertEquals(7, vector.min(new int[] {9,15,7,12,16}));
		assertEquals(9, vector.min(new int[] {9,15,17,12,16}));
	}
	@Test
	public void indexOfMin() {
		assertEquals(4,vector.IndexOfMin(new int[]{9,15,7,12,6}));
		assertEquals(0,vector.IndexOfMin(new int[]{9,15,17,12,16}));
	}
		
	@Test
	public void sum() {
		assertEquals(49,vector.sum(new int[] {9,15,7,12,6}));
		assertEquals(0,vector.sum(new int[] {}));
		assertEquals(43, vector.sum(new int[] {9,15,7,12}));
	}
}
