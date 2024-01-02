package com.example.myweb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Questioner", value = "/questioner")
public class QuestionerServlet extends HttpServlet {
    public static int counterYesJava = 0;
    public static int counterNoJava = 0;
    public static int counterYesPython = 0;
    public static int counterNoPython = 0;
    public static int counterYesDotNet = 0;
    public static int counterNoDotNet = 0;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");
        int age = Integer.parseInt(request.getParameter("age"));
        String answerJava = request.getParameter("java");
        String answerPython = request.getParameter("python");
        String answerDotNet = request.getParameter("dotNet");

        if (answerJava.equals("yes")) {
            counterYesJava++;
        } else if (answerJava.equals("no")) {
            counterNoJava++;
        }

        if (answerPython.equals("yes")) {
            counterYesPython++;
        } else if (answerPython.equals("no")) {
            counterNoPython++;
        }

        if (answerDotNet.equals("yes")) {
            counterYesDotNet++;
        } else if (answerPython.equals("no")) {
            counterNoDotNet++;
        }

        // HARDCODING IT`S BAD!
        out.println("<html><body>");
        out.println("<h1>Hello! " + firstName + " " + secondName + " - " +
                age + " y.o." + "</h1>");
        out.println("<p>" + counterYesJava + " people like Java<br>" +
                counterNoJava + " people don`t like Java</p>");
        out.println("<p>" + counterYesPython + " people like Python<br>" +
                counterNoPython + " people don`t like Python</p><bn><bn>");
        out.println("<p>" + counterYesDotNet + " people like .NET<br>" +
                counterNoDotNet + " people don`t like .NET</p><bn><bn>");
        out.println("<h3>Goodbye!</h3>");
        out.println("</body></html>");
    }
}