public class SimpleDotGame{
	public static void main(String[] args){

		int numofGuess = 0;
		GameHelper helper = new GameHelper();

		SimpleDotCom dotcom = new SimpleDotCom();
		int randomnum = (int) (Math.random()*5);

		int[] locations = {randomnum, randomnum+1, randomnum+2};
		dotcom.setLocationCells(locations);
		boolean isAlive = true;

		while(isAlive==true){
			String guess = helper.getUserInput("enter a number");
			String result = dotcom.checkyourself(guess);
			numofGuess++;
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("you took " + numofGuess + " guesses");
			}
		}
	}
}



