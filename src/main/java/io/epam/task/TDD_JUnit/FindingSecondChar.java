package io.epam.task.TDD_JUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRemovalTest {
	
	FindingSecondChar remove;
	@BeforeEach
	   void setup() 
     {
		     remove = new FindingSecondChar();
	   }
	
	@Test
	    void testNChars() {
	       	  assertEquals("AAAA",remove.remove("ABCD"));
		      assertEquals("BACD",remove.remove("AACD"));
		      assertEquals("ABCD",remove.remove("BACD"));
		      assertEquals("AACD",remove.remove("BBAA"));
		      assertEquals("BBCD",remove.remove("AABAA"));
	      }
	
	void test1Char() {
		assertEquals("",remove.remove("A"));
		assertEquals("B",remove.remove("B"));		
	}
	
	void testNoChar() {
		assertEquals("",remove.remove(""));
	}
}

public class FindingSecondChar {
	String remove(String input){
		       String str = input;
		       int len = input.length();
		       if(len>=2) {
		               	if(input.charAt(0) == 'A' && input.charAt(1) == 'A')
		                        		str = str.substring(2);
		              	else if(input.charAt(0) == 'A' && input.charAt(1) != 'A')
		                         		str = str.substring(1);
	              		else if(input.charAt(0) != 'A' && input.charAt(1) == 'A')
		                        		str = str.substring(0,1) + str.substring(2);
	                  	}
	       	else if(len == 1) {
		               	str = input.charAt(0) == 'A' ? "" : str; 
                		}
      		return str;
			}
}