package com.QMS.Java.Dtos;

import com.QMS.Java.Entity.Division;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DivisionRequest {
    private Division division;
}
