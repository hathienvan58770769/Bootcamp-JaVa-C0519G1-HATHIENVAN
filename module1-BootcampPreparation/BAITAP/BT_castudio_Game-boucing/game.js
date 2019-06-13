var canvas = document.getElementById('gameBouncingBall');
var context = canvas.getContext("2d");

var ballR = 10, x = canvas.width / 2, y = canvas.height - 30, dx = 3, dy = -3, pongH = 15, pongW = 80, pongX = (canvas.width - pongW) / 2, rightKey = false,  leftKey = false, brickRows = 3 , brickCol = 9, brickW = 75, brickH = 20, brickPadding = 10, brickOffsetTop = 30, brickOffsetLeft = 30;

var bricks = [];

for (let col = 0; col < brickCol; col++) {
    for (let row = 0; row < brickRows; row++) {
        bricks.push({
            x : (col * (brickW + brickPadding)) + brickOffsetLeft,
            y : (row * ( brickH + brickPadding)) + brickOffsetTop,
            status : 1
        });  
    }
}

function drawBall() {
    context.beginPath();
    context.arc(x, y, ballR, 0, Math.PI * 2);
    context.fillStyle = "yellow";
    context.fill();
    context.closePath();
}

function drawPong() {
    context.beginPath();
    context.rect(pongX, canvas.height - pongH, pongW, pongH);
    context.fillStyle = "pink";
    context.fill();
    context.closePath();
}

function drawBricks() {
    bricks.forEach(function (brick){
        if (!brick.status) return;

            context.beginPath();
            context.rect(brick.x, brick.y, brickW, brickH);
            context.fillStyle = "pink";
            context.fill();
            context.closePath();
        }
    );
}
 
function collisionDetection() {
    bricks.forEach(function(b){
        if (!b.status) return;

        var inBricksColumn = x > b.x && x < b.x + brickW,
        inBricksRow = y > b.y && y<b.y + brickH;

        if (inBricksColumn && inBricksRow){
                dy = -dy;
                b.status = 0;
            }
        }
    );
}

function draw() {
    context.clearRect(0, 0, canvas.width, canvas.height);

    drawBricks();
    drawBall();
    drawPong();
    collisionDetection();

    if (hitSideWall()) 
        dx = - dx;
    if (hitTop() || hitPong()) 
        dy = - dy;
    if (gameOver()) 
        document.location.reload();

    function ballOverPong() {
        return x > pongX && x < (pongX + pongW);
    }
    function hitBottom() {
        return (y + dy) > (canvas.height - ballR);
    }
    function hitPong() {
        return hitBottom() && ballOverPong();
    }
    function gameOver() {
        return hitBottom() && !ballOverPong();
    }
    function hitSideWall() {
        return (x + dx) > (canvas.width - ballR) || (x + dx)  < ballR;
    }
    function hitTop() {
        return (y + dy) < ballR;
    }
    function rightPressed(event) {
        return event.keyCode == 39;
    }
    function leftPressed(event) {
        return event.keyCode == 37;
    }
    function keyDown(event) {
        rightKey = rightPressed(event);
        leftKey = leftPressed(event);
    }
    function keyUp(event) {
        rightKey = rightPressed(event) ? false : rightKey;
        leftKey = leftPressed(event) ? false : leftKey;
    }

    document.addEventListener("keydown", keyDown, false);
    document.addEventListener("keyup", keyUp, false);

    var maxX = canvas.width - pongW, minX = 0, pongDelta = rightKey ? 7 : leftKey ? -7 : 0;

    pongX = pongX + pongDelta;
    pongX = Math.min(pongX, maxX);
    pongX = Math.max(pongX, minX);
    
    x += dx;
    y += dy;
}
setInterval(draw, 20);
