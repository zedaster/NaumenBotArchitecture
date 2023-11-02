package me.zedaster.oopbot;

import me.zedaster.oopbot.bot.Bot;
import me.zedaster.oopbot.bot.DiscordBot;
import me.zedaster.oopbot.bot.TelegramBot;

/**
 * Построить базовую архитектуру бота, который сможет работать в  telegram и ещё как минимум одной чат-бот платформе
 * (Discord, VK или др.). В качестве основного функционала бота можно возвращать в ответ текст, который отправил
 * пользователь с пометкой от бота. Например "Ваше сообщение: <сообщение>". Нужно акцентировать внимание именно на
 * архитектуре и интерфейсах.
 * Пример:
 * User: привет
 * Bot: "Ваше сообщение: 'привет'".
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {
    /**
     * Входная точка для запуска бота
     */
    public static void main(String[] args) {
        Bot bot = new TelegramBot();
//        Bot bot = new DiscordBot();
        bot.addMessageHandler((message) -> {
            // Вариант 1
            message.reply("Ваше сообщение: '" + message.getText() + "'");
            // Вариант 2
            // bot.sendMessage(message.getSender(), "Ваше сообщение: '" + message.getText() + "'");
        });
    }
}
