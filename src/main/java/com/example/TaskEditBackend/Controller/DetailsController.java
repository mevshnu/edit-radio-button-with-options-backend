package com.example.TaskEditBackend.Controller;


import com.example.TaskEditBackend.Dao.EditDao;
import com.example.TaskEditBackend.Model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class DetailsController {

    @Autowired
    private EditDao edao;

    @CrossOrigin(origins = "*")
    @PutMapping(path = "/editDetails",consumes = "application/json", produces = "application/json")
    public HashMap<String,String> EditDetails(@RequestBody Details dls)
    {
        edao.editDetails(dls.getId(), dls.getName(), dls.getDescriptions(),dls.getTickdata(),dls.isTick());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Details> ViewAll(){
        return (List<Details>) edao.findAll();
    }


   @CrossOrigin(origins = "*")
   @PostMapping(value = "/getbyid",consumes = "application/json",produces = "application/json")
     public List<Details> getDetails(@RequestBody Details dls)
       {
          return (List<Details>) edao.Getbyid(dls.getId());
      }
}
