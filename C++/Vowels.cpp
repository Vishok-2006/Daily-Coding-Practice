#include<iostream>
#include <string>
using namespace std;
int main(){
    string s,r;
    cout <<"Enter string : ";
    cin >>s;
    int n=s.length();
    for(int i=0;i<n;i++){
      switch(s[i]){
        case 'a':
          {
            cout <<"2";
            break;
          }
        case 'e':{
            cout <<"3";
            break;
        }
        case 'i':{
            cout <<"4";
            break;
        }
        case 'o':{
            cout <<"5";
            break;
        }
        case 'u':{
            cout <<"6";
            break;

        }
        default:{
            cout <<s[i];
            break;
        }
      }

    }
    cout <<"\n";
}