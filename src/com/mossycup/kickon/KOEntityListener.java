package com.mossycup.kickon;

import java.util.logging.Logger;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.entity.Player;

public class KOEntityListener extends EntityListener {
    private final KickOn plugin;
    private static final Logger log = Logger.getLogger("Minecraft");

    public KOEntityListener(KickOn instance) {
        plugin = instance;
    }
    
    public void onEntityDeath(EntityDeathEvent event){
    	
    	log.info("[KO] Event:  EntityDeathEvent EntityID " + event.getEntity().getEntityId());
    	
    	if(!(event.getEntity() instanceof Player)) return;
    	
    	Player player = (Player)event.getEntity();
    	
    	log.info("[KO] Kick:  " + event.getEntity().getEntityId() + "has been kicked");
    	player.kickPlayer("You have been KICKED!");
    }
    
}
