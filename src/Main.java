public class Main {
    public static void main(String[] args) {

    Random r = new Random();
    //Задача 1
        for (int i = 0; i < r.arr.length; i++) {// предположим что этот цикл выводит траты за месяц и генерирует их со-
            System.out.println(r.arr[i]);//ответственно тоже он.
        }
        int summForMount = 0;
        for (int i = 0; i < r.arr.length; i++) {
            summForMount += r.arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summForMount);//а вы можете мне в обратной связи написать
        //возмонж есть какая то команда которая в выводе в консоле разделяет число по 3 знака, что бы читать было удобней
        //Задание 2

        int min = r.arr[0];//минимальное значение приравниеваем к массиву
        int max = r.arr[0];//максимальное тоже что бы все было кошерно))
        for (int i = 0; i < r.arr.length; i++) {
            if(r.arr[i]>max){
                max=r.arr[i];
            }
            if(r.arr[i]<min){
                min = r.arr[i];
            }
        }
        System.out.println("Максимальное число в массиве равно " + max);
        System.out.println("Минимальное число в массиве равно " + min);

        //Задание 3

        double medianSumm = summForMount / r.arr.length;
        System.out.println("Средняя сумма которую тратит компания в месяц составляет " + medianSumm);
        //хз как суда цикл пилить, вроде и не требуется, но если что пишите, ещё подумаю)
        //Задание 4
        char tmp;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            tmp =reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i- 1] ;
            reverseFullName[reverseFullName.length - i- 1]  = tmp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }//а можно какую нибудь кратенькую инструкцию по опльзованию отладчиков в ИДЕИ а то прокопался долго из за того
    }//что не умею им тут пользоваться

}