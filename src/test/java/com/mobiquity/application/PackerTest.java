package com.mobiquity.application;

import com.mobiquity.controller.PackageController;
import com.mobiquity.exception.APIException;
import com.mobiquity.packer.Packer;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PackageController.class)
@PowerMockIgnore("jdk.internal.reflect.*")
public class PackerTest {

    @InjectMocks
    PackageController packageController;

    @Test
    @Ignore
    public void testStatic() {
        MockitoAnnotations.openMocks(this);
        try {
            ResponseEntity<Object> responseEntity = new ResponseEntity<>(Packer.pack("src/main/test/resources/example_input"), HttpStatus.OK);
            PowerMockito.when(packageController.packer(any())).thenReturn(new ResponseEntity<>(Packer.pack(any()), HttpStatus.OK));
            assertEquals(packageController.packer(any()), responseEntity);
        }catch (APIException e) {
            e.printStackTrace();
        }


    }
}
