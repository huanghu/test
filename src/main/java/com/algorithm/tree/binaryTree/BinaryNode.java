package com.algorithm.tree.binaryTree;

/**
 * 二叉树节点
 * @author huanghu
 *
 */
public class BinaryNode {
	String nodeText;
	BinaryNode nextNode;
	
	public BinaryNode(String nodeText){
		this.nodeText = nodeText;
	}
	
	public void nextNode(BinaryNode node) throws Exception{
		this.nextNode = node;
	}

	public BinaryNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(BinaryNode nextNode) {
		this.nextNode = nextNode;
	}

	public String getNodeText() {
		return nodeText;
	}

	public void setNodeText(String nodeText) {
		this.nodeText = nodeText;
	}
	
}
