package com.projectx.ipldashboard.repository;

import com.projectx.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

  Team findByTeamName(String teamName);
}
