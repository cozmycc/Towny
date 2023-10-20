package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.TownBlock;
import com.palmergames.bukkit.towny.object.TownBlockType;
import org.bukkit.Bukkit;
import org.bukkit.Warning;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is no longer called.
 * @deprecated since 0.99.6.4 use {@link com.palmergames.bukkit.towny.event.plot.PlotChangeTypeEvent} instead.
 */
@Deprecated
@Warning(reason = "Event is no longer called. Event has been moved to the com.palmergames.bukkit.towny.event.plot package.")
public class PlotChangeTypeEvent extends Event {
    public static final HandlerList handlers = new HandlerList();
    private final TownBlockType oldType;
    private final TownBlockType newType;
    private final TownBlock townBlock;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
	 * Changes a plot's TownBlockType
	 * 
     * @param oldType- Old Type
     * @param newType - New Type
	 * @param townBlock - Plot to target
     */
    public PlotChangeTypeEvent(TownBlockType oldType, TownBlockType newType, TownBlock townBlock) {
    	super(!Bukkit.getServer().isPrimaryThread());
        this.newType = newType;
        this.oldType = oldType;
        this.townBlock = townBlock;
    }

    public TownBlockType getNewType() {
        return newType;
    }

    public TownBlockType getOldType() {
        if (oldType == null) {
            return TownBlockType.WILDS; // Considering the further fact we know null is wilderness if there is no old type, it has to have been wilderness.
        }
        return oldType;
    }

    public TownBlock getTownBlock() {
        return townBlock;
    }
}
