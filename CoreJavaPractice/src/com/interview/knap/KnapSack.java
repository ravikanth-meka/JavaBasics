package com.interview.knap;

public class KnapSack {

	public int knapsack(int W, int[] weights, int[] vals) {
	
		int[][] cache = new int[weights.length + 1][W + 1];
		
		for(int i =1; i<= weights.length; i++)
			for (int j=0; j<=W; j++) {
				
				if(weights[i-1] > j) cache[i][j] = cache[i-1][j];
				else
					cache[i][j] = Math.max(cache[i-1][j], cache[i-1][j-weights[i-1]] + vals[i-1]);
			}
		return cache[weights.length][W];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = { 5 ,9, 12 };
		 int[] values = {6, 10, 12 };
		 int max_weight  = 15;
		 KnapSack k = new KnapSack();
		 //System.out.println(k.knapsack(max_weight, weights, values));
		 
		 System.out.println(k.recKanpsack(max_weight, weights, values));

	}
	
	
	
	public int recKanpsack(int W, int[] weights, int[] vals)
	{
		return recknapsack(W, weights, vals, 0);
	}

	public int recknapsack(int W, int[] weights, int[] vals, int i)
	{
		if (i==weights.length) return 0;
		if (W-weights[i] < 0) return recknapsack(W, weights, vals, i+1);
		return 
				Math.max(recknapsack(W- weights[i], weights, vals, i+1) + vals[i], 
						recknapsack(W, weights, vals, i+1));
	}
}


/*
 
 weights = { 5 ,9, 12 }
 values = {6, 10, 12 }
 max weight (W) = 15
 
 
     	    j->   0    1    2 	  3    4     5    6     7    8     9    10     11     12     13     14    15(W)
val/weights i
          	0   [ 0	   0    0     0    0     0    0     0    0     0    0       0     0      0      0     0     ]    
6     	5   1   [
10     	9   2   [
12     	12  3   [
 
 
 */
