package com.ubivashka.vk.spigot.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.callback.MarketCommentDelete;

@Deprecated
public class VKMarketCommentDeleteEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private MarketCommentDelete comment;

	public VKMarketCommentDeleteEvent(MarketCommentDelete comment) {
		super(true);
		setComment(comment);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public MarketCommentDelete getComment() {
		return comment;
	}

	public void setComment(MarketCommentDelete comment) {
		this.comment = comment;
	}
}