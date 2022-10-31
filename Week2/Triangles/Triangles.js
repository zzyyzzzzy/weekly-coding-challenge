const doesTriangleFit = (tri1, tri2) => {
    let validTriangle = (tri) => {
        return tri[0] + tri[1] > tri[2] && 
        tri[2] + tri[1] > tri[0] && tri[0] + tri[2] > tri[1];
    };
    if(validTriangle(tri1) && validTriangle(tri2)){
        return tri1.reduce((a, b) => a + b) <= tri2.reduce((a, b) => a + b);
    }
    return false;
};

console.log(doesTriangleFit([1, 1, 1], [1, 1, 1]));
console.log(doesTriangleFit([1, 1, 1], [2, 2, 2]));
console.log(doesTriangleFit([1, 2, 3], [1, 2, 2]));
console.log(doesTriangleFit([1, 2, 4], [1, 2, 6]));