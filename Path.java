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
	public static boolean isCityPresent(String city){
		Set<String> newSet = routes.keySet();
		if(newSet.contains(city)) return true;
		for(String ele:newSet){
			List<String> places = routes.get(ele); 
			if(places.contains(city)) return true;
		}
		return false;
	}
	public static  boolean isPathAvailable(String source , String destination){
		return routes.get(source).contains(destination);
	}

}
