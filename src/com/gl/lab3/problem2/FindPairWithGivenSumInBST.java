package com.gl.lab3.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class FindPairWithGivenSumInBST {

	static HashSet<Integer> set=new HashSet<Integer>();
	static class Node{
		int nodeData;
		Node leftNode, rightNode;
	};

	static Node NewNode(int nodeData) {
		Node temp=new Node();
		temp.nodeData=nodeData;
		temp.leftNode=null;
		temp.rightNode=null;

		return temp;
	};

	static Node insert(Node root, int key) {
		if(root==null)
			return NewNode(key);
		else if(key < root.nodeData)
			root.leftNode =insert(root.leftNode, key);
		else
			root.rightNode= insert(root.rightNode, key);
		return root;	
	}

	static void InOrder(Node root) {
		if(root==null)
		return;
		else
		{
			InOrder(root.leftNode);
			System.out.println(root.nodeData+" ");
			set.add(root.nodeData);
			InOrder(root.rightNode);
		}
	}

	public void findGivenSumWithPair(int sum) {
		int arr[] = new int[set.size()];
		int i=0;
		boolean isPairFound=false;
		 List<Integer> list = new ArrayList<Integer>(set);
	     Collections.sort(list);
		for(Integer ele:list){
			arr[i++] = ele;
		}

		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int j=0; j<arr.length; j++) {
			for(int k=0; k<arr.length; k++) {
				if(arr[j]!=arr[k]) {
					if(!map.containsKey(arr[j])) {
						if((arr[j]+arr[k])==sum) {
							System.out.println("The pair is");
							System.out.println("("+arr[j]+", "+arr[k]+")");
							map.put(arr[k], arr[j]);
							isPairFound=true;
							//break;
						}
					}
				}
				
			}
			/*
			 * if(isPairFound==true) { break; }
			 */
		}
		
		if(!isPairFound) {
			System.out.println("nodes are not found");
		}

	}
	
	
	
	
/*	public boolean findpairUtil(Node root, int sum, HashSet<Integer> set){
		
		if (root==null)
			return false;
		
		if(findpairUtil(root.leftNode, sum, set))
			return true;
		
		if(set.contains(sum-root.nodeData)) {
			System.out.println("Pair is Found ("+ (sum-root.nodeData)+ ", " + root.nodeData + ")");
			return true;
		}	
		
		else
			set.add(root.nodeData);
		
		return findpairUtil(root.rightNode, sum, set);
}

public void findPairWithGivenSum(Node root, int sum){
	
	HashSet<Integer> set = new HashSet<Integer>();
	if(!findpairUtil(root, sum, set))
		System.out.println("Pairs does not exist");
}*/

}
