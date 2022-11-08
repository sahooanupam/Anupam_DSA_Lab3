package com.gl.lab3.problem2;

import java.util.HashSet;

import com.gl.lab3.problem2.FindPairWithGivenSumInBST.Node;


public class Main {

	public static void main(String[] args) {
		int value;
		int givenSum=140;
		int[] arr= {40, 20, 60, 10, 30, 50, 70};
		Node root=null;
		//HashSet<Integer> set;
		FindPairWithGivenSumInBST pair=new FindPairWithGivenSumInBST();
		for(int i=0; i<arr.length; i++) {
			value=arr[i];
			if(root==null) 
				root=FindPairWithGivenSumInBST.insert(root, value);
			else
				FindPairWithGivenSumInBST.insert(root, value);
		}
		
		System.out.println("InOrder of BST");
		FindPairWithGivenSumInBST.InOrder(root);
		pair.findGivenSumWithPair(givenSum); 
		
		/*
		 * Node root= null;
		 * 
		 * FindPairWithGivenSumInBST fsp =new FindPairWithGivenSumInBST();
		 * 
		 * root = fsp.insert(root, 40); root = fsp.insert(root, 20); root =
		 * fsp.insert(root, 60); root = fsp.insert(root, 10); root = fsp.insert(root,
		 * 30); root = fsp.insert(root, 50); root = fsp.insert(root, 70);
		 * 
		 * int sum=80;
		 * 
		 * fsp.findPairWithGivenSum(root, sum);
		 */

	}

}
