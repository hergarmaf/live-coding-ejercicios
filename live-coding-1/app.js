/* Escribe tu código aquí.
2.- Construye una función que reciba por parámetros un array de strings y lo imprima dentro de la lista (

) en el index.html. La función debe mostrar la lista en el HTML manipulando el DOM, cada string del arreglo debe imprimirse en un elemento
. El array que se recibe por parámetros debe ser un array resultante de utilizar la función anterior.
Escribe una función que reciba 1 parámetro
Parámetro 1 - Un array de strings
La función debe mostrar la lista en el HTML, cada string del arreglo debe imprimirse en un elemento
.
Ejemplo:
const myArray = ['insecto', 'bootcamp', 'escritorio'];
printArray(myArray);
Output - <li>insecto</li> <li>bootcamp</li> <li>escritorio</li> 3.- Conecta tu archivo JS con el index.html. Comprueba el funcionamiento del código con diferentes inputs.
*/

let ul=document.getElementById("ul");
let palabras = ['insecto', 'bootcamp', 'escritorio','Mel','Carina'];
app(palabras);

function app(arrayLista){
    arrayLista.forEach(element => {
        ul.innerHTML+=`<li>${element}</li>`;
    });
    
}



