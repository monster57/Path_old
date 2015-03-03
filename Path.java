import java.util.*;

public class Path{
	static Map<String ,List<String>> routes = new HashMap<String , List<String>>();
	static{
		List <String> banglore = new ArrayList<String>();
		banglore.add("singapore");
		List <String> singapore = new ArrayList<String>();
		singapore.add("banglore");
		singapore.add("tokyo");
		List <String> tokyo =  new ArrayList<String>();
		tokyo.add("singapore");

		routes.put("banglore" , banglore);
		routes.put("singapore" , singapore);
		routes.put("tokyo" , tokyo);
	};
	// public static boolean isCityPresent(String city){
	//
	// }
	public static  boolean isPathAvailable(String source , String destination){
		Set newSet = routes.keySet();
		if(!newSet.contains(source) || !routes.get(source).contains(destination)){
			return false;
		}
		return true;
	}

}
