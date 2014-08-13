/*�ж����������ǲ��Ƕ�Ԫ�������ĺ���������
��Ŀ������һ���������飬�жϸ������ǲ���ĳ��Ԫ�������ĺ�������Ľ����
�������� 5��7��6��9��11��10��8��������һ�����������������ĺ�����������
     8
   /   \
  6     10
 / \   /  \
5   7 9   11
*/

/*����˼·���ݹ��ң���Ϊ�������������һ��Ԫ��һ���Ǹ��ڵ㣬��Ԫ������������С�ڸ��ڵ㣬���������ڸ��ڵ�*/

#include<iostream>
using namespace std;

int isBinaryTree(int *a,int begin, int end){
	if (begin >= end){
		return 1;
	}
	int lBegin;
	int lEnd;
	int rBegin;
	int rEnd;

	for (int i = begin; i <= end; i++){
		if (a[i] >= a[end]){
			rBegin = i;
			break;
		}
	}

	lBegin = begin;
	lEnd = rBegin - 1;
	rEnd = end - 1;

//	cout << "lBegin:" << lBegin << endl;
//	cout << "lEnd:" << lEnd << endl;
//	cout << "RBEGIN:" << rBegin << endl;
//	cout << "rEnd:" << rEnd << endl;

	for (int i = lBegin; i <= lEnd; i++)
	{
		if (a[i] > a[end]){
			return -1;
		}
	}
	for (int i = rBegin; i <= rEnd; i++)
	{
		if (a[i] < a[end]){
			return -1;
		}
	}

	if (isBinaryTree(a, rBegin, rEnd) == -1 || isBinaryTree(a, lBegin, lEnd) == -1){
		return -1;
	}

	return 1;

}

int main(){
	int A[] = { 5, 7, 6, 9, 11, 10, 8 };
	int B[] = { 7, 4, 6, 5 };
	int C[] = {  5,7 };
	
	cout << "ANSWER:" << isBinaryTree(A, 0, 6) << endl;
	cout << "ANSWER:" << isBinaryTree(B, 0, 3) << endl;
	cout << "ANSWER:" << isBinaryTree(C, 0, 1) << endl;

}

