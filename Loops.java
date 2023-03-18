
public class Loops {
public static void main(String[]args) {
// 	int counter=0;
// 	while(counter < 100) {
// 		System.out.println("Hello world");
// 		counter++;
// 	}
// Reverse a number eg.99801
	int  n=99801;
		while(n>0){
			int lastDigit=n%10;
			System.out.print(lastDigit + " ");
			n/=10;
		}
	System.out.println();
}

}
}
