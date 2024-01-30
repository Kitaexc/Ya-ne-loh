import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Hehe
{
    public static void main(String[] args)
    {
        while (true){

            Scanner vvod = new Scanner(System.in);
            System.out.println("Привет пользователь, у повара Ашота случилась трагедия,\nв его книги рецептов пропали все грамовки блюд:(\nПомоги Ашоту вспомнить грамовки его рецептов!  ");
            System.out.println("1. Помочь Ашоту");
            System.out.println("2. Пусть сам свои рецепты вспоминает!");
            try {
                int num = vvod.nextInt();

                if (num == 1){
                    One();
                    break;
                }
                else if (num == 2){
                    System.out.println("Туда его, совсем обленился!");
                    break;
                }
                else {
                    System.out.println("Ты не тупой, все ошибаются ^_^");
                }
            }
            catch (Exception exception) {
                System.out.println("Ты не тупой, все ошибаются ^_^");
            }
        }
    }
    public static void One(){
        Scanner vvod = new Scanner(System.in);
        System.out.println("Добро пожаловать в легендарную книгу рецептов :D");
        System.out.println("------------------------------------------------");
        System.out.println("               *** Рецепты ***");
        System.out.println("1. Салат карпачо");
        System.out.println("2. Суп рассольник");

        try {

            int num = vvod.nextInt();
            switch (num) {
                case 1:
                    Karpacho();
                    break;
                case 2:
                    Rassolnik();
                    break;
            }
        }
        catch (Exception exception){
            System.out.println("Ты не тупой, все ошибаются ^_^");
        }
    }
    public static void Karpacho(){
        Scanner vvod = new Scanner(System.in);
        System.out.println("И так, основой этого салата служит грудка корпачо, сколько надо грамм? ");
        int grudka = vvod.nextInt();
        System.out.println("Теперь не менее важный ингридиент, это морковка по корейский ");
        int morkva = vvod.nextInt();
        System.out.println("Куда же салат и без кукурузки? ");
        int kukuruza = vvod.nextInt();
        System.out.println("В этом рецепте как и в рассольнке, тоже огурчики, но на этот раз корнюшоны ");
        int ogurec = vvod.nextInt();
        System.out.println("Лучок, желательно бочок, но тут выбираешь ты ");
        int luk = vvod.nextInt();
        System.out.println("Царь всех салатов, его величество майонез ");
        int mazik = vvod.nextInt();


        System.out.println("Хотите ли вы сохранить данные? (Да/Нет)");
        String response = vvod.next();

        if (response.equalsIgnoreCase("Да")) {
            try {
                PrintWriter writer = new PrintWriter("Korpaho.txt");
                writer.println("Куриная грудка карпачо: " + grudka + " грамм");
                writer.println("Марковь по карейски: " + morkva + " грамм");
                writer.println("Кукуруза консервированная: " + kukuruza + " грамм");
                writer.println("Огурец корнюшон маринованый: " + ogurec + " грамм");
                writer.println("Майонез : " + mazik + " грамм");
                writer.println("Лук репчатый: " + luk + " грамм");
                writer.println("");
                writer.println("Рецепт приготовления: ");
                writer.println("Сырокопчёную грудку корпачо режем мелкими кубиками, добовляем кукурузу из банки,");
                writer.println("нарезаем корнишоны кружочками, добовляем заранее подготовленную морковь по керейски.");
                writer.println("Нарезаем и обжариваем лук на сливочном масле, затем добавлем его вместе с майонезом в салат,");
                writer.println("тчательно перемешиваем и салат готов.");
                writer.close();
                System.out.println("Рецепт сохранён в файл 'Korpaho.txt'.");
                One();
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка при записи файла.");
            }
        } else {
            System.out.println("Хорошо попробуйте снова :D");
            One();

        }
        String str = """
                asdasd """ + mazik + """
                """;


    }
    public static void Rassolnik(){

        Scanner vvod = new Scanner(System.in);
        System.out.println("Сколько литров воды нужно? ");
        int voda = vvod.nextInt();
        System.out.println("Сколько грамм мяса нужно для наваристого бульёна? ");
        int miso = vvod.nextInt();
        System.out.println("Сколько грам радиационных салёных огурчиков? ");
        int ogurec = vvod.nextInt();
        System.out.println("В супе должен быть пропареный рис, сколько грамм? ");
        int ris = vvod.nextInt();
        System.out.println("Сколько грамм картохи мы будем добавлять? ");
        int potato = vvod.nextInt();
        System.out.println("Теперь лук, скока грамм? ");
        int luk = vvod.nextInt();
        System.out.println("Морковка тоже нужна, сколько добавим? ");
        int morkva = vvod.nextInt();
        System.out.println("И помидорки так-то тоже, сколько грамм? ");
        int tomato = vvod.nextInt();
        System.out.println("На последок чуть чуть специй, их нужно совсем немного, сколько грамм? ");
        int specii = vvod.nextInt();
        System.out.println("Ну и когда все уже готово сверху чуток зеленушки, сколько грамм?");
        int zelen = vvod.nextInt();

        System.out.println("Хотите ли вы сохранить данные? (Да/Нет)");
        String response = vvod.next();

        if (response.equalsIgnoreCase("Да")) {
            try {
                PrintWriter writer = new PrintWriter("rasollnik.txt");
                writer.println("Вода: " + voda + " литров");
                writer.println("Мясо: " + miso + " грамм");
                writer.println("Огурец солёный: " + ogurec + " грамм");
                writer.println("Рис пропаренный: " + ris + " грамм");
                writer.println("Картошка: " + potato + " грамм");
                writer.println("Лук репчатый: " + luk + " грамм");
                writer.println("Морковь: " + morkva + " грамм");
                writer.println("Помидор свежий: " + tomato + " грамм");
                writer.println("Специи: " + specii + " грамм");
                writer.println("Зеленушка: " + zelen + " грамм");
                writer.println("");
                writer.println("Рецепт приготовления: ");
                writer.println("Сначала нужно приготовить бульон, ставим на плиту кастрюлю с тремя литрами воды, и погружаем туда месо на кости,");
                writer.println("затем дождавшись когда вода закипит, снимаем пенку и сразу трем соленые огурцы. Накрыть крышко и варить около полутра часа. ");
                writer.println("В то время пока готовиться бульон, следует замочить пропаренный рис, почистить и нарезать картошку и подготовить овощи: лук и морковь. ");
                writer.println("После того как бульон готов, следует достать мясо шумовкой, в готовый бульон засыпать рис картошку лук и марковь, и дать покипеть 20 - 30 минут.");
                writer.println("затем добавить помидорчик и приправы. Мясо которое мы достали заранее режеться на порционные кусочки и добовляется в самом конце,");
                writer.println("а также соль по вкусу. и дать повариться еще 5 - 7 минут, после чего лучший на свете рассольник готов. ");
                writer.close();
                System.out.println("Рецепт сохранён в файл 'rasollnik.txt'.");
                One();
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка при записи файла.");
            }
        } else {
            System.out.println("Хорошо попробуйте снова :D");
            One();
        }
    }
}
