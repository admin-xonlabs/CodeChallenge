public class Challenge2 {

	public static void main(String[] args) {
		Random gen= new Random();
			int target= 0;
			while(hasDupes(target= (gen.nextInt(900) + 100)));
			String targetStr = target +"";
			boolean guessed = false;
			Scanner input = new Scanner(System.in);
			int guesses = 0;
			do{
				int MATCH = 0;
				int CLOSE = 0;
				System.out.print("Guess a 3-digit number with no duplicate digits: ");
				int guess;
				try{
					guess = input.nextInt();
					if(hasDupes(guess) || guess < 100) 
							
						continue;
						
				}
				catch(InputMismatchException e){
						
					continue;
				}
				guesses++;
				String guessStr = guess + "";
				for(int i= 0;i < 3;i++)
				{
					if(guessStr.charAt(i) == targetStr.charAt(i))
					{
						MATCH++;
						System.out.println("MATCH");
					}
					else if(targetStr.contains(guessStr.charAt(i)+""))
					{
						CLOSE++;
						System.out.println("CLOSE");
					}
				}
					
					
				if(MATCH == 3){
					guessed = true;
				}
				if(MATCH==0 && CLOSE==0) 
				{
					System.out.println("NONE");
				}
					
			}while(!guessed);
			System.out.println("CONGRATULATIONS!\n");
			System.out.println("You won after "+guesses+" guesses!");
		}
		 
		public static boolean hasDupes(int num){
			boolean[] digs = new boolean[10];
			while(num > 0)
			{
				if(digs[num%10]) return true;
				digs[num%10] = true;
				num/= 10;
			}
				
			return false;
		}
	}


	}

}
	
