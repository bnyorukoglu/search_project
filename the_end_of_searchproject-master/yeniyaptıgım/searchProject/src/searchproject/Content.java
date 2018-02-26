/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchproject;

import java.util.HashMap;

/**
 *
 * @author bengi
 */
public class Content {
    private String date;
    private String time;
    private String word;
    private String detail;
    
//public HashMap<String, String> HashMapP;

    public Content() {
        //HashMapP = new HashMap<>();

    }

    public Content(String date1,String time1,String word1,String detail1){
        
        setDate(date1);
        setTime(time1);
        setWord(word1);
        setDetail(detail1);
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getWord() {
        return word;
    }

    public String getDetail() {
        return detail;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
}
