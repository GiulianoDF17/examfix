/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }
    
    public int setYearOfBirth(int yearOfBirth){
        yearOfBirth = currentYear - age;
    }
    
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // to be completed
        if age >= 16
            System.print.outln("You can drive!");
        else
            System.print.out.ln("You need to wait" + 16 - age + "before you may drive.");
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        int deductions = 30%
        netPay = (unpaidHours * hourlyWage) - deductions;
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        System.print.outln(fullname+ "" + "has received a wire transfer of" + "" + netPay);
        this.unpaidHours = 0.0;
        return unpaidHours;
    }
}