public class Test {

    public static void main(String[] args) {

        System.out.println("--- Question 1: Salary Increment (+) ---");
        int priyaInitialSalary = 25000;
        int increment = 5000;
        int priyaFinalSalary = priyaInitialSalary + increment;
        System.out.println("Priya's Initial Salary: Rs. " + priyaInitialSalary);
        System.out.println("Increment: Rs. " + increment);
        System.out.println("Final Salary: Rs. " + priyaFinalSalary + "\n");

        System.out.println("--- Question 2: Book Purchase (*, -) ---");
        int arunWallet = 5000;
        int numBooks = 4;
        int bookPrice = 350;
        int totalBookCost = numBooks * bookPrice;
        int arunRemainingWallet = arunWallet - totalBookCost;
        System.out.println("Arun's Initial Wallet: Rs. " + arunWallet);
        System.out.println("Total Cost of Books: Rs. " + totalBookCost);
        System.out.println("Remaining Balance: Rs. " + arunRemainingWallet + "\n");

        System.out.println("--- Question 3: Mobile Recharge (-) ---");
        int sureshWallet = 1200;
        int rechargeAmount = 399;
        int sureshRemainingWallet = sureshWallet - rechargeAmount;
        System.out.println("Suresh's Initial Wallet: Rs. " + sureshWallet);
        System.out.println("Recharge Amount: Rs. " + rechargeAmount);
        System.out.println("Remaining Balance: Rs. " + sureshRemainingWallet + "\n");

        System.out.println("--- Question 4: Chocolate Purchase (*, -) ---");
        int nehaWallet = 800;
        int numChocolates = 6;
        int chocolatePrice = 45;
        int totalChocolateCost = numChocolates * chocolatePrice;
        int nehaRemainingWallet = nehaWallet - totalChocolateCost;
        System.out.println("Neha's Initial Wallet: Rs. " + nehaWallet);
        System.out.println("Total Cost of Chocolates: Rs. " + totalChocolateCost);
        System.out.println("Remaining Balance: Rs. " + nehaRemainingWallet + "\n");

        System.out.println("--- Question 5: Bonus Amount (+) ---");
        int kavyaSalary = 32000;
        int bonus = 7000;
        int kavyaTotalSalary = kavyaSalary + bonus;
        System.out.println("Kavya's Initial Salary: Rs. " + kavyaSalary);
        System.out.println("Bonus Received: Rs. " + bonus);
        System.out.println("Total Salary: Rs. " + kavyaTotalSalary + "\n");

        System.out.println("--- Question 6: Student Distribution (/) ---");
        int totalStudents = 240;
        int numberOfClasses = 12;
        int studentsPerClass = totalStudents / numberOfClasses;
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Number of Classes: " + numberOfClasses);
        System.out.println("Students in each Class: " + studentsPerClass + "\n");

        System.out.println("--- Question 7: Chocolate Distribution (%) ---");
        int rahulChocolates = 53;
        int numberOfFriends = 5;
        int remainingChocolates = rahulChocolates % numberOfFriends;
        System.out.println("Total Chocolates: " + rahulChocolates);
        System.out.println("Number of Friends: " + numberOfFriends);
        System.out.println("Remaining Chocolates: " + remainingChocolates + "\n");

        System.out.println("--- Question 8: Laptop Cashback (+) ---");
        int kiranWallet = 15000;
        int cashback = 2500;
        int kiranFinalWallet = kiranWallet + cashback;
        System.out.println("Kiran's Initial Wallet: Rs. " + kiranWallet);
        System.out.println("Cashback Received: Rs. " + cashback);
        System.out.println("Final Wallet Balance: Rs. " + kiranFinalWallet + "\n");

        System.out.println("--- Question 9: Rice Bag Packing (/, %) ---");
        int totalRiceBags = 95;
        int truckCapacity = 9;
        int fullLoads = totalRiceBags / truckCapacity;
        int remainingRiceBags = totalRiceBags % truckCapacity;
        System.out.println("Total Rice Bags: " + totalRiceBags);
        System.out.println("Number of Full Loads: " + fullLoads);
        System.out.println("Remaining Rice Bags: " + remainingRiceBags + "\n");

        System.out.println("--- Question 10: Juice Bottle Packing (*, -, /, %) ---");
        int storeMoney = 5000;
        int juiceBottlesBought = 12;
        int juiceBottlePrice = 120;
        int boxes = 5;

        int totalPurchaseAmount = juiceBottlesBought * juiceBottlePrice;
        int storeRemainingMoney = storeMoney - totalPurchaseAmount;
        int bottlesInEachBox = juiceBottlesBought / boxes;
        int remainingBottles = juiceBottlesBought % boxes;

        System.out.println("Total Purchase Amount: Rs. " + totalPurchaseAmount);
        System.out.println("Remaining Money: Rs. " + storeRemainingMoney);
        System.out.println("Bottles in Each Box: " + bottlesInEachBox);
        System.out.println("Remaining Bottles: " + remainingBottles);
    }
}