/**
		HashSet을 이용한 로또 추첨 프로그램
		
		1~45 사이의 무작위수를 추첨하여(Random클래스)
		
		HashSet에 집어넣습니다.
		
		6개 추첨해서 넣고 들어간 데이터를 출력해 보세요
		
		중복은 허용하지 않습니다.
 */

import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		Random ran=new Random();
		HashSet <Integer> hs= new HashSet<Integer>();
		
		//6번 반복
				for(int i=0; i<6; ++i){
					int su = rand.nextInt(45)+1;//1~45 정수
					if(!hs.add(su)){//int->Integer
						System.out.println("중복!");
						i--;
					}
				}
				
				//출력
				Iterator<Integer> it = hs.iterator();
				while(it.hasNext()){
					int su = it.next();//Integer->int
					System.out.print(su+"\t");
				}
				
				///////////////////////////////////TreeSet///////////////////////////////
				System.out.println("===========================");
				TreeSet<Integer> ts = new TreeSet<Integer>();
				//hs -> ts 로 데이터 복제
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