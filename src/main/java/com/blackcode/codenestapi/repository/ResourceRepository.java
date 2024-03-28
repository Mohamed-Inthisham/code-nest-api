package com.blackcode.codenestapi.repository;

import com.blackcode.codenestapi.model.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resources,Long> {
}
