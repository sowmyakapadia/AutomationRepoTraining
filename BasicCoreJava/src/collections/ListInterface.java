package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;
//Creating a collection
public class ListInterface 
{
//	this will disable the execution of test case "test" but not "test2"
@Test(enabled=false)
//this is non generic list which can store different data types. The warning shows that list is Raw
//data type.
public void test(){
List list=new ArrayList<>();
//here we can see add.object as option which means we can enter any datatype
list.add("Sowmya");
list.add(30);
list.add(true);
//creating an object of the class to make an array list
list.add(new ListInterface());
}
@Test
// here we have generalized our list which means it can store only string value
public void test2(){
List <String> list=new ArrayList<>();
//here we get only one option i.e. add.string
list.add("Sowmya");
list.add("Kapadia");
list.add("AutoTesting");
list.add("Sowmya");
list.add("Kapadia");
list.add("AutoTesting");
// for each or enhanced for loop
for (String s:list) 
{
	System.out.println(s);
}
}
@Test
//here we have generalized our list which means it can store only string value
public void test3(){
List <String> list=new LinkedList<>();
//here we get only one option i.e. add.string
list.add("Sowmya");
list.add("Kapadia");
list.add("AutoTesting");
list.add("Sowmya");
list.add("Kapadia");
list.add("AutoTesting");
//for each or enhanced for loop
for (String s:list) 
{
	System.out.println(s);
}
}
@Test
//here we have generalized our list which means it can store only string value
public void test4(){
List <String> list=new Vector<>();
//here we get only one option i.e. add.string
list.add("Sowmya");
list.add("Kapadia");
list.add("AutoTesting");
list.add("Sowmya");
list.add("Kapadia");
list.add("AutoTesting");
//for each or enhanced for loop
for (String s:list) 
{
	System.out.println(s);
}




}
}
