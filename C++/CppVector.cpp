#include<iostream>
#include<vector>
using namespace std;
int main(){
    
    int n;
    cout <<"Enter the value of size : ";
    cin >>n;
    vector<int> v(n);
    cout <<"Enter the value's : ";
    for(int i=0;i<n;i++){
        cin >> v[i];
    }
    v.push_back(9238);
    for(int i=0;i<=n;i++){
        cout << v[i]<<"\n";
    }
}