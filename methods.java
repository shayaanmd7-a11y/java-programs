public class methods {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        printsquare(a,b);
        welcome();
    }
    static void welcome() {
        System.out.println("welcome to bangalore!");
        
    }
    public static void printsquare(int a,int b){
        int sq=(a*a)+(b*b)+(2*a*b);
        System.out.println(sq);
    }
    
}
