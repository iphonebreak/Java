/**
		HashSet�� �̿��� �ζ� ��÷ ���α׷�
		
		1~45 ������ ���������� ��÷�Ͽ�(RandomŬ����)
		
		HashSet�� ����ֽ��ϴ�.
		
		6�� ��÷�ؼ� �ְ� �� �����͸� ����� ������
		
		�ߺ��� ������� �ʽ��ϴ�.
 */

import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		Random ran=new Random();
		HashSet <Integer> hs= new HashSet<Integer>();
		
		//6�� �ݺ�
				for(int i=0; i<6; ++i){
					int su = rand.nextInt(45)+1;//1~45 ����
					if(!hs.add(su)){//int->Integer
						System.out.println("�ߺ�!");
						i--;
					}
				}
				
				//���
				Iterator<Integer> it = hs.iterator();
				while(it.hasNext()){
					int su = it.next();//Integer->int
					System.out.print(su+"\t");
				}
				
				///////////////////////////////////TreeSet///////////////////////////////
				System.out.println("===========================");
				TreeSet<Integer> ts = new TreeSet<Integer>();
				//hs -> ts �� ������ ����
				ts.addAll(hs);
				
				it = ts.iterator();
				while(it.hasNext()){
					int su = it.next();//Integer->int
					System.out.print(su+"\t");
				}
				System.out.println();
				System.out.println("===========================");
				
				it=ts.descendingIterator();
				while(it.hasNext()){
					int su = it.next();//Integer->int
					System.out.print(su+"\t");
			}
		}

				
				
				
				
				
				
			}
		}