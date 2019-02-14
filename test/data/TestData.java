package data;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.ChopService;

public class TestData {
	
	@Test
	public void chopTest01() {
		
		List<Integer> values = new ArrayList<Integer>();
		Integer	position = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest02() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		
		Integer	position = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest03() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		
		Integer	position = Integer.valueOf(1);		
		
		assertEquals(Integer.valueOf(0), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest04() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(1);		
		
		assertEquals(Integer.valueOf(0), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest05() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(1), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest06() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(5);		
		
		assertEquals(Integer.valueOf(2), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest07() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(0);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}	
	
	@Test
	public void chopTest08() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(2);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}	
	
	@Test
	public void chopTest09() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(4);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest10() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		
		Integer	position = Integer.valueOf(6);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}	
	
	@Test
	public void chopTest11() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(1);		
		
		assertEquals(Integer.valueOf(0), new ChopService().chop(position, values));
	}	
	
	@Test
	public void chopTest12() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(3);		
		
		assertEquals(Integer.valueOf(1), new ChopService().chop(position, values));
	}	
	
	@Test
	public void chopTest13() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(5);		
		
		assertEquals(Integer.valueOf(2), new ChopService().chop(position, values));
	}	
	
	@Test
	public void chopTest14() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(5);		
		
		assertEquals(Integer.valueOf(2), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest15() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(7);		
		
		assertEquals(Integer.valueOf(3), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest16() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(0);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest17() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(2);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}

	@Test
	public void chopTest18() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(4);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}	

	@Test
	public void chopTest19() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(6);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}
	
	@Test
	public void chopTest20() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(Integer.valueOf(1));
		values.add(Integer.valueOf(3));
		values.add(Integer.valueOf(5));
		values.add(Integer.valueOf(7));
		
		Integer	position = Integer.valueOf(8);		
		
		assertEquals(Integer.valueOf(-1), new ChopService().chop(position, values));
	}	
}
