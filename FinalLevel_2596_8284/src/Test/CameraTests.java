//Shoshi Berko i.d. 207278284
//Efrat Nahamani i.d. 319022596
//this part of program is in the Test package, this is the tests of Camera.
//it defines the tests of Camera-estRaysConstruction1() and estRaysConstruction2().
package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import Primitives.*;
import Elements.*;
public class CameraTests {

	@Test
	public void testRaysConstruction1() throws Exception {
		Camera cam=new Camera();
		Ray result= cam.constructRayThroughPixel (3, 3, 0, 0,1, 9,9,2);
		Vector v=new Vector(new Point3D(new Coordinate(-3),new Coordinate(3),new Coordinate(-1)));
		v.normalize();
		assertEquals(result,new Ray(new Point3D(cam.getP0()),v));

		
	}

	@Test
	public void testRaysConstruction2() throws Exception {
		Camera cam=new Camera();
		Ray result= cam.constructRayThroughPixel (3, 3, 2, 2,1, 9,9,2);
		Vector v=new Vector(new Point3D(new Coordinate(3),new Coordinate(-3),new Coordinate(-1)));
		v.normalize();
		assertEquals(result,new Ray(new Point3D(cam.getP0()),v));

		
	}
}
