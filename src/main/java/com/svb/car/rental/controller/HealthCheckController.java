package com.svb.car.rental.controller;

import com.svb.car.rental.service.HealthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheckController {
  @Autowired
  private HealthService healthService;

  @GetMapping("/health")
  public boolean heartbeat() {
    return true;
  }
}