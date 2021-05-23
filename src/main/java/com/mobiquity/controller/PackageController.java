package com.mobiquity.controller;

import com.mobiquity.exception.APIException;
import com.mobiquity.service.FileService;
import com.mobiquity.service.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PackageController {

    private static Logger log = LoggerFactory.getLogger(PackageController.class);

//    private FileServiceImpl fileService;

//    @Autowired
//    public PackageController(FileServiceImpl fileService) {
//        this.fileService = fileService;
//    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/package", produces = "application/json")
    public ResponseEntity<Object> packageMethod(@RequestParam String path) throws APIException {
        log.info("Requesting files from path", path);
        return null;
    }
}
