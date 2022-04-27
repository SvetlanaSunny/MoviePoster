package ru.netology;

public class PosterObject {
  private String name;
  private String genre;
  private String imageUrl;
  private boolean premiereTomorrow;

  public PosterObject()
  {}

public PosterObject(String name, String genre, String imageUrl,
                    boolean premiereTomorrow){
  this.name = name;
  this.genre = genre;
  this.imageUrl = imageUrl;
  this.premiereTomorrow = premiereTomorrow;
}
}
