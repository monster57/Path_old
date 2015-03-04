import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PathTest {
	@Test
	public void Test_isPathAvailable_returns_true_for_banglore_to_singapore_route(){
		Path newPath = new Path();
		assertTrue(newPath.isPathAvailable("banglore" , "singapore"));
	}
	@Test
	public void Test_isPathAvailable_returns_true_for_banglore_to_seoul(){
		Path newPath = new Path();
		assertTrue(newPath.isPathAvailable("banglore" , "seoul"));

	}
	@Test 
	public void Test_isPathAvailable_returns_true_for_singapore_to_tokyo(){
		Path newPath = new Path();
		assertTrue(newPath.isPathAvailable("singapore" , "tokyo"));
	}
	@Test 
	public void Test_isPathAvailable_returns_true_for_beijing_to_singapore(){
		Path newPath = new Path();
		assertTrue(newPath.isPathAvailable("beijing" , "singapore"));
	}
	@Test
	public void Test_isCityPresent_returns_true_for_singapore(){
		Path newPath = new Path();
		assertTrue(newPath.isCityPresent("singapore"));
	}
	@Test
	public void Test_isCityPresent_returns_false_for_chennai(){
		Path newPath = new Path();
		assertFalse(newPath.isCityPresent("chennai"));
	}
}
