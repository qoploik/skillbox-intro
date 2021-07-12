public class main {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Система расчета штрафов");

        int carSpeed = 105;

        boolean isTown;
        isTown = false;


        int fineFor1to10 = 15;
        int fineFor11to15 = 25;
        int fineFor16to20 = 35;
        int fineFor21to25 = 80;
        int fineFor26to30 = 100;
        int fineFor31to40 = 160;
        int fineFor41andMore = 500;

        int fineFor1to10C = 10;
        int fineFor11to15C = 20;
        int fineFor16to20C = 30;
        int fineFor21to25C = 70;
        int fineFor26to30C = 80;
        int fineFor31to40C = 120;
        int fineFor41andMoreC = 160;
        //int fineFor51to60C = 240;
        //int fineFor61to70C = 440;
        //int fineFor70andMore = 600;

        int townSpeed = 50;
        int countrySpeed = 90;

        int overSpeedT = carSpeed - townSpeed;
        int overSpeedC = carSpeed - countrySpeed;



        if (isTown = true) {
            if (overSpeedT >= 1 && overSpeedT <= 10) {
                System.out.println("Speed was overtaken " + fineFor1to10);
            }
            else if (overSpeedT > 10 && overSpeedT <= 16) {
                System.out.println("Штраф: " + fineFor11to15 + " you are an idiot");
            }
            else if (overSpeedT > 16 && overSpeedT <= 21) {
                System.out.println("Штраф: " + fineFor16to20 + " really idiot");
            }
            else if (overSpeedT > 21 && overSpeedT <= 26) {
                System.out.println("Штраф: " + fineFor21to25 + " cheeel...");
            }
            else if (overSpeedT > 26 && overSpeedT <= 31) {
                System.out.println("Штраф " + fineFor26to30 + " durancheus");
            }
            else if (overSpeedT > 31 && overSpeedT <= 40) {
                System.out.println("Штраф " + fineFor31to40 + " + 2 штраф балла + 1 месяц лишение прав");
            }
            else if (overSpeedT > 40) {
                System.out.println("Штраф " + fineFor41andMore + " + 2 штраф балла + 1 месяц лишение прав");
            }
            }
        if (isTown = false) {
            if (overSpeedC >= 1 && overSpeedC <= 11) {
                System.out.println("Speed was overtaken " + fineFor1to10C + " in country");
            }
            else if (overSpeedC > 11 && overSpeedC <= 16) {
                System.out.println("Штраф: " + fineFor11to15C + " country you are an idiot");
            }
            else if (overSpeedC > 16 && overSpeedC <= 21) {
                System.out.println("Штраф: " + fineFor16to20C + " country really idiot");
            }
            else if (overSpeedC > 21 && overSpeedC <= 26) {
                System.out.println("Штраф: " + fineFor21to25C + " country cheeel...");
            }
            else if (overSpeedC > 26 && overSpeedC <= 31) {
                System.out.println("Штраф " + fineFor26to30C + " country");
            }
            else if (overSpeedC > 31 && overSpeedC <= 40) {
                System.out.println("Штраф " + fineFor31to40C + " country + 2 штраф балла + 1 месяц лишение прав");
            }
            else if (overSpeedC > 40) {
                System.out.println("Штраф " + fineFor41andMoreC + " country + 2 штраф балла + 1 месяц лишение прав");
            }
        }
    }
}