//�ִ밪�� 21�ﰳ�� �����Ƿ� ��� ���� Ÿ���� long���� ����ߵ�....
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainBOJ13458���谨�� {
	static int N, B, C;
	static long result=0;
	static int[] A;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		B = Integer.parseInt(st.nextToken());//�Ѱ����� �����Ҽ� �ִ� �����
		C = Integer.parseInt(st.nextToken());//�ΰ����� �����Ҽ� �ִ� �����
		for(int i=0;i<N;i++) {
			A[i]-=B;
			result++;
			if(A[i]<=0) {
				continue;
			}
			if(A[i]<=C) {
				A[i]-=C;
				result++;
			}
			if(A[i]>C) {
				result+=(A[i]/C);
				if((A[i]%C)>0) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}