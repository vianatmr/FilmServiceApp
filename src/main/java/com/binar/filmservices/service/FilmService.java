package com.binar.filmservices.service;

import com.binar.filmservices.dto.FilmDTO;
import com.binar.filmservices.entity.Film;
import com.binar.filmservices.entity.Schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmService {
    public Film insertFilm(Film film);
    public List<Film> getAllFilm();
    public Film updateFilm(Integer film_code, Film film);
    public Boolean delete (Integer film_code);
    public Schedule getSchedule (Integer film_code);
    public Film findById (Integer film_code);
    List<Film> findOnShowingFilm(Boolean sedangTayang);
    FilmDTO mapToDto(Film film);
    Film mapToEntity(FilmDTO filmDTO);

}
