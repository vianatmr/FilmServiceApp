package com.binar.filmservices.service;

import com.binar.filmservices.dto.ScheduleRequest;
import com.binar.filmservices.dto.ScheduleResponse;

import java.util.List;

public interface ScheduleService {
    ScheduleResponse addSchedule(ScheduleRequest scheduleRequest);
    List<ScheduleResponse> searchFilmSchedule(Integer film_code);
}
