package escolaSpring.controllers;

import escolaSpring.entities.Aluno;
import escolaSpring.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService userService;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }



}
