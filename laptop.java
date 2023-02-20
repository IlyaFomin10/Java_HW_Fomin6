import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class laptop {
int id;
String manufacturer;
String name;
String color;
int  sizeRAM;
int  sizeHD;
String OS;
int price;

public laptop(int id,
String manufacturer,
String name,
String color,
int  sizeRAM,
int  sizeHD,
String OS,
int price) {
this.id = id;
this.manufacturer = manufacturer;
this.name = name;
this.color = color;
this.sizeRAM = sizeRAM;
this.sizeHD = sizeHD;
this.OS = OS;
this.price = price;
}

Scanner iScanner = new Scanner(System.in);

public String printLaptop() {
return "product ID: " + id + ", manufacturer: " + manufacturer + ", name: " + name + ", color: " + color + 
", size RAM: " + sizeRAM + " GB, size HD: " + sizeHD + " GB, OS: " + OS + ", price: " + price + "$";
}

public List<laptop> findLaptop(HashSet<laptop> hashlaptop, int num) {
    List<laptop> laptopList = new ArrayList<laptop>();
    if (num == 1){
        System.out.println("Введите объем оперативной памяти в Гб: ");
        int myRAM = iScanner.nextInt();
        System.out.printf("Ноутбук с объемом оперативной памяти %s Гб: \n", myRAM);
        for (laptop r : hashlaptop) {
            if (r.sizeRAM == myRAM) {
                laptopList.add(r);
            }
        }
    }    
    else if (num == 2){
        System.out.println("Введите объем жесткого диска в Гб: ");
        int myHD = iScanner.nextInt();
        System.out.printf("Ноутбук с объемом жесткого диска %s Гб: \n", myHD);
        for (laptop h : hashlaptop) {
            if (h.sizeHD == myHD) {
                laptopList.add(h);
            }
        }
    }
    else if (num == 3){
        System.out.println("Введите нужную вам операционную систему (с заглавной буквы на английском): ");
        String myOS = iScanner.next();
        System.out.printf("Ноутбук с операционной системой - %s: \n", myOS);
        for (laptop o : hashlaptop) {
            if (o.OS.equals(myOS)) {
                laptopList.add(o);
            }
        }
    }            
    else if (num == 4){
        System.out.println("Введите нужный вам цвет ноутбука (с заглавной буквы на английском): ");
        String myСolor = iScanner.next();
        System.out.printf("Ноутбук со цветом - %s: \n", myСolor);
        for (laptop c : hashlaptop) {
            if (c.color.equals(myСolor)) {
                laptopList.add(c);
            }
        }
    }
    else {
        System.out.println("Введите верное число! ");
    }
return laptopList;
}
}