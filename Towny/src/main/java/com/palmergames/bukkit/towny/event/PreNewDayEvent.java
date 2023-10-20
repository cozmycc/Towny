package com.palmergames.bukkit.towny.event;

import org.bukkit.Bukkit;
import org.bukkit.Warning;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is no longer called.
 * @deprecated since 0.99.6.4 use {@link com.palmergames.bukkit.towny.event.time.PreNewDayEvent} instead.
 */
@Deprecated
@Warning(reason = "Event is no longer called. Event has been moved to the com.palmergames.bukkit.towny.event.time package.")
public class PreNewDayEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	
	public PreNewDayEvent() {
		super(!Bukkit.getServer().isPrimaryThread()); // Check if event is async
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
}
