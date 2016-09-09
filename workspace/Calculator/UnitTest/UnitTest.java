import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	@Test
	   public void test_returnAddition() {
	      System.out.println("Test if calculator returns correct addition...") ;
	      Calculator C1 = new Calculator(1,1,1) ;
	      assertTrue(C1.calculatorFunction() == 2) ;
	   }
	@Test
	   public void test_returnSubtraction() {
	      System.out.println("Test if calculator returns correct subtraction...") ;
	      Calculator C2 = new Calculator(2,2,2) ;
	      assertTrue(C2.calculatorFunction() == 0) ;
	   }
	@Test
	   public void test_returnMultiplication() {
	      System.out.println("Test if calculator returns correct multiplication...") ;
	      Calculator C2 = new Calculator(8,3,2) ;
	      assertTrue(C2.calculatorFunction() == 16) ;
	   }
	@Test
	   public void test_returnDivision() {
	      System.out.println("Test if calculator returns correct division...") ;
	      Calculator C2 = new Calculator(8,4,2) ;
	      assertTrue(C2.calculatorFunction() == 4) ;
	   }
	@Test
	   public void test_returnModulus() {
	      System.out.println("Test if calculator returns correct modulus...") ;
	      Calculator C2 = new Calculator(8,5,2) ;
	      assertTrue(C2.calculatorFunction() == 0) ;
	   }
}
