package ru.netology;

public class PosterManager {

  private PosterRepository repository;

  public PosterManager(PosterRepository repository){
    this.repository = repository;
  }

  // возвращает массив всех хранящихся в массиве объектов
  public  PosterObject [] getAll(){
    PosterObject [] item = repository.findAll();
    return item;
    }


  // добавляет объект в массив
  public void addObject(PosterObject item){
    repository.addFilm(item);
  }

  //  возвращает объект по идентификатору
  public PosterObject returnObject(int id){
    return repository.findById(id);
      }

  //удаляет объект по идентификатору
  public void removeById(int id){
    repository.removeById(id);
  }

  //полностью вычищает репозиторий
  public void removeAll(){
    repository.removeAll();
  }

}
