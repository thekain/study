/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9plus1homeworkv2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

/**
 *
 * @author cnp.ak
 */
public class HttpDownloader {

    public static void main(String[] args) {
        URL url = null;
        URLConnection con = null;
        int i;
        try {
            url = new URL("http://www.havaambulansi24.com/robots.txt");
            //url = new URL("https://payment.processinggmbh.ch/status.txt");
            con = url.openConnection();
            File file = new File("C:\\_Development\\WorkFiles\\day9plus1\\file.txt");
            BufferedInputStream bis = new BufferedInputStream(
                    con.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream(file.getName()));
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            bos.flush();
            bis.close();
        } catch (MalformedInputException malformedInputException) {
            malformedInputException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception something){
            something.printStackTrace();
        }
    }
}
