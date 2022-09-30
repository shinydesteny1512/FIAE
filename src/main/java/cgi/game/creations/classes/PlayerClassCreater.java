package cgi.game.creations.classes;

import java.util.Random;

public class PlayerClassCreater {
    private IntPlayerClass intClass;
    private StrPlayerClass strClass;
    private DexPlayerClass dexClass;
    private final String STRENGTH = "STRENGTH";
    private final String INTELLIGENCE = "INTELLIGENCE";
    private final String DEXTERITY = "DEXTERITY";

    public IntPlayerClass createMage() {
        intClass = new IntPlayerClass();
        intClass.setName("Mage");
        intClass.setAttributeTyp(INTELLIGENCE);
        setAttributes(intClass);
        return intClass;
    }

    public StrPlayerClass createWarrior() {
        strClass = new StrPlayerClass();
        strClass.setName("Warrior");
        strClass.setAttributeTyp(STRENGTH);
        setAttributes(strClass);
        return strClass;
    }

    public DexPlayerClass createRanger() {
        dexClass = new DexPlayerClass();
        dexClass.setName("Ranger");
        dexClass.setAttributeTyp(DEXTERITY);
        setAttributes(dexClass);
        return dexClass;
    }

    //  -> NOT USED CLASSES RIGHT NOW - JUST "FIXING" INTELLIJ ISSUES
    public IntPlayerClass createPriest() {
        intClass = new IntPlayerClass();
        intClass.setName("Priest");
        intClass.setAttributeTyp(INTELLIGENCE);
        setAttributes(intClass);
        return null;
    }

    public IntPlayerClass createRogue() {
        dexClass = new DexPlayerClass();
        dexClass.setName("Rogue");
        dexClass.setAttributeTyp(DEXTERITY);
        setAttributes(dexClass);
        return null;
    }

    public IntPlayerClass createBarb() {
        strClass = new StrPlayerClass();
        strClass.setName("Barb");
        strClass.setAttributeTyp(STRENGTH);
        setAttributes(strClass);
        return null;
    }

    private void setAttributes(PlayerClass playerClass) {
        Random r = new Random();
        int randomNumber = r.nextInt(15) + 6;
        if (playerClass instanceof IntPlayerClass) {
            System.out.println("IntClass");
            Integer IntelligenceValue = (int) (randomNumber * 0.5);
            Integer DexterityValue = (int) (randomNumber * 0.3);
            Integer StrengthValue = (int) (randomNumber * 0.2);
            playerClass.setInt(IntelligenceValue);
            playerClass.setDex(DexterityValue);
            playerClass.setStr(StrengthValue);
        } else if (playerClass instanceof DexPlayerClass) {
            System.out.println("DexClass");
            Integer IntelligenceValue = (int) (randomNumber * 0.3);
            Integer DexterityValue = (int) (randomNumber * 0.5);
            Integer StrengthValue = (int) (randomNumber * 0.2);
            playerClass.setInt(IntelligenceValue);
            playerClass.setDex(DexterityValue);
            playerClass.setStr(StrengthValue);
        } else {
            System.out.println("StrClass");
            Integer IntelligenceValue = (int) (randomNumber * 0.2);
            Integer DexterityValue = (int) (randomNumber * 0.3);
            Integer StrengthValue = (int) (randomNumber * 0.5);
            playerClass.setInt(IntelligenceValue);
            playerClass.setDex(DexterityValue);
            playerClass.setStr(StrengthValue);
        }
    }
}
