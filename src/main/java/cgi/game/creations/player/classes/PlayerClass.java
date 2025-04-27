package cgi.game.creations.player.classes;

import cgi.game.creations.Attributes;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public abstract class PlayerClass {
    private String playerClassName;
    private Attributes attributeTyp;
    private Integer str;
    private Integer dex;
    private Integer Int;

    public void initializeAttributes() {
        final Random r = new Random();
        int randomNumber = r.nextInt(30) + 10;
        if (this.getAttributeTyp().toString() != null) {
            if (this.getAttributeTyp().toString().equals(Attributes.INTELLIGENCE.toString())) {
                Integer IntelligenceValue = (int) (randomNumber * 0.5);
                Integer DexterityValue = (int) (randomNumber * 0.3);
                Integer StrengthValue = (int) (randomNumber * 0.2);
                this.setInt(IntelligenceValue);
                this.setDex(DexterityValue);
                this.setStr(StrengthValue);

            } else if (this.getAttributeTyp().toString().equals(Attributes.DEXTERITY.toString())) {
                Integer IntelligenceValue = (int) (randomNumber * 0.3);
                Integer DexterityValue = (int) (randomNumber * 0.5);
                Integer StrengthValue = (int) (randomNumber * 0.2);
                this.setInt(IntelligenceValue);
                this.setDex(DexterityValue);
                this.setStr(StrengthValue);

            } else if (this.getAttributeTyp().toString().equals(Attributes.STRENGTH.toString())) {
                Integer IntelligenceValue = (int) (randomNumber * 0.2);
                Integer DexterityValue = (int) (randomNumber * 0.3);
                Integer StrengthValue = (int) (randomNumber * 0.5);
                this.setInt(IntelligenceValue);
                this.setDex(DexterityValue);
                this.setStr(StrengthValue);

            } else {
                System.out.println("Attribute Type not found, values will be rolled on a average Value");
                Integer IntelligenceValue = (int) (randomNumber * 0.33);
                Integer DexterityValue = (int) (randomNumber * 0.33);
                Integer StrengthValue = (int) (randomNumber * 0.33);
                this.setInt(IntelligenceValue);
                this.setDex(DexterityValue);
                this.setStr(StrengthValue);
            }
        }
    }

}
