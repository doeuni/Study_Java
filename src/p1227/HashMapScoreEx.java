package p1227;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		//사용자 이름과 점수를 기록하는 HashMap컬렉션 생성 
		HashMap<String, Integer> javaScore =
				new HashMap<String, Integer>();
		//4개의 점수 저장
		javaScore.put("김은비", 97);
		javaScore.put("박고은", 01);
		javaScore.put("최지원", 02);
		javaScore.put("김민영", 97);
		javaScore.put("홍창윤", 9);
		System.out.println("HashMap의 요소 개수:"
		+ javaScore.size());
		
		//모든 사람의 점수 출력.
		//javaScore에 들어있는 모든 (key,value) 쌍 출력
		//key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = javaScore.keySet();
		
		//key 문자열을 가진 집합 Set컬렉션 리턴 
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + ":" + score);
		}
		
	}

}
