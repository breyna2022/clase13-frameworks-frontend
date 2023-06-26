/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clase13.controller;

import com.example.clase13.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrador
 */
@Controller
@RequestMapping("/facultad")
public class FacultadController {
    @Autowired
    private FacultadService facultadService;
    
    @GetMapping
    public String indexFacultad(Model model){
        model.addAttribute("facultades", facultadService.readAll());
        return "facultad/facu";
    }
    
}
