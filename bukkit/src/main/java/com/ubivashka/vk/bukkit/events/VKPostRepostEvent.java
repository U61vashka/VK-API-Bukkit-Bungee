package com.ubivashka.vk.bukkit.events;

import org.bukkit.event.HandlerList;

import com.vk.api.sdk.objects.wall.Wallpost;

public class VKPostRepostEvent extends AbstractVkEvent {
	private static final HandlerList handlers = new HandlerList();
	private Wallpost post;

	public VKPostRepostEvent(Wallpost post, Integer groupId) {
		super(groupId);
		setPost(post);
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public final HandlerList getHandlers() {
		return handlers;
	}

	public Wallpost getPost() {
		return post;
	}

	public void setPost(Wallpost post) {
		this.post = post;
	}
}
