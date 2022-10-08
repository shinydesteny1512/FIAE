package cgi.game.creations.player.classes;

import cgi.game.creations.Attributes;

public class PlayerClassFactory {
    private IntPlayerClass intClass;
    private StrPlayerClass strClass;
    private DexPlayerClass dexClass;

    public final IntPlayerClass createMage() {
        intClass = new IntPlayerClass();
        intClass.setPlayerClassName("Mage");
        intClass.setAttributeTyp(Attributes.INTELLIGENCE);
        intClass.initializeAttributes();
        return intClass;

    }

    public StrPlayerClass createWarrior() {
        strClass = new StrPlayerClass();
        strClass.setPlayerClassName("Warrior");
        strClass.setAttributeTyp(Attributes.STRENGTH);
        strClass.initializeAttributes();
        return strClass;

    }

    public DexPlayerClass createRanger() {
        dexClass = new DexPlayerClass();
        dexClass.setPlayerClassName("Ranger");
        dexClass.setAttributeTyp(Attributes.DEXTERITY);
        dexClass.initializeAttributes();
        return dexClass;

    }

    public IntPlayerClass createPriest() {
        intClass = new IntPlayerClass();
        intClass.setPlayerClassName("Priest");
        intClass.setAttributeTyp(Attributes.INTELLIGENCE);
        intClass.initializeAttributes();
        return intClass;

    }

    public DexPlayerClass createRogue() {
        dexClass = new DexPlayerClass();
        dexClass.setPlayerClassName("Rogue");
        dexClass.setAttributeTyp(Attributes.DEXTERITY);
        dexClass.initializeAttributes();
        return dexClass;

    }

    public StrPlayerClass createBarbarian() {
        strClass = new StrPlayerClass();
        strClass.setPlayerClassName("Barbarian");
        strClass.setAttributeTyp(Attributes.STRENGTH);
        strClass.initializeAttributes();
        return strClass;

    }

}
