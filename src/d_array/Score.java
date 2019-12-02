package d_array;

import java.util.Arrays;

import javax.sql.rowset.spi.TransactionalWriter;

import training.training1127;

public class Score {
	
	public static void main(String[] args) {
		
		/* 
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		 * 50~100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 순위	이름	Java	Oracle	HTML	CSS	JQuery	JSP	총점	평균
		 * 1	홍길동	90	100		80		50	30		90	400	70
		 * 2	홍길동	90	100		80		50	30		90	400	70
		 * 3	홍길동	90	100		80		50	30		90	400	70
		 * 4	홍길동	90	100		80		50	30		90	400	70
		 * 5	홍길동	90	100		80		50	30		90	400	70		 
		 */
		
		
		
		int Transcript[][] = new int [21][7];
		
		String[] name = {"김지선","이누리","박종민","정대석","정재영","강현철","주향한","윤창훈","연은주","김령환",
					"구한나","백종빈","이병훈","강현지","김경운","이지형","이예림","이승재","민태홍","정보람","박진영"};
		String[] title = {"순위","이름","Java","Oracle","HTML","CSS","JQuery","JSP","총점","평균"};
		
		for(int i = 0; i <10;i++){
		System.out.print(title[i]+"\t");
		}
		System.out.println();
		int[] sum = new int[Transcript.length];

		double[] avg = new double[Transcript.length]; //평균
		
		

		for(int i = 0; i<Transcript.length;i++){
				
			
			for(int j = 0; j<Transcript[i].length;j++){
					Transcript[i][j] = (int)(Math.random()*90+10);	
					sum[i] = sum[i] + Transcript[i][j];
																		
			}
			
			Transcript[i][6]= sum[i];
			avg[i]=(int)(sum[i]*10+0.5)/Transcript[i].length/10.0;
		}	

			
		
			
		int[] Rank = new int[sum.length];

		for (int a = 0; a < Rank.length; a++) {
			Rank[a] += 1;
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {

				if (sum[j] < sum[i]) {

					Rank[j]++;

				}
			}
		}	
		
		
		
		for(int i = 0; i < Rank.length-1; i++){
			for(int j= i + 1; j < Rank.length; j++){
				if (Rank[i]>Rank[j]){
					int temp = Rank[i];
					Rank[i]=Rank[j];
					Rank[j] = temp;
					
					String nameString = name[i];
					name[i] = name[j];
					name[j] = nameString;
					
					double avgsort = avg[i];
					avg[i] = avg[j];
					avg[j] = avgsort;
					
					int[] Transcriptsort = Transcript[i];
					Transcript[i] = Transcript[j];
					Transcript[j] = Transcriptsort;
					
					}
				}
			}
		
				
		
		for (int i = 0; i < Transcript.length; i++) {
			System.out.print(Rank[i]+"\t"+name[i]+"\t");
			for (int j = 0; j <7; j++) {
				
				System.out.print(Transcript[i][j]+"\t");
				
			}
			System.out.println(avg[i]);
			
		}
		
		int sub[][] = new int [7][21];
		int lastsum[]= new int[Transcript.length];
		double[] lastavg = new double[Transcript.length]; //평균
		
		System.out.print("\t"+"과목별평균"+"\t");
		for(int j = 0; j<sub.length;j++){	
			for(int i = 0; i<Transcript.length;i++){
				lastsum[j]= lastsum[j] + Transcript[i][j];
				
		

			lastavg[j]=(int)(lastsum[j]*10+0.5)/sub[j].length/10.0;
			
												
			}
			System.out.print(lastavg[j]+"\t");
		}	
		

				
		
		
			
	}

}
