import java.util.Scanner;
public class tp3 {
	
	public static void main(String [] arge){
		int [] tab=new int [9];
		tab[0]=2;
		tab[1]=4;
		tab[2]=2;
		tab[3]=9;
		tab[4]=3;
		tab[5]=6;
		tab[6]=7;
		tab[7]=1;
		tab[8]=2;
		aff(tri(tab));
		System.out.println(occu(tab,10));
		System.out.println(dicho(tab,10));

		}
	
	public static void aff(int [] tab)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("[");
		int lg=tab.length;
		;
		for(int i=0;i<lg;i++){
			if (i!=0){System.out.print(";");
				}
			System.out.print(tab[i]);
		}
		System.out.print("]");
		System.out.println("");
		}

	public static float[] ftab4()
	{
		float [] tab4=new float [4];
		float lg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer les 4 valeurs");
		for(int i=0;i<4;i++){
		System.out.print("valeur");
		System.out.println(i);
		lg= scan.nextFloat();
		tab4[i]=lg;
		}
		return tab4;
		
	}
	public static float[][] ftab34()
	{
		float [][] tab4=new float [3][4];
		float lg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer les valeurs");
		for(int i=0;i<3;i++){
		System.out.print("ligne");
		System.out.println(i);
		for(int j=0;j<4;j++){
			System.out.print("colomne");
			System.out.println(j);
			lg= scan.nextFloat();
			tab4[i][j]=lg;
			}
		}
		return tab4;
		
	}
	
	public static float moyenne(float [] tab)
	{
		int lg=tab.length;
		float moy=0;
		int aff=0;
		for(int i=0;i<lg;i++){
		moy+=tab[i];
		}
		moy=moy/lg;
		for(int i=0;i<lg;i++){
			if (moy==tab[i] && aff==0){
				Scanner scan = new Scanner(System.in);
				System.out.println(i);
				aff=1;
			}
		}
		return moy;
		
	}
	
	public static int[] partition(int [] tab)
	{
		int lg=tab.length;
		float moy=0;
		for(int i=0;i<lg;i++){
		moy+=tab[i];
		}
		moy=moy/lg;
		
		int nbr=0;
		int trans=0;
		int i=0;
		while(i!=lg-1-nbr){
			if (tab[i]>=moy){
				trans=tab[i];
				tab[i]=tab[lg-1-nbr];
				tab[lg-1-nbr]=trans;
				nbr++;
			}
			else{
				i++;
			}
		}
		return tab;
		
	}
	
	
	//--  BONUS  --

	
	
	
	
	
	
	
	
	//--fin bonus--
	
	
	public static int[] tri(int [] tab)
	{
		int lg=tab.length;
		int trans=0;
		for (int i=0;i<lg;i++){
			
			for (int j=0;j<lg-1;j++){
				if (tab[j]>tab[j+1]){
					trans=tab[j];
					tab[j]=tab[j+1];
					tab[j+1]=trans;
				}
			}

		}
		
		
		
		return tab;
		
	}
	
	
	public static int occu(int [] tab,int val)
	{
		int lg=tab.length;
		for(int i=0;i<lg;i++){
		if (val==tab[i])
		{
			return i;
		}
		}
		return -1;
		
	}
	// v au début : 1 itération
	// v a la fin : n itérations (n la longueur)
	// en moyenne n/2 itérations
	
	public static int dicho(int [] tab,int val)
	{
		int lg=tab.length;
		int ga=0;
		int dr=lg-1;
		int mid=0;
		
		while(ga<dr){
		mid=(dr-ga);
		if (tab[mid]==val)
			{
			return mid;
			}
		else{
			if (val<tab[mid]){
				dr=mid;
			}
			else{
				ga=mid;
			}
			/*System.out.print(ga);
			System.out.print(",");
			System.out.print(dr);
			System.out.print(",");
			System.out.print(mid);
			System.out.println("");*/
			}
		}
		return -1;
		
	}
	
	//--  BONUS  --
	//en moyenne il ya log(n) itérations
	//pire des cas : n/2 itérations
	//--fin bonus--
	
	}
