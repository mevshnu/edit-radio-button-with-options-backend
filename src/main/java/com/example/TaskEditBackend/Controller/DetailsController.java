package com.example.TaskEditBackend.Controller;


import com.example.TaskEditBackend.Dao.EditDao;
import com.example.TaskEditBackend.Model.Details;
import com.example.TaskEditBackend.Service.TaskServiceImplimentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class DetailsController {

    @Autowired
    private EditDao edao;
    @Autowired
    private TaskServiceImplimentation taskServiceImplimentation;

    @CrossOrigin(origins = "*")
    @PutMapping(path = "/.",consumes = "application/json", produces = "application/json")
    public HashMap<String,String> EditDetails(@RequestBody Details dls)
    {

        return taskServiceImplimentation.EditDetails(dls);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Details> viewAll(){
        return taskServiceImplimentation.viewAll();
    }


   @CrossOrigin(origins = "*")
   @PostMapping(value = "/getbyid",consumes = "application/json",produces = "application/json")
     public List<Details> getDetails(@RequestBody Details dls)
       {
          return taskServiceImplimentation.getDetails(dls);
      }
}
