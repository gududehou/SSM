package com.monkey.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    //当前页码
    private Integer currentPage;

    //每页大小
    private Integer pageSize;

    private Integer total;
    
    private List<T> data;
}
