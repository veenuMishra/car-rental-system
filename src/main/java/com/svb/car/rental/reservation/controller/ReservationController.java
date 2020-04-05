package com.svb.car.rental.reservation.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationController {

  String barcode="some_string";
  @GetMapping("/reserve/{barcode}")
  boolean reserveVehicle(@PathVariable String barcode) {
    return true;
  }
}
