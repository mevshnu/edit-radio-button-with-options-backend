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
        Details details =new Details(dls.getId(), dls.getName(), dls.getDescriptions(), dls.isTick(), dls.getTickdata());
        return taskServiceImplimentation.EditDetails(details);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public ListDto viewAll()
    {
        List<Details> detailsLists =taskServiceImplimentation.viewAll();
        return new ListDto(detailsLists);
    }


   @CrossOrigin(origins = "*")
   @PostMapping(value = "/getbyid",consumes = "application/json",produces = "application/json")
     public ListDto getDetails(@RequestBody DetailsDto dls)
       {
          Details details = new Details(dls.getId(), dls.getName(), dls.getDescriptions(), dls.isTick(), dls.getTickdata());
          List<Details> detaileLists=taskServiceImplimentation.getDetails(details);
          return new ListDto(detaileLists);

      }
}
