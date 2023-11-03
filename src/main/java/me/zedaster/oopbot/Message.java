package me.zedaster.oopbot;

import me.zedaster.oopbot.bot.Bot;

/**
 * Описывает сообщение, пришедшее от бота
 */
public interface Message {
    /**
     * Получает отправителя сообщения
     */
    User getSender();

    /**
     * Получает текст сообщения
     */
    String getText();

    /**
     * Отправляет текстовый ответ на сообщение
     */
    void reply(String text);

    /**
     * Получает бота, от которого пришло сообщение
     */
    Bot getBot();
}
