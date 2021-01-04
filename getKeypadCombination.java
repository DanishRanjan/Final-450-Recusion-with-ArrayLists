import java.util.*;
public class getKeypadCombination {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.println(getKPC(str));
	System.out.println(getKPC(str).size());
	
}
static String[] codes = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };
public static ArrayList<String> getKPC(String str){
	if(str.length()==0) {
		ArrayList<String> baseCase = new ArrayList<>();
		baseCase.add("");
		return baseCase;
	}
	
	char cc = str.charAt(0);
	String ros = str.substring(1);
	
	ArrayList<String> recResult = getKPC(ros);
	ArrayList<String> myResult = new ArrayList<>();
	
	String codesforch = codes[cc - '0'];
	for(int i=0;i<codesforch.length();i++) {
		char chcode = codesforch.charAt(i);
		for(int j=0;j<recResult.size();j++) {
			myResult.add(chcode+recResult.get(j));
		}
	}
return myResult;	
}
}