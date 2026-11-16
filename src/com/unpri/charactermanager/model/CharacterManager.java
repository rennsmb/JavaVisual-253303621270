
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characterList = new ArrayList<>();

    public void addCharacter(Character character) {
        if (character == null) {
            System.out.println("Karakter tidak boleh null.");
            return;
        }

        if (findByName(character.getName()) != null) {
            System.out.println("Karakter sudah ada.");
            return;
        }

        characterList.add(character);
        System.out.println("Karakter berhasil ditambahkan.");
    }

    public Character findByName(String name) {
        for (Character character : characterList) {
            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }
        }
        return null;
    }

    public boolean removeCharacter(String name) {
        Character character = findByName(name);

        if (character != null) {
            characterList.remove(character);
            return true;
        }

        return false;
    }

    public int getTotalCharacters() {
        return characterList.size();
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    public double getAverageLevel() {
        if (characterList.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character character : characterList) {
            total += character.getLevel();
        }

        return (double) total / characterList.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        for (Character character : characterList) {
            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }
}
