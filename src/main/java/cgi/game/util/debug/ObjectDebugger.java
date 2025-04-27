package cgi.game.util.debug;

import cgi.game.creations.player.Player;
import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.IntPlayerClass;
import cgi.game.creations.player.classes.StrPlayerClass;

public class ObjectDebugger {

    public static void debugPlayer(Player player) {
        System.out.printf(String.format("""
                        #######################################################
                        PLAYER NAME: %s
                        PLAYER HEALTH: %s
                        PLAYER MANA: %s
                        PLAYER INITIATIVE: %s
                        PLAYER INITIATIVE BONUS: %s
                        PLAYER CLASS: %s
                        PLAYER CLASS ATTRIBUTE TYPE: %s
                        PLAYER CLASS STRENGTH: %s
                        PLAYER CLASS DEXTERITY: %s
                        PLAYER CLASS INTELLIGENCE: %s
                        PLAYER CLASS WEAPON: %s
                        PLAYER CLASS HELM: %s
                        PLAYER CLASS ARMOUR: %s
                        PLAYER CLASS ACCESSORIES: %s
                        #######################################################
                        """,
                player.getName(),
                player.getHealth(),
                player.getMana(),
                player.getInitiative(),
                player.getInitiativeBonus(),
                player.getMyClass().getPlayerClassName(),
                player.getMyClass().getAttributeTyp(),
                player.getMyClass().getStr(),
                player.getMyClass().getDex(),
                player.getMyClass().getInt(),
                player.getInventory().getWeapon(),
                player.getInventory().getHelm(),
                player.getInventory().getChest(),
                player.getInventory().getAccessories()));

        if (player.getMyClass() instanceof StrPlayerClass strPlayerClass) {
            System.out.println("STR CLASS: " + strPlayerClass);
        } else if (player.getMyClass() instanceof DexPlayerClass dexPlayerClass) {
            System.out.println("DEX CLASS: " + dexPlayerClass);
        } else if (player.getMyClass() instanceof IntPlayerClass intPlayerClass) {
            System.out.println("INT CLASS: " + intPlayerClass);
        }
    }

}
