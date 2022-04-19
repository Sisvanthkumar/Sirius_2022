package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.model.UploadFile;
import com.example.model.User;
import com.example.repository.UploadFileRepository;
import org.springframework.util.StringUtils;

@Component
public class FileStorageService {
	@Autowired
    private UploadFileRepository uploadFileRepository;
	 

    public void storeFile(MultipartFile file,User user) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                System.out.println("Sorry! Filename contains invalid path sequence " + fileName);
            }

            UploadFile dbFile = new UploadFile(user,fileName, file.getContentType(), file.getBytes());
            
//            String uploadDirectory="/PassPort_Applications/src/main/resources/static/images/"+fileName;//            FileUploadUtil.saveFile(uploadDirectory,fileName,file);      //Its not storing in the desired folder
            uploadFileRepository.save(dbFile);
        } catch (Exception ex) {
            
        }
    }

    public Optional<UploadFile> getFile(String fileId) {
        return uploadFileRepository.findById(fileId);
    }
   
}
