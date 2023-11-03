package me.zedaster.oopbot.hanlder;

import me.zedaster.oopbot.Message;

/**
 * Обработчик операций для бота
 */
public interface BotHandler {
    /**
     * Метод вызывается для обработки сообщения от бота
     */
    void handleMessage(Message message);
}
