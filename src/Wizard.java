public class Wizard extends Character{
    // Calling the constructor of the super class.
    Wizard (String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

 
    /**
     * The function Hellfire is a function that takes in a Character object as a parameter and does 50
     * damage to the enemy character
     * 
     * @param enemyCharacter The character that is being attacked.
     */
    public void Hellfire (Character enemyCharacter) {
        int damagePoints = 50;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Hellfire (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }

        /**
         * This function will take in an enemy character and will subtract 45 mana points from the
         * character's mana points and will then print out the character's name and the enemy
         * character's name and will then call the damageTarget function and will pass in the enemy
         * character and 70 damage points.
         * 
         * @param enemyCharacter The character that is being attacked.
         */
        public void flamethrower(Character enemyCharacter){
            int damagePoints = 70;
            int manaCost = 45;
            manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with flamethrower (Damage - 40)");
        damageTarget(enemyCharacter, damagePoints);
    }
    /**
     * This function is used to heal the character and regenerate mana
     */
    public void healSpell(){
        int heal=80;
        int manaRegen=60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}
