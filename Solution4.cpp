/*�ڶ�Ԫ�����ҳ���Ϊĳһֵ������·��������
��Ŀ������һ��������һ�ö�Ԫ����
�����ĸ���㿪ʼ���·���һֱ��Ҷ��������������н���γ�һ��·����
��ӡ����������������ȵ�����·����
     10
	 /\
	5 12
   / \
  4   7
  �ڵ���10,12,��10,5,7*/
#include<iostream>
#include<vector>
using namespace std;

struct BinaryTreeNode
{
	int m_nValue;
	BinaryTreeNode *m_pLeft;
	BinaryTreeNode *m_pRight;
	BinaryTreeNode(int a){ m_nValue = a; m_pLeft = NULL; m_pRight = NULL; }
};

void finSumInBinaryTree(vector<int> &path, int sum, BinaryTreeNode *node,int expectValue){

	if (node == NULL){
		if (sum == expectValue){
			vector<int>::iterator it;
			for (it = path.begin(); it != path.end(); it++)
			{
				cout << *it << "_";
			}
			cout << endl;
			return;
		}
	}else{
		path.push_back(node->m_nValue);
		sum = sum + node->m_nValue;
		finSumInBinaryTree(path, sum, node->m_pLeft, expectValue);
		if (node->m_pRight != NULL){
			finSumInBinaryTree(path, sum, node->m_pRight, expectValue);
		}
		path.pop_back();
	}
}

int main(){
	BinaryTreeNode root(10);
	root.m_pLeft = new BinaryTreeNode(5);
	root.m_pRight = new BinaryTreeNode(12);
	root.m_pLeft->m_pLeft = new BinaryTreeNode(4);
	root.m_pLeft->m_pRight = new BinaryTreeNode(7);
	vector<int> path;
	finSumInBinaryTree(path, 0, &root, 22);
}