public class App {

        public static void main(String[] args) throws Exception {
            System.out.println("Wizards and Warlocks\n");
    
            // Creating a new instance of the class Wizard and Warlock.
            Wizard Alvin = new Wizard("Alvin", 50,150,200);
            Warlock Mello = new Warlock("Mello", 10, 100, 150);
           
            // Calling the methods of the class Wizard and Warlock.
            Alvin.nameDisplay();
            Mello.nameDisplay();
    
            Alvin.flamethrower(Mello);
            Alvin.showStats();
            Mello.showStats();
    
            Mello.firebolt(Alvin);
            Alvin.showStats();
            Mello.showStats();
    
            Alvin.healSpell();
            Alvin.showStats();
            Mello.showStats();
    
            Mello.thunderwave(Alvin);
            Alvin.showStats();
            Mello.showStats();
    
            Alvin.Hellfire(Mello);
            Alvin.levelUp();
        }
    } 