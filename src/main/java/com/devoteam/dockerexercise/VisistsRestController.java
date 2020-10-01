package com.devoteam.dockerexercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisistsRestController {

  private VisitRepository visitRepository;

  public VisistsRestController(VisitRepository visitRepository) {

    this.visitRepository = visitRepository;
  }

  @GetMapping("/")
  public long visits() {
    visitRepository.save(new Visit());
    return visitRepository.count();
  }
}
