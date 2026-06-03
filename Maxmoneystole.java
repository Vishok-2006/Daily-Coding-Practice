public class Maxmoneystole {
    public static void main(String[] args) {
        int n=5;
        int[] s={2,4,1,6,3};
        int m[]={10,20,30,40,50};
        double avg=0;
        int t=0;
        for(int i=0;i<n;i++){
             avg+=s[i];
        }
        avg/=n;
        for(int i=0;i<n;i++){
            if(s[i]<avg) t+=m[i];
        }
        System.out.println(t);
     
    }
}


// Question 3  -

// // Online Java Compiler

// // Use this editor to write, compile and run your Java code online

 

// class Main {

//     public static void main(String[] args) {

//         int n=5;

//         int[] s={2,4,1,6,3};

//         int m[]={10,20,30,40,50};

//         int sum=0;

//         int robbedmoney=0;

//         for(int s1:s)

//         {

//             sum+=s1;

//         }

//         double avg_sec=(double)sum/n;

//         for(int i=0;i<n;i++)

//         {

//             if(s[i]<avg_sec)

//             {

//                robbedmoney+=m[i]; 

//             }

//         }

//         System.out.println(robbedmoney);

//     }

// }




