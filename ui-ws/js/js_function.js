
let greet = name => `Hello ${name}!, Welcome to JavaScript World.`
let message = greet(`John`);
console.log(message);


mul = (a,b) => a*b;
perform = (a,b,fn) => fn(a,b);

let result = perform(10,20,(a,b) => a+b);
console.log(result);

