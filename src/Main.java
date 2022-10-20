public class Main {
    public static void main(String[] args) {

    Random random = new Random();
    //Задача 1
        for (int i = 0; i < random.arr.length; i++) {// предположим что этот цикл выводит траты за месяц и генерирует их со-
            System.out.println(random.arr[i]);//ответственно тоже он.
        }
        int summForMount = 0;
        for (int i = 0; i < random.arr.length; i++) {
            summForMount += random.arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summForMount);//а вы можете мне в обратной связи написать
        //возмонж есть какая то команда которая в выводе в консоле разделяет число по 3 знака, что бы читать было удобней
        //Задание 2

        int min = random.arr[0];//минимальное значение приравниеваем к массиву
        int max = random.arr[0];//максимальное тоже что бы все было кошерно))
        for (int i = 0; i < random.arr.length; i++) {
            if(random.arr[i]>max){
                max=random.arr[i];
            }
            if(random.arr[i]<min){
                min = random.arr[i];
            }
        }
        System.out.println("Максимальное число в массиве равно " + max);
        System.out.println("Минимальное число в массиве равно " + min);

        //Задание 3

        double averageSumm = summForMount / random.arr.length;
        System.out.println("Средняя сумма которую тратит компания в месяц составляет " + averageSumm);
        //хз как суда цикл пилить, вроде и не требуется, но если что пишите, ещё подумаю)
        ///Задание 4
        char tmp;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, j = reverseFullName.length - i - 1;i < reverseFullName.length; i++,j--) {
            if(i<reverseFullName.length/2) {
                tmp = reverseFullName[i];
                reverseFullName[i] = reverseFullName[j];
                reverseFullName[j] = tmp;
            }
            System.out.print(reverseFullName[i]);
        }


    }//что не умею им тут пользоваться


}