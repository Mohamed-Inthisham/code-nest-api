package com.blackcode.codenestapi.repository;

import com.blackcode.codenestapi.model.Roadmap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadmapRepository extends JpaRepository<Roadmap,Long> {
}
