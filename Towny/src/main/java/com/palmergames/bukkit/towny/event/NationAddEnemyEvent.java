package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.Nation;
import org.bukkit.Bukkit;
import org.bukkit.Warning;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is no longer called.
 * @deprecated since 0.99.6.4 use {@link com.palmergames.bukkit.towny.event.nation.NationAddEnemyEvent} instead.
 */
@Deprecated
@Warning(reason = "Event is no longer called. Event has been moved to the com.palmergames.bukkit.towny.event.nation package.")
public class NationAddEnemyEvent extends Event {
	
	private static final HandlerList handlers = new HandlerList();

	private final Nation enemy;
	private final Nation nation;
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	public NationAddEnemyEvent(Nation nation, Nation enemy) {
		super(!Bukkit.getServer().isPrimaryThread());
		this.enemy = enemy;
		this.nation = nation;
	}

	/**
	 *
	 * @return the nation that added the enemy.
	 */
	public Nation getNation() {
		return nation;
	}

	/**
	 *
	 * @return the nation that is now an enemy.
	 */
	public Nation getEnemy() {
		return enemy;
	}
}
