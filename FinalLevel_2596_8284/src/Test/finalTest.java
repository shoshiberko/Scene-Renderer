package Test;

//import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import Elements.AmbientLight;
import Elements.SpotLight;
import Geometries.Sphere;
import Geometries.Triangle;
import Primitives.Material;
import Primitives.Point3D;
import Primitives.Vector;
import Renderer.ImageWriter;
import Renderer.Render;
import Scene.Scene;

public class finalTest {

	@Test
	public void bird() throws Exception//birds
	{
		Scene scene = new Scene();
		scene.setDistanceViewPlane(150);
		scene.setBackground(new Color(183,216,249));
		scene.setAmbientLight(new AmbientLight(0.1,Color.black));
		///////middle bird
		Sphere c= new Sphere (50, new Point3D(0, 0, -200),new Color(189,183,107),new Material(1,1,20,0,0));
		scene.addGeometry(c);//body
		Sphere  c1= new Sphere (10, new Point3D(-15,15,-150),new Color(255,255,255),new Material(1,1,20,0,0));
		scene.addGeometry(c1);//eye 1
		Sphere  c2= new Sphere (4, new Point3D(-12.5,12.5,-120),Color.black,new Material(1,1,20,1,0));
		scene.addGeometry(c2);//eye 1-in
		Sphere  c3= new Sphere (10, new Point3D(15,15,-150),new Color(255,255,255),new Material(1,1,20,0,0));
		scene.addGeometry(c3);//eye 2
		Sphere  c4= new Sphere (4, new Point3D(12.5,12.5,-120),Color.black,new Material(1,1,20,1,0));
		scene.addGeometry(c4);//eye 2-in
		Triangle triangle = new Triangle(new Point3D(-15, 0, -150),
				new Point3D(15, 0, -150),
				new Point3D( -0,  -20, -150),new Color (0,0,0),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle);//hand1
		Triangle triangle1 = new Triangle(new Point3D(40, 25, -200),
				new Point3D(40, -25, -200),
				new Point3D(100, 40, -250),new Color (189,183,107),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle1);//hand2
		Triangle triangle2 = new Triangle(new Point3D(-40, 25, -200),
				new Point3D(-40, -25, -200),
				new Point3D(-100, 40, -250),new Color (189,183,107),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle2);//mouth
		scene.addLight(new SpotLight( new Point3D(200, 200, -150),0, 0.00001, 0.000005,
				new Vector(new Point3D(-2, -2, -3)),new Color(255, 100, 100)));
		Triangle triangle9 =new Triangle(new Point3D(-10,-43, -180),//leg1
				new Point3D(-12,-43, -180),
				new Point3D( -11,-75, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle9);
		Triangle triangle10 =new Triangle(new Point3D(-11,-55, -180),//leg1
				new Point3D(-15,-55, -160),
				new Point3D( -6,-55, -160), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle10);
		Triangle triangle11 =new Triangle(new Point3D(10,-20, -180),//leg2
				new Point3D(12,-75, -180),
				new Point3D( 11,-20, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle11);
		Triangle triangle12 =new Triangle(new Point3D(10,-55, -180),//leg2
				new Point3D(15,-55, -160),
				new Point3D( 6,-55, -160), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle12);
		////////////////////
		////////// left bird
		Sphere c5= new Sphere (45, new Point3D(-170, 0, -200),new Color(189,183,107),new Material(1,1,20,0,0));
		scene.addGeometry(c5);//body
		Sphere  c6= new Sphere (10, new Point3D(-95,15,-140),new Color(255,255,255),new Material(1,1,20,0,0));
		scene.addGeometry(c6);//eye 1
		Sphere  c7= new Sphere (3, new Point3D(-75,12.5,-120),new Color(0,0,0),new Material(1,1,20,1,0));
		scene.addGeometry(c7);//eye 1-in
		Triangle triangle3 = new Triangle(new Point3D(-90, 0, -200),//mouth1
				new Point3D(-125, -10, -200),
				new Point3D( -130,  2, -200), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle3);
		Triangle triangle4 = new Triangle(new Point3D(-90, -15, -200),//mouth2
				new Point3D(-125, -10, -200),
				new Point3D(-130, 2, -200), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle4);
		Triangle triangle5 = new Triangle(new Point3D(-130,-10, -130),
				new Point3D(-170, 5, -155),
				new Point3D(-120, 2, -155),new Color(189,183,107),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle5);//hand
		scene.addLight(new SpotLight( new Point3D(-140, 5, -100),0, 0.00001, 0.000005,
				new Vector(new Point3D(0, -1, 0)),new Color(255, 100, 100)));
		
		Triangle triangle6 = new Triangle(new Point3D(-215, 0, -180),//tail1
				new Point3D(-210, 10, -180),
				new Point3D( -240,  15, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle6);
		Triangle triangle7 = new Triangle(new Point3D(-215, 0, -180),//tail2
				new Point3D(-210, 10, -180),
				new Point3D( -240,  2, -180), Color.black,new Material(1,1,20,0,0));		
		scene.addGeometry(triangle7);
		Triangle triangle8 =new Triangle(new Point3D(-215, 0, -180),//tail3
				new Point3D(-210, 10, -180),
				new Point3D( -240,  -10, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle8);
		Triangle triangle13 =new Triangle(new Point3D(-145,-50, -180),//leg1-triangle
				new Point3D(-144,-50, -160),
				new Point3D( -146,-60, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle13);
		Triangle triangle14 =new Triangle(new Point3D(-160,-40,-180),//leg1
				new Point3D(-159,-40, -180),
				new Point3D( -158,-75, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle14);
		Triangle triangle15 =new Triangle(new Point3D(-155,-40,-180),//leg1
				new Point3D(-154,-40, -180),
				new Point3D( -153,-75, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle15);
		Triangle triangle16 =new Triangle(new Point3D(-141,-45, -180),//leg-triangle
				new Point3D(-140,-45, -160),
				new Point3D( -142,-55, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle16);
		///////////
		
		///////////tree
		Triangle triangle17 =new Triangle(new Point3D(-300,-60, -180),//base tree
				new Point3D(-300,-70, -180),
				new Point3D( 400,-65, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle17);
		///////////
		
		//////afifon
		Triangle triangle18 =new Triangle(new Point3D(210,190, -180),//right up
				new Point3D(250,180, -180),
				new Point3D( 230,230, -180),new Color(45,174,193),new Material(1,1,20,0,0));//blue	
		scene.addGeometry(triangle18);
		Triangle triangle19 =new Triangle(new Point3D(210,190, -180),//left up
				new Point3D(175,220, -180),
				new Point3D( 230,230, -180), Color.red,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle19);
		Triangle triangle20 =new Triangle(new Point3D(175,120, -180),//right down
				new Point3D(250,180, -180),
				new Point3D( 210,190, -180),new Color(33,189,80),new Material(1,1,20,0,0));//	green
		scene.addGeometry(triangle20);
		Triangle triangle21 =new Triangle(new Point3D(175,120, -180),//right down
				new Point3D(175,220, -180),
				new Point3D( 210,190, -180), Color.yellow,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle21);
		Triangle triangle22 =new Triangle(new Point3D(140,50, -181),//first thread
				new Point3D(178,130, -181),
				new Point3D( 183,130, -181), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle22);
		Triangle triangle23 =new Triangle(new Point3D(138,50, -181),//first thread
				new Point3D(142,50, -181),
				new Point3D( 180,130, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle23);
		/////////
		Triangle triangle24 =new Triangle(new Point3D(138,50, -181),//first thread
				new Point3D(142,50, -181),
				new Point3D( -11,-65, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle24);
		Triangle triangle25 =new Triangle(new Point3D(138,50, -181),//first thread
				new Point3D(-14,-65, -180),
				new Point3D( -8,-65, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle25);
		Triangle triangle26 =new Triangle(new Point3D(-11,-65, -180),//first thread
				new Point3D(-12,-95, -180),
				new Point3D( -20,-95, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle26);
		/////////
		scene.addLight(new SpotLight( new Point3D(-300, 200, -150),0, 0.00001, 0.000005,
				new Vector(new Point3D(1000, -200, 150)),new Color(255, 100, 100)));
		ImageWriter imageWriter = new ImageWriter("bird", 500, 500, 500, 500);

		Render render = new Render(scene,imageWriter);

		render.renderImage();
		imageWriter.writeToimage();
	}
	@Test
	public void closerBird() throws Exception//birds
	{
		Scene scene = new Scene();
		scene.setDistanceViewPlane(300);
		scene.setBackground(new Color(183,216,249));
		scene.setAmbientLight(new AmbientLight(0.1,Color.black));
		///////middle bird
		Sphere c= new Sphere (50, new Point3D(0, 0, -200),new Color(189,183,107),new Material(1,1,20,0,0));
		scene.addGeometry(c);//body
		Sphere  c1= new Sphere (10, new Point3D(-15,15,-150),new Color(255,255,255),new Material(1,1,20,0,0));
		scene.addGeometry(c1);//eye 1
		Sphere  c2= new Sphere (4, new Point3D(-12.5,12.5,-120),Color.black,new Material(1,1,20,1,0));
		scene.addGeometry(c2);//eye 1-in
		Sphere  c3= new Sphere (10, new Point3D(15,15,-150),new Color(255,255,255),new Material(1,1,20,0,0));
		scene.addGeometry(c3);//eye 2
		Sphere  c4= new Sphere (4, new Point3D(12.5,12.5,-120),Color.black,new Material(1,1,20,1,0));
		scene.addGeometry(c4);//eye 2-in
		Triangle triangle = new Triangle(new Point3D(-15, 0, -150),
				new Point3D(15, 0, -150),
				new Point3D( -0,  -20, -150),new Color (0,0,0),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle);//hand1
		Triangle triangle1 = new Triangle(new Point3D(40, 25, -200),
				new Point3D(40, -25, -200),
				new Point3D(100, 40, -250),new Color (189,183,107),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle1);//hand2
		Triangle triangle2 = new Triangle(new Point3D(-40, 25, -200),
				new Point3D(-40, -25, -200),
				new Point3D(-100, 40, -250),new Color (189,183,107),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle2);//mouth
		scene.addLight(new SpotLight( new Point3D(200, 200, -150),0, 0.00001, 0.000005,
				new Vector(new Point3D(-2, -2, -3)),new Color(255, 100, 100)));
		Triangle triangle9 =new Triangle(new Point3D(-10,-43, -180),//leg1
				new Point3D(-12,-43, -180),
				new Point3D( -11,-75, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle9);
		Triangle triangle10 =new Triangle(new Point3D(-11,-55, -180),//leg1
				new Point3D(-15,-55, -160),
				new Point3D( -6,-55, -160), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle10);
		Triangle triangle11 =new Triangle(new Point3D(10,-20, -180),//leg2
				new Point3D(12,-75, -180),
				new Point3D( 11,-20, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle11);
		Triangle triangle12 =new Triangle(new Point3D(10,-55, -180),//leg2
				new Point3D(15,-55, -160),
				new Point3D( 6,-55, -160), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle12);
		////////////////////
		////////// left bird
		Sphere c5= new Sphere (45, new Point3D(-170, 0, -200),new Color(189,183,107),new Material(1,1,20,0,0));
		scene.addGeometry(c5);//body
		Sphere  c6= new Sphere (10, new Point3D(-95,15,-140),new Color(255,255,255),new Material(1,1,20,0,0));
		scene.addGeometry(c6);//eye 1
		Sphere  c7= new Sphere (3, new Point3D(-75,12.5,-120),new Color(0,0,0),new Material(1,1,20,1,0));
		scene.addGeometry(c7);//eye 1-in
		Triangle triangle3 = new Triangle(new Point3D(-90, 0, -200),//mouth1
				new Point3D(-125, -10, -200),
				new Point3D( -130,  2, -200), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle3);
		Triangle triangle4 = new Triangle(new Point3D(-90, -15, -200),//mouth2
				new Point3D(-125, -10, -200),
				new Point3D(-130, 2, -200), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle4);
		Triangle triangle5 = new Triangle(new Point3D(-130,-10, -130),
				new Point3D(-170, 5, -155),
				new Point3D(-120, 2, -155),new Color(189,183,107),new Material(1,1,20,0,0));	
		scene.addGeometry(triangle5);//hand
		scene.addLight(new SpotLight( new Point3D(-140, 5, -100),0, 0.00001, 0.000005,
				new Vector(new Point3D(0, -1, 0)),new Color(255, 100, 100)));
		
		Triangle triangle6 = new Triangle(new Point3D(-215, 0, -180),//tail1
				new Point3D(-210, 10, -180),
				new Point3D( -240,  15, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle6);
		Triangle triangle7 = new Triangle(new Point3D(-215, 0, -180),//tail2
				new Point3D(-210, 10, -180),
				new Point3D( -240,  2, -180), Color.black,new Material(1,1,20,0,0));		
		scene.addGeometry(triangle7);
		Triangle triangle8 =new Triangle(new Point3D(-215, 0, -180),//tail3
				new Point3D(-210, 10, -180),
				new Point3D( -240,  -10, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle8);
		Triangle triangle13 =new Triangle(new Point3D(-145,-50, -180),//leg1-triangle
				new Point3D(-144,-50, -160),
				new Point3D( -146,-60, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle13);
		Triangle triangle14 =new Triangle(new Point3D(-160,-40,-180),//leg1
				new Point3D(-159,-40, -180),
				new Point3D( -158,-75, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle14);
		Triangle triangle15 =new Triangle(new Point3D(-155,-40,-180),//leg1
				new Point3D(-154,-40, -180),
				new Point3D( -153,-75, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle15);
		Triangle triangle16 =new Triangle(new Point3D(-141,-45, -180),//leg-triangle
				new Point3D(-140,-45, -160),
				new Point3D( -142,-55, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle16);
		///////////
		
		///////////tree
		Triangle triangle17 =new Triangle(new Point3D(-300,-60, -180),//base tree
				new Point3D(-300,-70, -180),
				new Point3D( 400,-65, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle17);
		///////////
		
		//////afifon
		Triangle triangle18 =new Triangle(new Point3D(210,190, -180),//right up
				new Point3D(250,180, -180),
				new Point3D( 230,230, -180),new Color(45,174,193),new Material(1,1,20,0,0));//blue	
		scene.addGeometry(triangle18);
		Triangle triangle19 =new Triangle(new Point3D(210,190, -180),//left up
				new Point3D(175,220, -180),
				new Point3D( 230,230, -180), Color.red,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle19);
		Triangle triangle20 =new Triangle(new Point3D(175,120, -180),//right down
				new Point3D(250,180, -180),
				new Point3D( 210,190, -180),new Color(33,189,80),new Material(1,1,20,0,0));//	green
		scene.addGeometry(triangle20);
		Triangle triangle21 =new Triangle(new Point3D(175,120, -180),//right down
				new Point3D(175,220, -180),
				new Point3D( 210,190, -180), Color.yellow,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle21);
		Triangle triangle22 =new Triangle(new Point3D(140,50, -181),//first thread
				new Point3D(178,130, -181),
				new Point3D( 183,130, -181), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle22);
		Triangle triangle23 =new Triangle(new Point3D(138,50, -181),//first thread
				new Point3D(142,50, -181),
				new Point3D( 180,130, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle23);
		/////////
		Triangle triangle24 =new Triangle(new Point3D(138,50, -181),//first thread
				new Point3D(142,50, -181),
				new Point3D( -11,-65, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle24);
		Triangle triangle25 =new Triangle(new Point3D(138,50, -181),//first thread
				new Point3D(-14,-65, -180),
				new Point3D( -8,-65, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle25);
		Triangle triangle26 =new Triangle(new Point3D(-11,-65, -180),//first thread
				new Point3D(-12,-95, -180),
				new Point3D( -20,-95, -180), Color.black,new Material(1,1,20,0,0));	
		scene.addGeometry(triangle26);
		/////////
		scene.addLight(new SpotLight( new Point3D(-300, 200, -150),0, 0.00001, 0.000005,
				new Vector(new Point3D(1000, -200, 150)),new Color(255, 100, 100)));
		ImageWriter imageWriter = new ImageWriter("closerBird", 500, 500, 500, 500);

		Render render = new Render(scene,imageWriter);

		render.renderImage();
		imageWriter.writeToimage();
	}

}
