package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {

    String film1 = "Бладшот";
    String film2 = "Вперёд";
    String film3 = "Отель Белград";
    String film4 = "Джентельмены";
    String film5 = "Человек-невидимка";
    String film6 = "Тролли. Мировой тур";
    String film7 = "Номер один";
    String film8 = "Девушка с татуировкой дракона";
    String film9 = "Идентификация Борна";
    String film10 = "Белоснежка и охотник";

    @Test
    public void mayAddFilms() {

        BillboardManager manager = new BillboardManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {
                film1,
                film2,
                film3,
                film4,
                film5,
                film6,
                film7,
                film8,
                film9,
                film10
        };

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mayFindLastFilm() {

        BillboardManager manager = new BillboardManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2,
                film1
        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mayLowerLimit() {

        BillboardManager manager = new BillboardManager(5);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {
                film10,
                film9,
                film8,
                film7,
                film6,
        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
