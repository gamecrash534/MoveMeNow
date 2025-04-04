package net.craftminecraft.bungee.movemenow;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import java.util.ArrayList;

public class ReloadCommand extends Command implements TabExecutor {
    MoveMeNow plugin;

    public ReloadCommand(MoveMeNow plugin) {
        super("mmn", "movemenow.admin");
        this.plugin = plugin;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (args.length != 1) {
            sender.sendMessage(new TextComponent("Please use /mmn reload."));
        }
        switch (args[0]) {
            case "reload":
                plugin.loadConfig();
        }
    }

    @Override
    public Iterable<String> onTabComplete(CommandSender sender, String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("reload");
        return list;
    }
}