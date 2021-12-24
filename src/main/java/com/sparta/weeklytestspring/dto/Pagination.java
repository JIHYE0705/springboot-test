package com.sparta.weeklytestspring.dto;

import lombok.Data;

@Data
public class Pagination {

    private int startPage;
    private int endPage;
    private int currentPage;
    private int lastPage;
    private int pageCount;
    private int rowCount;



}
