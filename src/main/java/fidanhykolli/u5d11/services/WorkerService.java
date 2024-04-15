package fidanhykolli.u5d11.services;

import fidanhykolli.u5d11.entities.Worker;
import fidanhykolli.u5d11.repositories.WorkerRepository;
import jakarta.persistence.Id;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public List getAllWorkers(){
        return workerRepository.findAll();
    }


    public Worker findById(Long workerId) {
        return workerRepository.findById(workerId).orElse(null);
    };

    public Worker createWorker(Worker worker) {
        if (worker.getName() == null || worker.getName().isEmpty()) {
            worker.setName("Nome non specificato");
        }

        Random rndm = new Random();
        long randomId = rndm.nextInt(1000) + 1;

        worker.setId(randomId);
        return workerRepository.save(worker);
    }

};
