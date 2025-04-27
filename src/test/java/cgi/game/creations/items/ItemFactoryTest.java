package cgi.game.creations.items;

import cgi.game.creations.items.accessiore.Accessories;
import cgi.game.creations.items.armour.Armour;
import cgi.game.creations.items.weapon.Weapon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class ItemFactoryTest {

    private ItemFactory itemFactory;

    @BeforeEach
    void setUp() {
        itemFactory = new ItemFactory();

    }

    @Test
    void createValidWeaponList() {
        itemFactory.createWeaponStagePack();
        List<Weapon> weaponList = itemFactory.getWeaponsOfStage();
        Assertions.assertNotNull(weaponList);

        for (Weapon weapon : weaponList) {
            System.out.println("####################################################");
            System.out.println("WEAPON_ NAME: " + ((weapon.getName() != null) ? weapon.getName() : weapon.getClass().toString()));
            System.out.println("WEAPON_ RARITY: " + weapon.getRarity());
            System.out.println("WEAPON_ AVG_DAMAGE: " + weapon.getAvgDamage());
            System.out.println("WEAPON_ MAX_DAMAGE: " + weapon.getMaxDmg());
            System.out.println("WEAPON_ MIN_DAMAGE: " + weapon.getMinDmg());
            System.out.println("WEAPON_ ATTACK SPEED: " + weapon.getAttackSpeed());
            System.out.println("WEAPON_ RANGE: " + weapon.getRange());
            System.out.println("WEAPON_ SHARPNESS: " + weapon.getSharpness());
            System.out.println("WEAPON_ ATTRIBUTE BONUS: " + weapon.getAttributeBonus());
            System.out.println("WEAPON_ UPGRADE COUNT: " + weapon.getUpgradeCount());
        }
    }

    @Test
    void createValidArmourList() {
        itemFactory.createArmourStagePack();
        List<Armour> armourList = itemFactory.getArmourListOfStage();
        Assertions.assertNotNull(armourList);

        for (Armour armour : armourList) {
            System.out.println("####################################################");
            System.out.println("ARMOUR_ NAME: " + armour.getClass());
            System.out.println("ARMOUR_ RARITY: " + armour.getRarity());
            System.out.println("ARMOUR_ ATTRIBUTE: " + armour.getAttributes());
            System.out.println("ARMOUR_ DURABILITY: " + armour.getDurability());
            System.out.println("ARMOUR_ DMG_REDUCTION: " + armour.getDmgReduction());
            System.out.println("ARMOUR_ WEIGTH: " + armour.getWeight());
            System.out.println("ARMOUR_ ARMOURTYP: " + armour.getArmourTyp());
        }

    }

    @Test
    void createValidAccessioresList() {
        itemFactory.createAccessoriesStagePack();
        List<Accessories> accessoriesList = itemFactory.getAccessoriesListOfStage();
        Assertions.assertNotNull(accessoriesList);

        for (Accessories accessories : accessoriesList) {
            System.out.println("####################################################");
            System.out.println("ACCESSIORES_ NAME: " + accessories.getClass());
            System.out.println("ACCESSIORES_ RARITY: " + accessories.getRarity());
            System.out.println("ACCESSIORES_ ATTRIBUTE: " + accessories.getAttributes());
        }
    }

}