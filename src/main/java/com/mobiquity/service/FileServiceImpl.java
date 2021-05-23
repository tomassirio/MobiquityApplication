package com.mobiquity.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service("FileService")
public class FileServiceImpl implements FileService{

    @Override
    public File openFile(String path) {
        try {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);     //opens a connection to an actual file
            return file;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }
}
