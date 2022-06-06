public class Main {


        public static void main(String [] args){

// первая задача

            byte watermelone = 1;
            short apples = 130;
            int seeds = 1000;
            long sand = 2000L;

            float digger = 1.5f;
            double Pi = 3.14;

// вторая задача

            float firstFighter = 78.2f;
            float secondFighter = 82.7f;
            float totalWeight = firstFighter + secondFighter;
            System.out.println("Общий вес двух боксеров: "+ totalWeight +" кг");
            float weightDifference = secondFighter % firstFighter;
            System.out.println("Разница в весе бойцов составляет " + weightDifference + " кг");

// третья задача

            int bananaWeight = 80;
            int bananasWeight = bananaWeight * 5;
            int milkVolume = 200;
            float totalMilkWeight = milkVolume * 1.05f;
            int iceCreamWeight = 100;
            int totalIceCreamWeight = iceCreamWeight * 2;
            int eggWeight = 70;
            int eggsWeight = eggWeight *4;

            float totalProductsWeight = bananasWeight + totalMilkWeight + totalIceCreamWeight + eggsWeight;
            System.out.println("Общий вес продуктов: "+ totalProductsWeight + " гр");

            float totalProdWeightInKg = totalProductsWeight / 1000f;
            System.out.println("Общий вес продуктов: " + totalProdWeightInKg + " кг");

// четвертая задача

            int resultInKg = 7;
            int resultInGr = resultInKg * 1000;
            int minWeightLoss = 250;
            int maxWeightLoss = 500;
            int longWeightLoss = resultInGr / minWeightLoss;
            System.out.println("В худшем случае спортсмен худеет за "+ longWeightLoss + " дней");
            int fastWeightLoss = resultInGr / maxWeightLoss;
            System.out.println("В лучшем случае спортсмен худеет за " + fastWeightLoss + " дней");
            int averNumOfDayWeightLoss = (longWeightLoss + fastWeightLoss) / 2;
            System.out.println("Среднее количество дней похудения: "+ averNumOfDayWeightLoss + "дней");

// пятая задача

            int salaryMasha = 67_760;
            int salaryDenis = 83_690;
            int salaryKristina = 76_230;

            float newSalaryMasha = salaryMasha * 1.1f;
            System.out.println("После повышения зарплата Маши составит: " + newSalaryMasha + " руб.");
            float newSalaryDenis = salaryDenis * 1.1f;
            System.out.println("После повышения зарплата Дениса составит: " + newSalaryDenis + " руб.");
            float newSalaryKristina = salaryKristina * 1.1f;
            System.out.println("После повышения зарплата Кристины составит: " + newSalaryKristina + " руб.");

            int annualIncomeMasha = salaryMasha * 12;
            int annualIncomeDenis = salaryDenis * 12;
            int annualIncomeKristine = salaryKristina * 12;
            float newAnnualIncomeMasha = newSalaryMasha * 12;
            float newAnnualIncomeDenis = newSalaryDenis * 12;
            float newAnnualIncomeKristina = newSalaryKristina * 12;
            float incomeDiffMasha = newAnnualIncomeMasha - annualIncomeMasha;
            float incomeDiffDenis = newAnnualIncomeDenis - annualIncomeDenis;
            float incomeDiffKristina = newAnnualIncomeKristina - annualIncomeKristine;
            System.out.println("Теперь Маша получает "+ newSalaryMasha +" руб. Ее доход вырос на " + incomeDiffMasha);
            System.out.println("Теперь Денис получает "+ newSalaryDenis +" руб. Его доход вырос на " + incomeDiffDenis);
            System.out.println("Теперь Кристина получает "+ newSalaryKristina +" руб. Ее доход вырос на " + incomeDiffKristina);







        }

    }



