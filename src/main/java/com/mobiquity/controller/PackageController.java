package com.mobiquity.controller;

import com.mobiquity.config.ApiPaths;
import com.mobiquity.exception.APIException;
import com.mobiquity.packer.Packer;
import com.mobiquity.utils.ErrorDetails;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = ApiPaths.PACKAGE_API)
public class PackageController {

    private static Logger log = LoggerFactory.getLogger(PackageController.class);

    @ApiOperation(value = "Calculates Packages Cost")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully"),
            @ApiResponse(code = 400, message = "Bad request", response = ErrorDetails.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDetails.class)

    })
    @GetMapping(ApiPaths.PACKAGE_CALCULATE)
    public ResponseEntity<Object> packer(@RequestParam String path) throws APIException {
        log.info("Requesting files from path {}", path);
        try {
            return new ResponseEntity<>(Packer.pack(path), HttpStatus.OK);
        } catch (APIException e) {
            throw new APIException("Error in Packer", e);
        }
    }
}
