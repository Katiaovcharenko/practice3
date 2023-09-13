import java.util.*

fun main(args: Array<String>)
{
    //1
    val myAge = 18
    val isTeenager = myAge in 13..19 //проверка являются ли оба человека подростками
    println("Являюсь ли я подростком? $isTeenager")

    //2
    val theirAge = 30

    // проверяем являются ли оба человека подростками
    val bothTeenagers = (myAge in 13..19) && (theirAge in 13..19)
    println("Оба мы подростки? $bothTeenagers")

    //3
    val reader = "Kate"
    val author = "Richard Lucas"
    val authorIsReader = reader == author // проверка, равны ли reader и author
    println("Автор и читатель одно и тоже лицо? $authorIsReader")

    //4
    val readerBeforeAuthor = reader < author // проверка, следует ли reader перед author по алфовиту
    println("Читатель перед Автором по алфавиту? $readerBeforeAuthor")

    //5
    val myAge2 = 18

    /*используем if для проверки,находится ли в переменной myAge2 в диапозоне от 13 до 19
      Если значение входит в этот диапозон, выводится сообщение "Подросток" иначе "Не подросток"
     */
    if (myAge2 in 13..19)
    {
      println("Подросток")
    }
    else
    {
      println("Не подросток")
    }

    //6

    //однострочное выражение if-else
    val answer = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)

    //7
    var counter = 0

    // в цикле выполняется до тех пор, пока значение counter меньше 10
    while (counter < 10)
    {
        println("Counter = $counter")
        counter++
    }

    //8
    var counter1 = 0
    var roll = 0
    do
    {
      roll = Random().nextInt(6) //получения случайного значения меджу 0 и 5
      counter1++ //увеличения счётчика на 1
      println("После $counter1 броска, roll = $roll")
    }
        while (roll != 0) //цикл будет выполняться, пока roll не станет = 0

    //9
        //с помощью константы определяем интервал от 1 до 10
        val range = 1..10

    /* переменная number будет последовательно
       принимать значения из интервала range
       Внутри цикла мы вычисляем квадрат каждого числа
       умножая его самого на себя и сохраняем результатв переменную square
     */
    for (number in range)
    {
      val square = number * number
      println("Квадрат числа $number: $square")
    }
}