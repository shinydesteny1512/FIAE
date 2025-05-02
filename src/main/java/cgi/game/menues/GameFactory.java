package cgi.game.menues;

import cgi.game.creations.items.ItemFactory;
import cgi.game.creations.player.Player;
import cgi.game.menues.general.CreatePlayerWindow;
import cgi.game.menues.general.GameWindow;
import cgi.game.menues.general.MainWindow;
import cgi.game.menues.ingame.EventMenu;
import cgi.game.menues.ingame.FightMenu;
import cgi.game.menues.ingame.RestMenu;
import cgi.game.menues.ingame.ShopMenu;

final public class GameFactory {
	public static Player player = new Player();
	public final static MainWindow mainWindow = new MainWindow(WindowNames.MAIN_MENU.toString());
	public final static GameWindow gameWindow = new GameWindow(WindowNames.GAME_WINDOW.toString());
	public final static CreatePlayerWindow createPlayerWindow = new CreatePlayerWindow(WindowNames.CREATE_PLAYER_MENU.toString());
	public final static FightMenu fightMenu = new FightMenu(WindowNames.FIGHT_MENU.toString());
	public final static ShopMenu shopMenu = new ShopMenu(WindowNames.SHOP_MENU.toString());
	public final static EventMenu eventMenu = new EventMenu(WindowNames.EVENT_MENU.toString());
	public final static RestMenu restMenu = new RestMenu(WindowNames.REST_MENU.toString());
	private final static ItemFactory ITEM_FACTORY = new ItemFactory();

}
