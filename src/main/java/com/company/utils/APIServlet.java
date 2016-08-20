package com.company.utils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Nikita on 20.08.2016.
 */
@WebServlet
public class APIServlet extends HttpServlet {

    public void doGet (HttpServletRequest rec, HttpServletResponse resp){
        System.out.println("Im working");
    }
}
