package gtp6b.test;

public class FindingGraterThanEqual {

	public static void main(String[] args) {
		
		int [] inputArray = new int []{8,9,1,2,4,5,3};
		int [] maxArray = new int []{3,6,9,7,10};
		
		int [] maxContArray = getGraterThanOrEqulaNumbersCount1(inputArray,maxArray);
		
		System.out.println("==========greater than equal==========");
		for (int graterNubersCount : maxContArray) {
			
			System.out.println(graterNubersCount);
		}
		
		int [] minContArray = getLessThanOrEqulaNumbersCount(inputArray,maxArray);
		
		System.out.println("==========less than equal==========");
		for (int lessNubersCount : minContArray) {
			
			System.out.println(lessNubersCount);
		}
	}

	private static int[] getLessThanOrEqulaNumbersCount(int[] inputArray,int[] maxArray) {
		
		int [] returnArray = new int [maxArray.length];
		
		for (int i = 0; i < maxArray.length; i++) {
			
			int count=0;
			int maxNumber = maxArray[i];
			for (int j = 0; j < inputArray.length ; j++) {
				
				if(inputArray[j]<=maxNumber)
					count++;
			}
			returnArray[i]= count;
		}
		return returnArray;
		
	}

	private static int[] getGraterThanOrEqulaNumbersCount1(int[] inputArray, int[] maxArray) {
		
		int [] returnArray = new int [maxArray.length];
		
		for (int i = 0; i < maxArray.length; i++) {
			
			int count=0;
			int maxNumber = maxArray[i];
			for (int j = 0; j < inputArray.length ; j++) {
				
				if(inputArray[j]>=maxNumber)
					count++;
			}
			returnArray[i]= count;
		}
		return returnArray;
		
	}
}
