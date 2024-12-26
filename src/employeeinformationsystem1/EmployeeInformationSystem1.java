package employeeinformationsystem1;

import java.util.*;
import java.io.*;

abstract class Menu
{
        public static Scanner in=new Scanner(System.in);
        int Your_choice;
      public abstract void Menu();
}

class MainMenu extends Menu
{
    @Override
    public void Menu()
    {
        System.out.println("\t\t****************************************************************************");
        System.out.println("\t\t                       Employee Information Managment");
        System.out.println("\t\t****************************************************************************");
        System.out.println("\t\t\tWelcome Please Follow the following Instruction CareFully");
        System.out.println("\t\t****************************************************************************");
        System.out.println("\t\t\t\tPress 1 : To Add Employee's Info");
        System.out.println("\t\t\t\tPress 2 : To See Employee's Info");
        System.out.println("\t\t\t\tPress 3 : To Update Employee's Info");
        System.out.println("\t\t\t\tPress 4 : To Delete Employee's Info");
        System.out.println("\t\t\t\tPress 5 : To Exit System");
        System.out.println("\t\t****************************************************************************");
        System.out.print("Enter Your Choice Here : ");
        Your_choice =in.nextInt();
    }
}

class MiniMenu extends Menu
{
    @Override
    public void Menu()
    {
        System.out.println("\t\t**********************************************************************");
        System.out.println("\t\t\t\tPress 1 : To See All Employee's");
        System.out.println("\t\t\t\tPress 2 : To See Only Chosen Employee");
        System.out.println("\t\t\t\tPress 3 : To See how many Employee's You have Total");
        System.out.println("\t\t**********************************************************************");
        System.out.print("Enter Your Choice Here : ");
        Your_choice =in.nextInt();
    }
}

class DelMenu extends Menu
{
    @Override
    public void Menu()
    {
        System.out.println("\t\t**********************************************************************");
        System.out.println("\t\t\t\tPress 1 : To Delete All Employee's");
        System.out.println("\t\t\t\tPress 2 : To Delete Only Chosen Employee");
        System.out.println("\t\t**********************************************************************");
        System.out.print("Enter Your Choice Here : ");
        Your_choice =in.nextInt();   
    }
}

class Inputs
{
        List<Integer>ID=new ArrayList<>();
        List<String>F_name=new ArrayList<>();
        List<Character>Gender=new ArrayList<>();
            int id;
            String f_name;
            char gender;
            int N_Emp;
}

class Employee extends Inputs
{
    public void add_Employee()
    {
        System.out.print("How Many Employee's You Want to add : ");
        this.N_Emp=MainMenu.in.nextInt();
    for(int i=0;i<this.N_Emp;i++)
        {
            System.out.print("Enter Employee "+(i+1)+"\'s ID (Id should be unique for all and 4 digits) : ");
            this.id=MainMenu.in.nextInt();
            MainMenu.in.nextLine();
            System.out.print("Enter Employee "+(i+1)+"\'s FirstName : ");
            this.f_name=MainMenu.in.nextLine();
            System.out.print("Enter Employee "+(i+1)+"\'s Gender (M/F) : ");
            this.gender=MainMenu.in.next().charAt(0);
            ID.add(i, id);F_name.add(i, f_name);Gender.add(i, gender);
        System.out.println("Employee SuccessFully Added.");
          
        }
    }
    
    public void add_emp()
    {
            System.out.print("How Many Employee's You Want to add : ");
                int n_Emp=MainMenu.in.nextInt();
                N_Emp+=n_Emp;
                int i=(N_Emp-n_Emp);
            while(i<N_Emp)
        {
            System.out.print("Enter Employee "+(i+1)+"\'s ID (Id should be unique for all and 4 digits) : ");
            this.id=MainMenu.in.nextInt();
            MainMenu.in.nextLine();
            System.out.print("Enter Employee "+(i+1)+"\'s FirstName : ");
            this.f_name=MainMenu.in.nextLine();
            System.out.print("Enter Employee "+(i+1)+"\'s Gender (M/F) : ");
            this.gender=MainMenu.in.next().charAt(0);
            ID.add(i, id);F_name.add(i, f_name);Gender.add(i, gender);
        System.out.println("Employee SuccessFully Added.");
            i++;
        
       }
    }
    
    public void showAll()
    {
                System.out.println("***************************************************************All Employee's Information***************************************************************************");
                System.out.println("EmployeeID\tEmployeeFirstName\tEmployeeGender");
        for(int i=0;i<N_Emp;i++)
            {
                System.out.println(ID.get(i)+"\t\t"+F_name.get(i)+"\t\t\t"+Gender.get(i));
            }
                System.out.println("*********************************************************************************************************************************************************************");
            
    }
    
    public void showSpecific()
    {
                System.out.print("Enter the ID of the Employee Information You want : ");
        int x=MainMenu.in.nextInt();
        if(ID.contains(x))
            {
                System.out.println("\tEmployee Found : ");
                   int z=ID.indexOf(x);
                    System.out.println("\tID: "+ID.get(z));
                    System.out.println("\tFirstName: "+F_name.get(z));
                    System.out.println("\tGender: "+Gender.get(z));
            }
        else
                System.out.println("Employee Not Found!");
    }
    
    public void howMany()
    {
        System.out.println("You Have "+ID.size()+" Employee's");
    }
    
    public void updateInfo()
    {
                    System.out.print("Enter the ID of the Employee Information You want to Update : ");
        int x=MainMenu.in.nextInt();
        if(ID.contains(x))
            {
                System.out.println("\tEmployee Found : ");
                   int z=ID.indexOf(x);
                    System.out.println("\tID : "+ID.get(z));
                    System.out.println("\tFirstName : "+F_name.get(z));
                    System.out.println("\tGender : "+Gender.get(z));
                    System.out.println("Enter the Update Information of the Employee");
                        System.out.print("ID : ");
                            int a=MainMenu.in.nextInt();
                            MainMenu.in.nextLine();
                        System.out.print("FirstName : ");
                            String b=MainMenu.in.nextLine();
                        System.out.print("Gender : ");
                            char d=MainMenu.in.next().charAt(0);
                    ID.set(z,a);F_name.set(z,b);Gender.set(z,d);
                System.out.println("Employee Info Success Fully Updated.");
            }
        else
                System.out.println("Employee Not Found!");
    }
    
    public void deleteAll()
    {
            System.out.println("Are you sure You Want To Delete Every thing Permanently?(Y/N)");
                char z=MainMenu.in.next().charAt(0);
        if(z=='Y'||z=='y')
            {
                ID.clear();F_name.clear();Gender.clear();
                id=0;f_name=null;gender=0;
                N_Emp=0;
            }
        System.out.println("All Employee's Success fully Deleted.");
    }
    
    public void deleteSpecific()
    {
                System.out.print("Enter the ID of the Employee Information You want to Delete : ");
        int x=MainMenu.in.nextInt();
        if(ID.contains(x))
            {
                System.out.println("\t\tEmployee Found : ");
            System.out.println("Are you sure You Want To Delete this Employee's Info ?(Y/N)");
                 char z=MainMenu.in.next().charAt(0);
            if(z=='Y'||z=='y')
                 {
                 int p=ID.indexOf(x);
                  ID.remove(p);F_name.remove(p);Gender.remove(p);
                  N_Emp--;
                System.out.println("This Employee's Info Success Fully Deleted.");
                 }
            }
        else
                System.out.println("Employee Not Found!");
    }
}

public class EmployeeInformationSystem1 
{
    static Scanner insert=new Scanner(System.in);
    static MainMenu M1=new MainMenu();//creating object for MainMenu Class.
    static MiniMenu M2=new MiniMenu();//creating object for MiniMenu Class.
    static DelMenu M3=new DelMenu();//creating object for DelMenu Class.
    static Employee E1=new Employee();//creating object for Employee Class.
    public static void main(String[] args) 
    {
        int w=19823764; //Let's Assume this is the password and the Manager knows it too We have not learnt how to save a value even after System exits so We have done it manually.
            System.out.print("Welcome\n Are You The Manager (Y/N)? : ");
                char q=insert.next().charAt(0);
        if(q=='Y'||q=='y')
            {
                System.out.print("Please Enter The Password To Continue : ");
                    int e=insert.nextInt();
                if(e==w)
                {
                    do{
                        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________");
                    M1.Menu();
                  switch(M1.Your_choice)
                  {
                      case 1:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                        int p=E1.ID.size();
                    if(p==0)
                          E1.add_Employee();
                        else
                          E1.add_emp();
                        break;
                      case 2:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                         p=E1.ID.size();
                    if(p!=0){
                          char r;
                        do
                        {
                          M2.Menu();
                          switch(M2.Your_choice)
                          {
                              case 1:
                                  System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                                  E1.showAll();
                                  break;
                              case 2:
                                  System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                                  E1.showSpecific();
                                  break;
                              case 3:
                                  System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                                  E1.howMany();
                                  break;
                              default : System.out.println("Invalid Input!");
                          }
                            System.out.print("Do you Want Still to See Employee's Info (Y/N) : ");
                            r=insert.next().charAt(0);
                        }while(r=='Y'||r=='y');}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      case 3:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                         p=E1.ID.size();
                    if(p!=0){
                          E1.updateInfo();}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      case 4:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                          p=E1.ID.size();
                    if(p!=0){
                          char t;
                          do
                          {
                              M3.Menu();
                              switch(M3.Your_choice)
                              {
                                  case 1:
                                      System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
                                      E1.deleteAll();
                                      break;
                                  case 2:
                                      System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
                                      E1.deleteSpecific();
                                      break;
                                  default : System.out.println("Invalid Input!");
                              }
                                System.out.print("Do you Want Still to Delete Employee's Info (Y/N) : ");
                                t=insert.next().charAt(0);
                          }while(t=='Y'||t=='y');}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      case 5:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                          p=E1.ID.size();
                    if(p!=0){
                          System.exit(0);}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      default : System.out.println("Invalid Input!");
                  }
                    }while(true);
                }
                else
                {
                    System.out.print("One last try Please Re-enter the Password Correctly : ");
                       e=insert.nextInt();
                   if(e==w)
                        {
                           do{
                        System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________");
                    M1.Menu();
                  switch(M1.Your_choice)
                  {
                      case 1:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                        int p=E1.ID.size();
                    if(p==0)
                          E1.add_Employee();
                        else
                          E1.add_emp();
                        break;
                      case 2:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                         p=E1.ID.size();
                    if(p!=0){
                          char r;
                        do
                        {
                          M2.Menu();
                          switch(M2.Your_choice)
                          {
                              case 1:
                                  System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                                  E1.showAll();
                                  break;
                              case 2:
                                  System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                                  E1.showSpecific();
                                  break;
                              case 3:
                                  System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                                  E1.howMany();
                                  break;
                              default : System.out.println("Invalid Input!");
                          }
                            System.out.print("Do you Want Still to See Employee's Info (Y/N) : ");
                            r=insert.next().charAt(0);
                        }while(r=='Y'||r=='y');}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      case 3:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                         p=E1.ID.size();
                    if(p!=0){
                          E1.updateInfo();}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      case 4:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                          p=E1.ID.size();
                    if(p!=0){
                          char t;
                          do
                          {
                              M3.Menu();
                              switch(M3.Your_choice)
                              {
                                  case 1:
                                      System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
                                      E1.deleteAll();
                                      break;
                                  case 2:
                                      System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
                                      E1.deleteSpecific();
                                      break;
                                  default : System.out.println("Invalid Input!");
                              }
                                System.out.print("Do you Want Still to Delete Employee's Info (Y/N) : ");
                                t=insert.next().charAt(0);
                          }while(t=='Y'||t=='y');}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      case 5:
                          System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________");
                          p=E1.ID.size();
                    if(p!=0){
                          System.exit(0);}
                    else
                              System.out.println("Please Add An Employee First");
                        break;
                      default : System.out.println("Invalid Input!");
                  }
                    }while(true); 
                        }
                   else
                        {
                            System.out.println("That's it for Safety System Will be Terminated Try again Another Time");
                            System.exit(0);
                        }
                }
            }
        else
            {
                System.out.println("System Can Not Be Used Other Than The Manager Sorry");
                System.exit(0);
            }
    }   
}