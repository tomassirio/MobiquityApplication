package com.mobiquity.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service("FileService")
public class FileServiceImpl implements FileService{

    private static Logger log = LoggerFactory.getLogger(FileServiceImpl.class);

    @Override
    public File openFile(String path) {
        log.info("Opening file on path {}", path);
        File file = null;
        try {
            file = new File(path);
            FileInputStream fis = new FileInputStream(file);     //opens a connection to an actual file
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return file;
    }
}
