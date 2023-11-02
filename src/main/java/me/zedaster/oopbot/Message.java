package me.zedaster.oopbot;

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
}
