# FIAE

## Uniting Worlds
This Game is a Project for trainees.
When the Game is finished it should be possible to play a Mini Game with successfully used different technical parts of Java.

Exercises:

1. Create all Data Objects
   1. Items, Classes and Races
2. Fill Items, Classes and Races with some functionality for example damage calculation for Weapons, Attributes of Classes, Charactical Marks for Races
3. Create all Data Objects about the Player and at least 1 Enemy
4. Fill Player and Enemies with functionality for example, player health and mana calculation based on Class + Race combo, same for Enemies (enemies dont have classes)
5. Create Game instance and adjust Items and Enemies that they scale with the Gamestage
6. Create Player Inventory
7. Create Tiles for the Game. Fight, Shop and Rest
8. Create a Console Clean Screen that load at least 12 Random Tiles. it should be loaded at least 2 different  shops and 2 rest tiles. 
9. Split the Clean Screen into Action Area and Player Area. In Player Area the Player should be able to open an Character Sheet that shows all available Character Informations (Stats + Items).
10. Create a function that allows the player to choose between the tiles. If the Player choose a fight, generate a combat  log that loads every second a new action
    1. for example -> LINE1: Player attacks [Enemy] for X Damage - LINE2: [Enemy] attack Player for X Damage
    2. If the HP of the Player or the Enemy goes to 0, the Fight Ends
    3. If the HP of the Player goes to 0, the Game is over and the Character should be deleted.
11. The Last Fight of a Gamestage should be an "Elite-Fight" a Stronger  Enemy that increases the Gamestage by 1 and generate 12 new and harder tiles on death.
12. Implement a Menu that allows the Player to start a new Game or load a old game.

BONUS EXERCISES:
1. The Gamestage gets a Type that changes the whole Stage
   1. for example, a Desert Type that slows every thing in fight.
2. Change the Fight from Automatic Fights to "old school" RPG fights. With "Attack" "Defense" and "FLEE!"
3. ???????
4. Profit