package me.zedaster.oopbot.bot;

import me.zedaster.oopbot.Message;
import me.zedaster.oopbot.User;

import java.util.function.Consumer;

public interface Bot {
    /**
     * Отправляет пользователю сообщение
     */
    void sendMessage(User user, String text);

    /**
     * Добавляет обработчик сообщений из бота
     */
    void addMessageHandler(Consumer<Message> handler);
}
