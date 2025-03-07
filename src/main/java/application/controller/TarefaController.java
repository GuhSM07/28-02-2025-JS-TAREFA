package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import application.repository.TarefaRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefaController{
    @Autowired
    private TarefRepository tarefaRepo;

    @RequestMapping("/list")
    public String select(Model ui){
        ui.addAttribute("tarefas", tarefaRepo.findAll());
        return "list";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "forminsert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("descricao")String descircao){
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);

        tarefaRepo.save(tarefa);

        return "forminsert";
    
    }
}