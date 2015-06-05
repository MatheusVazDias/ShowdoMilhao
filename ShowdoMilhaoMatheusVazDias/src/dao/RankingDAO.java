package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;
import modelo.JogoCompleto;
import modelo.Ranking;

public class RankingDAO {
    
    public Boolean inserir (Ranking ranking)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO Ranking (login, pontos, data) VALUES (?, ?, ?)";
        
        PreparedStatement pst = Conexão.getPreparedStatement(sql);
        
        try
        {
            pst.setString(1, ranking.getJogador().getLogin());
            pst.setDouble(2, ranking.getPontos());
            pst.setDate(3, (Date) ranking.getData());
            
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Ranking> listar ()
    {
        List<Ranking> lista = new ArrayList<Ranking>();
        
        String sql = "SELECT login, pontos, data FROM Ranking order by pontos desc";
        PreparedStatement pst = Conexão.getPreparedStatement(sql);
        
         try 
        { 
            ResultSet res = pst.executeQuery();

            while (res.next())
            {
                Ranking ranking = new Ranking();               
                //ranking.getJogador().setLogin(res.getString("login"));
                
                Jogador jog = new Jogador();
                jog.setLogin(res.getString("login"));
                ranking.setJogador(jog);
                
                ranking.setPontos(res.getInt("pontos"));
                ranking.setData(res.getDate("data"));
                lista.add(ranking);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return lista;         
    }
}
