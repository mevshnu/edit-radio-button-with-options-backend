package com.example.TaskEditBackend.Dto;

import com.example.TaskEditBackend.Model.Details;

import java.util.List;

public class ListDto {
    private List<Details> detailsList;

    public ListDto(List<Details> detailsList) {
        this.detailsList = detailsList;
    }

    public ListDto() {
    }

    public List<Details> getDetailsList() {
        return detailsList;
    }

    public void setDetailsList(List<Details> detailsList) {
        this.detailsList = detailsList;
    }
}
