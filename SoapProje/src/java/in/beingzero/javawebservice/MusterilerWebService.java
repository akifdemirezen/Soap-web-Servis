/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.beingzero.javawebservice;


import Arayuz.Anasayfa;
import Arayuz.MusteriEkle;
import Data.DataMusteri;
import Entity.Musteri;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author akif
 */
@WebService(serviceName = "MusterilerWebService")
public class MusterilerWebService {

    public static int validasyonhatasi_kodu=101;
    public static String validasyonhatasi_mesaj="Validasyon HAtası";
    public static int servishata_kodu=102;
    public static String servishata_mesaj="Servis Hatası";
    public static int ekleme_basarili_kod=100;
    public static String ekleme_basarili_mesaj="İşlem Başarılı";
    
    public static int basarili_kayit_kodu=100;
    public static String basarili_kayit_mesaj="Kayıt Bulundu";
    
     public static String hatali_kayit_mesaj="Kayıt Bulunamadı" ;
     public static int hatali_kayit_kodu=101;
   
    
    
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "musteriekle")
    public String ws_musteri_ekle(Entity.Musteri m) throws ClassNotFoundException{
    
        try {
            
        m = MusteriEkle.eklenen_musteri;
        if(DataMusteri.musteri_ekle(m)){
        
        return ekleme_basarili_mesaj+" "+ekleme_basarili_mesaj;
        }else
    return validasyonhatasi_kodu+" "+ validasyonhatasi_mesaj;
        
        } catch (Exception e) {
                return servishata_kodu+" "+servishata_mesaj;
        }
    
   
    }
      @WebMethod(operationName = "musterigetir")
    public String ws_musteri_Getir(int id) throws ClassNotFoundException{
    
        id=Anasayfa.alinan_id;
       
          if ( DataMusteri.musteri_Getir(id)) {
            
              return basarili_kayit_kodu+" "+basarili_kayit_mesaj;
          }else
              return hatali_kayit_kodu+" "+hatali_kayit_mesaj;   

    }
    
    
}
