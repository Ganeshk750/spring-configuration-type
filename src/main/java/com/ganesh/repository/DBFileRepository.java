package com.ganesh.repository;


import com.ganesh.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @created: 27/04/2021 - 12:44 PM
 * @author: Ganesh
 */

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {
}
