/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetimekeepingapplication;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class EmployeeTimekeepingApplication {

    public static void main(String[] args){
        SLinkedList list = new SLinkedList();
        
<<<<<<< HEAD
             //if file does not exist, create file
       


=======
        //if file does not exist, create file
        if(!checkFileExists()){
            createFile();
        }
        
        //store contents of file into linked list
      fileToList(list);
      
  
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a

      /*chooses which user type. final version of app will select this based on the type of object has logged in
      */
      
<<<<<<< HEAD
      
      Employee employee = new Employee();
      employee.setLastName("D");
      Employee employee2 = new Employee();
      employee2.setLastName("A");
      Employee employee3 = new Employee();
      employee3.setLastName("X");
      
      SNode node = new SNode(employee,null);
      SNode node2 = new SNode(employee2,null);
      SNode node3 = new SNode(employee3,null);
      
      list.add(node);
      list.add(node2);
      list.add(node3);
      

      
       
      printAll(list);
       
       
      
      
      
      
=======
     /* removing for testing 
      
      
      int choice = -1;
       do{
            try{
                choice = Integer.parseInt(JOptionPane.showInputDialog("Which Account is logging in? \n" + 
                        "1. Employee account \n" +
                        "2. Manager account \n" +
                        "3. Admin account\n "+
                        "4. Exit"
                        
                ));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid Option. Try again");
            }
            if(choice == 2){
              managerMenu(list);  
            }            
            if(choice == 3){
              adminMenu(list);  
            }

            
        }while(choice != 4) ;
      
      
       */ 
     
     
     adminMenu(list);
    }

    
    //DO NOT USE
    public static SNode sortUsers(SLinkedList list){
        
    
          SNode min = list.getHead();
          SNode node;
          
           for(node = list.getHead().getNext();node != null;node = node.getNext()){
              if(node.getData().getLastName().compareToIgnoreCase(min.getData().getLastName()) < 0){
                  min = node;
               }
           }
           SNode temp = min;
           return min;
    }

    public static SLinkedList sort(SLinkedList list){
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a
        
      
    }
    
    private static void managerMenu(SLinkedList list){
        
<<<<<<< HEAD
=======
        for(SNode index = list.getHead(); index != null; index = index.getNext()){
            SNode min = index;
            for(SNode index2 = index.getNext(); index2 != null; index2 = index2.getNext()){
                if(index2.getData().getLastName().compareToIgnoreCase(min.getData().getLastName()) < 0){
                    min = index2;
                    
                }
                SNode temp = index;
                index.setData(min.getData());
                min.setData(temp.getData());
                
            }
        }
        return list;
    }     
    private static void managerMenu(SLinkedList list){
        
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a
    }
    
    private static void fileToList(SLinkedList list){
       Scanner inputStream; 
       
       try{
           inputStream = new Scanner(new FileInputStream("database.txt"));
           inputStream.close();
       }catch(FileNotFoundException e){
           System.out.println(e);
           System.exit(1);
       }
       
    }
<<<<<<< HEAD

    
=======
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a
    private static void addEmployee(SLinkedList list, int choice){
        Employee employee = null;
        switch(choice){
            case 1:
                employee = new Employee();
                break;
            case 2:
                employee = new Manager();
                break;
            case 3:
                employee = new Admin();
                break;            
        }
        createEmployee(employee);
        SNode node = new SNode(employee,null);
        list.add(node);
    }
    
    private static void createEmployee(Employee employee){
     //   employee.setFirstName(JOptionPane.showInputDialog("Enter first name:"));
        employee.setLastName(JOptionPane.showInputDialog("Enter last name: "));
     //   employee.setPassword(JOptionPane.showInputDialog("Enter password: "));
        
<<<<<<< HEAD
        if(employee instanceof Manager){
            System.out.println("working");
        }
=======
     //   addAddress(employee);
     //   addLocation(employee);
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a
        
    }
    
    private static void addAddress(Employee employee){
        employee.getAddress().setStreet(JOptionPane.showInputDialog("Enter Street name: "));
        employee.getAddress().setAptNum(JOptionPane.showInputDialog("Enter apt num: "));
        employee.getAddress().setCity(JOptionPane.showInputDialog("Enter City: "));
        employee.getAddress().setState(JOptionPane.showInputDialog("Enter State: "));
        employee.getAddress().setZipCode(JOptionPane.showInputDialog("Enter ZIP: "));    
    }
    
    private static void addLocation(Employee employee){
        int id = locationMenu();
        employee.getLocation().setLocation(id);
    }
    
    private static int locationMenu(){
        int locationID;
        do{
            try{
                locationID = Integer.parseInt(JOptionPane.showInputDialog("1. Factory 415, 123 Fake Street, Nowhere, NN, 00111 \n" +  
                "2. Research 221, 123 Faker Street, Still Nowhere, NN, 00112 \n" + 
                "3. Corporate 001, 123 Not-Fake Street, Somewhere, IL, 01010"));
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid location try again");
                locationID = -1;
            }
        }while(locationID < 0 || locationID > 3 );
        
        return locationID;
    }
    
    private static boolean checkFileExists(){
        String fileName = "database.txt";
        File f = new File(fileName);
        boolean check = f.exists();

        
        return check;
    }
    
    private static void createFile(){
        if(checkFileExists()){
            JOptionPane.showMessageDialog(null, "Loading database");
        }
        else{
            try{
                File file = new File("database.txt");
                
                if(file.createNewFile()){
                    JOptionPane.showMessageDialog(null, "Creating database");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
    }
    
<<<<<<< HEAD
    private static Employee login(String userID, String pass,SLinkedList list){
        int code = searchTextFile(userID, pass);
        Employee employee = null;
        if(code == 1){
            employee = list.getSpecific(userID);
        }
=======
  //  public static void writeDefaultAdd()
    
    private static void login(String filepath){
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a
        
        return employee;
    }
    
    private static void writeToFile(String filepath, Employee employee){
        PrintWriter pr = null;
        try{
            pr = new PrintWriter(new BufferedWriter(new FileWriter(new File(filepath), true)));
            pr.println(employee.getId() + " oleole123" + " enabled");
            
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            pr.close();
        }
    }
    
    private static int mainMenu(){
        int choice = 0;
        do{
            try{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Option: \n" + 
                    "1. Create Account \n" + "2. Login To existing Account"));
            }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid choice, Try again");
            }
        }while(choice <= 0 || choice > 2);
        
        return choice;
    }
    
    private static void createUserMenu(SLinkedList list){
        int choice = 0;
        do{
            try{
                choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Option: \n" + 
                        "1. Create Employee account \n" +
                        "2. Create Manager account \n" +
                        "3. Create Admin account "
                ));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid Option. Try again");
            }
        }while(choice <= 0 || choice > 3);
        
        return choice;
    }
    
    private static void createUserMenu(SLinkedList list){
        int choice = 0;
        do{
            try{
                choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Option: \n" + 
                        "1. Create Employee account \n" +
                        "2. Create Manager account \n" +
                        "3. Create Admin account\n "+
                        "4. Exit"
                        
                ));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid Option. Try again");
            }
        }while(choice <= 0 || choice > 4) ;
        
       addEmployee(list,choice);
<<<<<<< HEAD
=======
        
        
>>>>>>> 5b72f7ad97027e43260b0db744d5b3c4216bc11a
    }
    private static void adminMenu(SLinkedList list){
        int choice = 0;
        do{
            try{
                choice = Integer.parseInt(JOptionPane.showInputDialog("Administrator Menu: \n" + 
                        "1. Create Account \n" +
                        "2. Manage User \n" +
                        "3. View Disabled Users \n "+
                        "4. Logout\n"+
                        "5. Display All Users (for testing)\n"+
                        "6. Sort All Users"
                        
                ));
                
                if(choice == 1){
                    createUserMenu(list);
                }
                if(choice ==6){
                    list = sort(list);
                    //sortUsers(list);
                }
                if(choice == 5){
                    printAll(list);
                }

               
                
       
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid Option. Try again");
            }
        }while(choice != 4) ;
        

        
      
    }
    //PRINTS ALL EMPLOYEE OBJECTS FOR TESTING PURPOSES***
    private static void printAll(SLinkedList list){
 
        String output = "";
        SNode curr = list.getHead();
        
        //if there is only one object in list
        if(!curr.hasNext()){
            output += curr.getData();
        }
        else{
        //if there are multiple objects in list
            while(curr != null){
               output += curr.getData() + "\n";
               curr = curr.getNext();
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }

    
    private static int searchTextFile(String userID, String password){
        File data = new File("database.txt");
        int statusCode = -2;
        try{
            BufferedReader br = new BufferedReader(new FileReader(data));
            String line;
            while((line = br.readLine()) != null){
                String[] dataSet = line.split(" ");
                if(dataSet[0].equals(userID) && dataSet[1].equals(password) && dataSet[2].equals("enabled")){
                    statusCode = 1;
                    return statusCode;
                }
                else if(dataSet[0].equals(userID) && dataSet[1].equals(password) && !dataSet[2].equals("enabled")){
                    statusCode = 0;
                    return statusCode;
                }
                else if(dataSet[0].equals(userID) && !dataSet[1].equals(password)){
                    statusCode = -1;
                    return statusCode;
                }
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return statusCode;
    }
      private static void adminMenu(SLinkedList list){
        int choice = 0;
        do{
            try{
                choice = Integer.parseInt(JOptionPane.showInputDialog("Administrator Menu: \n" + 
                        "1. Create Account \n" +
                        "2. Manage User \n" +
                        "3. View Disabled Users \n "+
                        "4. Logout\n"+
                        "5. Display All Users (for testing)"+
                        "6. Sort All Users"
                        
                ));
                
                if(choice == 1){
                    createUserMenu(list);
                }
                if(choice == 5){
                    printAll(list);
                }
                if(choice ==6){
                    sort(list);
                }
                
       
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid Option. Try again");
            }
        }while(choice != 4) ;
        

        
      
    }
    //PRINTS ALL EMPLOYEE OBJECTS FOR TESTING PURPOSES***
    private static void printAll(SLinkedList list){
        SNode node = list.getHead();
        String output = "";
        while(node != null){
           output += node.getData() + "\n";
           node = node.getNext();
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
        
    
    
    public static SLinkedList sort(SLinkedList list){
        
        
        for(SNode index = list.getHead(); index != null; index = index.getNext()){
            SNode min = index;
            for(SNode index2 = index.getNext(); index2 != null; index2 = index2.getNext()){
                if(index2.getData().getLastName().compareToIgnoreCase(min.getData().getLastName()) > 0){
                    min = index2;
                    
                }
                SNode temp = index;
                index.setData(min.getData());
                min.setData(temp.getData());
                
            }
        }
        return list;
    }
}
    

