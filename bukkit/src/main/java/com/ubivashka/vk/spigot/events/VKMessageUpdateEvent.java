package com.ubivashka.vk.spigot.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

import com.vk.api.sdk.objects.messages.Message;

public abstract class VKMessageUpdateEvent extends Event implements Cancellable {
	private boolean cancel = false;

	private Message message;

	public VKMessageUpdateEvent(Message message) {
		setMessage(message);
	}

	public final void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

	public final boolean isCancelled() {
		return this.cancel;
	}

	public Message getMessage() {
		return this.message;
	}

	public Integer getUserId() {
		return this.message.getFromId();
	}

	public Integer getPeer() {
		return this.message.getPeerId();
	}

	private void setMessage(Message message) {
		this.message = message;
	}
}
