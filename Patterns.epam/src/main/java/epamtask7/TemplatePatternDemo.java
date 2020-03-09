package epamtask7;
abstract class Game {
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   public final void play(){

	      initialize();

	      startPlay();

	      endPlay();
	   }
	}

	class Cricket extends Game {

	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}

	class Football extends Game {

	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}

	public class TemplatePatternDemo {
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();		
	   }
	}

