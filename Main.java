package by.htp.task3.main;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		// 1. Необходимо вывести на экран числа от 1 до 5
		int i;
		System.out.print("Задача 1. ");
		for (i = 1; i < 5; i++) {
			System.out.print(i + ", ");
		}
		System.out.print(i+"\n");
		
		// 2.  Необходимо вывести на экран числа от 5 до 1
		System.out.print("Задача 2. ");
		for (i = 5; i > 1; i--) {
			System.out.print(i + ", ");
		}
		System.out.print(i+"\n");
		
		// 3.  Необходимо вывести на экран таблицу умножения на 3: 
		System.out.println("Задача 3. Ответ:");
		for (i = 1; i <= 10; i++) {
			System.out.println("---> 3 x " + i + " = "+ i*3);
		}
		
		// 4.  С помощью оператора while напишите программу вывода всех четных чисел 
		//     в диапазоне от 2 до 100 включительно
		i = 1;
		System.out.println("Задача 4. Ответ:");
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.print( i + ", ");
			}
			i++;
		}
		System.out.print( i + " \n" );
		
		// 5.  С помощью оператора while напишите программу определения суммы 
		//     всех нечетных чисел в диапазоне от 1 до 99 включительно
		i = 1;
		int sum = 0;
		while (i < 100) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Задача 5. Сумма всех нечетных чисел в диапазоне от 1 до 99 включительно равна " + sum);
		
		// 6.  Напишите программу, где пользователь вводит любое целое положительное число. 
		//     А программа суммирует все числа от 1 до введенного пользователем числа
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите любое целое положительное число: ");
        }
        i = sc.nextInt();
        while (i <= 0) {
        	System.out.print("Введите любое целое положительное число: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите любое целое положительное число: ");
            }
            i = sc.nextInt();
        }
        int count = 1;
		sum = 0;
		while (count <= i) {
			sum = sum + count;
			count++;
		}
		System.out.println("Задача 6. Сумма всех чисел от 1 до "+i+" равна " + sum);
		
		// 7. Вычислить значения функции на отрезке [а,b] c шагом h
		double a = 0.7;
		double b = 4.2;
		double h = 0.4;
		System.out.print("Задача 7. Значения функции на отрезке от "+a+" до "+b+" с шагом "+h+" равны: ");
		for (double m = a; m <= b; m = m + h) {
			if (m <= 2) {
				System.out.print(-1*m + ", ");
			} else {
				System.out.print(m + ", ");
			}
		}
		System.out.print("\n");
		
		// 8. Вычислить значения функции на отрезке [а,b] c шагом h: 
		// !!! Используем переменные a, b и h из задачи  №7 !!!
		double c = 10;
		System.out.print("Задача 8. Значения функции на отрезке от "+a+" до "+b+" с шагом "+h+" равны: ");
		for (double m = a; m <= b; m = m + h) {
			if (m == 15) {
				System.out.print((m+c)*2 + ", ");
			} else {
				System.out.print((m-c)+6 + ", ");
			}
		}
		System.out.print("\n");
		
		// 9. Найти сумму квадратов первых ста чисел
		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum = sum + i*i;
		}
		System.out.println("Задача 9. Сумма квадратов первых ста чисел равна " + sum);
		
		// 10. Составить программу нахождения произведения квадратов первых двухсот чисел
		BigInteger val;
		BigInteger result2;
		result2 = new BigInteger("1");
		for (i = 1; i <= 200; i++) {
			int square = i*i;
			String str = Integer.toString(square);
			val = new BigInteger(str);
			result2 = result2.multiply(val);
		}
		System.out.println("Задача 10. Произведение квадратов первых двухсот чисел равно " + result2);
		
		// 11. Составить программу нахождения разности кубов первых двухсот чисел
		int diff = 1;
		for (i = 2; i <= 200; i++) {
			diff = diff - i*i*i;
		}
		System.out.println("Задача 11. Разность кубов первых двухсот чисел равна " + diff);
		
		// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 
		//     Составьте программу нахождения произведения первых 10 членов этой последовательности
		int a1 = 1;
		System.out.print("Задача 12. Ответ: ");
		for (i = 1; i < 10; i++) {
			System.out.print(a1 + ", ");
			a1 = a1 + 6;
		}
		System.out.print(a1+ "\n");

		// 13.  Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5
		a = -5;
		b = 5;
		h = 0.5;
		double m = a;
		System.out.print("Задача 13. Значения функции: ");
		for (m = a; m < b; m = m + h) {
			System.out.print(m + ", ");
		}
		System.out.print(m + "\n");
		
		// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
		int n = 15;
		double summa = 0;
		for (m = 1; m <= n; m++) {
			summa = summa + 1/m;
		}
		System.out.println("Задача 14. Ответ: " + summa);
		
		// 15.  Вычислить : 1+2+4+8+...+ 2 в 10 степени
		summa = 0;
		for (i = 0; i <= 10; i++) {
			summa = summa + Math.pow(2, i);
		}
		System.out.println("Задача 15. Ответ: " + summa);
		
		// 16.  Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
		sum = 1;
		long sum2 = 1;
		for (i = 2; i <= 10; i++) {
			sum = sum + i;
			sum2 = sum2 * sum;
		}
		System.out.println("Задача 16. Ответ: " + sum2);
		
		// 17.  Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		double varA = 2.25;
		int varN = 5;
		summa = varA; // double
		double itog = 1;
		for (i = 0; i < varN; i++) {
			summa = varA + i;
			itog = itog*summa;
		}
		System.out.println("Задача 17. Ответ: " + itog);
		
		// 18. Даны числовой ряд и некоторое число е. 
		//     Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
		varN = 15; // int
		double e = 0.245;
		itog = 0; // double
		for (i = 1; i < varN; i++) {
			summa = (Math.pow(-1, i)/i);
			if (Math.abs(summa) >= e) {
				itog = itog + Math.abs(summa);
				
			}
		}
		System.out.println("Задача 18. Ответ: " + itog);
		
		// 19. Даны числовой ряд и некоторое число е. 
		//     Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
		varN = 15; // int
		e = 0.245; // double
		itog = 0; // double
		for (i = 1; i < varN; i++) {
			summa = (double)1/(Math.pow(2, i) + 1/Math.pow(3, i));
			if (Math.abs(summa) >= e) {
				itog = itog + Math.abs(summa);
				
			}
		}
		System.out.println("Задача 19. Ответ: " + itog);
		
		// 20. Даны числовой ряд и некоторое число е. 
		//     Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
		varN = 15; // int
		e = 0.015; // double
		itog = 0; // double
		summa = 0; // double
		for (i = 1; i < varN; i++) {
			summa = (double)1/( ( 3*i - 2 ) * ( 3*i + 1 ) );
			if (Math.abs(summa) >= e) {
				itog = itog + Math.abs(summa);
				
			}
		}
		System.out.println("Задача 20. Ответ: " + itog);
		
		// 21.  Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
		//      Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
		//      второй - соответствующие значения функции: F(x) = x - sin(x)
		a = -0.5; // double
		b = 2; // double
		h = 0.5; // double
		System.out.println("Задача 21. Ответы: ");
		for (m = a; m <= b; m = m + h) {
			System.out.println("---> x = "+m+", F("+m+") = "+ (m - Math.sin(m)));
		}
		
		// 22. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
		//     Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
		//     второй - соответствующие значения функции: 
		a = -0.5; // double
		b = 2; // double
		h = 0.5; // double
		System.out.println("Задача 22. Ответы: ");
		for (m = a; m <= b; m = m + h) {
			System.out.println("---> x = "+m+", F("+m+") = "+ Math.pow(Math.sin(m), 2));
		}
		
		// 23.  Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
		//      Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
		//      второй - соответствующие значения функции
		a = -0.5; // double
		b = 2; // double
		h = 0.5; // double
		System.out.println("Задача 23. Ответы: ");
		for (m = a; m <= b; m = m + h) {
			System.out.println("---> x = "+m+", F("+m+") = "+ (1/Math.tan(m/3) + Math.sin(m)/2));
		}
		
		// 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
		//     Преобразовать его в другое число, цифры которого будут следовать в обратном порядке 
		//     по сравнению с введенным числом
		varN = 1988; // int
		int varNcopy = varN;
		sum = 0; // int
		int varNew = 0;
		while (varN > 0) {
			int ostatok = varN % 10;
			varN = (varN / 10);
			if (ostatok % 2 == 0) {
				sum = sum + ostatok;
			}
			varNew = varNew * 10 + ostatok;
		}
		System.out.println("Задача 24. Ответы: ");
		System.out.println("---> Сумма четных цифр числа "+varNcopy+" равна "+sum);
		System.out.println("---> Число "+varNcopy+" в обратном порядке: "+varNew);
		
		// 25. Требуется определить факториал числа, которое ввел пользователь
		long factorial = 1;
		Scanner scan = new Scanner(System.in);
        System.out.print("Задача 25. Введите целое неотрицательное число: ");
        while(!scan.hasNextLong()) {
        	scan.next();
        	System.out.print("Задача 25. Введите целое неотрицательное число: ");
        }
        long varN3 = scan.nextLong();
        while (varN3 <= 0) {
        	System.out.print("Задача 25. Введите целое неотрицательное число: ");
            while(!scan.hasNextLong()) {
            	scan.next();
            	System.out.print("Задача 25. Введите целое неотрицательное число: ");
            }
            varN3 = scan.nextLong();
        }
        for (i = 1; i <= varN3; i++) {
        	factorial = factorial * i;
        }    
		System.out.println("Задача 25. Факториал числа "+varN3+" равен "+factorial);
		
		// 26.  Вывести на экран соответствий между символами и их численными обозначениями 
		//      в памяти компьютера (Таблицу ASCII)
		System.out.println("Задача 26. Ответы: ");
		char ch;
		for(ch = 'a'; ch<='z'; ch++) {
            System.out.print(ch + " ("+(byte)ch+"), ");
        }
		System.out.print("\n");
		
		// 27. Для каждого натурального числа в промежутке от m до n вывести все делители, 
		//     кроме единицы и самого числа. m и n вводятся с клавиатуры
		Scanner sc1 = new Scanner(System.in);
        System.out.print("Задача 27. Введите первое целое число промежутка: ");
        while(!sc1.hasNextInt()) {
        	sc1.next();
        	System.out.print("Задача 27. Введите первое целое число промежутка: ");
        }
        varN = sc1.nextInt();
        int varM;
        System.out.print("Задача 27. Введите второе целое число промежутка: ");
        while(!sc1.hasNextInt()) {
        	sc1.next();
        	System.out.print("Задача 27. Введите второе целое число промежутка: ");
        }
        varM = sc1.nextInt();
        while (varM <= varN) {
        	System.out.print("Задача 27. Введите целое число больше первого: ");
            while(!sc1.hasNextInt()) {
            	sc1.next();
            	System.out.print("Задача 27. Введите целое число больше первого: ");
            }
            varM = sc1.nextInt();
        }
        System.out.println();
		for (i = varN; i < varM; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("---> Число "+ i +" делится без остатка на "+ j);
				}
			}
		}
		
		// 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
		//     Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, 
		//     а также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл). 
		//     В качестве символа прекращения вычислений принять ‘0’.
		int varN1 = 1;
		while (varN1 != 0) {
			// Вводим первое число
			Scanner scan1 = new Scanner(System.in);
	        System.out.print("Задача 28. Введите первое целое число: ");
	        while(!scan1.hasNextInt()) {
	        	scan1.next();
	        	System.out.print("Задача 28. Введите первое целое число: ");
	        }
	        varN1 = scan1.nextInt();
	        if (varN1 == 0) {
	        	System.out.println("Задача 28. Конец работы программы!");
	        	break;
	        }
	        // Вводим второе число
	        Scanner scan2 = new Scanner(System.in);
	        System.out.print("Задача 28. Введите второе целое число: ");
	        while(!scan2.hasNextInt()) {
	        	scan2.next();
	        	System.out.print("Задача 28. Введите второе целое число: ");
	        }
	        int varN2 = scan2.nextInt();
	        // Вводим оператор
	        Scanner scan3 = new Scanner(System.in);
	        System.out.print("Задача 28. Введите действие (+, –, /, *): ");
	        while (!scan3.hasNext("[+-/*]")) {
	            System.out.print("Задача 28. Введите действие (+, –, /, *): ");
	            scan3.next();
	        }
	        String action = scan3.next();
	        // Выполняем действие
	        if (action.equals("+")) {
	        	System.out.println("Задача 28. "+ varN1 + action + varN2 +"="+ (varN1+varN2));
	        } else if (action.equals("-")) {
	        	System.out.println("Задача 28. "+ varN1 + action + varN2 +"="+ (varN1-varN2));
	        } else if (action.equals("*")) {
	        	System.out.println("Задача 28. "+ varN1 + action + varN2 +"="+ (varN1*varN2));
	        } else if (action.equals("/")) {
	        	if (varN2 == 0) {
	        		System.out.println("Задача 28. На \"0\" делить нельзя!");
	        	} else {
	        		System.out.println("Задача 28. "+ varN1 + action + varN2 +"="+ ((double)varN1/+varN2));
	        	}
	        }
		}
		
		
		// 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
		int n1 = 123045;
		int n2 = 223303;
		int ostatok1;
		int ostatok2;
		boolean res1 = false;
		boolean res2 = false;
		System.out.println("Задача 29. Ответы: ");
		for (i = 0; i < 10; i++) {
			int n1Copy = n1;
			while (n1Copy > 0) {
				ostatok1 = n1Copy % 10;
				if (ostatok1 == i) {
					res1 = true;
				}
				n1Copy = n1Copy / 10;
			}
			int n2Copy = n2;
			while (n2Copy > 0) {
				ostatok2 = n2Copy % 10;
				if (ostatok2 == i) {
					res2 = true;
				}
				n2Copy = n2Copy / 10;
			}
			if (res1 == true && res2 == true) {
				System.out.println("---> Цифра "+i+" содержится и в числе "+n1+", и в числе "+n2);
			}
			res1 = false;
			res2 = false;
		}
		
		// 30.  Написать программу, переводящую римские цифры в арабские
		Scanner sc2 = new Scanner(System.in);
        System.out.print("Задача 30. Введите цифру от 1 до 9: ");
        while(!sc2.hasNextInt()) {
        	sc2.next();
        	System.out.print("Задача 30. Введите цифру от 1 до 9: ");
        }
        varN = sc2.nextInt();
        while (varN <= 0 || varN > 9) {
        	System.out.print("Задача 30. Введите цифру от 1 до 9: ");
            while(!sc2.hasNextInt()) {
            	sc2.next();
            	System.out.print("Задача 30. Введите цифру от 1 до 9: ");
            }
            varN = sc2.nextInt();
        }
        switch (varN) {
        	case  (1):
	            System.out.println("---> Арабская цифра \"1\" равна римской цифре \"I\"");
	            break;
        	case  (2):
                System.out.println("---> Арабская цифра \"2\" равна римской цифре \"II\"");
                break;
        	case  (3):
                System.out.println("---> Арабская цифра \"3\" равна римской цифре \"III\"");
                break;
        	case  (4):
                System.out.println("---> Арабская цифра \"4\" равна римской цифре \"IV\"");
                break;
        	case  (5):
                System.out.println("---> Арабская цифра \"5\" равна римской цифре \"V\"");
                break;
        	case  (6):
                System.out.println("---> Арабская цифра \"6\" равна римской цифре \"VI\"");
                break;
        	case  (7):
                System.out.println("---> Арабская цифра \"7\" равна римской цифре \"VII\"");
                break;
        	case  (8):
                System.out.println("---> Арабская цифра \"8\" равна римской цифре \"VIII\"");
                break;
        	case  (9):
                System.out.println("---> Арабская цифра \"9\" равна римской цифре \"IX\"");
                break;
        }

		// 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. 
        //     Человек пытается их угадать. Программа должна выводить угаданные и неугаданные числа из тех, 
        //     что сгенерировала программа, а также ошибочные числа пользователя
		int[] randArr = new int[5];
		for (i = 0; i < 5; i++) {
			randArr[i] = (int)(Math.random()*15 + 1);
		}
		int result = 0;
		while (result != 5) {
			Scanner sc3 = new Scanner(System.in);
	        System.out.print("Задача 31. Введите число от 1 до 15: ");
	        while(!sc3.hasNextInt()) {
	        	sc3.next();
	        	System.out.print("Задача 31. Введите число от 1 до 15: ");
	        }
	        varN = sc3.nextInt();
	        while (varN < 1 || varN > 15) {
	        	System.out.print("Задача 31. Введите число от 1 до 15: ");
	            while(!sc3.hasNextInt()) {
	            	sc3.next();
	            	System.out.print("Задача 31. Введите число от 1 до 15: ");
	            }
	            varN = sc3.nextInt();
	        }
	        System.out.print("Вы ввели число "+varN+". \n");
	        for (i = 0; i < 5; i++) {
	    	   if (randArr[i] == varN) {
	    		   System.out.print("Такое число есть в массиве! \n");
	    		   result++;
	    	   }
	        }
	       
		}
		
		// 32. Проверить введенную пользователем строку на наличие недопустимых символов. 
		//     В качестве первого символа допустимы только буквы и знак подчеркивания. 
		//     Остальные символы могут быть буквами, цифрами и знаком подчеркивания
		boolean bool = true;
		Scanner sc4 = new Scanner(System.in);
        System.out.print("Задача 32. Введите строку: ");
        String str = sc4.next();
        for (i = 0; i < str.length(); i++) {
        	char ch2 = str.charAt(i);
        	if (i == 0) {
        		if ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z') || ch2 == '_') {
        			bool = true;
            	} else {
            		bool = false;
            	}
        	} else if (i > 0) {
        		if ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z') || (ch2 >= '0' && ch2 <= '9') || ch2 == '_') {
        			bool = true;
            	} else {
            		bool = false;
            	}
        	}
        }
        if (bool) {
        	System.out.println("Задача 32. Строка \""+str+"\" не содержит недопустимых символов");
        } else {
        	System.out.println("Задача 32. Строка \""+str+"\" содержит недопустимые символы");
        }
		
		// 33. Найдите наибольшую цифру данного натурального числа
		varN = 2233598;
		int varNc = varN;
		int max = 0;
		while (varNc % 10 > 0) {
			ostatok1 = varNc % 10;
			if (max < ostatok1) {
				max = ostatok1;
			}
			varNc = varNc / 10;
		}
		System.out.println("Задача 33. Наибольшая цифра числа "+varN+" равна "+max);

		// 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15
		System.out.println("Задача 34. Ответы: ");
		sum = 0;
		for (i = 1000; i < 10000; i++) {
			int iDouble = i;
			while (iDouble > 0) {
				// int ostatok3 = iDouble % 10;
				sum = sum + iDouble % 10;
				iDouble = iDouble / 10;
			}
			if (sum == 15) {
				System.out.print(i + ", ");
			}
			sum = 0;
		}
		System.out.print("\n");
		
		// 35. Найдите количество четных цифр данного натурального числа
		varN = 1234567;
		varNc = varN;
		i = 0;
		while (varNc > 0) {
			int ostat = varNc % 10;
			if (ostat % 2 == 0) {
				i++;
			}
			varNc = varNc / 10;
		}
		System.out.println("Задача 35. Количество четных цифр числа "+varN+" равно "+i);
		
		// 36. Два двузначных числа, записанных одно за другим, образуют четырёхзначное число, 
		//     которое делится на их произведение. Найти эти числа
		System.out.println("Задача 36. Ответы: ");
		for (i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				varN = i * 100 + j;
				if (varN % (i*j) == 0) {
					System.out.println("---> "+varN);
				}
			}
		}
		
		// 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: 
		//     первое число получили путем написания сначала числа А, затем В.
		//     Для получения второго числа сначала записали число В, затем А. 
		//     Найти числа А и В если известно, что первое четырехзначное число нацело делится на 99, а второе на 49
		System.out.println("Задача 37. Ответы: ");
		for (i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				varN = i * 100 + j;
				varNc = j * 100 + i;
				if (varN % 99 == 0 && varNc % 49 == 0) {
					System.out.println("---> "+i+", "+j);
				}
			}
		}
		
		// 38. Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
		//     Предполагается, что в числе не менее трёх цифр. Например: 1357, 963
		boolean res = true;
		varN = 13579;
		varNc = varN;
		int ostat1 = varNc % 10;
		varNc = varNc / 10;
		int ostat2 = varNc % 10;
		varNc = varNc / 10;
		int raznost = ostat1 - ostat2;
		while (varNc > 0) {
			ostat1 = varNc % 10;
			if (ostat2 - ostat1 != raznost) {
				System.out.println("Задача 38. Цифры числа "+varN+" не образуют арифметическую прогрессию.");
				res = false;
				break;
			}
			ostat2 = ostat1;
			varNc = varNc / 10;
		}
		if (res) {
			System.out.println("Задача 38. Цифры числа "+varN+" образуют арифметическую прогрессию.");
		}
		
		// 39.  В трехзначном числе зачеркнули старшую цифру. 
		//      Когда полученное число умножили на 7, то получили исходное число. Найти это число
		for (i = 100; i <= 999; i++) {
			varN = i % 100;
			if (varN * 7 == i) {
				System.out.println("Задача 39. Ответ: " + i);
			}
		}
		
		// 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры
		System.out.println("Задача 40. Ответы: ");
		varN = 99;
		res = true; 
		for (i = 1; i <= varN; i++) {
			int i_Double = i;
			while (i_Double > 0) {
				int ostat3 = i_Double % 10;
				if (ostat3 != 0) {
					if (i % ostat3 != 0) {
						res = false;
						break;
					}
				}
				i_Double = i_Double / 10;
			}
			if (res) {
				System.out.println("---> "+i);
			}
			res = true;
		}
		
		
		

	}

}
