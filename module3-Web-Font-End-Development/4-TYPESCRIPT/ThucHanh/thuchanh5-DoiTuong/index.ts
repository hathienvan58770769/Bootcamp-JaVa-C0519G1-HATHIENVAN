
class Circle{
    radius: number = 6;
    color: string = "yellow";

    public getRadius():number {
        return this.radius;
    }
    public getColor():string{
        return this.color;
    }
}
function getRadiusNow(circle: Circle){
    alert("circle radius:" + circle.getRadius() + " , color :" + circle.getColor());
    }

function getArea(circle: Circle){
    alert("circle area:" + circle.getRadius()*circle.getRadius()*3.14+ " , color :" + circle.getColor());
    }