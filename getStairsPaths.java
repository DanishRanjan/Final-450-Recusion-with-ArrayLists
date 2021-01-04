import java.util.*;
public class getStairsPaths {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(getSP(n));
	System.out.println(getSP(n).size());
}
public static ArrayList<String> getSP(int n){
	if(n==0) {
		ArrayList<String> positiveBaseCase = new ArrayList<>();
		positiveBaseCase.add("");
		return positiveBaseCase;
	}
	else if(n<0) {
		ArrayList<String> negativeBaseCase = new ArrayList<>();
		return negativeBaseCase;
	}
	
	ArrayList<String> path1 = getSP(n-1);
	ArrayList<String> path2 = getSP(n-2);
	ArrayList<String> path3 = getSP(n-3);
	ArrayList<String> paths = new ArrayList<>();
	
	for(String recResult1:path1) {
		paths.add(1+recResult1);
	}
	for(String recResult2:path2) {
			paths.add(2+recResult2);
		}
	for(String recResult3:path3) {
		paths.add(3+recResult3);
	}
	return paths;
}
}
