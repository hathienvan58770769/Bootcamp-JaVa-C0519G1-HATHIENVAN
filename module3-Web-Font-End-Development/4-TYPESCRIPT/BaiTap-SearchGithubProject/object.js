let customer = {
    name: 'Bob',
    age: 50
};
console.log(customer);
/* customer = {
  name: 'Anna'
}; */
/*
* Error: Type '{ name: string; }' is not assignable to type 'IUser'.
* Property 'age' is missing in type '{ name: string; }'.
*/
class Shape {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }
    toString() {
        return `(x: ${this.x}, y: ${this.y})`;
    }
}
class Rect extends Shape {
    constructor(x, y, width, height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    area() {
        return this.width * this.height;
    }
}
const rect = new Rect(5, 5, 10, 20);
console.log(rect.toString());
console.log(rect.area());
