package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import model.Compiler;

class CompilerTest {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	Compiler.setT0(1);
	Compiler.setT1(0);
	Compiler.setT2(12);
	}

	@Test
	void addTest() throws Exception {
		setUpBeforeClass();
      assertEquals(13,Compiler.add("t2", "t0"));
	}
	
	@Test
	void addiTest() throws Exception {
		setUpBeforeClass();
      assertEquals(19,Compiler.addi("t2", 7));
	}
	
	@Test
	void subTest() throws Exception {
		setUpBeforeClass();
      assertEquals(11,Compiler.sub("t2", "t0"));
	}
	
	@Test
	void mulTest() throws Exception {
		setUpBeforeClass();
		Compiler.setT0(2);
      assertEquals(24,Compiler.mul("t2", "t0"));
	}
	
	@Test
	void divTest() throws Exception {
		setUpBeforeClass();
		Compiler.setT0(2);
      assertEquals(6,Compiler.div("t2", "t0"));
	}
	
	@Test
	void negTest() throws Exception {
		setUpBeforeClass();
		Compiler.setT2(-12);
      assertEquals(12,Compiler.neg(Compiler.getT2()));
	}
	
	@Test
	void sltTest() throws Exception {
		setUpBeforeClass();
      assertEquals(0,Compiler.slt("t0", "t1"));
	}
	
	@Test
	void sltiTest() throws Exception {
		setUpBeforeClass();
      assertEquals(1,Compiler.slti("t0", 5));
	}
	
	@Test
	void xorTest() throws Exception {
		setUpBeforeClass();
		assertEquals(1,Compiler.xor("t0", "t1"));
	}
	
	@Test
	void norTest() throws Exception {
		setUpBeforeClass();
      assertEquals(0,Compiler.nor("t0", "t1"));
	}
	
	@Test
	void andTest() throws Exception {
		setUpBeforeClass();
      assertEquals(0,Compiler.and("t0", "t1"));
	}
	
	@Test
	void andiTest() throws Exception {
		setUpBeforeClass();
      assertEquals(1,Compiler.andi("t0", 1));
	}
	
	@Test
	void orTest() throws Exception {
		setUpBeforeClass();
      assertEquals(1,Compiler.or("t0", "t1"));
	}
	
	@Test
	void oriTest() throws Exception {
		setUpBeforeClass();
      assertEquals(1,Compiler.ori("t0", 1));
	}

}
