package com.algorithm.tree.binaryTree;

public class BinaryTree {
	public static void main(String[] args){
		try {
			int size = 11;
			BinaryNode rootNode = new BinaryNode(String.valueOf(1));
			BinaryNode firstNode = null;
			BinaryNode secondNode = null;
			for (int i = 1; i < size; i++) {
				String nodeText;
				if (i == 1) {
					nodeText = String.valueOf(i);
					secondNode = new BinaryNode(nodeText);
					rootNode.nextNode(secondNode);
				}else {
					nodeText = String.valueOf(i + 1);
					firstNode = new BinaryNode(String.valueOf(i));
					secondNode = new BinaryNode(nodeText);
					firstNode.nextNode(secondNode);
				}

			}
			
			System.out.println("rootNode " + rootNode.getNodeText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
