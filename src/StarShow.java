import org.teachingextensions.logo.Tortoise;

public class StarShow {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		for (int i = 0; i < 5; i++) {
			Tortoise.turn(80);
			Tortoise.move(50);
		}
	}

}
