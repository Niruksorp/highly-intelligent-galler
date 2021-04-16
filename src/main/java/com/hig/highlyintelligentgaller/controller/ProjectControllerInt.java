package com.hig.highlyintelligentgaller.controller;

import com.hig.highlyintelligentgaller.dto.ShortFormProjectDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api("Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public interface ProjectControllerInt {
    @ApiOperation("Returns list of all ShortFormProjectDTO in the system.")
    ResponseEntity<List<ShortFormProjectDTO>> getList();

}
