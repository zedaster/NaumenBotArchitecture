package me.zedaster.oopbot;

import me.zedaster.oopbot.bot.DiscordBot;
import me.zedaster.oopbot.bot.TelegramBot;
import me.zedaster.oopbot.hanlder.BotHandler;
import me.zedaster.oopbot.hanlder.ReplierHandler;

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
        BotHandler helloHandler = new ReplierHandler("Ваше сообщение: '{msg}'");
        new DiscordBot(helloHandler);
        new TelegramBot(helloHandler);
    }
}
