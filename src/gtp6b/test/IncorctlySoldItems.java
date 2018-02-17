package gtp6b.test;

import java.util.HashMap;
import java.util.Map;

public class IncorctlySoldItems {

	public static void main(String[] args) {
		
		String [] inputItems =new String []{"a", "b", "mm", "someX", "rice"}; 
		float [] originalCost =new float []{10f, 20f, 55.5f, 99.0f, 100f}; 
		
		String [] soldItems =new String []{"b", "a", "someX", "mm","rice"}; 
		float [] soldCost =new float []{20f, 100f, 99.0f, 50.5f,10f}; 
		
		int incorrectlySoldItems = getIncorrectlySoldItems(inputItems,originalCost,soldItems,soldCost);
		
		System.out.println("incorrectlySoldItems:"+ incorrectlySoldItems);;
	}

	private static int getIncorrectlySoldItems(String[] inputItems,
			float[] originalCost, String[] soldItems, float[] soldCost) {
		
		int incorctlySoldItems =0;
		
		if(inputItems.length==originalCost.length && soldItems.length == soldCost.length){
			
		  Map<String, Float>	originalCostMap = new HashMap<String, Float>();
		  Map<String, Float>	soldCostMap = new HashMap<String, Float>();
			
		  for (int i = 0; i < inputItems.length; i++) {
				
			  originalCostMap.put(inputItems[i], originalCost[i]);//key input item , value is original cost 
			}
		  
		  for (int i = 0; i < soldItems.length; i++) {
				
			  soldCostMap.put(soldItems[i], soldCost[i]);//key sold item , value is sold cost
			}
		  
		  for (String soldItem : soldCostMap.keySet()) {//iterate through all sold items and find wrongly sold items
			
			  if(originalCostMap.containsKey(soldItem)){ //item name matching
				  
				  if(originalCostMap.get(soldItem).equals(soldCostMap.get(soldItem))){
					  //same item sold at same cost
				  }else{
					//  System.out.println(originalCostMap.get(soldItem));
					 // System.out.println(soldCostMap.get(soldItem));
					//same item different cost
					  incorctlySoldItems++;
					  
				  }
					  
			  }else{
				  System.out.println("wrong data original Item not found but sold!!!!");//corner case
			  }
		  }
		  
		}else{
			
			System.out.println("wrong input data");//corner case
		}
		
		return incorctlySoldItems;
	}
}
