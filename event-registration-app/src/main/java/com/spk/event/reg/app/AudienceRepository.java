package com.spk.event.reg.app;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AudienceRepository extends CrudRepository<Audience, Integer> {

}
