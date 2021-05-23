package com.mobiquity.packer;

import com.mobiquity.controller.PackageController;
import com.mobiquity.exception.APIException;
import com.mobiquity.model.PackageDTO;
import com.mobiquity.service.FileServiceImpl;
import com.mobiquity.service.ParseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class Packer {

    private static Logger log = LoggerFactory.getLogger(Packer.class);

    @Autowired
    private static FileServiceImpl fileService;
    @Autowired
    private static ParseServiceImpl parseService;

    private Packer() {
        this(fileService, parseService);
    }

    @Autowired
    public Packer(FileServiceImpl fileService, ParseServiceImpl parseService){
        this.fileService = fileService;
        this.parseService = parseService;
    }

    public static String pack(String filePath) throws APIException{
        log.info("Packing {}", filePath);
        List<PackageDTO> packages = preparePackages(filePath);

        return null;
    }

    private static List<PackageDTO> preparePackages(String filePath) {
        List<PackageDTO> packageDTOS = new ArrayList<>();
        try {
            File input = fileService.openFile(filePath);
            packageDTOS = parseService.parseFile(input);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return packageDTOS;
    }
}
