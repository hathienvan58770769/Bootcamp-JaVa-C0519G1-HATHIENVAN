class Circle {
    constructor() {
        this.radius = 6;
        this.color = "yellow";
    }
    getRadius() {
        return this.radius;
    }
    getColor() {
        return this.color;
    }
}
function getRadiusNow(circle) {
    alert("circle radius:" + circle.getRadius() + " , color :" + circle.getColor());
}
function getArea(circle) {
    alert("circle area:" + circle.getRadius() * circle.getRadius() * 3.14 + " , color :" + circle.getColor());
}
