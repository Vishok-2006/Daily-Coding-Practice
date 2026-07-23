import java.util.Scanner;
public class StackImplementation {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Stack:");
        int n=sc.nextInt();
        MStack<Integer> s=new MStack<>(n);
        System.out.println("enter the Stack Elements:");
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        System.out.print("The Stack elements are : ");
        s.display();
        s.pop();
        System.out.println("the top element is :"+ s.peek());
        s.display();
        sc.close();
     }    
}




class MStack<T>{
    int size;
    T[] arr;
    int top;
    @SuppressWarnings("unchecked")
    public MStack(int val){
        this.size=val;
        arr=(T[]) new Object[size];
        top=-1;
    }



    void push(T val){
        if(top==size-1){
            System.out.println(" stack overflow:");
            return;
        }
        top++;
        arr[top]=val;
    }



    T pop(){
        if(top == -1){
            System.out.println("Stack underflow:");
            return null ;
        }
        T value=arr[top];
    arr[top]=null;   
    top--;

    return value;
    }



    T peek(){
        if(top==-1){
            System.out.println("Stack underflow:");
            return null;
        }
        return arr[top];
    }


    boolean isEmpty(){
        return top==-1;
    }


    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    int size(){
    return top+1;
}

}
