package ru.netology.graphics;

import ru.netology.graphics.image.ConverterImpl;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new ConverterImpl(); // Создайте тут объект вашего класса конвертера

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Сохраняем в файл:
        PrintWriter fileWriter = new PrintWriter("converted-image.txt");

        converter.setMaxWidth(200); //размер ширина, выбросит исключение, картинка большая
        converter.setMaxHeight(300); // размер высота, выбросит исключение, картинка большая
//      converter.setMaxRatio(2);  // максимально допустимое соотношение сторон картинки


        fileWriter.write(converter.convert("http://www.cartoonbucket.com/wp-content/uploads/2015/05/Laughing-Image-Of-Tom-And-Jerry.jpg"));
//      fileWriter.write(converter.convert("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQxpwvg7naSm6-zUBnchHhwK_PffIE5LMEyA&usqp=CAU"));
//       fileWriter.write(converter.convert("https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png"));

        fileWriter.close();

        // Выводим в КОНСОЛЬ:
        String url = "http://www.cartoonbucket.com/wp-content/uploads/2015/05/Laughing-Image-Of-Tom-And-Jerry.jpg";
//        String url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQxpwvg7naSm6-zUBnchHhwK_PffIE5LMEyA&usqp=CAU";
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}

//   1   http://www.cartoonbucket.com/wp-content/uploads/2015/05/Laughing-Image-Of-Tom-And-Jerry.jpg   ТОМ И ДЖЕРИ
//   2   https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQxpwvg7naSm6-zUBnchHhwK_PffIE5LMEyA&usqp=CAU  КОТ
//   3   https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png   ТЕСТ