package org.crackerbites.join;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtendedClass implements Listener {

    private JavaPlugin plugin;

    public ExtendedClass(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location joinLocation = player.getLocation();
        smoke(joinLocation);
    }

    private void smoke(Location location) {
        if (location != null && location.getWorld() != null) {
            int particleCount = 30;  // Adjust for desired number of particles
            double radius = 2;
            for (int degree = 0; degree < 360; degree += 360 / particleCount) {
                double radians = Math.toRadians(degree);
                double offsetX = radius * Math.cos(radians);
                double offsetZ = radius * Math.sin(radians);
                double x = location.getX() + 2;
                double y = location.getY();
                double z = location.getZ() + 2;
                double xx = location.getX() + 1;
                double zz = location.getZ() + 1;

                location.getWorld().spawnParticle(Particle.HEART, x, y, z, 100);
                location.getWorld().spawnParticle(Particle.HEART, xx, y, zz, 100);
                location.getWorld().spawnParticle(Particle.HEART, x, y, z, 100);

                System.out.println("Cool particles");
            }
        }
    }
}
