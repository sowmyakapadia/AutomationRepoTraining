package TestArrays;

public class TestTwoDimensionalArray {
public static void main(String[] args) {
	String[][] login= new String [4][2];
	//Row 0, column 1 & 2	
	login[0][0]="UserName";
	login[0][1]="Password";
//	login[0][0][2]="Hint Question";
	
	//Row 2, Column 2 & 3
	login[1][0]="ABC";
	login[1][1]="abc";
//	login[1][1][2]="Maiden name";
	
	//Row 3
	login[2][0]="XYZ";
	login[2][1]="xyz";
//	login[2][1][2]="place of birth";
	
	//row 4
	login[3][0]="RST";
	login[3][1]="rst";
//	login[3][1][2]="Fav color";
	
	for (int i = 0; i < login.length; i++) {
		for (int j = 0; j<login[i].length; j++) {
			System.out.println(login[i][j]);
			}
		}
	}
}

