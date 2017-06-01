/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entity.Musteri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author akif
 */
public class DataMusteri {
       public static String ekle_query="INSERT INTO public.musteri_bilgi(ad, soyad, yas) VALUES (?, ?, ?);";
        
       public static String idyegore_getir_query="SELECT id, ad, soyad, yas FROM public.musteri_bilgi Where id=?;";
       
       
       
       public static boolean musteri_ekle(Entity.Musteri m) throws ClassNotFoundException{
            
            boolean result=false;
            Connection con = null;
            con=DataConnection.getConnection();
            
            try {
                PreparedStatement ps=con.prepareStatement(ekle_query);
                
                ps.setString(1, m.getAd());
                ps.setString(2, m.getSoyad());
                ps.setInt(3, m.getYas());
              
                ps.executeUpdate();
                result=true;
            } catch (Exception e) {
                System.out.println(e.getMessage()); 
            }finally{
                try {
                    if(con==null && !con.isClosed())
                        con.close();
                } catch (SQLException ex) {
             
                }
            }
            
            return result;
        
        }
    
    
       public static boolean musteri_Getir(int id){
       
             Connection con=null;
             ArrayList<Musteri> musteriler = new ArrayList<Musteri>();
             boolean sonuc = true;
             try {
                  con = DataConnection.getConnection();
                  PreparedStatement ps = con.prepareStatement(idyegore_getir_query);                
                  ResultSet rs=ps.executeQuery();
                  if (!rs.next()) {
                    sonuc = false;
                 }
                 
                 
       } catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try {
                if(con!=null && !con.isClosed())
                    con.close();
            } catch (SQLException ex) {
             ex.printStackTrace();
            }
        }       
        
    return sonuc;    
       
       }
       
       
}
