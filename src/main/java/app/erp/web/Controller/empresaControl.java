package app.erp.web.Controller;
import org.springframework.web.bind.annotation.RestController;
import app.erp.web.Entity.empresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class empresaControl {
    
    @Autowired 
    private app.erp.web.Repository.empresaRepo empresaRepo;

    @PostMapping("api/empresa")
    public empresa empresaPost(@RequestBody empresa emp) {

        return empresaRepo.save(emp);
    }
    
    @GetMapping("api/empresas")
    public List<empresa> empresaGet() {
        return empresaRepo.findAll();
    }

    @GetMapping("api/empresa/{id}")
    public empresa empresaGet(@PathVariable String id) {
        return empresaRepo.findById(id).get();
    }

    @DeleteMapping("api/deleteall")
    public String empresaDelete() {
         empresaRepo.deleteAll();
         return "All empresas deleted";
         
    }

    @PutMapping("api/empresa/{id}")
    public empresa empresaPut (@PathVariable String id, @RequestBody empresa emp) {
        return empresaRepo.save(emp);
    }


    @DeleteMapping("api/empresa/{id}")
    public String  empresaDelete(@PathVariable String id) {
         empresaRepo.deleteById(id);

         return "Empresa deleted with id: " + id;
        
        }


    
}
