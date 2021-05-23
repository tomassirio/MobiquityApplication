package com.mobiquity.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService{

    @Override
    public void open(String path) {
        try {
            File file = new File(path);
            FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file
            System.out.println("file content: ");
            int r=0;
            while((r=fis.read())!=-1)
            {
                System.out.print((char)r);      //prints the content of the file
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Override
    public void close() {

    }
}
