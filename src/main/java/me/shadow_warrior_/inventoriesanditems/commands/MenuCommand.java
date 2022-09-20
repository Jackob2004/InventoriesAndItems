package me.shadow_warrior_.inventoriesanditems.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        Inventory inventory = Bukkit.createInventory(p,9, ChatColor.RED + "Inventory title");

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_GREEN + "Click me");

        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_AQUA + "Description test");
        lore.add("Description test");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);

        ItemStack axe = new ItemStack(Material.DIAMOND_AXE,1);
        ItemMeta axeMeta = axe.getItemMeta();
        axeMeta.setDisplayName(ChatColor.RED + "Click me");
        axeMeta.addEnchant(Enchantment.ARROW_DAMAGE,10,true);
        axe.setItemMeta(axeMeta);

        inventory.setItem(0,item);
        inventory.setItem(1,axe);

        p.openInventory(inventory);


        return true;
    }
}
