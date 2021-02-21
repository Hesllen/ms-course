package com.cursoms.hrworker.resources;

import com.cursoms.hrworker.entities.Worker;
import com.cursoms.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = workerRepository.findAll();

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findbyId(@PathVariable Long id) {
/*        para teste de timeout
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        logger.info("PORT = " + environment.getProperty("local.server.port"));

        Worker worker = workerRepository.findById(id).get();

        return ResponseEntity.ok(worker);
    }
}
