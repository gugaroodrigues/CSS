/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDao;
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
@WebServlet(urlPatterns = "/alimentos/editar")
public class AlimentosEditar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        AlimentoBean alimento = new AlimentoDao().obterPeloId(id);
        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - editar</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='/Alimentos/update' method='post'>");
        out.println("<input type='hidden' name='id' value='1'>");
        out.println("<div>");
        out.println("<label for=''></label>");
        out.println("<input type='text' id='campo-nome' name='nome'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=''></label>");
        out.println("<input type='text' id='campo-quantidade' name='quantidade'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=''></label>");
        out.println("<input type='text' id='campo-preco' name='preco'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for=''></label>");
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
