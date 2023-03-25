class Warrior {
	// Declaring member variables here
  	public int HP;
  	public int MP;

	public int getHP() {
		// please write your code here
      	return HP;
	}

	public int getMP() {
		// please write your code here
      	return MP;
	}

	public Warrior() {
		// please write your code here
      	int HP = 700:
      	int MP = 100;
	}

	public Warrior(int HP, int MP) {
		// please write your code here
      	setWarrior(HP, MP);
	}

	public void Slash(Wizard wizard){
		// please write your code here
	}

	public boolean CheckAlive() {
		// please write your code here
      	if (HP>0){
          return true;
        }
      	else {
          System.out.println("\"Wizard Win\"");
          return false;
      
	}
}

class Wizard {
	// Declaring member variables here
  	int HP;
    int MP;
  
	public int getHP() {
		// please write your code here

	}

	public int getMP() {
		// please write your code here
	}

	public Wizard() {
		// please write your code here
      	int HP = 300;
      	int MP = 500;
	}

	public Wizard(int HP, int MP) {
		// please write your code here
      	setWizard(HP, MP);
	}

	public void FireBall(Warrior warrior){
		// please write your code here
	}

	public boolean CheckAlive() {
		// please write your code here
	}
}

public class Main {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();
		int dice = 0;
		while(warrior.CheckAlive() && wizard.CheckAlive()) {
			if(dice % 2 == 0) {
				warrior.Slash(wizard);
			}
			else {
				wizard.FireBall(warrior);
			}
			dice += 1;
		}
	}
}
