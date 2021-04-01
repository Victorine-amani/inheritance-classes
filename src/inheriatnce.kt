fun main() {
var car=Car("Nissan","Urvan","Black",15)
    car.carry(13)
    car.identity()
    println(car.calculateParkingFees(2))
    var bus=Bus("Scania","omniExpress","white",55)
    bus.carry(45)
    bus.identity()
    println(bus.maxTripFare(100.00))
    println(bus.calculateParkingFees(4))
}
open class Car(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry(people:Int){

        if(people<=capacity){
            println("Carrying $people passengers")
        }else{
            var x=people-capacity
            println("Over capacity by $x people ")
        }
    }fun identity(){
        println("I am a $colour $make $model")
    }
   open fun calculateParkingFees(Hours:Int):Int{
        return Hours*20
    }

}
class Bus (make:String,model:String,colour:String,capacity:Int):Car(make,model,colour,capacity){
fun maxTripFare(fare:Double):Double{
    return capacity * fare
}

    override fun calculateParkingFees(Hours: Int): Int {
        return super.calculateParkingFees(Hours*capacity)
    }
}