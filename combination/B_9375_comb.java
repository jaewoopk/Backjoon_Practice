import java.util.*;

public class B_9375_comb {
    public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
 
            while (T-- > 0) {
            	HashMap<String, Integer> hm = new HashMap<>();
            	int N = in.nextInt();
            	
            	while (N-- > 0) {
            		in.next();	// 옷 이름은 필요 없음 
            		String kind = in.next();	// 옷 종류 
            		if (hm.containsKey(kind)) {
            			hm.put(kind, hm.get(kind) + 1);
            		} 
            		else {
            			hm.put(kind, 1);
            		}
            	}
            	int result = 1;
 
            	for (int val : hm.values()) {
            		result *= (val + 1);
            	}	
            	System.out.println(result - 1);		// 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답.
            }
			// 한 번더 살펴볼 것
        }
    }
    /*
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        int[] answers = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int size, answer;
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(sc.next());
                list.add(sc.next());
            }
            Set<String> arrset = new HashSet<>(list);
            size = list.size() - arrset.size();
            if (size == 0)
                answers[i] = answer = (int)Math.pow(2, list.size() / 2) - (int) Math.pow(2, size + n - 3);
            else
                answers[i] = answer = (int)Math.pow(2, list.size() / 2) - (int) Math.pow(2, size + n - 3) - 1;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answers[i]);
        }
    }
    */
}
