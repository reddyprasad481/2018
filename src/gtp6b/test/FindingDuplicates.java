package gtp6b.test;

import java.util.HashSet;

public class FindingDuplicates {

	public static void main(String[] args) {
		
		int [] inputArray = new int []{1,2,3,5,7,3,1,1,6,7,2,11,8,2};
		
		int numberOfDuplicates = getNumberOfDuplicates(inputArray);
		System.out.println("numberOfDuplicates:"+numberOfDuplicates);
		
		int duplicateNumbersCount = getDuplicateNumbersCount(inputArray);
		System.out.println("duplicateNumbersCount:"+duplicateNumbersCount);
	}

	private static int getDuplicateNumbersCount(int[] inputArray) {
		

		
		HashSet<Integer> integerSet = new HashSet<Integer>();
		HashSet<Integer> duplicatesSet = new HashSet<Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			
			if(integerSet.add(inputArray[i])){
				//not a duplicate so added into the set
			}else{
				duplicatesSet.add(inputArray[i]);//different numbers duplicated will be added to it
			}
		}
		return duplicatesSet.size();
	
	}

	private static int getNumberOfDuplicates(int[] inputArray) {
		
		int numberOfDuplicates=0;
		HashSet<Integer> integerSet = new HashSet<Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			
			if(integerSet.add(inputArray[i])){
				//not a duplicate so added into the set
			}else{
				numberOfDuplicates++;
			}
		}
		int duplicatesCount = inputArray.length -integerSet.size();//this is most easiest way 
		System.out.println("no of Duplicates =" +duplicatesCount);
		return numberOfDuplicates;
	}
}
