/*题目：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
句子中单词以空格符隔开。为简单起见，标点符号和普通字母一样处理。
例如输入“I am a student.”，则输出“student. a am I”。*/

/*解题思路：翻转两次，先整体翻转，然后对各个单词进行翻转*/

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