package com.kosa.matjip.service;

import com.kosa.matjip.domain.Menu;
import com.kosa.matjip.mapper.RestaurantMapper;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    private RestaurantMapper mapper;

    public MenuService(RestaurantMapper mapper) {
        this.mapper = mapper;
    }
    public void createMenu(Menu menu) {
        mapper.createMenu(menu);
    }
}
