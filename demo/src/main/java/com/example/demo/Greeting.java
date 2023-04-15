package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record Greeting(long id, String content, LocalTime curTime) {

}
