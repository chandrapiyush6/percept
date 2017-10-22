import java.util.*;
import java.lang.*;
public class Self implements packages,classes,mains,Sopln
{
	public void Spack()
	{
		System.out.println("import.java.util.*;");
	}
	public void Bpack()
	{
		System.out.println("import java.io.*;");
	}
	public void Sobj()
	{
		System.out.println("Scanner sc = new Scanner(System.in);");
	}
	public void Bobj()
	{
		System.out.println("BufferedReader in = new BufferedReader(new InputStreamReader(System.in));");
	}
	public void cpack()
	{
		System.out.print("class\t");
	}
	public void cname()
	{
		System.out.println("anyname");
		System.out.println("{");
	}
	public void mfunc()
	{
		System.out.println("public static void main(String[] args)");
		System.out.println("{");
	}
	public void print(String param)
	{
		System.out.println("System.out.println("+(char)34+param+(char)34+");");
	}
	public void endmain()
	{
		System.out.println("}");
	}
	public void endclass()
	{
		System.out.println("}");
	}
	/*public static void main(String[] args)
	{
		/*Self a = new Self();
		a.Spack();
		a.cpack();
		a.cname();
		a.mfunc();
		a.print("Hello");
		a.endmain();
		a.endclass();
	*/

	static double theta1[] = new double[2];
	static double theta2[] = new double[2];
	static double theta3[] = new double[2];
	static double theta4[] = new double[1];
	static double a1[] = new double[2];
	static double a2[] = new double[2];
	static double a3[] = new double[2];
	static double a4[] = new double[1];
	public  static int train(int inputs[][],int outputs[],int epoch)
	{
		//random initialisation
		Random r = new Random();
		/*theta1[] = new double[2];
		theta2[] = new double[2];
		theta3[] = new double[2];
		theta4[] = new double[1];*/
		for(int i = 0;i<2;i++)
		{
			theta1[i] = r.nextDouble();
			theta2[i] = r.nextDouble();
			theta3[i] = r.nextDouble();
			//theta4[i] = r.nextdouble();
		}
		theta4[0] = r.nextDouble();
		/*a1[] = new double[2];
		a2[] = new double[2];
		a3[] = new double[2];
		a4[] = new double[1];*/	
		a1[0] = a1[1] = 1;
		a2[0] = 1;
		a3[0] = 1;
		for(int i = 0;i<epoch;i++)
		{
			
			a2[1] = sigmoid(a1[0]*theta1[0] + a1[1]*theta1[1]);
			a3[1] = sigmoid(a2[0]*theta2[0] + a2[1]*theta2[1]);
			a4[0] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);

		}
		if((a1[1] + a2[1] + a3[1] + a4[0]) > 3)
			return 1;
		else
			return 0;
	}

	public static double sigmoid(double a)
	{
		return 1/(1+Math.exp(-a));
	}

		
	public static void main(String args[])
	{
		Self t = new Self();

		int aps[][] = {{1,1,1,1},{1,1,1,0},{1,1,0,1},{1,0,1,0},{0,0,1,1}};
		int apss[] = {1,0,0,0,0};
		t.train(aps,apss,200);
		Scanner sc = new Scanner(System.in);
		System.out.println("what do you want to print?");
		String param = sc.nextLine();
		System.out.println("Scanner or BufferReader");
		String ch = sc.nextLine();
			/*System.out.println(a1[1]);
			System.out.println(a2[1]);
			System.out.println(a3[1]);
			System.out.println(a4[0]);*/
		if(a1[1] >= 0.5)
		{
			if(ch == "scanner")
			{
				t.Spack();
			}
			else
			{
				t.Bpack();
			}
		}
		if(a2[1] >= 0.5)
		{
			t.cpack();
			t.cname();
		}
		if(a3[1] >= 0.5)
		{
			t.mfunc();
		}
		if(a4[0] >= 0.5)
		{
			if(ch == "scanner")
			{
				t.Sobj();
			}
			else
			{
				t.Bobj();
			}
			t.print(param);
			t.endmain();
			t.endclass();
		}
	}
}
