#include<iostream>
#include <map>
#include <string>
#include <set>
using namespace std;

int main(){
    map<char,int> m;
    set<char> st;
    string  s;
    cout <<"Enter the string : ";
    cin >>s;
    int n=s.length(),cn=0;
    
    for(int i=0;i<n;i++){
           m[s[i]]++;
           st.insert(s[i]);
           cn++;
    
    }
    for(char c : st){
        cout <<c<<"  -->  "<<m[c]<< " \n";
    }
       cout <<"\n "<<" the total count of this word is :  "<<cn <<"\n";

    cout<<"\n Tell the character to be counted : ";
    char mp;
    cin >> mp;
    if( m.count(mp)){
        cout <<" exist \n";
    }
    else {
        cout <<"Not found";
    }
    cout <<" The Size of the map is : " << m.size() <<"\n";
}