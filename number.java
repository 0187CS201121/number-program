import java.util.*;

class number{
    // Q1 print digit of a number;
    static void printDigit(int n){
        while(n!=0){
            int d = n%10;
            System.out.print(d+" ");
            n = n/10;
        }
    }

    // Q2 check if number is palindrome or not;
    static boolean checkPalindrome(int n){
        int m = n;
        int sum =0;
        while(n!=0){
            int d = n%10;
            sum = sum*10+d;
            n = n/10;
        }
        if(m==sum) return true;
        return false;
    }

     // Q2 check if number is spy number or not; A number is spy number if its sum of its digit == product of its digit
     static boolean checkSpy(int n){
        int m = n;
        int sum = 0, product = 1;
        while(n!=0){
            int d = n%10;
            sum = sum+d;
            product = product*d;
            n = n/10;
        }
        if(sum==product) return true;
        return false;
    }

    // Q3 check if a number is special number or not 
    // a number is said to be special if its sum of digits and product of digits sum == number itself ie. 59 = 5+9 + 5*9;
    static boolean checkSpecialNumber(int n){
        int m = n;
        int sum = 0, product = 1;
        while(n!=0){
            int d = n%10;
            sum = sum+d;
            product = product*d;
            n = n/10;
        }
        if(sum+product==m) return true;
        return false;
    }

    // Q4 check if a number is harshed/niven number or not
    // A number is said to niven number if it is divisible by its sum of digits 
    static boolean checkNivenNumber(int n){
        int m = n;
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum = sum+d;
            n = n/10;
        }
        if(m%sum==0) return true;
        return false;
    }

    //Q5 check if a number is duck number or not 
    // if a number has zero present then that number is said to be duck number;
    static boolean checkDuckNumber(int n){
        int count = 0;
        while(n!=0){
            int d = n%10;
            if(d == 0) count++;
            n = n/10;
        }
        if(count>0) return true;

    return false;
    }

    //Q6 check if a number is neon number or not
    // a number is said to be neon number if its square digit sum == number itself ie 9 ==> 9*9=81 = 8+1 = 9
    static boolean checkNeonNumber(int n){
        int m = n, sum = 0;
        n = n*n;
        while(n!=0){
            int d = n%10;
            sum = sum+d;
            n = n/10;
        }
        if(sum == m) return true;

    return false;
    }

    // Q7 check if a number is automorphic number or not 
    // a number is said to be automorphic if its last digit is equal to square of its last digit 
    static boolean checkAutomorphicNumber(int n){
        int m = n, flag = 0, q = n*n;
        while(n!=0){
            int d = n%10;
            int d1 = q%10;
            if(d != d1) flag = 1;
            n = n/10; q = q/10;
        }
        if(flag == 0) return true;

    return false;
    }

    // Q8 check if a number is special number or not 
    // a number is said to be special number if its factorial digits sum is equal to number itself ie 145 = 1!+4!+5!;this number also known as Krishnamurty(KM) number
    static boolean checkKMNumber(int n){
        int m = n, sum = 0;
        while(n!=0){
            int d = n%10;
            int fact = 1;
            for(int i=1;i<=d;i++) fact *= i;
            sum += fact;
            n = n/10;
        }
        if(sum == m) return true;

    return false;
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);    
        // System.out.print("Enter first number- ");  
        // int a = sc.nextInt(); 
        // System.out.println(a); 
        int n = 145;
        // printDigit(n);
        // System.out.println(checkPalindrome(n));
        // System.out.println(checkSpy(n));
        // System.out.println(checkSpecialNumber(n));
        // System.out.println(checkNivenNumber(n));
        // System.out.println(checkDuckNumber(n));
        // System.out.println(checkNeonNumber(n));
        // System.out.println(checkAutomorphicNumber(n));
        System.out.println(checkKMNumber(n));





    }
}