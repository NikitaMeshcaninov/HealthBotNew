package com.company.utils;

import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;


/**
 * Created by Nikita on 20.08.2016.
 */
@WebServlet(urlPatterns = "/lol", name = "register")
public class APIServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest rec, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("Hi!");
        PrintWriter out = resp.getWriter();
        out.println("Hi frome servlet");

    }


    }

