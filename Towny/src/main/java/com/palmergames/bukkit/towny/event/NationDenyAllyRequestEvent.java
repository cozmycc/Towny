package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.Nation;

import org.bukkit.Warning;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * This event is no longer called.
 * @deprecated since 0.99.6.4 use {@link com.palmergames.bukkit.towny.event.nation.NationDenyAllyRequestEvent} instead.
 */
@Deprecated
@Warning(reason = "Event is no longer called. Event has been moved to the com.palmergames.bukkit.towny.event.nation package.")
public class NationDenyAllyRequestEvent extends CancellableTownyEvent {
	private static final HandlerList HANDLER_LIST = new HandlerList();

	private final Nation receiverNation;
	private final Nation senderNation;

	public NationDenyAllyRequestEvent(Nation receiverNation, Nation senderNation) {
		this.receiverNation = receiverNation;
		this.senderNation = senderNation;

	}

	public Nation getReceiverNation() {
		return receiverNation;
	}
	public Nation getSenderNation() {
		return senderNation;
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
