public class Permutation {
    public static void main(String[] args) {
        String s="ABC";
        
        int fi=0;
        char[] arr=s.toCharArray();
        Permutations(arr,fi);


        
    }
    static void Permutations(char[] arr,int fi){
     
        if(fi==arr.length-1){
             System.out.println(arr);
        }
        for(int i=fi;i<arr.length;i++){
            arr= swap(arr,i,fi);
            Permutations(arr,fi+1);
            arr= swap(arr,i,fi);
            
        }
    }
    static char[] swap(char[] arr,int i,int fi){
        char temp =arr[i];
        arr[i]=arr[fi];
        arr[fi] = temp;
        return arr;
    }
}
