package wildcodeschool.java08;

public class Nature {
	



	    public static void main(String[] args) {



	        Penguin pingou = new Penguin("Pingou");

	        pingou.dive();

	        pingou.swimDown(3);

	        pingou.swimUp(1);

	        pingou.swimDown(4);

	        pingou.swimUp(5);

	        pingou.swimUp(1);

	        pingou.getOut();



	        Eagle eyeCherry = new Eagle("Eye Cherry");

	        // TODO : d�commente le code suivant afin de le tester

	        

	        eyeCherry.takeOff();

	        eyeCherry.Flyascend(120);

	        eyeCherry.Flyascend(150);

	        eyeCherry.glide();

	        eyeCherry.Flydescend(10);

	        eyeCherry.land();

	        eyeCherry.Flydescend(1);

	        eyeCherry.land();

	       

	    }

	}
