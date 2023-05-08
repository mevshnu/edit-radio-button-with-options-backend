package com.example.TaskEditBackend.Service;

import com.example.TaskEditBackend.Dao.EditDao;
import com.example.TaskEditBackend.Dto.DetailsDto;
import com.example.TaskEditBackend.Model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class TaskServiceImplimentation implements TaskService{

    @Autowired
    EditDao edao;
    @Override
    public List<Details> viewAll()
    {
        return (List<Details>) edao.findAll();
    }
    @Override
    public List<Details> getDetails(int id)
    {
        return (List<Details>) edao.Getbyid(id);
    }

    @Override
    public HashMap<String, String> EditDetails(Details dls) {
        edao.editDetails(dls.getId(), dls.getName(), dls.getDescriptions(),dls.getTickdata(),dls.isTick());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("status","success");
        return hashMap;
    }

}
