public class GuessGame{
	Player p1;
	Player p2;
	Player p3;

	public void startgame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;

		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;

		int target = (int)(Math.random()*10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("Number to guess is "+ target);

			p1.guess();
			p2.guess();
			p3.guess();

			guess1 = p1.number;
			System.out.println("Players one guess: " + guess1);
			guess2 = p2.number;
			System.out.println("Players second guess: " + guess2);
			guess3 = p3.number;
			System.out.println("Players three guess: " + guess3);

			if(guess1==target){
				p1Right = true;
			}
			if(guess2==target){
				p2Right = true;
			}
			if(guess3==target){
				p3Right = true;
			}

			if (p1Right||p2Right||p3Right){
				break;
			}
			else{
				System.out.println("Players will have to try again.");
			}

		}

	}
}