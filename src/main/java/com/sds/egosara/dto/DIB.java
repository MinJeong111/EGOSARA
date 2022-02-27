package com.sds.egosara.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.security.PrivateKey;

@Data
@Alias("dib")
public class DIB {
    private int dNum;
    private String dId;

}
