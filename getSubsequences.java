import java.util.*;
public class getSubsequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(getSS(str));
	}
	public static ArrayList<String> getSS(String str){
		if(str.length()==0) {
			ArrayList<String> baseCase = new ArrayList<>();
			baseCase.add("");
			return baseCase;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);
		for(int i=0;i<recResult.size();i++) {
			myresult.add(recResult.get(i));
//			myresult.add(cc+recResult.get(i));
		}
		for(int i=0;i<recResult.size();i++) {
//			myresult.add(recResult.get(i));
			myresult.add(cc+recResult.get(i));
		}
		return myresult;
	}

}
