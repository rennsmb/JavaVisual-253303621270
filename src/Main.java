

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Character Manager TP3 ===");

        CharacterManager manager = new CharacterManager();

        Character hero = new Character(
            1, "Arjuna", CharacterType.WARRIOR, 5
        );

        Character mage = new Character(
            2, "Merlin", CharacterType.MAGE, 3
        );

        Character archer = new Character(
            3, "Athena", CharacterType.ARCHER, 4
        );

        manager.addCharacter(hero);
        manager.addCharacter(mage);
        manager.addCharacter(archer);

        System.out.println("\n=== Daftar Karakter ===");

        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }

        System.out.println("\n=== Demo Level Up ===");

        hero.setLevel(hero.getLevel() + 1);
        System.out.println(hero);

        System.out.println("\n=== Mini Challenge ===");

        Character healer = new Character(
            4, "Luna", CharacterType.HEALER, 6
        );

        healer.setMana(100);

        System.out.println(healer);
        System.out.println("Mana Luna: " + healer.getMana());
        System.out.println("Luna masih hidup: " + healer.isAlive());

        System.out.println("\nTotal karakter: "
                + manager.getTotalCharacters());
    }
}
