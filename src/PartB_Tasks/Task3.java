package PartB_Tasks;

//3. Дан текст. Нужно подсчитать количество слов и предложений в тексте. Результат вывести в консоль.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Введите текст состоящий из несколько предложений:");
        String vvod = text.nextLine();
        int word = 0;
        int sntnc = 0;

        if (vvod.length() != 0){
            word++;
            for (int w = 0; w < vvod.length(); w++) {
                if(vvod.charAt(w) == ' '){
                    word++;
                }
            }
        }

        if (vvod.length() != 0) {
            for (int s = 0; s < vvod.length() -1; s++) {
                if(vvod.charAt(s+1) == '.'||vvod.charAt(s+1) == '!' ||vvod.charAt(s) == '?')
                {
                    sntnc++;
                }
            }
        }

        System.out.println("Вы ввели "+word+" слов(а).");
        System.out.println("Вы ввели "+sntnc+" предложения.");
    }
}

