package Test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import Renderer.ImageWriter;

public class ImageWriterTest {

	@Test
	public void test1() 
	{
		try{
		ImageWriter image=new ImageWriter("test1",500,500,500,500);
		//divides the screen to grid by interval and put white color in the lines of the grid
		for(int i=0;i<image.getHeight();i++)
		{
			for(int j=0;j<image.getWidth();j++)
			{//System.out.println(image.getWidth());
				if(i%50==0||j%50==0||j==499||i==499)
				{
					//System.out.println(j);
					image.writePixel(i,j,255,255,255);
				}
				else
					image.writePixel(i,j,0,0,0);
			}
		}
		image.writeToimage();
		assertTrue(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Test
	public void test2() //red heart
	{
		try{
		ImageWriter image=new ImageWriter("test2",500,500,500,500);
		for(int i=0;i<image.getHeight();i++)
		{
			for(int j=0;j<image.getWidth();j++)
			{
				if(i%50==0||j%50==0||j==499||i==499)
				{
					image.writePixel(i,j,255,255,255);
				}
				else
					image.writePixel(i,j,0,0,0);
			}
		}
		Color h=Color.RED;
		for(int i=225;i<=250;i++)
		{
			for(int j=225;j<=i;j++)
			{
					image.writePixel(j,i,h);
			}
		}
		
		int k=0;
		for(int i=225;i<=250;i++,k++)
		{
			for(int j=225;j>=225-k;j--)
			{
					image.writePixel(j,i,h);
			}
		}
			
		for(int i=225;i<=250;i++)
		{
			for(int j=275;j<=i+50;j++)
					image.writePixel(j,i,h);
		}
		int n=0;
		for(int i=225;i<=250;i++,n++)
		{
			for(int j=275;j>=275-n;j--)
			{
					image.writePixel(j,i,h);
			}
		}
		int y=0;
		for(int i=299;i>=251;i--,y++)
		{
			for(int j=250;j>=250-y;j--)
			{
					image.writePixel(j,i,h);
			}
		}
		
		int u=0;
		for(int i=299;i>=251;i--,u++)
		{
			for(int j=251;j<=251+u;j++)
			{
					image.writePixel(j,i,h);
			}
		}
		
		image.writeToimage();
		assertTrue(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Test
	public void test3() //red heart
	{
		try{
		ImageWriter image=new ImageWriter("test3",500,500,500,500);
		for(int i=0;i<image.getHeight();i++)
		{
			for(int j=0;j<image.getWidth();j++)
			{
				if(i%50==0||j%50==0||j==499||i==499)
				{
					image.writePixel(i,j,255,255,255);
				}
				else
					image.writePixel(i,j,0,0,0);
			}
		}
		Color h=Color.GREEN;
		for(int i=225;i<=250;i++)
		{
			for(int j=225;j<=i;j++)
			{
					image.writePixel(j,i,h);
			}
		}
		
		int k=0;
		for(int i=225;i<=250;i++,k++)
		{
			for(int j=225;j>=225-k;j--)
			{
					image.writePixel(j,i,h);
			}
		}
			
		for(int i=225;i<=250;i++)
		{
			for(int j=275;j<=i+50;j++)
					image.writePixel(j,i,h);
		}
		int n=0;
		for(int i=225;i<=250;i++,n++)
		{
			for(int j=275;j>=275-n;j--)
			{
					image.writePixel(j,i,h);
			}
		}
		int y=0;
		for(int i=299;i>=251;i--,y++)
		{
			for(int j=250;j>=250-y;j--)
			{
					image.writePixel(j,i,h);
			}
		}
		
		int u=0;
		for(int i=299;i>=251;i--,u++)
		{
			for(int j=251;j<=251+u;j++)
			{
					image.writePixel(j,i,h);
			}
		}
		
		image.writeToimage();
		assertTrue(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void test4() //house
	{
		ImageWriter image=new ImageWriter("test4",500,500,500,500);
		for(int i=0;i<image.getHeight();i++)//grid
		{
			for(int j=0;j<image.getWidth();j++)
			{
				if(i%50==0||j%50==0||j==499||i==499)
				{
					image.writePixel(i,j,255,255,255);
				}
				else
					image.writePixel(i,j,0,0,0);
			}
		}
		Color h=Color.YELLOW;
		Color red=Color.RED;
		Color gray=Color.DARK_GRAY;
		//Color blue=Color.blue;
		
	
		/*
		for(int i=255;i<=300;i++)//smoke
		{
			for(int j=167;j<=175;j++)
			{
					image.writePixel(j,i,gray);
			}
		}
		*/
		
		for(int i=0;i<500;i++)//background
		{
			for(int j=0;j<500;j++)
			{
					image.writePixel(j,i,51,255,255);
			}
		}
		
		for(int i=255;i<=300;i++)//smoke
		{
			for(int j=167;j<=175;j++)
			{
					image.writePixel(j,i,gray);
			}
		}
		int k=0;
		for(int i=250;i<=300;i++,k++)
		{
			for(int j=99;j>=100-k;j--)/////
			{
					image.writePixel(j,i,red);
			}
		}

		
		for(int i=250;i<=300;i++)
		{
			for(int j=100;j<=150;j++)
			{
					image.writePixel(j,i,red);
			}
		}
		int y=0;
		for(int i=250;i<=300;i++,y++)
		{
			for(int j=150;j<=150+y;j++)
			{
					image.writePixel(j,i,red);
			}
		}
		
		for(int i=300;i<=350;i++)//wall
		{
			for(int j=50;j<200;j++)
			{
					image.writePixel(j,i,h);
			}
		}
		
		
		for(int i=310;i<=335;i++)//window
		{
			for(int j=160;j<=180;j++)
			{
					image.writePixel(j,i,255,204,204);
			}
		} 
		for(int i=310;i<=335;i++)//window
		{
			for(int j=168;j<=171;j++)
			{
					image.writePixel(j,i,153,153,153);
			}
		} 
		for(int i=322;i<=325;i++)//window
		{
			for(int j=160;j<=180;j++)
			{
					image.writePixel(j,i,153,153,153);
			}
		} 
		
		
		for(int j=160;j<=180;j++)//window
		{
			for(int i=333;i<=335;i++)
				image.writePixel(j,i,153,153,153);
			for(int i=310;i<=312;i++)
				image.writePixel(j,i,153,153,153);
		}
		
		for(int i=310;i<=335;i++)//window
		{
			for(int j=160;j<=162;j++)
			{
					image.writePixel(j,i,153,153,153);
			}
			for(int j=178;j<=180;j++)
			{
					image.writePixel(j,i,153,153,153);
			}
		} 
		for(int i=320;i<=350;i++)//door
		{
			for(int j=117;j<=133;j++)
			{
					image.writePixel(j,i,102,51,0);
			}
		}
		
		for(int i=334;i<=336;i++)//door
		{
			for(int j=120;j<=123;j++)
			{
					image.writePixel(j,i,0,0,0);
			}
		}
		for(int i=351;i<500;i++)//ground
		{
			for(int j=0;j<500;j++)
			{
					image.writePixel(j,i,102,255,0);
			}
		}
		for(int i=0;i<image.getHeight();i++)//grid
		{
			for(int j=0;j<image.getWidth();j++)
			{
				if(i%50==0 || j%50==0||j==499||i==499)
				{
					image.writePixel(i,j,255,255,255);
				}
			}
		}
		image.writeToimage();
		assertTrue(true);
		}
		
	
	
	/* ImageWriter image=new ImageWriter("test4",500,500,500,500);
		for(int i=0;i<image.getHeight();i++)//grid
		{
			for(int j=0;j<image.getWidth();j++)
			{
				if(i%50==0||j%50==0)
				{
					image.writePixel(i,j,255,255,255);
				}
				else
					image.writePixel(i,j,0,0,0);
			}
		}
		Color h=Color.YELLOW;
		Color red=Color.RED;


		int k=0;
		for(int i=100;i<=150;i++,k++)
		{
			for(int j=99;j>=100-k;j--)/////
			{
					image.writePixel(j,i,red);
			}
		}

		
		for(int i=100;i<=150;i++)
		{
			for(int j=101;j<=150;j++)
			{
					image.writePixel(j,i,red);
			}
		}
		int y=0;
		for(int i=100;i<=150;i++,y++)
		{
			for(int j=150;j<=150+y;j++)
			{
					image.writePixel(j,i,red);
			}
		}
		
		for(int i=150;i<200;i++)//wall
		{
			for(int j=50;j<200;j++)
			{
					image.writePixel(j,i,h);
			}
		}
		
		Color gray=Color.DARK_GRAY;
		for(int i=170;i<200;i++)//door
		{
			for(int j=117;j<=133;j++)
			{
					image.writePixel(j,i,gray);
			}
		}
		
	
		image.writeToimage();
		assertTrue(true);
		}
	 */
	}
