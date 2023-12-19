import java.awt.font.TextHitInfo;

public class Employee {
    String name;
    int salary;
    int taxSalary ;
    int workHours;
    int hireYear;
    int result;

    int bonus;
    int bonusSalary;
    int tax;

    int raise;
    int raiseSalary;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary= salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax(){
        if(this.salary > 10000){
            this.tax = (int)(this.salary * 0.03) ;
            this.taxSalary = this.salary - this.tax;
        }else {
        }
    }

    void bonus(){
        if(this.workHours > 40 ){
        this.bonus = ( workHours - 40 ) * 30;
        this.bonusSalary = this.bonus + this.salary;
        }

    }

    void raise(){
        if(2024 - hireYear < 10 ){
            this.raise = (int) (this.salary*0.05);
            this.raiseSalary  = this.salary + this.raise;
        } else if (2024 - hireYear > 9 && 2024 - hireYear <= 20 ) {
            this.raise = (int) (this.salary*0.10);
            this.raiseSalary  = this.salary + this.raise;
        } else if (2024 - hireYear > 19 ) {
            this.raise = (int) (this.salary*0.15);
            this.raiseSalary  = this.salary + this.raise;
        }
    }

    void result (){
        this.result = this.raiseSalary + this.bonusSalary - this.taxSalary ;
    }


   void workerInfo(){
        bonus();
        tax();
        raise();
        result();
       System.out.println("ADI : " + this.name);
       System.out.println("MAAŞ BİLGİSİ : "+ this.salary);
       System.out.println("ÇALIŞMA SAATİ : " +this.workHours);
       System.out.println("BAŞLANGIÇ YILI : " + this.hireYear);
       System.out.println("VERGİ : " + this.tax);
       System.out.println("BONUSLAR : " +(this.bonus + this.raise));
       System.out.println("MAAŞ ARTIŞI : "+(this.bonus +this.raise-this.tax));
       System.out.println("-----------------");
       System.out.println("TOPLAM GÜNCEL MAAŞ : " + this.result );
   }

}
