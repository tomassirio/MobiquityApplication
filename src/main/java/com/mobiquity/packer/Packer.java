package com.mobiquity.packer;

import com.mobiquity.exception.APIException;
import com.mobiquity.service.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Packer {

    @Autowired
    private static FileServiceImpl fileService;

    private Packer() {
        this(fileService);
    }

    @Autowired
    public Packer(FileServiceImpl fileService){
      this.fileService = fileService;
    }

    public static String pack(String filePath) throws APIException {
      fileService.open(filePath);
      System.out.println("Sarasa");
      return null;
    }
}
