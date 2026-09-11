#include<iostream>
using namespace std;

int add(int a, int b, int c);

int main(){
    int a,b,c;
    cin >> a;
    cout <<".\n";
    cin >>b;
    cout <<".\n";
    cin >> c ;
    cout <<"\n A == "<<a <<"\n";
    cout <<" b == " << b <<"\n";
    cout <<" c =="<< c<<"\n";
    int r=add(a,b,c);
    cout <<" Result : "<<r;
}
int add(int a , int b, int c){
    return a+b+c;
}