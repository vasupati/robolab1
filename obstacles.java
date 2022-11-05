Public class Obstacles{
    sesor motionsensor;
    float sample;
    double distance;
    """
    methods
    """
    Obstacles (sesor motionsensor, float sample, double distance){
     this.motionsensor= motionsensor;
    this.sample=sample;
    this.distance=distance;
    }
    public double getDistance(){
    return distance;
    }
    public void identifyObstacle(){
    system.out.print(“identify obstacle”);
    }
    Public void closeSensor(){
    System.out.print(“close sensor”);
    }
