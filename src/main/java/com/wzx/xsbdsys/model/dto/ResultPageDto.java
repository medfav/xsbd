package com.wzx.xsbdsys.model.dto;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.Data;

@Data
public class ResultPageDto {

    private Object list;

    private PageInfo pageInfo;

}
