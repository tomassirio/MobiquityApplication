package com.mobiquity.packer;

import com.mobiquity.controller.PackageController;
import com.mobiquity.exception.APIException;
import com.mobiquity.model.PackageDTO;
import com.mobiquity.service.FileServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class Packer {

    private static Logger log = LoggerFactory.getLogger(Packer.class);

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

        log.info("Packing {}", filePath);
        return null;
    }

    private static List<PackageDTO> preparePackages(String filePath) {
        File input = fileService.openFile(filePath);
        return null;
    }
}
