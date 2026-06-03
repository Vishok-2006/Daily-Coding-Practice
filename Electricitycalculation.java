public class Electricitycalculation {
    public static void main(String[] args) {
        int d=3;
        int[] ac={10,20,30};
        int[] tv={5,5,10};
        int[] fri={15,15,20};
        int[] wm={5,10,5};
        int[] fan={10,5,5};
        double total
        StringBuilder sb=new StringBuilder();
        double [] t=new double [d];
        for(int i=0;i<d;i++){
            t[0]+=ac[i];
            t[1]+=tv[i];
            t[2]+=fri[i];
            t[3]+=wm[i];
            t[4]+=fan[i];

        }
        for(double i:t){
            total+=i;
        }

        double[] p=new double [d];
           
        for(int i=0;i<d;i++){
            p[i]=t[i]*100/total;
        }
        
         





    }
}





// class Main {

//     public static void main(String[] args) {

//       int d=3;

//       int[] ac={10,20,30};

//     int[] tv={5,5,10};

//     int[] fridge={15,15,20};

//     int[] wm={5,10,5};

//     int[] fan={10,5,5}; 

//     double[] total = new double[5];

//     for(int i=0;i<d;i++)

//     {

//         total[0]+=ac[i];

//         total[1]+=tv[i];

//         total[2]+=fridge[i];

//         total[3]+=wm[i];

//         total[4]+=fan[i];

//     }

//        double overall=0;

//        for(double x : total)

//        {

//            overall+=x;

//        }

       

//        double[] per = new double[5];

//        for(int i=0;i<5;i++)

//        {

//            per[i]=total[i]*100.0/overall;

//        }

//        String [] devices = {"ac","tv","fridge","wm","fan"};

//        int mid=0;

//        for(int i=1;i<5;i++)

//        {

//            if(per[i]<per[mid])

//            {

//                mid=i;

//            }

//        }

//        System.out.println(String.format("%.2f %.2f %.2f %.2f %.2f %s",per[0],per[1],per[2],per[3],per[4],devices[mid]));

       

//     }

//     }




