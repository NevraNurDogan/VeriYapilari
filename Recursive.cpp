#include <iostream>
using namespace std;

	int faktoriyel(int num){
		if(num==0){
			return 1;
		}
		else{
			return num*faktoriyel(num-1);
		}
	}

int main(int argc, char** argv) {
	int num;
	cout<<"Enter number:";
	cin>>num;
	int sonuc=faktoriyel(num);
	cout<<num<<"!="<<sonuc;
	
	return 0;
}
