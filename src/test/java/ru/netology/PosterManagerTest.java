package ru.netology;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class PosterManagerTest {

  @Test
  public void findLast() {
    // создаем репозиторий кого подделываем
    PosterRepository film = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(film);
    PosterObject first = new PosterObject( "вперед", "мультфильм", "https/..", false);
    PosterObject second = new PosterObject( "Отель", "комедия", "https/..", false);
    PosterObject third = new PosterObject( "номер один", "комедия", "https/..", true);
    film.addFilm(first);
    film.addFilm(second);
    film.addFilm(third);
    // настройка заглушки
    PosterObject[] retutned = {first, second, third };
    doReturn(retutned).when(film).findAll();
    // возвращай готовый ответ , когда тебя repo  спросят findAll
    PosterObject[] actual = manager.getAll();
    PosterObject[] expected = {first, second, third };
    assertArrayEquals(expected, actual);
    //удостовериться что заглушка была вызвана
    verify(film).findAll();
  }

  @Test
  public void returnObject(){
    PosterRepository film = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(film);
    PosterObject first = new PosterObject( "вперед", "мультфильм", "https/..", false);
    PosterObject second = new PosterObject( "Отель", "комедия", "https/..", false);
    PosterObject third = new PosterObject( "номер один", "комедия", "https/..", true);
    film.addFilm(first);
    film.addFilm(second);
    film.addFilm(third);
    // настройка заглушки
    doReturn(first).when(film).findById(0);
    PosterObject expected = first;
    PosterObject actual = manager.returnObject(0);
    //удостовериться что заглушка была вызвана
   verify(film).findById(0);
  }

  }
