public class TugasJava {
    public static void main(String[] args) {
        Employee tania = new Employee("Tania", 100.0);

        System.out.println("Nama : " + tania.getName() + "(" + tania.getClass().getName() + ")");
        System.out.println("Gaji : " + tania.getSalary());
        System.out.println("Pajak : " + tania.getTax());
        System.out.println("Pendapatan Bersih : " + tania.getTakeHomePay());

        System.out.println();

        ComissionedEmployee silvi = new ComissionedEmployee("Silvi", 100.0, 300.0);

        System.out.println("Nama : " + silvi.getName() + "(" + silvi.getClass().getName() + ")");
        System.out.println("Gaji : " + silvi.getSalary());
        System.out.println("Komisi : " + silvi.getComission());
        System.out.println("Pajak : " + silvi.getTax());
        System.out.println("Pendapatan Bersih : " + silvi.getTakeHomePay());
    }
}