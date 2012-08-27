package unittest.forms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import uxForms.MainPanel;

public class MainFormTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MainPanel panel = new MainPanel();
	    assertEquals(panel.textField.getText(), "");
		
	}
	
	@Test
	public void test2() {
		MainPanel panel = new MainPanel();
		panel.btnNewButton.doClick();
		
		assertEquals(panel.textField.getText(), "hello world");
	}
	

}
