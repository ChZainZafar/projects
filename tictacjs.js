const prompt = require('prompt-sync')();
let holder='_';
let isuserOneTurn=true;

let noOfTurns;
let isWin=false;
var board = new Array(3);

for (var i = 0; i < board.length; i++) {
  board[i] = new Array(3);
}
function setBoard() {
    for (let row = 0; row < 3; row++) {
        for (let col = 0; col < 3; col++) {
            
            board[row][col]=holder;
        }
    }
}
function printBoard(){
    console.log("  0 1 2");
    for (let row = 0; row < 3; row++) {
      
       console.log(row+" "+board[row][0]+" "+board[row][1]+" "+board[row][2]);
       
    }
}

setBoard();
   
do{
    console.clear();
printBoard();
let row;
let col;
if(isuserOneTurn){
    
    do{
        row = prompt('Enter row user 1?');
        col = prompt('Enter col user 1?');
    }while(board[row][col] !=holder);
    board[row][col]='X';
    printBoard();
    isuserOneTurn=false;

}else{
    do{
        row = prompt('Enter row user 2?');
        col = prompt('Enter col user 2?');
    }while(board[row][col] !=holder)
    board[row][col]='O'
    isuserOneTurn=true;
}
noOfTurns++;
if(noOfTurns==9){
    console.log("Draw");
}   
if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'
|| board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'
|| board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'
|| board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'
|| board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'
|| board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'
|| board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'
|| board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
console.log("User 2 wins!!");
break;
} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'
|| board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'
|| board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'
|| board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'
|| board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'
|| board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'
|| board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'
|| board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
console.log("User 1 wins!!");
break;
}
}while(noOfTurns!=9||isWin==false)
