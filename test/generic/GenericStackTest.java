package generic;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericStackTest {
	GenericStack<String> stack1 = new GenericStack<String>();
	GenericStack<Integer> stack2 = new GenericStack<Integer>();
	
	public GenericStackTest() {
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		stack2.push(1);
		stack2.push(2);
		
	}
	
	@Test
	public void testOther(){
	
	}

	@Test
	public void testGetSize() {
		assertEquals(stack1.getSize(), 3);
	}

	@Test
	public void testPeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testPop() {
		assertEquals(stack2.pop(), new Integer(2));
		assertEquals(stack2.getSize(), 1);
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

}
