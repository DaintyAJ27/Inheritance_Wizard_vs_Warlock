public class Warlock extends Character {
    // A constructor.
    Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

    /**
     * The firebolt function takes an enemy character as a parameter, subtracts 30 mana points from the
     * character's mana points, and then prints out a message saying that the character attacked the
     * enemy character with firebolt, and then calls the damageTarget function to damage the enemy
     * character
     * 
     * @param enemyCharacter The character that is being attacked.
     */
    public void firebolt(Character enemyCharacter) {
        int damagePoints = 50;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with firebolt (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
  
    /**
     * The function takes in an enemy character and then subtracts 45 mana points from the character's
     * mana points and then prints out a message saying that the character attacked the enemy character
     * with thunderwave and then calls the damageTarget function to deal 70 damage to the enemy
     * character
     * 
     * @param enemyCharacter The character that is being attacked
     */
    public void thunderwave(Character enemyCharacter){
        int damagePoints = 70;
        int manaCost = 45;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with thunderwave (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }
 
    /**
     * This function is used to heal the character and regenerate mana
     */
    public void healthRegen(){
        int heal=80;
        int manaRegen=60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }
}
