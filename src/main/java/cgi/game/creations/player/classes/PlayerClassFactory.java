package cgi.game.creations.player.classes;

import cgi.game.creations.Attributes;

import java.util.Random;

public class PlayerClassFactory {
    private IntPlayerClass intClass;
    private StrPlayerClass strClass;
    private DexPlayerClass dexClass;

    public IntPlayerClass createMage() {
        intClass = new IntPlayerClass();
        intClass.setPlayerClassName("Mage");
        intClass.setAttributeTyp(Attributes.INTELLIGENCE);
        setAttributes(intClass);
        return intClass;
    }

    public StrPlayerClass createWarrior() {
        strClass = new StrPlayerClass();
        strClass.setPlayerClassName("Warrior");
        strClass.setAttributeTyp(Attributes.STRENGTH);
        setAttributes(strClass);
        return strClass;
    }

    public DexPlayerClass createRanger() {
        dexClass = new DexPlayerClass();
        dexClass.setPlayerClassName("Ranger");
        dexClass.setAttributeTyp(Attributes.DEXTERITY);
        setAttributes(dexClass);
        return dexClass;
    }

    public IntPlayerClass createPriest() {
        intClass = new IntPlayerClass();
        intClass.setPlayerClassName("Priest");
        intClass.setAttributeTyp(Attributes.INTELLIGENCE);
        setAttributes(intClass);
        return intClass;
    }

    public DexPlayerClass createRogue() {
        dexClass = new DexPlayerClass();
        dexClass.setPlayerClassName("Rogue");
        dexClass.setAttributeTyp(Attributes.DEXTERITY);
        setAttributes(dexClass);
        return dexClass;
    }

    public StrPlayerClass createBarbarian() {
        strClass = new StrPlayerClass();
        strClass.setPlayerClassName("Barbarian");
        strClass.setAttributeTyp(Attributes.STRENGTH);
        setAttributes(strClass);
        return strClass;
    }

    private void setAttributes(PlayerClass playerClass) {
        final Random r = new Random();
        int randomNumber = r.nextInt(30) + 10;
        if (playerClass instanceof IntPlayerClass) {
            Integer IntelligenceValue = (int) (randomNumber * 0.5);
            Integer DexterityValue = (int) (randomNumber * 0.3);
            Integer StrengthValue = (int) (randomNumber * 0.2);
            playerClass.setInt(IntelligenceValue);
            playerClass.setDex(DexterityValue);
            playerClass.setStr(StrengthValue);

        } else if (playerClass instanceof DexPlayerClass) {
            Integer IntelligenceValue = (int) (randomNumber * 0.3);
            Integer DexterityValue = (int) (randomNumber * 0.5);
            Integer StrengthValue = (int) (randomNumber * 0.2);
            playerClass.setInt(IntelligenceValue);
            playerClass.setDex(DexterityValue);
            playerClass.setStr(StrengthValue);

        } else {
            Integer IntelligenceValue = (int) (randomNumber * 0.2);
            Integer DexterityValue = (int) (randomNumber * 0.3);
            Integer StrengthValue = (int) (randomNumber * 0.5);
            playerClass.setInt(IntelligenceValue);
            playerClass.setDex(DexterityValue);
            playerClass.setStr(StrengthValue);

        }
    }
}
