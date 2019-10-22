package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapInterface {
@Test(enabled=false)
	public void test()
	{
//		we use may when we used keyword and value
	Map<String, String>map= new HashMap<String, String>();
	map.put("name1", "Srishti");
	map.put("name2", "Seema");
	map.put("name3", "Jyoti");
	map.put("name4", "Swati");
	map.put("name5", "Aesha");
	map.put("name6", "Jaywant");
	map.put(null, "Pratik");
	map.put("name1", "Ashu");
	System.out.println(map.get("name1"));  
//	this will retuen all the keys into a set
	Set<String> keys=map.keySet();
//	this for loop will display till the keys are assigned
	for(String key:keys){
//		map.get will help get the values assigned to keys
		System.out.println(map.get(key));
	}
	
	
	}
@Test
public void test2()
{
//	we use may when we used keyword and value
Map<String, String>map= new Hashtable<String, String>();
map.put("name1", "Srishti");
map.put("name2", "Seema");
map.put("name3", "Jyoti");
map.put("name4", "Swati");
map.put("name5", "Aesha");
map.put("name6", "Jaywant");
//map.put(null, "Pratik");
map.put("name1", "Ashu");
System.out.println(map.get("name1"));  
//this will retuen all the keys into a set
Set<String> keys=map.keySet();
//this for loop will display till the keys are assigned
for(String key:keys){
//	map.get will help get the values assigned to keys
	System.out.println(map.get(key));
}
System.out.println("This is Hashtable");


}

}
