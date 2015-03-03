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

	public static void main(String[] args) {
		String city1 = args[0];
		String city2 = args[1];
		if(!isCityPresent(city1)){
			System.out.println("No city named "+city1+" in database");
		}
		if(!isCityPresent(city2)){
			System.out.println("No city named "+city2+" in database");
		}
		if(isCityPresent(city1) && isCityPresent(city2)){
			System.out.println(""+isPathAvailable(city1 , city2));
		}

	}

}
