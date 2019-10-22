package filehandling;

import java.io.IOException;

public class User {

	public static void main(String[] args) throws IOException {
		String filepath=System.getProperty("user.dir")+"\\src\\filehandling\\TestData.xls";
		Xls_Reader xl=new Xls_Reader(filepath);
//		This will get count of columns within Sheet1 that has data
		System.out.println(xl.getColumnCount("Sheet1"));
		System.out.println(xl.getRowCount("Sheet1"));
//this will show data is 1st row & 1st cell
		System.out.println(xl.getCellData("Sheet1", 1, 1));
		
//		This helps read all data from the excel sheet "Sheet1"
		int row=xl.getRowCount("Sheet1");
		int col=xl.getColumnCount("Sheet1");
		
		for (int r = 1; r < row; r++) {
			for (int c = 1; c <= col; c++) {
//"ln" prints whatever statement you have in parenthesis on a new line hence
//deleting "ln" in syso print command will show data of a r and c in the same line
//keeping the "ln" will print the data in r and c in different lines
				System.out.print(xl.getCellData("Sheet1", r, c)+" ");
				
			}
			System.out.println();
		}
				
//this will show data is 1st row 2nd cell
//		System.out.println(xl.getCellData("Sheet1", 1, 2));
//		
////		writing data into xls
//		xl.setCellData("Sheet1", 2, 1, "Test");
//		System.out.println(xl.getCellData("Sheet1", 2, 1));
	}

}
