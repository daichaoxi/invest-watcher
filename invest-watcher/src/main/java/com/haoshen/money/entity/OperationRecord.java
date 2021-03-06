package com.haoshen.money.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class OperationRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer userId;
    private String investId;
    private Integer operDirection;
    private Integer operType;
    private Float operNum;
    private Float operPrice;
    private Date operDate;
    private Integer holdId;

}
