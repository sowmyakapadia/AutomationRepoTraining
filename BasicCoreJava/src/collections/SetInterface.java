package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetInterface {
//	priority=0 will execute that test case first and priority=2 will be executed last
//	priority sets the priorities for testcase execution
	@Test(priority = 1)
	public void Test1(){
//		Generic collections doesnt store primitive datatypes so if we need to store int we have to type"integer"
//		show values in random order
		Set<Integer> set= new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(10);
//		set doesnt allow duplicate entries hence after execution the result will display only 1 value as "10"
		for(int a:set){
			System.out.println(a);
			
		}
		System.out.println("This is hasset TC");
		}
	@Test(priority = 2)
	public void Test2(){
//		Generic collections doesnt store primitive datatypes so if we need to store int we have to type"integer"
//		Import Linked HashSet
//		preserves insertion order i.e shows the values in the order you enter
		Set<Integer> set= new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(80);
//		set doesnt allow duplicate entries hence after execution the result will display only 1 value as "10"
		for(int a:set){
			System.out.println(a);
		}
		System.out.println("Linked HashSet collection");
		}
	@Test(priority=0)
	public void Test3(){
//		Generic collections doesn't store primitive datatypes so if we need to store int we have to type"integer"
//		Import TreeSet
//		Sorts the order
		Set<Integer> set= new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
//		set doesnt allow duplicate entries hence after execution the result will display only 1 value as "10"
		for(int a:set){
			System.out.println(a);
		}
		System.out.println("TreeSet collections");
		}
	
}


