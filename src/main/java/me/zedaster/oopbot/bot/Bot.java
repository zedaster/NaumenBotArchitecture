package me.zedaster.oopbot.bot;

import me.zedaster.oopbot.User;
import me.zedaster.oopbot.hanlder.BotHandler;

/**
 * Чат-бот
 */
public abstract class Bot {
    protected final BotHandler botHandler;

    public Bot(BotHandler botHandler) {
        this.botHandler = botHandler;
    }

    /**
     * Отправляет пользователю сообщение
     */
    public abstract void sendMessage(User user, String text);
}
