package ru.netology;

public class AfishaManager {

    private AfishaFilms[] films = new AfishaFilms[0];
    private int limit;

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaManager() {
        this.limit = 10;
    }

    public void add(AfishaFilms filmName) {
        AfishaFilms[] tmp = new AfishaFilms[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;
    }

    public AfishaFilms[] findAll() {
        return films;
    }

    public AfishaFilms[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        AfishaFilms[] reversed = new AfishaFilms[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }


}
