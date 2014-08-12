//����ջ�����ݽṹ��Ҫ�����һ�� min �������ܹ��õ�ջ����СԪ�ء�
//Ҫ���� min��push �Լ� pop ��ʱ�临�Ӷȶ��� O(1)
//����˼·��ͬʱ���һ������ջ��������С������Ҫ��ջ����������С�������ʱ������ͬʱ��ջ
//����ջʱ�򣬱Ƚ�Ҫ��ջ��������С����ջ��Ԫ�ش�С�������������ͬʱ����С����ջ

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