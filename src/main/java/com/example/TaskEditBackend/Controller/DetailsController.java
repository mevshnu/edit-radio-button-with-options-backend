package com.example.TaskEditBackend.Controller;


import com.example.TaskEditBackend.Dao.EditDao;
import com.example.TaskEditBackend.Dto.DetailsDto;
import com.example.TaskEditBackend.Dto.ListDto;
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
    @PutMapping(path = "/editDetails",consumes = "application/json", produces = "application/json")
    public HashMap<String,String> EditDetails(@RequestBody DetailsDto dls)
    {
        return taskServiceImplimentation.editDetails(dls);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public ListDto viewAll()
    {
        List<Details> detailsLists =taskServiceImplimentation.viewAll();
        return new ListDto(detailsLists);
    }

   @CrossOrigin(origins = "*")
   @GetMapping(value = "/getbyid/{id}",produces = "application/json")
     public ListDto getDetails(@PathVariable int id)
       {
          List<Details> detaileLists=taskServiceImplimentation.getDetails(id);
          return new ListDto(detaileLists);
      }
}
