package com.mainpackage.modelpackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class Courses {
    private int id;
    private String course;
}
