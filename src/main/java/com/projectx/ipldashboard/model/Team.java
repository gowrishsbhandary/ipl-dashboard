package com.projectx.ipldashboard.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String teamName;
  private long totalMatch;
  private long totalWins;

  @Transient private List<Match> matches;

  public Team(String teamName, long totalMatch) {
    this.teamName = teamName;
    this.totalMatch = totalMatch;
  }
}
