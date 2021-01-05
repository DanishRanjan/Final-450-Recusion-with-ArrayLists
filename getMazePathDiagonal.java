import java.util.*;
public class getMazePathDiagonal {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	int sr = scn.nextInt();
	int sc = scn.nextInt();
	int er = scn.nextInt();
	int ec = scn.nextInt();
	System.out.println(getMPD(sr, sc, er, ec));
}
public static ArrayList<String> getMPD(int sr,int sc, int er, int ec){
	if(sr==er && sc==ec) {
		ArrayList<String> positiveBaseCase = new ArrayList<>();
		positiveBaseCase.add("");
		return positiveBaseCase;
	}
	if(sr>er || sc>ec) {
		ArrayList<String> negativeBaseCase =new ArrayList<>();
		return negativeBaseCase;
	}
	ArrayList<String> myResult = new ArrayList<>();
	ArrayList<String> recResultHorizontal = getMPD(sr, sc+1, er, ec);
	for(String rrhs: recResultHorizontal) {
		myResult.add("H"+rrhs);
	}
	ArrayList<String> recResultVertical = getMPD(sr+1, sc, er, ec);
	for(String rrvs: recResultVertical) {
		myResult.add("V"+rrvs);
	}
	ArrayList<String> recResultDiagonal = getMPD(sr+1, sc+1, er, ec);
	for(String rrds: recResultDiagonal) {
		myResult.add("D"+rrds);
	}
	return myResult;
}
}
