package com.kosa.matjip.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer id;
    private String name;
    private Integer price;
    private Date createdAt;
    private Date updatedAt;
    private Integer restaurantId;
}
