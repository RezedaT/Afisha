package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    AfishaManager manager = new AfishaManager();

    AfishaFilms filmName1 = new  AfishaFilms("Бладшот");
    AfishaFilms filmName2 = new AfishaFilms("Вперед");
    AfishaFilms filmName3 = new AfishaFilms("Отель Белград");
    AfishaFilms filmName4 = new AfishaFilms("Джентельмены");
    AfishaFilms filmName5 = new AfishaFilms("Человек-Невидимка");
    AfishaFilms filmName6 = new AfishaFilms("Тролли. Мировой тур");
    AfishaFilms filmName7 = new AfishaFilms("Номер один");
    AfishaFilms filmName8 = new AfishaFilms("Джентельмены удачи");
    AfishaFilms filmName9 = new AfishaFilms("Полосатый рейс");
    AfishaFilms filmName10 = new AfishaFilms("Мастер и Маргарита");


    @Test
    public void shouldFindFiveFilms() {
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);

        AfishaFilms[] expected = {filmName1, filmName2, filmName3, filmName4, filmName5};
        AfishaFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindFilmsMaxLimit() {
        AfishaManager manager = new AfishaManager();
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);
        manager.add(filmName6);
        manager.add(filmName7);
        manager.add(filmName8);
        manager.add(filmName9);
        manager.add(filmName10);

        AfishaFilms[] expected = {filmName1, filmName2, filmName3, filmName4, filmName5, filmName6, filmName7, filmName8, filmName9, filmName10};
        AfishaFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindFilmsFromLimit() {
        AfishaManager manager = new AfishaManager(7);
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);
        manager.add(filmName6);
        manager.add(filmName7);

        AfishaFilms[] expected = {filmName1, filmName2, filmName3, filmName4, filmName5, filmName6,filmName7};
        AfishaFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastFilmsBelowLimit() {
        AfishaManager manager = new AfishaManager(7);
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);

        AfishaFilms[] expected = {filmName1, filmName2, filmName3};
        AfishaFilms[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);

        AfishaFilms[] expected = {filmName5, filmName4,filmName3, filmName2,filmName1};
        AfishaFilms[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastFilmsFromLimit() {
        AfishaManager manager = new AfishaManager(7);
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);
        manager.add(filmName6);
        manager.add(filmName7);

        AfishaFilms[] expected = {filmName7, filmName6, filmName5, filmName4,filmName3, filmName2,filmName1};
        AfishaFilms[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastFilmsOverLimit() {
        AfishaManager manager = new AfishaManager(7);
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);
        manager.add(filmName6);
        manager.add(filmName7);
        manager.add(filmName8);

        AfishaFilms[] expected = {filmName8,filmName7, filmName6, filmName5, filmName4, filmName3, filmName2};
        AfishaFilms[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
