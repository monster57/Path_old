import java.util.*;

class Roots{
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

	public static  boolean isPathAvailable(String source , String destination){
		Set newSet = routes.keySet();
		if(!newSet.contains(source) || !routes.get(source).contains(destination)){
			System.out.println(newSet.contains("banglore"));
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if(isPathAvailable("banglor" , "singapore"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}