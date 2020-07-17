package com.enigma;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void menu() throws IOException {

        System.out.println("Menu");
        System.out.println("1. Stock Merchant");
        System.out.println("2. Drawing Book");
        System.out.println("3. Grading Students");
        System.out.println("4. Apples and Oranges");
        System.out.println("5. Kangaroo");
        System.out.println("6. Compare The Triplets");
        System.out.println("7. A Very Big Sum");
        System.out.println("8. Diagonal Difference");
        System.out.println("9. Plus Minus");
        System.out.println("10. Stair Case");
        System.out.println("11. Mini-Max Sum");
        System.out.println("12. BirthDay Cake Candles");
        System.out.println("13. Time Conversation");
        System.out.println("14. Birthday Chocolate");
        System.out.println("15. Divisible Sum Pairs");
        System.out.println("16. Migratory Bird");
        System.out.println("17. Day of The Programmer");
        System.out.println("18. Bon Appetit");
        System.out.println("19. Electronics Shop");

        System.out.print("Input : ");
        int number = scanner.nextInt();

        if (number == 1) {
            sockMerchant();
            menu();
        } else if (number == 2){
            drawingBook();
            menu();
        } else if (number == 3){
            gradingStudents();
            menu();
        } else if (number == 4){
            applesAndOranges();
            menu();
        } else if (number == 5){
            kangarooJump();
            menu();
        } else if (number == 6){
            compareTriplets();
            menu();
        } else if (number == 7){
            sumOfInteger();
            menu();
        } else if (number == 8){
            differenceDiagonal();
            menu();
        } else if (number == 9){
            plusMinus();
            menu();
        } else if (number == 10){
            stairCase();
            menu();
        } else if (number == 11){
            miniMaxSum();
            menu();
        } else if (number == 12){
            countCandles();
            menu();
        } else if (number == 13){
            timeConversation();
            menu();
        } else if (number == 14){
            countChocolate();
            menu();
        } else if (number == 15){
            divisibleSumPairs();
            menu();
        } else if (number == 16){
            migratoryBird();
            menu();
        } else if (number == 17){
            dayOfTheProgrammer();
            menu();
        } else if (number == 18){
            bonAppetit();
            menu();
        } else if (number == 19){
            electronicShop();
            menu();
        }
    }

    public static void sockMerchant(){
        StockMerchant stock = new StockMerchant();

        System.out.print("enter the number of array : ");
            int amount = scanner.nextInt();
            int[] arr = new int[amount];

            for (int i = 0; i < amount ; i++) {
                System.out.print("number-"+i+" : ");
                int numb =scanner.nextInt();
                arr[i]= numb;
            }
            System.out.println(stock.stockMerchant(amount, arr));
    }

    public static void drawingBook(){

        DrawingBook drawingBook = new DrawingBook();

        System.out.print("input the number of pages in the book : ");
        int n = scanner.nextInt();

        System.out.print("input the page number to turn to : ");
        int p = scanner.nextInt();

        System.out.println(drawingBook.countPage(n, p));
    }

    public static void gradingStudents(){
        GradingStudents gradingStudents = new GradingStudents();

        List<Integer> grades = new ArrayList<>();

        System.out.print("the amount of students : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("grade-"+i);
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        System.out.println(gradingStudents.gradingStudent(grades));
    }

    public static void applesAndOranges(){

        ApplesAndOranges applesAndOranges = new ApplesAndOranges();

        System.out.print("input start point for house : ");
        int s = scanner.nextInt();

        System.out.print("input endpoint for house : ");
        int t = scanner.nextInt();

        System.out.print("input location of apple tree :");
        int a = scanner.nextInt();

        System.out.print("input location of orange tree :");
        int b = scanner.nextInt();

        System.out.print("the amount of apples : ");
        int m = scanner.nextInt();

        System.out.print("the amount of oranges : ");
        int n = scanner.nextInt();

        int[] apples = new int[a];
        int[] oranges = new int[b];

        for (int i = 1; i <= m ; i++) {
            System.out.print("distance of apple-"+i + " from tree : ");
            int d = scanner.nextInt();
            apples[i]=d;
        }

        for (int i = 1; i <=n ; i++) {
            System.out.println("distance of orange-"+i+ "from tree : ");
            int d = scanner.nextInt();
            oranges[i]=d;
        }

        applesAndOranges.determineDistance(s, t, a, b, apples, oranges);
    }

    public static void kangarooJump(){
        Kangaroo kangaroo = new Kangaroo();

        System.out.print("input x1 : ");
        int x1 = scanner.nextInt();

        System.out.print("input v1 : ");
        int v1 = scanner.nextInt();

        System.out.print("input x2 : ");
        int x2 = scanner.nextInt();

        System.out.print("input v2 : ");
        int v2 = scanner.nextInt();

        System.out.println(kangaroo.determineKPK(x1,v1, x2, v2));
    }

    public static void compareTriplets(){

        CompareTheTriplets compareTheTriplets = new CompareTheTriplets();

        int[] alice = new int[3];
        int[] bob = new int[3];

        System.out.print("input score for alice : ");
        String scoreA = scanner.next();

        System.out.print("input score for bob : ");
        String scoreB = scanner.next();

        String[] splitA = scoreA.split(",");
        for (int i = 0; i < 3 ; i++) {
            int a = Integer.parseInt(splitA[i]);
            alice[i] = a;
        }
        String[] splitB = scoreB.split(",");
        for (int i = 0; i < 3 ; i++) {
            int a = Integer.parseInt(splitB[i]);
            bob[i] = a;
        }

        int[] result = compareTheTriplets.compareSCore(alice, bob);
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]);
        }
    }

    public static void sumOfInteger(){

        AVeryBigSum aVeryBigSum = new AVeryBigSum();

        System.out.print("input length : ");
        int length = scanner.nextInt();
        long[] ar = new long[length];

        for (int i = 1; i <= length ; i++) {
            System.out.print("input number ke-"+i+" : " );
            long number = scanner.nextLong();
            ar[i - 1] = number;
        }
        System.out.println(aVeryBigSum.addNumbers(ar));
    }

    public static void differenceDiagonal() throws IOException {

        DifferenceDiagonal differenceDiagonal = new DifferenceDiagonal();

        System.out.print("length of matrix : ");
        int number = scanner.nextInt();

        List<List<Integer>> ar = new ArrayList<>();

        for (int i = 0; i < number ; i++) {

            System.out.print("input row-"+i+" : ");
            String array = bufferedReader.readLine();

            String[] splitArray = array.split(" ");

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < splitArray.length ; j++) {
                row.add(Integer.parseInt(splitArray[j]));
            }
            ar.add(row);
        }
        System.out.println(differenceDiagonal.difference(ar));
    }

    public static void plusMinus(){
        PlusMinus plusMinus = new PlusMinus();

        System.out.println("size : ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 1; i <= n ; i++) {
            System.out.println("input number-"+i+" : ");
            int number = scanner.nextInt();
            array[i-1] =number;
        }
        plusMinus.determinePlusMinus(array);
    }

    public static void stairCase(){

        StairCase stairCase = new StairCase();

        System.out.print("input height : ");
        int height = scanner.nextInt();

        stairCase.setTriangle(height);
    }

    public static void miniMaxSum(){

        MiniMaxSum miniMaxSum = new MiniMaxSum();

        System.out.print("input length of array : ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length ; i++) {
            System.out.println("number-"+i+" : ");
            int number = scanner.nextInt();

            array[i] = number;
        }
        miniMaxSum.determineMinMaxSum(array);
    }

    public static void countCandles(){
        BirthDayCakeCandles birthday = new BirthDayCakeCandles();

        System.out.print("age : ");
        int age = scanner.nextInt();

        int[] height = new int[age];

        for (int i = 1; i <= age ; i++) {
            System.out.println("height candle-"+i+" : ");
            int h = scanner.nextInt();

            height[i-1] = h;
        }
        System.out.println(birthday.candlesCake(height));
    }

    public static void timeConversation() throws IOException {

        TimeConversation timeConversation = new TimeConversation();

        System.out.print("input time : ");
        String time = bufferedReader.readLine();

        System.out.println(timeConversation.convertTime(time));

    }

    public static void countChocolate() {

        BirthdayChocolate birthdayChocolate = new BirthdayChocolate();

        System.out.print("birth month : ");
        int m = scanner.nextInt();

        System.out.print("birth day : ");
        int d = scanner.nextInt();

        System.out.print("how many chocolate bar ? ");
        int n = scanner.nextInt();
        List<Integer> bars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("bar-"+i+" : ");
            int bar = scanner.nextInt();
            bars.add(bar);
        }
        System.out.println(birthdayChocolate.chocolate(bars, d, m));
    }

    public static void divisibleSumPairs(){

        DivisibleSumPairs divisibleSumPairs = new DivisibleSumPairs();

        System.out.print("input length of array : ");
        int n = scanner.nextInt();

        System.out.print("input number : ");
        int k = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("number-"+i+" : ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        System.out.println(divisibleSumPairs.sumPairs(n, k, array));
    }

    public static void migratoryBird(){

        MigratoryBirds migratoryBirds = new MigratoryBirds();

        System.out.print(" input n : ");
        int n = scanner.nextInt();

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.print("bird type-"+i+" : ");
            int type = scanner.nextInt();
            array.add(type);
        }

        System.out.println(migratoryBirds.birdsType(array));
    }

    public static void dayOfTheProgrammer(){
        DayOfTheProgrammer dayOfTheProgrammer = new DayOfTheProgrammer();

        System.out.print("input year : ");
        int year = scanner.nextInt();

        System.out.println(dayOfTheProgrammer.determineDay(year));
    }

    public static void bonAppetit(){
        BonAppetit bonAppetit = new BonAppetit();

        System.out.println("input the number of bills : ");
        int n = scanner.nextInt();

        System.out.println("index Anna not eat : ");
        int k = scanner.nextInt();

        List<Integer> bills = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println("input bill : ");
            int bill = scanner.nextInt();
            bills.add(bill);
        }
        System.out.println("Anna'is contribute : ");
        int b = scanner.nextInt();

        bonAppetit.getReturnMoney(bills, k, b);
    }

    public static void electronicShop(){
        ElectronicShop electronicShop = new ElectronicShop();

        System.out.print("input budget : ");
        int budget = scanner.nextInt();

        System.out.print("length keyboards : ");
        int keyboard = scanner.nextInt();

        System.out.print("length drives : ");
        int drive = scanner.nextInt();

        int[] keyboards = new int[keyboard];
        int[] drives = new int[drive];

        for (int i = 0; i < keyboard ; i++) {
            System.out.println("price keyboard-"+i+" : ");
            int k = scanner.nextInt();
            keyboards[i] = k;
        }

        for (int i = 0; i < drive ; i++) {
            System.out.println("price drive-"+i+" : ");
            int k = scanner.nextInt();
            drives[i] = k;
        }

        System.out.println(electronicShop.maximumCharge(budget,keyboards, drives));
    }
}
