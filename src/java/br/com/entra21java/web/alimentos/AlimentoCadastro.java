/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web.alimentos;

import com.sun.xml.ws.transport.http.HttpAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gus
 */
@WebServlet(urlPatterns = "/alimentos/cadastro")
public class AlimentoCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Cadastro</title>");
        out.println("<link rel='stylesheet type='text/css' href='/WebExemplo02/bootstrap/css/bootstrap.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='/WebExemplo02/alimentos/store' method='post'>");
        out.println("<div class='form-group'>");
        out.println("<label for=''>Nome</label>");
        out.println("<input type='text' id='campo-nome' name='nome'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=''>Quantidade</label>");
        out.println("<input type='text' id='campo-quantidade' name='quantidade'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=''>Preço</label>");
        out.println("<input type='text' id='campo-preco' name='preco'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=''>Descrição</label>");
        out.println("<textarea id='campo-descricao' name='descricao'>");
        out.println("</textarea>");
        out.println("</div>");
        out.println("<input type='submit' value='Cadastrar'>");
        out.println("</form>");
        out.println("");
        out.println("</body>");
        out.println("</html>");
    }

}
