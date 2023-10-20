package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.Nation;

import org.bukkit.Bukkit;
import org.bukkit.Warning;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is no longer called.
 * @deprecated since 0.99.6.4 use {@link com.palmergames.bukkit.towny.event.nation.NationBonusCalculationEvent} instead.
 */
@Deprecated
@Warning(reason = "Event is no longer called. Event has been moved to the com.palmergames.bukkit.towny.event.nation package.")
public class NationBonusCalculationEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	
	private final Nation nation;
	private int bonusBlocks;
	
	public NationBonusCalculationEvent(Nation nation, int bonusBlocks) {
		super(!Bukkit.getServer().isPrimaryThread());
		this.nation = nation;
		this.bonusBlocks = bonusBlocks;
	}
	
	public Nation getNation() {
		return nation;
	}
		
	public int getBonusBlocks() {
		return bonusBlocks;
	}
	
	public void setBonusBlocks(int bonusBlocks) {
		this.bonusBlocks = bonusBlocks;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
}
