
package io.github.bi0qaw.vectorskript;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import ch.njol.skript.Skript;
import io.github.bi0qaw.vectorskript.vector.VectorRegister;

public class VectorSkript extends JavaPlugin {

	private static VectorSkript plugin;
	public static boolean RandomSk;

	@Override
	public void onEnable() {
		plugin = this;
		Skript.registerAddon(this);
		RandomSk = Bukkit.getPluginManager().getPlugin("RandomSK") != null;
		if (!RandomSk) {
//			new VectorType();		//Temporarily not register this
		}
		new VectorRegister();
	}

	public static VectorSkript getPlugin() {
		return plugin;
	}
}
