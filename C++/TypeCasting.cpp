#include <iostream>
using namespace std;

int main(){
    int n,a;
    float m,b;
    double c,p;
    cout <<" enter in this order 1. int \n 2. int \n 3. float \n 4. float \n 5. double \n 6.double \n";
    cin >> n;
    cin >> a;
    cin >> m ;
    cin>> b;
    cin >> c;
    cin >> p;
    cout << static_cast<int> (c) << " Is double to int \n";
    cout << (int)m <<"Is float to int \n";
    cout << static_cast<float> (a)/b <<" is divided \n";
}