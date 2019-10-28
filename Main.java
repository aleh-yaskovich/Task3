package by.htp.task3.main;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		// 1. ���������� ������� �� ����� ����� �� 1 �� 5
		int i;
		System.out.print("������ 1. ");
		for (i = 1; i < 5; i++) {
			System.out.print(i + ", ");
		}
		System.out.print(i+"\n");
		
		// 2.  ���������� ������� �� ����� ����� �� 5 �� 1
		System.out.print("������ 2. ");
		for (i = 5; i > 1; i--) {
			System.out.print(i + ", ");
		}
		System.out.print(i+"\n");
		
		// 3.  ���������� ������� �� ����� ������� ��������� �� 3: 
		System.out.println("������ 3. �����:");
		for (i = 1; i <= 10; i++) {
			System.out.println("---> 3 x " + i + " = "+ i*3);
		}
		
		// 4.  � ������� ��������� while �������� ��������� ������ ���� ������ ����� 
		//     � ��������� �� 2 �� 100 ������������
		i = 1;
		System.out.println("������ 4. �����:");
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.print( i + ", ");
			}
			i++;
		}
		System.out.print( i + " \n" );
		
		// 5.  � ������� ��������� while �������� ��������� ����������� ����� 
		//     ���� �������� ����� � ��������� �� 1 �� 99 ������������
		i = 1;
		int sum = 0;
		while (i < 100) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("������ 5. ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������ ����� " + sum);
		
		// 6.  �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. 
		//     � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����
		Scanner sc = new Scanner(System.in);
        System.out.print("������� ����� ����� ������������� �����: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("������� ����� ����� ������������� �����: ");
        }
        i = sc.nextInt();
        while (i <= 0) {
        	System.out.print("������� ����� ����� ������������� �����: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("������� ����� ����� ������������� �����: ");
            }
            i = sc.nextInt();
        }
        int count = 1;
		sum = 0;
		while (count <= i) {
			sum = sum + count;
			count++;
		}
		System.out.println("������ 6. ����� ���� ����� �� 1 �� "+i+" ����� " + sum);
		
		// 7. ��������� �������� ������� �� ������� [�,b] c ����� h
		double a = 0.7;
		double b = 4.2;
		double h = 0.4;
		System.out.print("������ 7. �������� ������� �� ������� �� "+a+" �� "+b+" � ����� "+h+" �����: ");
		for (double m = a; m <= b; m = m + h) {
			if (m <= 2) {
				System.out.print(-1*m + ", ");
			} else {
				System.out.print(m + ", ");
			}
		}
		System.out.print("\n");
		
		// 8. ��������� �������� ������� �� ������� [�,b] c ����� h: 
		// !!! ���������� ���������� a, b � h �� ������  �7 !!!
		double c = 10;
		System.out.print("������ 8. �������� ������� �� ������� �� "+a+" �� "+b+" � ����� "+h+" �����: ");
		for (double m = a; m <= b; m = m + h) {
			if (m == 15) {
				System.out.print((m+c)*2 + ", ");
			} else {
				System.out.print((m-c)+6 + ", ");
			}
		}
		System.out.print("\n");
		
		// 9. ����� ����� ��������� ������ ��� �����
		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum = sum + i*i;
		}
		System.out.println("������ 9. ����� ��������� ������ ��� ����� ����� " + sum);
		
		// 10. ��������� ��������� ���������� ������������ ��������� ������ ������� �����
		BigInteger val;
		BigInteger result2;
		result2 = new BigInteger("1");
		for (i = 1; i <= 200; i++) {
			int square = i*i;
			String str = Integer.toString(square);
			val = new BigInteger(str);
			result2 = result2.multiply(val);
		}
		System.out.println("������ 10. ������������ ��������� ������ ������� ����� ����� " + result2);
		
		// 11. ��������� ��������� ���������� �������� ����� ������ ������� �����
		int diff = 1;
		for (i = 2; i <= 200; i++) {
			diff = diff - i*i*i;
		}
		System.out.println("������ 11. �������� ����� ������ ������� ����� ����� " + diff);
		
		// 12. ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n >1 
		//     ��������� ��������� ���������� ������������ ������ 10 ������ ���� ������������������
		int a1 = 1;
		System.out.print("������ 12. �����: ");
		for (i = 1; i < 10; i++) {
			System.out.print(a1 + ", ");
			a1 = a1 + 6;
		}
		System.out.print(a1+ "\n");

		// 13.  ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5
		a = -5;
		b = 5;
		h = 0.5;
		double m = a;
		System.out.print("������ 13. �������� �������: ");
		for (m = a; m < b; m = m + h) {
			System.out.print(m + ", ");
		}
		System.out.print(m + "\n");
		
		// 14. ���� ����������� n. ���������: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
		int n = 15;
		double summa = 0;
		for (m = 1; m <= n; m++) {
			summa = summa + 1/m;
		}
		System.out.println("������ 14. �����: " + summa);
		
		// 15.  ��������� : 1+2+4+8+...+ 2 � 10 �������
		summa = 0;
		for (i = 0; i <= 10; i++) {
			summa = summa + Math.pow(2, i);
		}
		System.out.println("������ 15. �����: " + summa);
		
		// 16.  ���������: (1+2)*(1+2+3)*...*(1+2+...+10)
		sum = 1;
		long sum2 = 1;
		for (i = 2; i <= 10; i++) {
			sum = sum + i;
			sum2 = sum2 * sum;
		}
		System.out.println("������ 16. �����: " + sum2);
		
		// 17.  ���� �������������� (�) � ����������� (n). ���������: a(a+1)...(a+n-1)
		double varA = 2.25;
		int varN = 5;
		summa = varA; // double
		double itog = 1;
		for (i = 0; i < varN; i++) {
			summa = varA + i;
			itog = itog*summa;
		}
		System.out.println("������ 17. �����: " + itog);
		
		// 18. ���� �������� ��� � ��������� ����� �. 
		//     ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. 
		varN = 15; // int
		double e = 0.245;
		itog = 0; // double
		for (i = 1; i < varN; i++) {
			summa = (Math.pow(-1, i)/i);
			if (Math.abs(summa) >= e) {
				itog = itog + Math.abs(summa);
				
			}
		}
		System.out.println("������ 18. �����: " + itog);
		
		// 19. ���� �������� ��� � ��������� ����� �. 
		//     ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. 
		varN = 15; // int
		e = 0.245; // double
		itog = 0; // double
		for (i = 1; i < varN; i++) {
			summa = (double)1/(Math.pow(2, i) + 1/Math.pow(3, i));
			if (Math.abs(summa) >= e) {
				itog = itog + Math.abs(summa);
				
			}
		}
		System.out.println("������ 19. �����: " + itog);
		
		// 20. ���� �������� ��� � ��������� ����� �. 
		//     ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �.
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
		System.out.println("������ 20. �����: " + itog);
		
		// 21.  ��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b] � ����� h. 
		//      ��������� ����������� � ���� �������, ������ ������� ������� � ��������  ���������, 
		//      ������ - ��������������� �������� �������: F(x) = x - sin(x)
		a = -0.5; // double
		b = 2; // double
		h = 0.5; // double
		System.out.println("������ 21. ������: ");
		for (m = a; m <= b; m = m + h) {
			System.out.println("---> x = "+m+", F("+m+") = "+ (m - Math.sin(m)));
		}
		
		// 22. ��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b] � ����� h. 
		//     ��������� ����������� � ���� �������, ������ ������� ������� � ��������  ���������, 
		//     ������ - ��������������� �������� �������: 
		a = -0.5; // double
		b = 2; // double
		h = 0.5; // double
		System.out.println("������ 22. ������: ");
		for (m = a; m <= b; m = m + h) {
			System.out.println("---> x = "+m+", F("+m+") = "+ Math.pow(Math.sin(m), 2));
		}
		
		// 23.  ��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b] � ����� h. 
		//      ��������� ����������� � ���� �������, ������ ������� ������� � ��������  ���������, 
		//      ������ - ��������������� �������� �������
		a = -0.5; // double
		b = 2; // double
		h = 0.5; // double
		System.out.println("������ 23. ������: ");
		for (m = a; m <= b; m = m + h) {
			System.out.println("---> x = "+m+", F("+m+") = "+ (1/Math.tan(m/3) + Math.sin(m)/2));
		}
		
		// 24. �������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������. 
		//     ������������� ��� � ������ �����, ����� �������� ����� ��������� � �������� ������� 
		//     �� ��������� � ��������� ������
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
		System.out.println("������ 24. ������: ");
		System.out.println("---> ����� ������ ���� ����� "+varNcopy+" ����� "+sum);
		System.out.println("---> ����� "+varNcopy+" � �������� �������: "+varNew);
		
		// 25. ��������� ���������� ��������� �����, ������� ���� ������������
		long factorial = 1;
		Scanner scan = new Scanner(System.in);
        System.out.print("������ 25. ������� ����� ��������������� �����: ");
        while(!scan.hasNextLong()) {
        	scan.next();
        	System.out.print("������ 25. ������� ����� ��������������� �����: ");
        }
        long varN3 = scan.nextLong();
        while (varN3 <= 0) {
        	System.out.print("������ 25. ������� ����� ��������������� �����: ");
            while(!scan.hasNextLong()) {
            	scan.next();
            	System.out.print("������ 25. ������� ����� ��������������� �����: ");
            }
            varN3 = scan.nextLong();
        }
        for (i = 1; i <= varN3; i++) {
        	factorial = factorial * i;
        }    
		System.out.println("������ 25. ��������� ����� "+varN3+" ����� "+factorial);
		
		// 26.  ������� �� ����� ������������ ����� ��������� � �� ���������� ������������� 
		//      � ������ ���������� (������� ASCII)
		System.out.println("������ 26. ������: ");
		char ch;
		for(ch = 'a'; ch<='z'; ch++) {
            System.out.print(ch + " ("+(byte)ch+"), ");
        }
		System.out.print("\n");
		
		// 27. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, 
		//     ����� ������� � ������ �����. m � n �������� � ����������
		Scanner sc1 = new Scanner(System.in);
        System.out.print("������ 27. ������� ������ ����� ����� ����������: ");
        while(!sc1.hasNextInt()) {
        	sc1.next();
        	System.out.print("������ 27. ������� ������ ����� ����� ����������: ");
        }
        varN = sc1.nextInt();
        int varM;
        System.out.print("������ 27. ������� ������ ����� ����� ����������: ");
        while(!sc1.hasNextInt()) {
        	sc1.next();
        	System.out.print("������ 27. ������� ������ ����� ����� ����������: ");
        }
        varM = sc1.nextInt();
        while (varM <= varN) {
        	System.out.print("������ 27. ������� ����� ����� ������ �������: ");
            while(!sc1.hasNextInt()) {
            	sc1.next();
            	System.out.print("������ 27. ������� ����� ����� ������ �������: ");
            }
            varM = sc1.nextInt();
        }
        System.out.println();
		for (i = varN; i < varM; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("---> ����� "+ i +" ������� ��� ������� �� "+ j);
				}
			}
		}
		
		// 28. �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+, �, /, *). 
		//     ��������� ��������� Z � ����������� �� �����. ������������� ������� �� ��������� �������� ���� ��������, 
		//     � ����� �� ���� Y=0 ��� �������. ������������ ����������� ������������ ���������� ��� ������������ ��������� (�.�. ��������� ����). 
		//     � �������� ������� ����������� ���������� ������� �0�.
		int varN1 = 1;
		while (varN1 != 0) {
			// ������ ������ �����
			Scanner scan1 = new Scanner(System.in);
	        System.out.print("������ 28. ������� ������ ����� �����: ");
	        while(!scan1.hasNextInt()) {
	        	scan1.next();
	        	System.out.print("������ 28. ������� ������ ����� �����: ");
	        }
	        varN1 = scan1.nextInt();
	        if (varN1 == 0) {
	        	System.out.println("������ 28. ����� ������ ���������!");
	        	break;
	        }
	        // ������ ������ �����
	        Scanner scan2 = new Scanner(System.in);
	        System.out.print("������ 28. ������� ������ ����� �����: ");
	        while(!scan2.hasNextInt()) {
	        	scan2.next();
	        	System.out.print("������ 28. ������� ������ ����� �����: ");
	        }
	        int varN2 = scan2.nextInt();
	        // ������ ��������
	        Scanner scan3 = new Scanner(System.in);
	        System.out.print("������ 28. ������� �������� (+, �, /, *): ");
	        while (!scan3.hasNext("[+-/*]")) {
	            System.out.print("������ 28. ������� �������� (+, �, /, *): ");
	            scan3.next();
	        }
	        String action = scan3.next();
	        // ��������� ��������
	        if (action.equals("+")) {
	        	System.out.println("������ 28. "+ varN1 + action + varN2 +"="+ (varN1+varN2));
	        } else if (action.equals("-")) {
	        	System.out.println("������ 28. "+ varN1 + action + varN2 +"="+ (varN1-varN2));
	        } else if (action.equals("*")) {
	        	System.out.println("������ 28. "+ varN1 + action + varN2 +"="+ (varN1*varN2));
	        } else if (action.equals("/")) {
	        	if (varN2 == 0) {
	        		System.out.println("������ 28. �� \"0\" ������ ������!");
	        	} else {
	        		System.out.println("������ 28. "+ varN1 + action + varN2 +"="+ ((double)varN1/+varN2));
	        	}
	        }
		}
		
		
		// 29. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����
		int n1 = 123045;
		int n2 = 223303;
		int ostatok1;
		int ostatok2;
		boolean res1 = false;
		boolean res2 = false;
		System.out.println("������ 29. ������: ");
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
				System.out.println("---> ����� "+i+" ���������� � � ����� "+n1+", � � ����� "+n2);
			}
			res1 = false;
			res2 = false;
		}
		
		// 30.  �������� ���������, ����������� ������� ����� � ��������
		Scanner sc2 = new Scanner(System.in);
        System.out.print("������ 30. ������� ����� �� 1 �� 9: ");
        while(!sc2.hasNextInt()) {
        	sc2.next();
        	System.out.print("������ 30. ������� ����� �� 1 �� 9: ");
        }
        varN = sc2.nextInt();
        while (varN <= 0 || varN > 9) {
        	System.out.print("������ 30. ������� ����� �� 1 �� 9: ");
            while(!sc2.hasNextInt()) {
            	sc2.next();
            	System.out.print("������ 30. ������� ����� �� 1 �� 9: ");
            }
            varN = sc2.nextInt();
        }
        switch (varN) {
        	case  (1):
	            System.out.println("---> �������� ����� \"1\" ����� ������� ����� \"I\"");
	            break;
        	case  (2):
                System.out.println("---> �������� ����� \"2\" ����� ������� ����� \"II\"");
                break;
        	case  (3):
                System.out.println("---> �������� ����� \"3\" ����� ������� ����� \"III\"");
                break;
        	case  (4):
                System.out.println("---> �������� ����� \"4\" ����� ������� ����� \"IV\"");
                break;
        	case  (5):
                System.out.println("---> �������� ����� \"5\" ����� ������� ����� \"V\"");
                break;
        	case  (6):
                System.out.println("---> �������� ����� \"6\" ����� ������� ����� \"VI\"");
                break;
        	case  (7):
                System.out.println("---> �������� ����� \"7\" ����� ������� ����� \"VII\"");
                break;
        	case  (8):
                System.out.println("---> �������� ����� \"8\" ����� ������� ����� \"VIII\"");
                break;
        	case  (9):
                System.out.println("---> �������� ����� \"9\" ����� ������� ����� \"IX\"");
                break;
        }

		// 31. ��������� ���������� ���� ����� � ��������� �� 1 �� 15 ������������. 
        //     ������� �������� �� �������. ��������� ������ �������� ��������� � ����������� ����� �� ���, 
        //     ��� ������������� ���������, � ����� ��������� ����� ������������
		int[] randArr = new int[5];
		for (i = 0; i < 5; i++) {
			randArr[i] = (int)(Math.random()*15 + 1);
		}
		int result = 0;
		while (result != 5) {
			Scanner sc3 = new Scanner(System.in);
	        System.out.print("������ 31. ������� ����� �� 1 �� 15: ");
	        while(!sc3.hasNextInt()) {
	        	sc3.next();
	        	System.out.print("������ 31. ������� ����� �� 1 �� 15: ");
	        }
	        varN = sc3.nextInt();
	        while (varN < 1 || varN > 15) {
	        	System.out.print("������ 31. ������� ����� �� 1 �� 15: ");
	            while(!sc3.hasNextInt()) {
	            	sc3.next();
	            	System.out.print("������ 31. ������� ����� �� 1 �� 15: ");
	            }
	            varN = sc3.nextInt();
	        }
	        System.out.print("�� ����� ����� "+varN+". \n");
	        for (i = 0; i < 5; i++) {
	    	   if (randArr[i] == varN) {
	    		   System.out.print("����� ����� ���� � �������! \n");
	    		   result++;
	    	   }
	        }
	       
		}
		
		// 32. ��������� ��������� ������������� ������ �� ������� ������������ ��������. 
		//     � �������� ������� ������� ��������� ������ ����� � ���� �������������. 
		//     ��������� ������� ����� ���� �������, ������� � ������ �������������
		boolean bool = true;
		Scanner sc4 = new Scanner(System.in);
        System.out.print("������ 32. ������� ������: ");
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
        	System.out.println("������ 32. ������ \""+str+"\" �� �������� ������������ ��������");
        } else {
        	System.out.println("������ 32. ������ \""+str+"\" �������� ������������ �������");
        }
		
		// 33. ������� ���������� ����� ������� ������������ �����
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
		System.out.println("������ 33. ���������� ����� ����� "+varN+" ����� "+max);

		// 34. ������� ��� �������������� �����, ����� ���� ������� �� ������� ����� 15
		System.out.println("������ 34. ������: ");
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
		
		// 35. ������� ���������� ������ ���� ������� ������������ �����
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
		System.out.println("������ 35. ���������� ������ ���� ����� "+varN+" ����� "+i);
		
		// 36. ��� ���������� �����, ���������� ���� �� ������, �������� ������������� �����, 
		//     ������� ������� �� �� ������������. ����� ��� �����
		System.out.println("������ 36. ������: ");
		for (i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				varN = i * 100 + j;
				if (varN % (i*j) == 0) {
					System.out.println("---> "+varN);
				}
			}
		}
		
		// 37. ���� ��� ���������� ����� � � �. �� ���� ����� ��������� 2 �������������� �����: 
		//     ������ ����� �������� ����� ��������� ������� ����� �, ����� �.
		//     ��� ��������� ������� ����� ������� �������� ����� �, ����� �. 
		//     ����� ����� � � � ���� ��������, ��� ������ �������������� ����� ������ ������� �� 99, � ������ �� 49
		System.out.println("������ 37. ������: ");
		for (i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				varN = i * 100 + j;
				varNc = j * 100 + i;
				if (varN % 99 == 0 && varNc % 49 == 0) {
					System.out.println("---> "+i+", "+j);
				}
			}
		}
		
		// 38. ��� ��������� ������������ ����� ����������, �������� �� ��� ����� �������������� ����������. 
		//     ��������������, ��� � ����� �� ����� ��� ����. ��������: 1357, 963
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
				System.out.println("������ 38. ����� ����� "+varN+" �� �������� �������������� ����������.");
				res = false;
				break;
			}
			ostat2 = ostat1;
			varNc = varNc / 10;
		}
		if (res) {
			System.out.println("������ 38. ����� ����� "+varN+" �������� �������������� ����������.");
		}
		
		// 39.  � ����������� ����� ���������� ������� �����. 
		//      ����� ���������� ����� �������� �� 7, �� �������� �������� �����. ����� ��� �����
		for (i = 100; i <= 999; i++) {
			varN = i % 100;
			if (varN * 7 == i) {
				System.out.println("������ 39. �����: " + i);
			}
		}
		
		// 40. �������� ��� �����, �� ����������� ��������� ����� N, ������� ������� ��� ������� �� ��� ���� �����
		System.out.println("������ 40. ������: ");
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
