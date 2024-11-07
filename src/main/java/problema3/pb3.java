package problema3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class pb3 {
    public static List<Mobilier> citire() {
        try {
            File file=new File("C:\\pj\\Lab6\\src\\main\\resources\\mobilier.json");
            ObjectMapper mapper = new ObjectMapper();
            List<Mobilier> m = mapper.readValue(file, new TypeReference<List<Mobilier>>(){}); ;
            return m;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<Mobilier> m=citire();
        String n;
        int nr=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLine();
        for(Mobilier m1:m){
            System.out.println(m1.getNume()+ m1.getPlaci());
        }
        for(Mobilier m2:m){
            if(n.equals(m2.getNume())){
                System.out.println(m2.getPlaci());
                nr++;
            }
        }
        if(nr==0)
            System.out.println("nu s-a gasit nici un mobilier");
        sc.close();
    }
}
