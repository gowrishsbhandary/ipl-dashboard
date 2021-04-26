package com.projectx.ipldashboard.controller;

import com.projectx.ipldashboard.model.Team;
import com.projectx.ipldashboard.repository.MatchRepository;
import com.projectx.ipldashboard.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeamController {

  private final TeamRepository teamRepository;
  private final MatchRepository matchRepository;

  @GetMapping("/team/{teamName}")
  public Team getTeam(@PathVariable String teamName) {
    Team team = teamRepository.findByTeamName(teamName);
    team.setMatches(matchRepository.findLatestMatchesByTeam(teamName, 4));
    return team;
  }
}
