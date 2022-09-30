// API
const API_ENDPOINT = 'https://yesno.wtf/api';
let btn=document.getElementById("button");
let answer=document.getElementById("answer");

btn.addEventListener("click", function(e){
    e.preventDefault
    fetchAnswer();

    })//btn

function fetchAnswer (){
    let promesa = fetch (API_ENDPOINT,
        {
            method: "GET"
        })//GET

    promesa.then((response)=>{
        response.json().then((data)=>{
        console.log(data);
        
            answer.innerHTML+=`La respuesta es ${data.answer}, ${data.forced}, ${data.image}`;
            answer.style.display = "block";
            setTimeout(()=>{answer.style.display = "none"}, 3000);
           
            }).catch((error)=>{
                console.error("Problemas con el formato de la respuesta" + error);
               })
        }).catch((error)=>{
            console.log("Error en la solicitud" + error);
        });

             



}

//timer esta en STORAGE



/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API +
 * 2. Output the API's response +
 * 3. Attach fetchAnswer to an event listener +
 * 4. Clear output after 3 seconds-- +
 * 5. Optional: add loading/error states--
 *
 */
