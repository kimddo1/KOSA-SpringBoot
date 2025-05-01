package com.kosa.matjip.controller;

import com.kosa.matjip.domain.Menu;
import com.kosa.matjip.service.MenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    private MenuService service;

    public MenuController(MenuService menuService) {
        this.service = menuService;
    }

    @PostMapping("/menu")
    public void createMenu(@RequestBody Menu menu) {
        service.createMenu(menu);
    }



}
