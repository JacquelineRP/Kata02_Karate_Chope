package data;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.ChopService;

public class TestData {
	
	@Test
	public void chopTest01() {
		
		List<Integer> list = new ArrayList<Integer>();
		Integer	value = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest02() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		
		Integer	value = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest03() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		
		Integer	value = Integer.valueOf(1);		
		
		assertEquals(Integer.valueOf(0), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest04() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(1);		
		
		assertEquals(Integer.valueOf(0), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest05() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(1), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest06() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(5);		
		
		assertEquals(Integer.valueOf(2), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest07() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(0);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}	
	
	@Test
	public void chopTest08() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(2);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}	
	
	@Test
	public void chopTest09() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(4);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest10() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		
		Integer	value = Integer.valueOf(6);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}	
	
	@Test
	public void chopTest11() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(1);		
		
		assertEquals(Integer.valueOf(0), new ChopService().chop(value, list));
	}	
	
	@Test
	public void chopTest12() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(1), new ChopService().chop(value, list));
	}	
	
	@Test
	public void chopTest13() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(5);		
		
		assertEquals(Integer.valueOf(2), new ChopService().chop(value, list));
	}	
	
	@Test
	public void chopTest14() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(5);		
		
		assertEquals(Integer.valueOf(2), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest15() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(7);		
		
		assertEquals(Integer.valueOf(3), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest16() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(0);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest17() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(2);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}

	@Test
	public void chopTest18() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(4);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}	

	@Test
	public void chopTest19() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(6);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}
	
	@Test
	public void chopTest20() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(7));
		
		Integer	value = Integer.valueOf(8);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(value, list));
	}	
}
