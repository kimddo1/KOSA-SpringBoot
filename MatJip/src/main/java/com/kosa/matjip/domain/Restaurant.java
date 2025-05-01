package com.kosa.matjip.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private Integer id;
    private String name;
    private String address;
    private Date createdAt;
    private Date updatedAt;
    private List<Menu> menus;
    private List<Review> reviews;
}

