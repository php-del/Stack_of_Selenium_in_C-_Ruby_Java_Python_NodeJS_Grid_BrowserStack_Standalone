using System;

namespace Employee
{
    public class Employee
    {

        // Instance Variables
        String name;
        String lastname;
        int empid;


        // Constructor Declaration of Class
        public Employee(String name,String lastname,int empid)
        {
            this.name = name;
            this.lastname = lastname;
            this.empid = empid;

        }

        // Property 1
        public String getName()
        {
            return name;
        }

        public String getlastname()
        {
            return lastname;
        }

        public int getempid()
        {
            return empid;
        }

        public void emptask()
        {
            Console.WriteLine("Employee is working");
        }
        class MainClass
        {
            public static void Main(string[] args)
            {
                Employee emp = new Employee("Pratik","Pathare",1307);
                Console.WriteLine("The employee first name is"+" "+emp.getName());
                Console.WriteLine("The employee last name is" + " " + emp.getlastname());
                Console.WriteLine("The employee ID is" + " " + emp.getempid());
                emp.emptask();
            }
        }
    }
}
