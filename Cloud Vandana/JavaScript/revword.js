const str = 'I Hear Voices In My Head';
const reverseSentence = str =>{
    const arr = str.split(" ");
    const reversed = arr.map(el => {
        return el.split('').reverse().join("");
    });
    return reversed.join(" ");
};
console.log(reverseSentence(str));