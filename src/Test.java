import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var list = new ArrayList<Blocks>();
        Methods methods = new Methods();
        var choice = 0;
        do {
            System.out.println("1: Them Thi Sinh");
            System.out.println("2: Hien Thi Thong Tin Ca Nhan");
            System.out.println("3: Tim Kiem Theo So Bao Danh");
            System.out.println("0: Thoat");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    list.add(methods.ceart(input));
                    break;
                case 2:
                    methods.display(list);
                    break;
                case 3:
                    if (list.size()>0){
                    System.out.println("Nhap So Bao Danh");
                    var name = input.nextLine();
                    var result = methods.searchID(list, name);
                    methods.display(result);
                    }else {
                        System.out.println("Danh Sach rong");
                    }
                    break;
            }
        } while (true);
    }
}
