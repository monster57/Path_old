import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PathTest {
	@Test
	public void Test_isPathAvailable_returns_true_for_banglore_to_singapore_route(){
		assertTrue(Path.isPathAvailable("banglore" , "singapore"));
	}
	@Test
	public void Test_isPathAvailable_returns_false_for_banglore_to_tokyo(){
		assertFalse(Path.isPathAvailable("banglore" , "tokyo"));
	}
}
