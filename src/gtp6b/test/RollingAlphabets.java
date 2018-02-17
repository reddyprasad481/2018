package gtp6b.test;

class RollingAlphabets {

	//I didn't get this question properly so solving based on my understanding
	public static void main(String[] args) {
		
		String inputString = "abmz";
		int[] rollingArray = new int[]{4,4,3,2,1};
		
		System.out.println("input1: "+inputString);
		String outputString = RollAlphabits(inputString,rollingArray);
		System.out.println("Result1: "+outputString);
		
		System.out.println("case2");
		inputString = "AbMz";
		System.out.println("input2: "+inputString);
		outputString = RollAlphabits(inputString,rollingArray);
		System.out.println("Result2: "+outputString);
		
		System.out.println("case3");
		inputString = "ZAaMz";
		System.out.println("input3: "+inputString);
		outputString = RollAlphabits(inputString,rollingArray);
		System.out.println("Result3: "+outputString);
	}

	private static String RollAlphabits(String inputString, int[] rollingArray) {

		String outputString = null;

		if(rollingArray.length>0){

			if(rollingArray[0] == rollingArray.length-1){//x number of roles need x+1 number of inputs in rollingArray array

				int numberOfRolles = rollingArray[0];

				char[] charArray = inputString.toCharArray();
				
				for (int i = 1; i <= numberOfRolles; i++) {//for each role 

					int numberOfAlphabits = rollingArray[i];// number of alphabets to role
				//	System.out.println(numberOfAlphabits);

					if(inputString.length()< numberOfAlphabits){
						
						System.out.println("wrong data, cant't role"+inputString+" "+numberOfAlphabits+" times");
						
					}else{
						
						for (int j = 0; j < numberOfAlphabits; j++) {
							
							char inputChar = charArray[j];
							char outputCharAfterOneRole ;
							
							if(inputChar=='Z'){//corner case
								
								outputCharAfterOneRole = 'A';
								
							}else if(inputChar=='z'){//corner case
								
								outputCharAfterOneRole = 'a';
								
							}else{
								
								int asciiValuOfInputChar = (int)inputChar; // get ASCII Value of inputChar
								asciiValuOfInputChar++;// next char ASCII Value
								
								outputCharAfterOneRole = (char)asciiValuOfInputChar;// convert next char ASCII Value to  char 
							}
							
							//System.out.println(inputChar);
							//System.out.println(outputCharAfterOneRole);
							
							charArray[j] = outputCharAfterOneRole;
									
						}
					}
					
				//	System.out.println(String.valueOf(charArray));
				}

				outputString = String.valueOf(charArray);
			}else{

				System.out.println("invalid data!!!!");
			}
		}

		return outputString;
	}
}

