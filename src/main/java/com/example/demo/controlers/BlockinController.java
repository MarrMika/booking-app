package com.example.demo.controlers;

import com.example.demo.domains.Blocking;
import com.example.demo.services.BlockingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocking")
public class BlockinController {

    private BlockingService blockingService;

    @Autowired
    public BlockinController(BlockingService blockingService) {
        this.blockingService = blockingService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Blocking findBlocking(@PathVariable("id") String id) {
        return blockingService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Blocking> findAll() {
        return blockingService.findAll();
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void deleteProperty(@PathVariable("id") String id) {
        blockingService.deleteById(id);
    }

    @PutMapping(value = "/update-user",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Blocking updateProperty(@RequestBody Blocking blocking) {
        return blockingService.update(blocking);
    }
}
