import java.io.*;
class dee
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value of n"); 
		
		
		int n=Integer.parseInt(in.readLine());
		double a[]=new double[n];
		double b[]=new double[n];
		double c[]=new double[n];
		double d[]=new double[n];
		double e[]=new double[n];
		double f[]=new double[n];
		double g[]=new double[n];
		double h[]=new double[n];

		int i;
		double p=0,q=0;
		
		System.out.println("Enter the start and end time for water supply");
		
		for(i=0;i<n;i++)
		{
		a[i]=Double.parseDouble(in.readLine());
		b[i]=Double.parseDouble(in.readLine());
		}
		System.out.println("enter the demand of water supply in million liters");
		for(i=0;i<n;i++)
		{
		c[i]=Double.parseDouble(in.readLine());
		}
		d[0]=c[0];
		for(i=1;i<n;i++)
		{
		d[i]=c[i]+d[i-1];
		}
		System.out.println("enter the water supply in million liters");
		for(i=0;i<n;i++)
		{
		e[i]=Double.parseDouble(in.readLine());
		}
		f[0]=e[0];
		for(i=1;i<n;i++)
		{
		f[i]=e[i]+f[i-1];
		}
		for(i=0;i<n;i++)
		{
		if((f[i]-d[i])>0)
		{
		if(p<(f[i]-d[i]))
		{
		p=(f[i]-d[i]);
		}
		}
		else
		{
		if(q<(d[i]-f[i]))
		{
		q=(d[i]-f[i]);
		}
		}
		}
		
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]+"-"+" "+b[i]+"-"+" "+c[i]+"-"+" "+d[i]+"-"+" "+e[i]+"-"+" "+f[i]+"-");
		
		}
		System.out.println(p+q);
		}
		}
