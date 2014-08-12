//输入一棵二元查找树，将该转换成个排 序的双向链表。
//要求不能创建任何新的结点，只调整指针的指向。

#include<iostream>
using namespace std;
class BstNode{
	public:
	int value;
	BstNode *leftNode;
	BstNode *rightNode;
	BstNode(int valueA, BstNode *leftNodeA, BstNode *rightNodeA){
		value = valueA;
		leftNode = leftNodeA;
		rightNode = rightNodeA;
	}
};

void nodeArrange(BstNode *&head, BstNode *&tail, BstNode *root){

	BstNode *leftTail;
	BstNode *rightHead;

	if (root == NULL)
	{
		head = NULL;
		tail = NULL;
		return;
	}
	nodeArrange(head, leftTail, root->leftNode);
	nodeArrange(rightHead, tail, root->rightNode);	


	if (leftTail != NULL){
		
		leftTail->rightNode = root;
		root->leftNode = leftTail;
	}
	else{
		head = root;
	}
	if (rightHead != NULL){
		
		
		root->rightNode = rightHead;
		rightHead->leftNode = root;
	}
	else{
		tail = root;
	}
}

BstNode * bstTreeTolinkList(BstNode *&root){
	BstNode *headNode ;
	BstNode *tailNode ;
	nodeArrange(headNode, tailNode, root);
	return headNode;
}




int main(){
	BstNode *nodeD = new BstNode(4, NULL, NULL);
	BstNode *nodeE = new BstNode(16, NULL, NULL);
	BstNode *nodeB = new BstNode(6, nodeD, NULL);
	BstNode *nodeC = new BstNode(14, NULL, nodeE);
	BstNode *nodeA = new BstNode(10,nodeB,nodeC);

	BstNode *head = bstTreeTolinkList(nodeA);
	while (head != NULL)
	{

		cout <<"HEAD:"<< head->value << endl;
		head = head->rightNode;
	}
}