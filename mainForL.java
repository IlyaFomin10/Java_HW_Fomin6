import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class mainForL {
public static void main(String[] args) {
System.out.println("Добро пожаловать в каталог ноутбуков! ");
System.out.println("Выберите действие: \n Нажмите 1 - Печать всех товаров; \n 2 - Поиск по каталогу; \n 0 - Выход.");

Scanner sc = new Scanner(System.in);
int userInput = sc.nextInt();

HashSet<laptop> laptopSet = new HashSet<laptop>();

laptop laptop_1 = new laptop(10000, "Apple", "MacBook", "Grey", 8, 256, "MacOS", 1200);
laptop laptop_2 = new laptop(10001, "Acer", "ZX100", "Black", 16, 512, "Lunix", 350);
laptop laptop_3 = new laptop(10002, "Lenovo", "WhiteLP", "White", 32, 1024, "Windows", 600);
laptop laptop_4 = new laptop(10003, "Samsung", "D-7", "White", 32, 1024, "Windows", 700);

laptopSet.add(laptop_1);
laptopSet.add(laptop_2);
laptopSet.add(laptop_3);
laptopSet.add(laptop_4);

switch (userInput) {
case 0:
System.out.println("Вы вышли!");
break;
case 1:
for (laptop j : laptopSet) {
System.out.println(j.printLaptop());
}
break;
case 2:
System.out.println("Введите цифру, соответствующую критерию поиска: \n 1 - RAM \n 2 - Объем HD \n 3 - Операционная система \n 4 - Цвет ");
int number = sc.nextInt();
List<laptop> query = laptop_4.findLaptop(laptopSet, number);
for (laptop l : query) {
System.out.println(l.printLaptop());
}
break;

default:
System.out.println("There's no such opeartion...");
return;
}
}

}