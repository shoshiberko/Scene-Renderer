//Shoshi Berko i.d. 207278284
//Efrat Nahamani i.d. 319022596
//this part of program is in the Test package, this is the tests of Triangle.
//it defines the test of Triangle-testGetNormal().
package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Elements.Camera;
import Geometries.*;
import Primitives.*;
public class triangleTest {

	@Test
	public void testGetNormal() throws Exception {
		Point3D p=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(0));
		Point3D p1=new Point3D(new Coordinate(1),new Coordinate(0),new Coordinate(0));
		Point3D p2=new Point3D(new Coordinate(0),new Coordinate(1),new Coordinate(0));
		Triangle t=new Triangle(p,p1,p2);
		Point3D p3=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(0));
		Vector v=t.getNormal(p3);
		Point3D p4=new Point3D(new Coordinate(0),new Coordinate(0),new Coordinate(1));
		assertEquals(v,new Vector(p4));
	}
	
	@Test
	public void testfindIntersection() throws Exception {//when the triangle is a higher than the view plane
		Camera camera=new Camera();
		Point3D p1=new Point3D(new Coordinate(0),new Coordinate(10),new Coordinate(-2));
		Point3D p2=new Point3D(new Coordinate(1),new Coordinate(-1),new Coordinate(-2));
		Point3D p3=new Point3D(new Coordinate(-1),new Coordinate(-1),new Coordinate(-2));
		Triangle t=new Triangle(p1,p2,p3);
		List<Point3D> help=new ArrayList<Point3D>();
		List<Point3D> intersectionPoint=new ArrayList<Point3D>();
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
		{
				help=(t.findIntersections(camera.constructRayThroughPixel(3, 3, j,i, 1, 9, 9,2)));
				
				intersectionPoint.addAll(help);
				
		}
		/*System.out.println(intersectionPoint.size());
		for(int i=0;i<intersectionPoint.size();i++){
		    System.out.println(intersectionPoint.get(i).toString());
		}*/
		assertEquals(2,intersectionPoint.size());
	}
	@Test
	public void testfindIntersection1() throws Exception {//when the view plane is higher than the triangle
		Camera camera=new Camera();
		Point3D p1=new Point3D(new Coordinate(0),new Coordinate(1),new Coordinate(-2));
		Point3D p2=new Point3D(new Coordinate(1),new Coordinate(-1),new Coordinate(-2));
		Point3D p3=new Point3D(new Coordinate(-1),new Coordinate(-1),new Coordinate(-2));
		Triangle t=new Triangle(p1,p2,p3);
		List<Point3D> help=new ArrayList<Point3D>();
		List<Point3D> intersectionPoint=new ArrayList<Point3D>();
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
		{
				help=(t.findIntersections(camera.constructRayThroughPixel(3, 3, j,i, 1, 9, 9,2)));
				
				intersectionPoint.addAll(help);
				
		}
		/*System.out.println(intersectionPoint.size());
		for(int i=0;i<intersectionPoint.size();i++){
		    System.out.println(intersectionPoint.get(i).toString());
		}*/
		assertEquals(1,intersectionPoint.size());
	}

}
