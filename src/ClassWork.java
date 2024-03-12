import com.example.classwork.Contact;
import com.example.classwork.Database;
import com.example.classwork.Message;

import java.util.*;

///*
//larrycodes work. email:kinuthialawrence343@gmail.com  >>this is the documentation part.
//package com.larrycodes;     >>>this is the package declaration.
//*/
//
//import java.util.Scanner;  // this is the import statement;
////import java.util.*;
//interface Car {
////    interfaces in Java define a contract for classes that implement them,
////    specifying the methods that implementing classes must provide.
////    they enable multiple inheritance.
//        };
//public class ClassWork {
////    instance variables belong to an instance of a class.
//    private double radius;
//    private double area;
//    public double getradius(){
//        return radius;
//    };
//    public void setRadius(double radius){
//        radius = 5.12;
//    }
//    public void calculate(){
//        this.area = 3.142 * radius* radius;
//    }
//    public void displayArea(){
//        System.out.println(area);
//    }
//
//    public static void main(String[] args) {
////        public static final PI = 3.142; >>>>declares it as a constant.
//    }
//}
//*************************************************************************************************************************
public class ClassWork {

    private  static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id =0;

    public static  void main(String[] args) {
//        float number = (float) 5.0;  // this is casting a number to a float so that it cannot be taken as a double
//        int a=2;
//        switch (a){
//            case 1:
//                System.out.println(a);
//                break;
//            case 2:
//                System.out.println(a);
//                break;
//        };

//          for (int i =0; i<10; i++) {
////              System.out.println("Larrycodes");
//          }
//          int a =7;
//          while (a<10){
//              a++;
//              if (a == 8){
//                  continue;
//              }
//              System.out.println("larrycodes");
//          }


//  //      getting user input
//
//        System.out.println("Enter your age: ");
//
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        System.out.println("You are " + age + " years old");
//        System.out.println("Enter your name: ");
//        String name = scanner.next();
//
//        System.out.println("Hello " + name);

////getting a random number.
//        Random random = new Random();
//        int number = random.nextInt();
//        System.out.println("The random number is: " + number);
//

//guess me game
      /*  System.out.println("Welcome to larrycodes Guess me Game😍😍😍😍");
        System.out.println("May I know your Name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + ". Shall we start the Game");
        System.out.println("\t1.Press 1 to for yes👌\n\t2.Press 2 for No🙅‍♀️");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1){
            System.out.println("Hello " + name + ". Shall we begin the Game");
            System.out.println("\t1.Press 1 to for yes👌\n\t2.Press 2 for No🙅‍♀️");



            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20);
        System.out.print("Please guess a Number: ");
        int userInput = scanner.nextInt();


        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while(!shouldFinish){
            timesTried ++;
             if (timesTried < 5){
                 if(userInput == x ){
                     hasWon = true;
                     shouldFinish = true;
                 }else if (userInput > x){
                     System.out.println("Guess Lower");
                     userInput = scanner.nextInt();
                 }else{
                     System.out.println("Guess higher");
                     userInput = scanner.nextInt();
                 }
             }else {
                 shouldFinish = true;
             }
        }
        if (hasWon){
            System.out.println("Congratulation! You've guessed in your " + timesTried + " guess.");
        }else {
            System.out.println("Game Over!");
            System.out.println("The number was: " + x);
        }*/

//Arrays
    /*    String[] students = new String[2];
        students[1] = "larry";
        students[0] = "kin";

        String [] employees = {"Meisan", "Tom", "cynthia"};
        int[] numbers = {1, 2, 3, 4, 5,};
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }*/

       /* String[] names = {"larry", "larrykin" , "larrycodes",  "larrykin343"};
        int[] numbers = {123,124,125,126};
        for (int i =0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.print("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i<names.length; i++){
            if (name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
*/

// Object-Oriented Programming
//   polymorphism is having two or more constructors. Also have two similar methods in a parent and child class but perfoming diffent tasks.
//        Also having multiple methods with the same name but having different number of arguments, or different argument return type
//   Overriding is changing the behavior of a method in a parent class after inheriting it in the child class.

    /* Phone redmi = new Phone("redmi", 8,7,8);

        System.out.println(redmi.getName());


        redmi.playMusic("Our wings are burning");
        redmi.playMusic("Lamenting Kiss");



        Phone pixel = new Phone("Pixel 2", 8);

    */
//        Inheritance
   /*     Bird phoenix = new Bird("Dove", "grey",2,true,2);
        System.out.println(phoenix.getName());
        phoenix.eat("Cones");

        System.out.println(phoenix.getWings());
        phoenix.fly();
*/

//        Composition
 /*       Car mercedes = new Car("Mercedes AMG",2,"Black", new Engine("Ranault", 8000));
        System.out.println(mercedes.getName());
        Engine engine = mercedes.getEngine();
        System.out.println("Engine Model: " + mercedes.getEngine().getModel());

*/
//        Null;   when an object is null we cannot use it or access it values.
    /*    Car mercedes = null;
        if (mercedes != null){
            mercedes.getName();
        }else {
            System.out.println("Car was null");
        }
       */


//        Final
       /* final int a =5;
       it can also be used in a class
       final Engine engine = new Engine(parameters)
*/

//        practice 2;

       /* Patient patient = new Patient("Larry",21,
                new Eye("Left Eye", "Short sighted", "Black", true),
                new Eye("Right Eye","Normal", "Black",true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD",false),
                new Skin("Skin","Normal" ,"White",69));
        System.out.println("Name: "+ patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;
        while(!shouldFinish){
            System.out.println("Choose an Organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                        }else{
                            continue;
                        }
                    }else  {
                        System.out.println("\t\t1.Open the Eye");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().open();
                        }else{
                            continue;
                        }
                }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().close();
                        }else{
                            continue;
                        }
                    }else  {
                        System.out.println("\t\t1.Open the Eye");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().open();
                        }else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");;
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1){
                        patient.getStomach().digest();
                    }else{

                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
                }
            }
*/
//            collections 3.43.00
      /*  ArrayList<String> names = new ArrayList<>();
//        List<String > students = new ArrayList<>();  //this is another way of creating an array list
        names.add("Larry");
        names.add("Cynthia");
        System.out.println(names.getFirst());
//        names.clear // you can use the dot operator to access other methods e.g contain, remove
        System.out.println(names.size());
    for (int i= 0; i < names.size(); i++){
        System.out.println(names.get(i));
    }
*/

//maps
 /*       Map<String,String> emailList = new HashMap<>();
        emailList.put("larry", "Larrycodes@gmail.com");
        emailList.put("Brad", "brad@gmail.com");
        System.out.println(emailList.get("larry"));*/
//    you can also use emailList and dot operator

//               Static Keywords -Inner Classes

//        concurrency - exceptions -- doing things simultaneously and at the same time.
//        like below, the code in the thread is running simultaneouly with the code outside the thread.
        /*Thread thread = new Thread(new Runnable() {
         @Override
            public void run() {
                for (int i = 0; i<5; i++){
                    System.out.println("Printing in a worker thread " + i);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        for (int i = 0; i<5; i++){
            System.out.println("Printing in a Main thread " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
*/
//            Exceptions- they catch errors hence preventing the application from crushing
            /*int a = 2;
            int b = 0;
            try{
                System.out.println(a/b);
            }catch (ArithmeticException e){// if don't know the exception you can  general Exception
//                e.printStackTrace(); //this is used when debbuging. it prints some errors.
                System.out.println("An arithmetic error");
            }*/


//    Singleton pattern - we use it when we want to have only one instance of a class in the entire application
     /*   Database database = Database.getInstance("db_music");
        System.out.println(database.toString());
*/
//
//                CHALLENGE 3
//        check above the psvm and also check the method below psvm.
        contacts =  new ArrayList<>();
        System.out.println("Welcome to my humble world of programming");
        showInitialOptions();





































//************************************************************************************************************88
    }
    private static  void showInitialOptions(){
        System.out.println("Please select one: "+
                "\n\t1.Manage Contacts"+
                "\n\t2.Messages"+
                "\n\t3.Quit");

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessanges();
                break;
            default:
                break;
        }
    }

    private static void manageMessanges() {
        System.out.println("Please select one:"+
                "\n\t1. Show all messages"+
                "\n\t2. Send a new Message"+
                "\n\t3. Go Back"  );
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
        }

    }

    private static void sendNewMessage() {
        System.out.println("Who are you going to send the message?");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Please enter the name of the contact");
            sendNewMessage();
        }else{
            boolean doesExist = false;
            for (Contact c: contacts){
                if(c.getName().equals(name)){
                    doesExist = true;
                }
            }
            if(doesExist){
                System.out.println("What are you going to say?");
                String text = scanner.next();
                if(text.equals("")){
                    System.out.println("Please enter some message");
                    sendNewMessage();
                }else{
                    id++;
                    Message newMessage = new Message(text,name,id);
                    for(Contact c: contacts){
                        if(c.getName().equals(name)){
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);
                            c.setMessages(newMessages);
                        }
                    }
                }
            }else{
                System.out.println("There is no such contact");
            }
        }
        showInitialOptions();
    }

    private static void showAllMessages() {
        ArrayList<Message> allMesseges = new ArrayList<>();
        for(Contact c:contacts){
            allMesseges.addAll(c.getMessages());
        }
        if(allMesseges.size()> 0){
            for(Message m: allMesseges){
                m.getDetails();
                System.out.println("**********************");
            }
        }else{
            System.out.println("You don't have any message");
        }
        showInitialOptions();
    }

    private static void manageContacts(){
        System.out.println("Please select one:"+
        "\n\t1. Show all Contacts"+
        "\n\t2. Add a new Contact"+
        "\n\t3. Search for Contact"+
        "\n\t4. Delete a contact"+
        "\n\t5. Go Back");

        int choice =scanner.nextInt();
        switch(choice){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContacts();
                break;
            case 3:
                searchForContacts();
                break;
            case 4:
                deleteContacts();
                break;
            default:
                showInitialOptions();
                break;

        }
    }

    private static void deleteContacts() {
        System.out.println("Please enter the contact's name:");
        String name = scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name:");
            deleteContacts();
        }else{
            boolean doesExist = false;
            for (Contact c: contacts){
                if(c.getName().equals(name)){
                    doesExist = true;
                    contacts.remove(c);
                }
            }
            if(!doesExist){
                System.out.println("There is no such name in your contacts");
            }
        }
        showInitialOptions();
    }

    private static void searchForContacts() {
        System.out.println("Please enter the contact name:");
        String name = scanner.next();
        if (name.equals("")){
            System.out.println("Please enter the name: ");
            searchForContacts();
        }else {
            boolean doesExist = false;
            for(Contact c: contacts){
                if(c.getName().equals(name)){
                    doesExist = true;
                    c.getDetails();
                }
            }
            if(!doesExist){
                System.out.println("There is no such contact in your phone!");
            }
        }
        showInitialOptions();
    }

    private static void addNewContacts() {
        System.out.println("Adding a new contact..."+
                "\nPlease enter the contact name: ");
        String name =scanner.next();
        System.out.println("Please enter contact's number:");
        String number = scanner.next();
        System.out.println("Please enter the contact's email");
        String email = scanner.next();

        if(name.equals("") || number.equals("") || email.equals("")){
            System.out.println("Please enter all the information");
            addNewContacts();
        }else{
            boolean doesExist = false;
            for (Contact c: contacts){
                if (c.getName().equals(name)){
                    doesExist = true;
                }
            }
            if (doesExist =true){
                System.out.println("We have a contact named "+ name+" saved on this device");
                addNewContacts();
            }else{
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println(name + " added successfully");
            }

        }
        showInitialOptions();
    }

    private static void showAllContacts() {
        if(contacts.size()>0){
            for (Contact c: contacts){
                c.getDetails();
                System.out.println("******************");
            }
            showInitialOptions();
        }else{
            System.out.println("You don't have any contact");
            showInitialOptions();
        }

    }




//   ****************************this is for class birds********************************8
    public static class Animal {
        private String name;
        private String color;
        private int legs;
        private boolean hasTale;

        public Animal(String name, String color, int legs, boolean hasTale) {
            this.name = name;
            this.color = color;
            this.legs = legs;
            this.hasTale = hasTale;
        }

        public void eat(String food){
            System.out.println("Eating "+ food);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getLegs() {
            return legs;
        }

        public void setLegs(int legs) {
            this.legs = legs;
        }

        public boolean isHasTale() {
            return hasTale;
        }

        public void setHasTale(boolean hasTale) {
            this.hasTale = hasTale;
        }
    }
}
