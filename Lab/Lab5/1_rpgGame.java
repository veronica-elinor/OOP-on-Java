class Warrior {
	// Declaring member variables here
 	int HP;
    int MP;

	public int getHP() {
		// please write your code here
      return this.HP;
	}

	public int getMP() {
		// please write your code here
      return this.MP;
	}

	public Warrior() {
		// please write your code here
      	this.HP = 700;
        this.MP = 100;
	}

	public Warrior(int HP, int MP) {
		// please write your code here
      	this.HP = HP;
        this.MP = MP;
	}

	public void Slash(Wizard wizard){
		// please write your code here
      if (this.MP >= 20) {
            this.MP -= 20;
            wizard.HP -= 60;
        }
	}

	public boolean CheckAlive() {
		// please write your code here
      if (this.HP <= 0) {
            System.out.println("Wizard win");
            return false;
        }
        return true;
	}
}

class Wizard {
	// Declaring member variables here
  	int HP;
    int MP;
	
  public int getHP() {
		// please write your code here
      return this.HP;
	}

	public int getMP() {
		// please write your code here
      return this.MP;
	}

	public Wizard() {
		// please write your code here
      	this.HP = 300;
        this.MP = 500;
	}

	public Wizard(int HP, int MP) {
		// please write your code here
      	this.HP = HP;
        this.MP = MP;
	}

	public void FireBall(Warrior warrior){
		// please write your code here
      if (this.MP >= 100) {
            this.MP -= 100;
            warrior.HP -= 140;
        }
	}

	public boolean CheckAlive() {
		// please write your code here
      if (this.HP <= 0) {
            System.out.println("Warrior win");
            return false;
        }
        return true;
	}
}
//test function
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

//chatGPT
class Warrior {
    private int HP;
    private int MP;
    
    public Warrior() {
        this.HP = 700;
        this.MP = 100;
    }
    
    public Warrior(int HP, int MP) {
        this.HP = HP;
        this.MP = MP;
    }
    
    public int getHP() {
        return this.HP;
    }
    
    public int getMP() {
        return this.MP;
    }
    
    public void Slash(Wizard wizard) {
        if (this.MP >= 20) {
            this.MP -= 20;
            wizard.takeDamage(60);
        }
    }
    
    public boolean CheckAlive() {
        if (this.HP <= 0) {
            System.out.println("Wizard win");
            return false;
        }
        return true;
    }
    
    public void takeDamage(int damage) {
        this.HP -= damage;
    }
}

class Wizard {
    private int HP;
    private int MP;
    
    public Wizard() {
        this.HP = 300;
        this.MP = 500;
    }
    
    public Wizard(int HP, int MP) {
        this.HP = HP;
        this.MP = MP;
    }
    
    public int getHP() {
        return this.HP;
    }
    
    public int getMP() {
        return this.MP;
    }
    
    public void FireBall(Warrior warrior) {
        if (this.MP >= 100) {
            this.MP -= 100;
            warrior.takeDamage(140);
        }
    }
    
    public boolean CheckAlive() {
        if (this.HP <= 0) {
            System.out.println("Warrior win");
            return false;
        }
        return true;
    }
    
    public void takeDamage(int damage) {
        this.HP -= damage;
    }
}

public class RPGGame {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        
        while (true) {
            warrior.Slash(wizard);
            if (!wizard.CheckAlive()) {
                break;
            }
            wizard.FireBall(warrior);
            if (!warrior.CheckAlive()) {
                break;
            }
            warrior.Slash(wizard);
            if (!wizard.CheckAlive()) {
                break;
            }
        }
    }
}

