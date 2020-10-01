package com.devoteam.dockerexercise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visits_counter")
public class Visit {

  private int id;

  @Id
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
