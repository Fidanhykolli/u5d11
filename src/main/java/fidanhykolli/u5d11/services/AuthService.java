package fidanhykolli.u5d11.services;

import fidanhykolli.u5d11.payloads.WorkerLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    public WorkerService workerService
    public String authenticateWorker(WorkerLoginDTO payload){
        return workerService.findById();
    }
}
