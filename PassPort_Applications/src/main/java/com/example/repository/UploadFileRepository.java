package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UploadFile;
import com.example.model.User;


@Repository
public interface UploadFileRepository extends JpaRepository<UploadFile,String>{

	List<UploadFile> findByUser(User user);
	
}
