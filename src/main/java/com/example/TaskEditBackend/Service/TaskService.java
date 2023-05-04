package com.example.TaskEditBackend.Service;

import com.example.TaskEditBackend.Model.Details;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

public interface TaskService {
    public List<Details> viewAll();
    public List<Details> getDetails(Details dls);
    public HashMap<String,String> EditDetails( Details dls);
}
