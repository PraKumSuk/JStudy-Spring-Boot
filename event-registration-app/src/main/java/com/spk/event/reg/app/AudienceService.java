package com.spk.event.reg.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudienceService {

	@Autowired
	private AudienceRepository audienceRepository;

	public List<Audience> findAll() {

		return (List<Audience>) audienceRepository.findAll();
	}

	public void add(Audience audience) {
		audienceRepository.save(audience);
	}

	public List<Audience> deleteById(int id) {
		audienceRepository.deleteById(id);
		return findAll();
	}

	// TODO: Search
	/*
	 * public Optional<Audience> find(int id) { return
	 * audienceList.stream().filter(a -> a.getId() == id).findFirst();
	 * }
	 */

}
