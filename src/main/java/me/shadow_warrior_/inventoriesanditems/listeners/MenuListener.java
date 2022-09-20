package me.shadow_warrior_.inventoriesanditems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Inventory title")){

            if (e.getCurrentItem() == null){
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GREEN + "Click me")) {
                System.out.println("You clicked on diamond sword");
            } else if (e.getCurrentItem().getType() == Material.DIAMOND_AXE){
                System.out.println("You clicked on diamond axe");
            }else System.out.println("You clicked on sth else");

            e.setCancelled(true); //player cannot move items
        }


    }
}
