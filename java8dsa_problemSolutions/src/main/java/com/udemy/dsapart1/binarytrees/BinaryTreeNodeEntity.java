package com.udemy.dsapart1.binarytrees;

/**
 * This class contains custom implementation for Binary search Tree entity and
 * its method to perform data manipulation operations on data items.
 * 
 */
public class BinaryTreeNodeEntity {
	
	private double dataValue;
	private BinaryTreeNodeEntity leftNodeRef;
	private BinaryTreeNodeEntity rightNodeRef;
	private BinaryTreeNodeEntity rootNodeRef;
	
	/**
	 * Empty default constructor.
	 * 
	 */
	public BinaryTreeNodeEntity() {
		
	}

	/**
	 * parameterized constructor to intialize data value into BinaryTreeNodeEntity
	 * node entity.
	 * 
	 */
	private BinaryTreeNodeEntity(double dataValue) {
	this.dataValue = dataValue;
	}
	
	
	public double getRootNode() {
		return rootNodeRef.dataValue;
	}
	
	
	/**
	 * This is wrapper method implementation for data value insertion to
	 * Binary tree Node.
	 * 
	 * @param dataValue
	 * 
	 */
	public void insertANode(double dataValue) {
	rootNodeRef = performNodeInsertion(rootNodeRef, dataValue);
	System.out.println("\nNode inserted with value : " + dataValue);
	}

	
	/**
	* This is wrapper method implementation to print sorted elements through Binary
	* search trees inorder traversal.
	* 
	*/
	public void printSortedOrder()
	{
	performInorderSortedTraversal(rootNodeRef);
	}
	
	
	/**
	 * This is wrapper method implementation to find minimum element from Binary
	 * tree.
	 * 
	 */
	public double getMinimumElement() {
	return findMinElement(rootNodeRef);
	}
	
	
	/**
	 * This is wrapper method implementation to find maximum element from Binary
	 * tree.
	 * 
	 */
	public double getMaximumElement() {
	return findMaxElement(rootNodeRef);
	}
	
	
	/**
	 * This is wrapper method implementation to find height of the Binary tree.
	 * 
	 * @return height of Binary tree.
	 * 
	 */
	public int getBinaryTreeHeight() {
	return computeBinaryTreeHeight(rootNodeRef);
	}
	
	
	/**
	 * 
	 * This is wrapper method implementation helps to check if the 'targetValue'
	 * exists into the Binary tree.
	 * 
	 * @param targetValue
	 * @return boolean - status
	 * 
	 */
	public boolean isElementPresent(double targetValue) {
	return checkElementExistsInTree(rootNodeRef,targetValue);
	}
	
	
	/**
	 * This method implementation helps to check if the given value exists into the
	 * Binary tree or not
	 * 
	 * @param rootNodeRef2
	 * @param targetValue
	 * @return boolean - status
	 * 
	 */
	private boolean checkElementExistsInTree(BinaryTreeNodeEntity rootNodeRef2, double targetValue) {
	boolean fgBlnStatus = false;
	if (rootNodeRef2 == null) {
		return fgBlnStatus;
		}
	if (rootNodeRef2.dataValue == targetValue) {
		return fgBlnStatus = true;
		}
	if (rootNodeRef2.dataValue > targetValue) {
		return fgBlnStatus = checkElementExistsInTree(rootNodeRef2.leftNodeRef, targetValue);
	} else {
		return fgBlnStatus = checkElementExistsInTree(rootNodeRef2.rightNodeRef, targetValue);
		}
	}

	
	/**
	 * This method is the implementation to find height of the Binary tree.
	 * @param rootNodeRef2
	 * @return height of Binary tree.
	 * 
	 */
	private int computeBinaryTreeHeight(BinaryTreeNodeEntity rootNodeRef2) {
	if (rootNodeRef2 == null) {
	return -1;
	}
	return (1 + Math.max(computeBinaryTreeHeight(rootNodeRef2.leftNodeRef),
				computeBinaryTreeHeight(rootNodeRef2.rightNodeRef)));
	}

	/**
	 * Finding maximum element from Binary tree has O(logN) - complexity.
	 * @param rootNodeRef2
	 * @return value of maximum Node.
	 * 
	 */
	private double findMaxElement(BinaryTreeNodeEntity rootNodeRef2) {
	BinaryTreeNodeEntity currentNodeRef = rootNodeRef2;
	while (currentNodeRef.rightNodeRef != null) {
		   currentNodeRef = currentNodeRef.rightNodeRef;
	}
	return currentNodeRef.dataValue;
	}

	
	/**
	 * Finding minimum element from Binary tree has O(logN) - complexity.
	 * @param rootNodeRef2
	 * @return value of minimum Node.
	 * 
	 */
	private double findMinElement(BinaryTreeNodeEntity rootNodeRef2) {
		BinaryTreeNodeEntity currentNodeRef = rootNodeRef2;
		while (currentNodeRef.leftNodeRef != null) {
		currentNodeRef = currentNodeRef.leftNodeRef;
		}
		return currentNodeRef.dataValue;
	}

	/**
	 * Recursive approach to print sorted elements into Binary tree though inorder
	 * traversal.
	 * 
	 * @param rootNodeRef2
	 * 
	 */
	private void performInorderSortedTraversal(BinaryTreeNodeEntity rootNodeRef2) {
		if (rootNodeRef2 != null) {
			performInorderSortedTraversal(rootNodeRef2.leftNodeRef);
			System.out.print(rootNodeRef2.dataValue + "--> ");
			performInorderSortedTraversal(rootNodeRef2.rightNodeRef);
		}
	}

	
	/**
	 * Recursive approach to add element to Binary Search Tree.
	 * 
	 * @param rootNodeRef2
	 * @param dataValue2
	 * @return rootNode
	 * 
	 */
	private BinaryTreeNodeEntity performNodeInsertion(BinaryTreeNodeEntity rootNodeRef2, double dataValue2) {
		if (rootNodeRef2 == null) {
			return new BinaryTreeNodeEntity(dataValue2);
		}
		if (dataValue2 < rootNodeRef2.dataValue) {
			rootNodeRef2.leftNodeRef = performNodeInsertion(rootNodeRef2.leftNodeRef, dataValue2);
		} else if (dataValue2 > rootNodeRef2.dataValue) {
			rootNodeRef2.rightNodeRef = performNodeInsertion(rootNodeRef2.rightNodeRef, dataValue2);
		}
		return rootNodeRef2;
	}
	
}