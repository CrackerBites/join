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
        getServer().getPluginManager().registerEvents(new ExtendedClass(this), this);
    }
}
