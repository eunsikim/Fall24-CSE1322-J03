abstract class Entity {
    private int hp;
    private int damage;
    private boolean isAlive;
    private String name;

    public Entity(int hp, String name, int damage) {
        this.hp = hp;
        this.name = name;
        this.damage = damage;
        this.isAlive = true;
    }

    abstract public int attack();

    public void takeDamage(int damage) {
        this.hp -= damage;

        if (hp < 0) {
            this.isAlive = false;
        }
    }

    public int getHP() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return isAlive;
    }
}

class Archer extends Entity {
    public Archer(int hp, String name) {
        super(hp, name, 4);
    }

    @Override
    public int attack() {
        System.out.println(getName() + " Deals " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return getName() + " has " + getHP() + " HP left!";
    }
}

class Warrior extends Entity {
    public Warrior(int hp, String name) {
        super(hp, name, 10);
    }

    @Override
    public int attack() {
        System.out.println(getName() + " Deals " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return getName() + " has " + getHP() + " HP left!";
    }
}

class Mage extends Entity {
    public Mage(int hp, String name) {
        super(hp, name, 7);
    }

    @Override
    public int attack() {
        System.out.println(getName() + " Deals " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return getName() + " has " + getHP() + " HP left!";
    }
}

class Player extends Entity {
    public Player(int hp, String name) {
        super(hp, name, 20);
    }

    @Override
    public int attack() {
        System.out.println("You deal " + getDamage() + " damage!");
        return getDamage();
    }

    @Override
    public String toString() {
        return "You have " + getHP() + " HP left!";
    }
}

public class ExampleA {
    public static void playRound(Entity one, Entity two) {
        one.takeDamage(two.attack());
        System.out.println(one);

        two.takeDamage(one.attack());
        System.out.println(two);
        System.out.println();
    }

    public static void main(String[] args) {
        Entity[] entities = new Entity[5];

        entities[0] = new Archer(0, null);
        entities[1] = new Mage(0, null);

        Entity playerOne = new Player(100, "Player One");
        Entity shapeShifter = new Archer(100, "The Shapeshifter mode: Archer");

        System.out.println(playerOne);
        System.out.println(shapeShifter);
        System.out.println();

        playRound(playerOne, shapeShifter);

        shapeShifter = new Mage(shapeShifter.getHP(), "The Shapeshifter mode: Mage");

        playRound(playerOne, shapeShifter);

        shapeShifter = new Warrior(shapeShifter.getHP(), "The Shapeshifter mode: Warrior");

        playRound(playerOne, shapeShifter);

    }
}