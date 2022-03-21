package com.capgemini.ccsw.tutorial.game;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ccsw.tutorial.game.model.GameDto;

@RestController
public class GameController {

    public List<GameDto> find(String title, Long idCategory) {
        return null;
    }

    public void save(Long id, GameDto dto) {

    }

}
