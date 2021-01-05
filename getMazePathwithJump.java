import java.util.*;
public class getMazePathwithJump {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	int sr = scn.nextInt();
	int sc = scn.nextInt();
	int er = scn.nextInt();
	int ec = scn.nextInt();
	System.out.println(getMPWJ(sr, sc, er, ec));
	System.out.println(getMPWJ(sr, sc, er, ec).size());
	
}
public static ArrayList<String> getMPWJ(int sr, int sc, int er, int ec){
	if(sr==er && sc==ec) {
		ArrayList<String> positiveBaseCase = new ArrayList<>();
		positiveBaseCase.add("");
		return positiveBaseCase;
	}
	if(sr>er || sc>ec) {
		ArrayList<String> negativeBaseCase = new ArrayList<>();
		return negativeBaseCase;
	}
	ArrayList<String> myResult = new ArrayList<>();
	for(int move=1;move<=ec-sc;move++) {
		ArrayList<String> recResultHorizontal = getMPWJ(sr, sc+move, er, ec);
		for(String rrhs : recResultHorizontal) {
			myResult.add("H"+move+rrhs);
		}
	}
	for(int move=1;move<=er-sr;move++) {
		ArrayList<String> recResultVertical = getMPWJ(sr+move, sc, er, ec);
		for(String rrvs : recResultVertical) {
			myResult.add("V"+move+rrvs);
			
		}
	}
	for(int move=1;move<=ec-sc;move++) {
		ArrayList<String> recResultDiagonal = getMPWJ(sr+move, sc+move, er, ec);
		for(String rrds : recResultDiagonal) {
			myResult.add("D"+move+rrds);
		}
	}
	return myResult;
}
}
