package org.launchcode.javawebdevtechjobspersistent.dataRepos;

import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlillReposiitory extends CrudRepository<Skill, Integer> {
}

