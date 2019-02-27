//Shoshi Berko i.d. 207278284
//Efrat Nahamani i.d. 319022596
//this part of program is in the Primitives package, this is the class of Coordinate.
//it defines a coordinate , by "double".

package Primitives;

public class Coordinate implements Comparable<Coordinate> {
	
	protected double coordinate;
	
	// ***************** Constructors ********************** // 
	public Coordinate()//constructor
	{
		coordinate=0;
	}
	public Coordinate(double a)//parameter constructor 
	{
		this.coordinate = a;
	}
	public Coordinate(Coordinate a)//copy constructor
	{
		this.coordinate=a.getCoordinate();
	}
	
	// ***************** Getters/Setters ********************** // 
	public double getCoordinate() {
		return coordinate;
	}
	public void setcoordinate(double coordinate) {
		this.coordinate = coordinate;
	}
	
	// ***************** Administration  ******************** //
	@Override
	public int compareTo(Coordinate a)//return 0 if this point is equal to the coordinate "a" parameter, else it returns -1 (this<a) or -1 (this>a)
	{
		if(this.coordinate<a.getCoordinate())
	          return -1;
	    else if(a.getCoordinate()<this.coordinate)
	          return 1;
	    return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (Double.doubleToLongBits(coordinate) != Double.doubleToLongBits(other.coordinate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ""+coordinate;
	}
	
	// ***************** Operations ******************** // 
	public void add(Coordinate a)//adds to this coordinate the "a" parameter coordinate
	{
		coordinate+=a.getCoordinate();
	}
	
	public void substract(Coordinate a)//sub from this coordinate the "a" parameter coordinate
	{
		coordinate-=a.getCoordinate();
	}
}
