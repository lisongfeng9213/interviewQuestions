/*��Ŀ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣
�����е����Կո��������Ϊ������������ź���ͨ��ĸһ������
�������롰I am a student.�����������student. a am I����*/

/*����˼·����ת���Σ������巭ת��Ȼ��Ը������ʽ��з�ת*/

#include<iostream>
#include<string>
using namespace std;

void rotate(string &a){
	int stringLen = a.size();
	char *arrayString = new char[stringLen];
	for (int i = 0; i < stringLen; i++){
		arrayString[i] = a[stringLen - i -1];
	}
	for (int i = 0; i < stringLen; i++){
		cout << arrayString[i];
	}
	cout << endl;


	int begin = 0;
	int end = stringLen - 1;
	while (begin < end){
		int wordEnd = begin;
		cout << "Begin" << begin << endl;
		while (arrayString[wordEnd] != ' '&&wordEnd <= end)
		{
			cout << "WORDENDIN:" << arrayString[wordEnd] << endl;
			wordEnd++;
		}
		wordEnd--;
		for (int i = begin; i <= (wordEnd + begin)/2; i++){
			char temp = arrayString[i];
			arrayString[i] = arrayString[wordEnd - i + begin];
			arrayString[wordEnd - i + begin] = temp;
		}
		begin = wordEnd + 2;
		cout << "wordEnd" << wordEnd << endl;
	}
	

	for (int i = 0; i < stringLen; i++){
		cout << arrayString[i];
	}
	cout << endl;
}
int main(){
	string a = "HELLO LISOGNFENG NIHAO SINA";
	rotate(a);
}