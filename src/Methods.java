import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    public Blocks ceart(Scanner input) {
        System.out.println("Chon\n1.Khoi A\n2.Khoi B\n3.Khoi C");
        var Selection = input.nextInt();
        input.nextLine();
        System.out.println("Nhap Ten");
        var name = input.nextLine();
        System.out.println("Nhap Dia Chi");
        var address = input.nextLine();
        System.out.println("So Diem Duoc U Tien");
        var precedence = Float.parseFloat(input.nextLine());
        Student student = new Student(null, name, address, precedence);

        switch (Selection) {
            case 1:
                System.out.println("Mon Toan");
                var subjectT = Float.parseFloat(input.nextLine());
                System.out.println("Ly");
                var subjectL = Float.parseFloat(input.nextLine());
                System.out.println("Hoa");
                var subjectH =Float.parseFloat(input.nextLine());

                return new Blocks("Khoi A", subjectT, subjectL, subjectH, student);
            case 2:
                System.out.println("Toan");
                var subjectTT = Float.parseFloat(input.nextLine());
                System.out.println("Hoa");
                var subjectHH = Float.parseFloat(input.nextLine());
                System.out.println("Sinh");
                var subjectS = Float.parseFloat(input.nextLine());
                return new Blocks("Khoi B", subjectTT, subjectHH, subjectS, student);
            case 3:
                System.out.println("Van");
                var subSubjectV = Float.parseFloat(input.nextLine());
                System.out.println("Su");
                var subSubjectS = Float.parseFloat(input.nextLine());
                System.out.println("Dia");
                var subSubjectD = Float.parseFloat(input.nextLine());

                return new Blocks("Khoi C", subSubjectV, subSubjectS, subSubjectD, student);
        }
        return null;
    }

    public void display(ArrayList<Blocks> list) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "SBD", "Ho Va Ten", "Dia Chi", "Nhap Diem UT", "Khoi", "Diem 1", "Diem 2", "Diem 3");
        for (var index : list) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    index.getStudent().getId(), index.getStudent().getFullName(), index.getStudent().getAddress(),
                    index.getStudent().getPrecedence(), index.getNameBlock(), index.getSubjectA(),
                    index.getSubjectB(), index.getSubjectC());
        }
    }

    public ArrayList<Blocks> searchID(ArrayList<Blocks> list, String name) {
        ArrayList<Blocks> list1 = new ArrayList<>();
        for (var index : list) {
            if (index.getStudent().getId().equals(name)){
                list1.add(index);
            }
        }
        return list1;
    }
}
