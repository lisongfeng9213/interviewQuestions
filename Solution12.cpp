/*用构造函数*/

#include<iostream>
using namespace std;

class Temp{
public:
	static int sum;
	static int number;
	Temp(){
		number++;
		sum += number;
	}
};

int Temp::sum = 0;
int Temp::number = 0;

int main(){
	int n = 100;
	Temp *tempArray = new Temp[n];
	free(tempArray);
	cout << Temp::sum << endl;
	cout << Temp::number << endl;
}