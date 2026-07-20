public class Ducknumber {
  
    public static void main(String[] args) {
        int n=1023;
        int flag=0;
        while(n!=0)
        {
            int r=n%10;
            if(r==0)
            {
                flag=1;
                break;
            }
            n/=10;
        }
        if(flag==1)
        {
            System.out.println("Duck Number");
        }
        else{
           System.out.println("Not a Duck Number"); 
        }

    }
}

