/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let prev = 0;
    let curr = 1;
    
    while (true){
        yield prev;
        [prev, curr] = [curr, prev + curr];
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */