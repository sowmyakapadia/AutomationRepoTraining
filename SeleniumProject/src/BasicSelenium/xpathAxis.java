package BasicSelenium;

public class xpathAxis {
	
//	preceeding relationship
	//a[text()='Shirts']//preceding::span[text()='Men']

//	following relationship
	//span[text()='Men']//following::a[text()='Shirts']


//	Ancestor
	//a[text()='Shirts']//ancestor::li/span[text()='Men']


//	Descendant
	//span[text()='Men']/..//descendant::a[text()='Shirts']

//	Descendant using parent function
	//span[text()='Men']//parent::li//descendant::a[text()='Shirts']

//	preceding sibling
	//a[text()='Shirts']/..//preceding-sibling::li/a[text()='Clothing']

//	following sibling
	//a[text()='Clothing']/..//following-sibling::li/a[text()='Shirts']



}
