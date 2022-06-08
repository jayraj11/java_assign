//Create a new Java class named Car.
class Car{
    private int Year;
    private String Make;
    private double Speed;
//Counstructor, getter methods, accelerate
    Car(int Year, String Make, Double Speed){
        this.Year=Year;
        this.Make=Make;
        this.Speed=Speed;
}
int getYear(){
    return Year;
}
String getMake(){
    return Make;
}
double getSpeed(){
    return Speed;
}
void accelerate(){
    this.Speed+=1.0;
}
}