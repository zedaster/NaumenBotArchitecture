package me.zedaster.oopbot.hanlder;

import me.zedaster.oopbot.Message;

/**
 * Обработчик для бота, который любое тестовое сообщение возвращает его отправителю по определенному шаблону
 * Например new ReplierHandler("Ваше сообщение: '{msg}'") при отправке 'привет' будет отвечать "Ваше сообщение: 'привет'"
 */
public class ReplierHandler implements BotHandler {
    private final String pattern;

    /**
     * Создает обработчик для бота, который любое тестовое сообщение возвращает его отправителю по
     * определенному шаблону
     */
    public ReplierHandler(String pattern) {
        this.pattern = pattern;
    }


    @Override
    public void handleMessage(Message message) {
        message.reply(pattern.replace("{msg}", message.getText()));
//        message.getBot().sendMessage(message.getSender(), pattern.replace("{msg}", message.getText()));
    }
}
