class DataTypes {
    public static void main(String[] args) {
        byte age = 17;
        short year = 2025;
        int salary = 100000;
        long population = 7800000000L;
        float pi = 3.14f;
        double gravity = 9.80665;
        char initial = 'U';
        boolean isCoding = true;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        System.out.println("Initial: " + initial);
        System.out.println("Is coding? " + isCoding);
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else {
            System.out.println("Keep Improving");
        }


        int day = 3;

        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }

        for (int i = 1; i <= 5; i++) {
             System.out.println("Count: " + i);
        }
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }
        do {
            System.out.println("Run at least once");
            i++;
        } while (i <= 8);

            for (int j = 1; j <= 10; j++) {
            if (j == 5) break; // stops at 5
            System.out.println(i);
        }
        for (int l = 1; l <= 5; l++) {
            if (l == 3) continue; // skips 3
            System.out.println(i);
        }



    }
}
