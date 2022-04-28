package ru.netology;


public class PosterRepository {

  private int amountFilms = 10; // кол-во фильмов по умолчанию
  private PosterObject[] poster = new PosterObject[0];

  public PosterRepository() {
  }

  public PosterRepository(int amountFilms) {
    this.amountFilms = amountFilms;
  }

  int lastID = 0;

  // добавление нового объекта в массив
  public void addFilm(PosterObject item) {
    PosterObject[] newPoster = new PosterObject[poster.length + 1];
    for (int i = 0; i < poster.length; i++) {
      newPoster[i] = poster[i];
    }
    newPoster[poster.length] = item;
    item.setId(lastID);
    lastID++;
    poster = newPoster;
  }

  // Вывод всех фильмов в порядке добавления
  public PosterObject[] findAll() {
    return poster;
  }

  //возвращает объект по идентификатору
  public PosterObject findById(int id) {
    for (int i = 0; i < poster.length; i++) {
      if (poster[i].getId() == id) {
        return poster[i];
      }
    }
    return null;
  }

  // удаляет объект по идентификатору
  public void removeById(int id) {
    PosterObject[] newPoster = new PosterObject[poster.length - 1];
    int index = 0;
    for (int i = 0; i < poster.length; i++) {
      if (poster[i].getId() != id) {
        poster[i] = newPoster[index];
        index++;
      }
    }
    poster = newPoster;
  }

  // удаляет все элементы
  public void removeAll() {
  poster = new PosterObject[0];
  }

  // Вывод последних добавленных фильмов в обратном от добавления порядке
  public PosterObject[] findLast() {
    int resultLength = poster.length;
    if (resultLength > amountFilms) {
      resultLength = amountFilms;
    }
    PosterObject[] newPoster = new PosterObject[resultLength];
    int index = resultLength - 1;
    for (int i = 0; i < resultLength; i++) {
      newPoster[index--] = poster[i];
    }
    poster = newPoster;
    return poster;
  }
}
