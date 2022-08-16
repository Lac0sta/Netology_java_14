package ru.netology.domain;

public class BillboardManager {

    private String[] films = new String[0];
    private int filmLimit;
    public BillboardManager() {
        filmLimit = 10;
    }

    public BillboardManager(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public void addFilm(String film) {  // Метод для добавления новых фильмов
            String[] tmp = new String[films.length + 1];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[i];
            }
            tmp[tmp.length - 1] = film;
            films = tmp;
    }

    public String[] findAll() { // Метод для вывода фильмов в порядке добавления
            return films;
    }

    public String[] findLast() {    // Метод для вывода максимум лимита последних добавленных фильмов в обратном порядке

        int resultLength;
        if (filmLimit < films.length) {
            resultLength = filmLimit;
        } else {
            resultLength = films.length;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
