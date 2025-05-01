package com.kosa.matjip.controller;

import com.kosa.matjip.domain.Menu;
import com.kosa.matjip.service.MenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/menu")
    public void createMenu(@RequestBody Menu menu) {
        menuService.createMenu(menu);
    }



}
