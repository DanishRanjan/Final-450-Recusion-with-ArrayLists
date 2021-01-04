import java.util.*;
public class getBoardPath {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int start = sc.nextInt();
	int end = sc.nextInt();
	getBP(start, end, "");
	
}
public static void getBP(int start, int end, String ans){
	if(start == end) {
		System.out.println(ans);
		return ;
	}
	if(start>end) {
		return ;
	}
	for(int dice=1;dice<=6;dice++) {
		getBP(start+dice, end, ans+dice);
	}
}
}
