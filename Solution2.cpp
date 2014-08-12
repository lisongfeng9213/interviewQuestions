//定义栈的数据结构，要求添加一个 min 函数，能够得到栈的最小元素。
//要求函数 min、push 以及 pop 的时间复杂度都是 O(1)
//解题思路：同时设计一个数组栈，保存最小数。当要出栈的数等于最小数组的数时候，两个同时出栈
//当进栈时候，比较要进栈的数与最小数组栈顶元素大小，大于则此数不同时进最小数组栈

#include<iostream>
using namespace std;

class MinStack{
public:
	int size;
	int maxSize;
	int* stackArray;
	int* minArray;
	int minNumber;
	MinStack(int a){
		stackArray = new int[a];
		minArray = new int[a];
		maxSize = a;
		size = -1;
		minNumber = -1;
	}

	void push_back(int n){
		if (minNumber == -1){
			size++;
			minNumber++;
			stackArray[size] = n;
			minArray[size] = n;
		}else if(n<=minArray[minNumber]&&size<maxSize){
			size++;
			stackArray[size] = n;
			minNumber++;
			minArray[minNumber] = n;
		}
		else if (n > minArray[minNumber] && size<maxSize)
		{
			size++;
			stackArray[size] = n;
		}else
		{
			cout << "STACK IS FULL" << endl;
		}
	}
	int min(){
		if (minNumber == -1){
			cout << "NO NUMBER_IN_MIN" << endl;
			return -1;
		}
		else{
			return minArray[minNumber];
		}
	}
	void pop(){
		if (size >= 0){
			if (stackArray[size] != minArray[minNumber]){
				size--;
			}
			else{
				size--;
				minNumber--;
			}
		}
		else
		{
			cout << "NO NUMBER_TO_POP" << endl;
		}
	}


};

int main(){
	MinStack a(6);
	a.push_back(3);
	a.push_back(10);
	a.push_back(2);
	a.push_back(1);
	cout << a.min() << endl;
	a.pop();
	cout << a.min() << endl;
	a.pop();
	cout << a.min() << endl;
	a.pop();
	cout << a.min() << endl;
	a.pop();
	cout << a.min() << endl;
	a.pop();
}