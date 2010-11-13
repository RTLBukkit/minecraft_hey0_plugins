import java.util.logging.Logger;
/*
 * DepthIndicator v0.1 (14-11-2010)
 * Made by: Ryan Leach(ryan_the_leach)
 * 
 * 
 * */
public class DepthIndicator extends Plugin {
	private Listener listener = new Listener();
	private Logger log;
	String name = "DepthIndicator";
	String version = "0.1";

	public void initialize() {
		log = Logger.getLogger("Minecraft");
		log.info(name + " " + version + " initialized");
		etc.getLoader().addListener( PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.MEDIUM);

	}

	public void enable() {
	}

	public void disable() {
	}

	class Listener extends PluginListener {
		public boolean onCommand(Player player, String[] split) {
			if (split[0].equals("/depth") && player.canUseCommand("/depth")) {
				int y = (int) player.getLocation().y;
				player.sendMessage("Your current depth: "+y);
				return true;
			}
			else return false;
		}
	}
	}