package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
  @Test
  public void addFilm() {
    PosterManager film = new PosterManager();
    PosterObject first = new PosterObject();
    PosterObject second = new PosterObject();
    PosterObject third = new PosterObject();
    film.addFilm(first);
    film.addFilm(second);
    film.addFilm(third);
    PosterObject[] actual = film.findAll();
    PosterObject[] expected = {first, second, third};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void findLast() {
    PosterManager film = new PosterManager();
    PosterObject first = new PosterObject("вперед", "мультфильм", "https/..", false);
    PosterObject second = new PosterObject("Отель", "комедия", "https/..", false);
    PosterObject third = new PosterObject("номер один", "комедия", "https/..", true);
    film.addFilm(first);
    film.addFilm(second);
    film.addFilm(third);
    PosterObject[] actual = film.findLast();
    PosterObject[] expected = {third, second, first};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void findLastAmountFilms() {
    PosterManager film = new PosterManager(9);
    PosterObject first = new PosterObject();
    PosterObject second = new PosterObject();
    PosterObject third = new PosterObject();
    PosterObject fourth = new PosterObject();
    PosterObject fifth = new PosterObject();
    PosterObject sixth = new PosterObject();
    PosterObject seventh = new PosterObject();
    PosterObject eighth = new PosterObject();
    PosterObject ninth = new PosterObject();
    PosterObject tenth = new PosterObject();
    PosterObject eleven = new PosterObject();
    PosterObject twelve = new PosterObject();
    film.addFilm(first);
    film.addFilm(second);
    film.addFilm(third);
    film.addFilm(fourth);
    film.addFilm(fifth);
    film.addFilm(sixth);
    film.addFilm(seventh);
    film.addFilm(eighth);
    film.addFilm(ninth);
    film.addFilm(tenth);
    film.addFilm(eleven);
    film.addFilm(twelve);
    PosterObject[] actual = film.findLast();
    PosterObject[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
    assertArrayEquals(expected, actual);
  }


}
