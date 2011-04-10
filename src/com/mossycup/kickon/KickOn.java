/**
 * Bukkit plugin which kicks players on certain events
 * 
 * @author Jeff Stevens <jeff@mossycup.com>
 */

package com.mossycup.kickon;

import java.util.logging.Logger;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class KickOn extends JavaPlugin {
	
	private static final Logger log = Logger.getLogger("Minecraft");
	private final KOEntityListener entityListener = new KOEntityListener(this);
	
    public void onEnable() {
   
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.ENTITY_DEATH, entityListener, Priority.Normal, this);
        log.info("[KO] Kick on Death Enabled");
    }

    public void onDisable() {
    	log.info("[KO] Kick on Death Disabled");
    }
 }
    