package cgi.game.menues;

import cgi.game.menues.general.CreatePlayerWindow;
import cgi.game.menues.general.GameWindow;
import cgi.game.menues.general.MainWindow;
import cgi.game.menues.ingame.EventMenu;
import cgi.game.menues.ingame.FightMenu;
import cgi.game.menues.ingame.RestMenu;
import cgi.game.menues.ingame.ShopMenu;

final public class WindowFactory {

    public final static MainWindow mainWindow = new MainWindow(WindowNames.MAINMENU.toString());
    public final static GameWindow gameWindow = new GameWindow(WindowNames.GAMEWINDOW.toString());
    public final static CreatePlayerWindow createPlayerWindow = new CreatePlayerWindow(WindowNames.CREATEPLAYERMENU.toString());
    public final static FightMenu fightMenu = new FightMenu(WindowNames.FIGHTMENU.toString());
    public final static ShopMenu shopMenu = new ShopMenu(WindowNames.SHOPMENU.toString());
    public final static EventMenu eventMenu = new EventMenu(WindowNames.EVENTMENU.toString());
    public final static RestMenu restMenu = new RestMenu(WindowNames.RESTMENU.toString());

}
