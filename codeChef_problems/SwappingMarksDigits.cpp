// problem link
// https://www.codechef.com/START130D/problems/SWMA


#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    int a1, b1, a2, b2;

	    cin >> a1 >> b1;

	    a2 = ((a1 % 10) * 10 )+ (a1/10);
	    b2 = ((b1 % 10) * 10) + (b1/10);

	    if(a1 > b1 || a2 > b1){
	        cout << "YES\n";
	    }else if(a2 > b2 || a1 > b2){
	        cout << "YES\n";
	    }else{
	        cout << "NO\n";
	    }
	}
	return 0;
}
