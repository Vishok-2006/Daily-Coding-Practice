public class RecursionDemo {
      public static void main(String[] args) {
        int n=5;
        printing(1,n);
      }
      public static void printing(int i,int n){
        if(i>n) return;
        printing(i+1,n);   //head recursion
        System.out.print(i+" ");
        
       // printing(i+1,n);   //tail recursion
              
    }
    
}