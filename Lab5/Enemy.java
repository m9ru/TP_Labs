public class Enemy extends Person {
	String name;
    public Enemy(String name) {
        super(name);
        this.name = name;
    }

    public static void checkRandom(int num, Player player, Enemy enemy) {
    	if (enemy.randNum == num) {
    		Person.loseLives(enemy);
    		System.out.printf("Вы угадали, теперь у врага с именем %s осталось %d жизней!\n", enemy.name, enemy.lives);
    	}
    	else if (enemy.randNum > num)
    		System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, больше");
    	else if (enemy.randNum < num)
    		System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, меньше");
    }
}
