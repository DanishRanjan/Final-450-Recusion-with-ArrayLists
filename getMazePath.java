import java.util.*;

public class getMazePath {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int sr = scn.nextInt();
		int sc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		System.out.println(getMP(sr, sc, er, ec));
	}

	public static ArrayList<String> getMP(int sr, int sc, int er, int ec) {
		if (sr == er && sc == ec) {
			ArrayList<String> positivebaseCase = new ArrayList<>();
			positivebaseCase.add("");
			return positivebaseCase;
		} else if (sr > er || sc > ec) {
			ArrayList<String> negativebaseCase = new ArrayList<>();
			return negativebaseCase;
		}
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResultHorizontal = getMP(sr, sc + 1, er, ec);
		for (String rrhs : recResultHorizontal) {
			myResult.add("H" + rrhs);
		}
		ArrayList<String> recResultVertical = getMP(sr + 1, sc, er, ec);
		for (String rrvs : recResultVertical) {
			myResult.add("V" + rrvs);
		}
		return myResult;
	}
}
