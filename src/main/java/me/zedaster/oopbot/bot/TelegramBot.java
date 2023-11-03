package me.zedaster.oopbot.bot;

import me.zedaster.oopbot.Message;
import me.zedaster.oopbot.User;
import me.zedaster.oopbot.hanlder.BotHandler;

import java.util.function.Consumer;

/**
 * Реализация бота для Телеграм
 */
public class TelegramBot extends Bot {
    public TelegramBot(BotHandler botHandler) {
        super(botHandler);
    }

    @Override
    public void sendMessage(User user, String text) {
        // TODO

    }
}
