/**
 * In this exercise you will complete a Character class and use it in the main()
 * method below.
 * <p>
 * You should start by following the instructions in the Character class.
 */
public class Main {
    public static void main(String[] args) {
        Character wizard = new Character("Harry","wizard",120.0,
                150.0);

        // todo: Create a main() method.
        // todo: Create a new instance of the Character class named wizard. The instance's type should be set to 'wizard', but all other properties are up to you.
        Character orc = new Character("Rufus","orc",150.0,115.0);

        // todo: Create a new instance of the Character class named orc. The instance's type should be set to 'orc', but all other properties are up to you.
        System.out.println(wizard);
        // todo: Print the wizard to the console.
        System.out.println(orc);
        // todo: Print the orc to the console.
        wizard.attack(orc);
        // todo: Have the wizard attack the orc
        orc.attack(wizard);
        // todo: Have the orc attack the wizard
        System.out.println(wizard);
        // todo: Print the wizard to the console again.
        System.out.println(orc);
        // todo: Print the orc to the console again.

    }
}
