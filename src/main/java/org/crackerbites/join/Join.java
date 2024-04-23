package org.crackerbites.join;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Join extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("JoinEffects Plugin Initialized");
        System.out.println("Made possible by CrackerBites\n" +
                "░█████╗░██████╗░░█████╗░░█████╗░██╗░░██╗███████╗██████╗░██████╗░██╗████████╗███████╗░██████╗\n" +
                "██╔══██╗██╔══██╗██╔══██╗██╔══██╗██║░██╔╝██╔════╝██╔══██╗██╔══██╗██║╚══██╔══╝██╔════╝██╔════╝\n" +
                "██║░░╚═╝██████╔╝███████║██║░░╚═╝█████═╝░█████╗░░██████╔╝██████╦╝██║░░░██║░░░█████╗░░╚█████╗░\n" +
                "██║░░██╗██╔══██╗██╔══██║██║░░██╗██╔═██╗░██╔══╝░░██╔══██╗██╔══██╗██║░░░██║░░░██╔══╝░░░╚═══██╗\n" +
                "╚█████╔╝██║░░██║██║░░██║╚█████╔╝██║░╚██╗███████╗██║░░██║██████╦╝██║░░░██║░░░███████╗██████╔╝\n" +
                "░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═════╝░╚═╝░░░╚═╝░░░╚══════╝╚═════╝░");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location joinLocation = player.getLocation();
        smoke(joinLocation);
    }

    private void smoke(Location location) {
        if (location != null && location.getWorld() != null) {
            location.getWorld().spawnParticle(Particle.SMOKE_LARGE, location, 100);
        }

    }

}

