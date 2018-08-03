/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web.alimentos;

import br.com.entra21java.dao.AlimentoDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alunos
 */
public class AlimentoExcluir extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        boolean apagou = new AlimentoDao().excluir(id);
        
        if(apagou){
            resp.getWriter().print("Apagou com sucesso");
            
        }else{
            resp.getWriter().print("Não foi possvel apagar");
        }
    
    }
    
    
    
}