package ru.netology;

public class PosterManager {

  private int amountFilms = 10; // кол-во фильмов по умолчанию
  private PosterObject[] poster = new PosterObject[0];

  public PosterManager() {
  }

  public PosterManager(int amountFilms) {
    this.amountFilms = amountFilms;
  }

  // добавление нового фильма
  public void addFilm(PosterObject item) {
    PosterObject[] newPoster = new PosterObject[poster.length + 1];
    for (int i = 0; i < poster.length; i++) {
      newPoster[i] = poster[i];
    }
    newPoster[poster.length] = item;
    poster = newPoster;
  }

  // Вывод всех фильмов в порядке добавления
  public PosterObject[] findAll() {
    return poster;
  }

  // Вывод последних добавленных фильмов в обратном от добавления порядке
  public PosterObject[] findLast() {
    int resultLength = poster.length;
    if (resultLength > amountFilms) {
      resultLength = amountFilms;
    }
    PosterObject[] newPoster = new PosterObject[resultLength];
    int index = resultLength-1;
    for (int i = 0; i < resultLength; i++) {
      newPoster[index--] = poster[i];
    }
    poster = newPoster;
    return poster;
  }
}
