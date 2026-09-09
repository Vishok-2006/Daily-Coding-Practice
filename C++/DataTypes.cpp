#include <iostream>
using namespace std;

int main(){
    int n;
    char c;
    string s;
    float f;
    int m;
    int arr[m];
    cout << "Enter the Value for n : ";
    cin >>n;
    cout <<" Enter the character for c : ";
    cin >>c;
    cout <<" Enter the string for s : ";
    cin >> s;
    cout <<" Enter the float for f : ";
    cin >> f;
    cout <<" Enter the length for array size m : ";
    cin >> m;
    cout << " Enter the value for the array : ";
    for(int i=0;i<m;i++){
        cout << " entr the value for the array element "<<i<<" : ";
        cin >> arr[i];
    }
     cout << "the Value : " << n<< "\n";
     cout << "the character : "<< c <<"\n";
     cout << "the float : " << f <<"\n";
     cout << "the String : " << s <<"\n";
     for(int i=0;i<m;i++){
        cout << arr[i] <<"\n";
     }

}