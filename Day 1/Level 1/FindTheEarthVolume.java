//Create FindTheEarthVolume Class to compute Volume of the Earth

class FindTheEarthVolume{
	public static void main(String[] args){
 
	 //Create a variable named "radiusOfEarth" to indicate the Radius of Earth.
     int radiusOfEarth = 6378; 
	 
	 //Create a variable named "earthVolume" to indicate the Volume of Earth in Kilometers.
	 double earthVolumeKilometer = (4/3) * Math.PI * Math.pow(radiusOfEarth,3);
	 
	 //Create a variable named "earthVolumeMiles" to indicate the Volume of Earth in Miles
	 double earthVolumeMiles = earthVolumeKilometer * 1.6;
	 	
	 //Print the Earth's volume.
	 System.out.println("The volume of earth in cubic kilometers is "+earthVolumeKilometer+" and cubic miles is "+earthVolumeMiles);
	 
	}
}