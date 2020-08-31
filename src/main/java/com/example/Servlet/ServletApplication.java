package com.example.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
public class ServletApplication extends HttpServlet {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (ServletOutputStream servletOutputStream = resp.getOutputStream()) {
			servletOutputStream.print("Hello GET");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
