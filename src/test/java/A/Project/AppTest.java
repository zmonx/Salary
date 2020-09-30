package A.Project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
public class AppTest     
{    
	Salary object;
	
	@Before
	public void newClassSalary() {
		object = new Salary();
		
	}
	
	@Test
	public void testResultNameInputName() {
		String input = "John" ;
		String expected = "John";
		object.setName(input);
		String actual = object.getName();
		assertEquals(expected, actual);
	}
	
	
}
