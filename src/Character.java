public class Character {
 // Declaring the variables.
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 300;
    public int manaPoints = 100;


   // The above code is creating a constructor for the Character class.
    Character(){
        System.out.println("Non Parameterized Constructor");
    }

    Character(String name, int newLevel, int newHealth, int newMana){
        characterName = name;
        level = newLevel;
        manaPoints = newMana;
        healthPoints = newHealth;
    }

    // A method that displays the name of the character.
    public void nameDisplay(){
        System.out.println("Character Initialized "+ characterName);
    }


   // A method that takes in two parameters, the first one is the enemy character and the second one is
   // the damage points.
    public void damageTarget(Character enemyCharacter,int damagePoints){

        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character "+ enemyCharacter.characterName +" Defeated");
        }
    }
    // A method that displays the character's name, health points, and mana points.
    public void showStats(){
        System.out.println(characterName +" Status \nHP "+ healthPoints +"\nMana "+ manaPoints);
    }
   // A method that increases the level of the character by 10.
    public void levelUp(){
        int levelUp = 10;
        level += levelUp;

        System.out.println(characterName +" Leveled up to Level "+ level);
    }

}