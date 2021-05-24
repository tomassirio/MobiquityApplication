package com.mobiquity.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;

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

    @Override
    public void writeToPath(String path, String input){
        log.info("Writing to file on path: {}", path);
        try {
            File file = new File(path+"_output");
            FileWriter myWriter = new FileWriter(file.getName());
            myWriter.write(input);
            myWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
