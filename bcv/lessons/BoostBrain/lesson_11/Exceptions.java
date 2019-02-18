package com.bcv.lessons.BoostBrain.lesson_11;

/*
Обработка ошибок
1. Ошибки есть почти в любой программе.
2. Иногда ошибки бывают не только в программе, но и в окружающей среде - операционной системе, аппаратном обеспечении, других программах.
3. Надежность программы зависит не только от количества ошибок в ней, но и от того, насколько хорошо программа реагирует на возникновение ошибочных ситуаций.
4. Некоторые ошибки все таки должны приводить к завершению программы.

Исключения
1. Исключение - это объект, который описывает произошедшую исключительную ситуацию.
2. Исключения делятся на проверяемые(сМескес!) и непроверяемые (unchecked).
3. Компилятор принудительно заставляет программиста обрабатывать проверяемые исключения.
4. Если забыть про непроверяемые исключения, то они могут завалить программу.
5. Перехватить исключение можно с помощью блока try{} catch(){}
6. С помощью ключевого слова throws можно указать, какие исключени могут возникнуть в методе класса.
7. Выбросить исключения можно с помощью ключевого слова throw
*/


public class Exceptions {

    public static void main(String[] args)  {
	//создаем новый объект класса  
	Example example = new Example();
	//обрабатываем исключение с помощью try catch
	try {
	    //пробуем воспользоваться методом
	    example.method1();
	    
	    example.method2();
	    //перехватываем исключение и объект исключения внутри блока catch представлен переменной е
	//} catch (Exception e)
	}catch (ExampleException e){
	    System.out.println(e.getMyText());
	}catch (NewException e) {
	System.out.println(e.toString());
    }
}
}