package com.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class Main {
        public static void main(String[] args) throws IOException {
            alunno a = new alunno("Mario", "Rossi", createDate(2000, 1, 1));
            alunno a1 = new alunno("d", "a", createDate(1974, 3, 29));
            alunno a2 = new alunno("a", "s", createDate(2000, 1, 1));
            alunno a3 = new alunno("f", "d", createDate(2000, 1, 1));
            System.out.println("---XML---");
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(a);
            System.out.println(xml);
      
            xmlMapper.writeValue(new File("test.xml"), a);
      
            alunno b = xmlMapper.readValue(xml, alunno.class);
              System.out.println(b.getNome());
              System.out.println(b.getCognome());
              System.out.println(b.getDataNascita());
       /*        System.out.println("---JSON---");
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(a);
                System.out.println(json);
        
                mapper.writeValue(new File("test.json"), a);
        
                alunno c = mapper.readValue(json, alunno.class);
                System.out.println(c.getNome());
                System.out.println(c.getCognome()); */
                classe cl = new classe(5, "BIA", "04-TC", new ArrayList<alunno>());
                cl.addAlunno(a);
                cl.addAlunno(a1);
                cl.addAlunno(a2);
                cl.addAlunno(a3);
                System.out.println("---XML---");
                xmlMapper = new XmlMapper();

                xmlMapper.writeValue(new File("test.xml"), cl);

                classe cl1 = xmlMapper.readValue(new File("test.xml"), classe.class);
                System.out.println(cl1.getNumero());
                System.out.println(cl1.getSezione());
                System.out.println(cl1.getAula());
                

        }
        private static Date createDate(int year, int month, int day) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day);
            return calendar.getTime();
        }
    }