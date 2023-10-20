package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.TownBlock;

import org.bukkit.Warning;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * This event is no longer called.
 * @deprecated since 0.99.6.4 use {@link com.palmergames.bukkit.towny.event.plot.PlotPreClearEvent} instead.
 */
@Deprecated
@Warning(reason = "Event is no longer called. Event has been moved to the com.palmergames.bukkit.towny.event.plot package.")
public class PlotPreClearEvent extends CancellableTownyEvent {
	private static final HandlerList HANDLER_LIST = new HandlerList();

	private final TownBlock townBlock;

	public PlotPreClearEvent(TownBlock townBlock) {
		this.townBlock = townBlock;
	}

	/**
	 * @return the new TownBlock.
	 */
	public TownBlock getTownBlock() {
		return townBlock;
	}

	public static HandlerList getHandlerList() {
		return HANDLER_LIST;
	}

	@NotNull
	@Override
	public HandlerList getHandlers() {
		return HANDLER_LIST;
	}
}
