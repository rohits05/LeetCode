/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
      let count = init;

      return{
        increment(){
          count++; return count;
        },

        decrement(){
          count--; return count;
        },
          
        reset(){
          count = init; return count;
        }
      }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */