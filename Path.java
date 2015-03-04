import java.util.*;

public class Path{
	static Map<String ,List<String>> database = new HashMap<String , List<String>>();
	List<String> routes = new ArrayList<String>();
	static {
		List <String> banglore = new ArrayList<String>();
		banglore.add("singapore");
		List <String> singapore = new ArrayList<String>();
		singapore.add("seoul");
		singapore.add("dubai");
		singapore.add("banglore");
		List <String> seoul =  new ArrayList<String>();
		seoul.add("beijing");
		seoul.add("singapore");

		List <String> beijing =  new ArrayList<String>();
		beijing.add("seoul");
		beijing.add("tokyo");
		List <String> dubai =  new ArrayList<String>();
		dubai.add("singapore");
		List <String> tokyo =  new ArrayList<String>();
		tokyo.add("beijing");

		database.put("banglore" , banglore);
		database.put("singapore" , singapore);
		database.put("seoul" , seoul);
		database.put("beijing" , beijing);
		database.put("dubai" , dubai);
		database.put("tokyo" , tokyo);

	};

	public  boolean isCityPresent(String city){
		Set<String> newSet = database.keySet();
		if(newSet.contains(city)) return true;
		for(String ele:newSet){
			List<String> places = database.get(ele); 
			if(places.contains(city)) return true;
		}
		return false;
	}
	public String look(List<String> startDestination){
		String newStart = findStart(startDestination);
		if(newStart ==null)
			return findStart(startDestination);
		return newStart;
	} 	

	public  String findStart(List<String> startDestination){
		String newStart = "";
		for(String ele: startDestination){
			if(!routes.contains(ele)){
				newStart = ele;	
				break;
			} 
		}
		return newStart;
	}

	public   boolean isPathAvailable(String source , String destination){
		List<String> startDestination = database.get(source); 
		routes.add(source);
		if(startDestination.contains(destination)){
			routes.add(destination);
			return true;
		}
		String newStart = look(startDestination);
		return isPathAvailable(newStart , destination);
				
	}

	public static void main(String[] args) {
		String city1 = args[0];
		String city2 = args[1];
		Path newPath = new Path();
		if(!newPath.isCityPresent(city1))
			System.out.println("No city named "+city1+" in database");
		if(!newPath.isCityPresent(city2)){
			System.out.println("No city named "+city2+" in database");
		}
		if(newPath.isCityPresent(city1) && newPath.isCityPresent(city2)){
			System.out.println(""+newPath.isPathAvailable(city1 , city2));
		}
	}
}
