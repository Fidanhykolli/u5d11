package fidanhykolli.u5d11.controllers;

import fidanhykolli.u5d11.entities.Worker;
import fidanhykolli.u5d11.services.WorkerService;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.RectangularShape;
import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    public WorkerService workerService;
    @GetMapping
    List<Worker> getAllWorkers(){
        return workerService.getAllWorkers();
    }

    @GetMapping("$/{id}")
    public Worker findById(@PathVariable Long id){
        return workerService.findById(id);
    }

    @PostMapping
    public Worker createWorker(@RequestBody Worker worker){
        return workerService.createWorker(worker);
    }

 //   @PutMapping("$/{id}")
   // public Worker updateWorker (@PathVariable Worker, @RequestBody Worker worker){}


}
