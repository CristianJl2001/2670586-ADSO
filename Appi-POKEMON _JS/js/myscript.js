let contentPrincipal;
let gifOffline = "img/cargando.gif";
let offset = 0;
const limit = 20;

window.onload = function () {
    contentPrincipal = document.getElementById("contentPrincipal");
    contenedorPokemones = document.getElementById("contenedorPokemones");
    imgPokemon = document.getElementById("imgPokemon");
};

function verificarConexion() {
    if (navigator.onLine) {
        
        return true;
    } else {
        
        return false;
    }
}

function mostrarGifCarga() {
    document.getElementById('imgPokemon').src = gifOffline;
}
function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";
    
    
    
    // Consumo - AJAX
    fetch(endpoint)
    .then(res => res.json())
    .then(data => {
        //Codigo para ejecutar en caso de tener el JSON como respuesta de la API 
        contentPrincipal.innerHTML ="";
         for(var i = 0; i < data.results.length; i++){
            
            let html_temporal = 
            `<div  class="btn-group btn-group-sm" role="group" aria-label="Small button group">
                <button type="button" class="btn btn-outline-dark" onclick="cargarDetalle('${data.results[i].url}')">${data.results[i].name}</button>
            </div>`

            contentPrincipal.innerHTML += html_temporal;
            
        }
    });        
}

function cargarDetalle(endpoint) {
    // Muestra el GIF de carga
    mostrarGifCarga();

    fetch(endpoint)
        .then(res => res.json())
        .then(data => {
            // Aquí actualizas la imagen del Pokémon con los datos obtenidos
            document.getElementById('imgPokemon').src = data.sprites.front_default;
        })
        .catch(error => {
            // Si hay un error (como falta de conexión), muestra el GIF de carga
            console.error("Error al cargar los datos:", error);
            mostrarGifCarga();
        });
}




function btn_principio(){
    offset = 0;
    let endpoint_inicio = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;


    fetch(endpoint_inicio).then(res => res.json()).then(data => {
        contentPrincipal.innerHTML = "";
        
        for(var i = 0; i < data.results.length; i++){
            
            let html_temporal = 
            `<div  class="btn-group btn-group-sm" role="group" aria-label="Small button group">
                <button type="button" class="btn btn-outline-dark" onclick="cargarDetalle('${data.results[i].url}')">${data.results[i].name}</button>
            </div>`

            contentPrincipal.innerHTML += html_temporal;
            
        }
    });
}


function btn_siguiente() {
    if (verificarConexion()) {
        // Hay conexión a Internet, realiza la solicitud para cargar los datos
        offset += limit;
        let endpoint_next = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;

        fetch(endpoint_next)
            .then(res => res.json())
            .then(data => {
                contentPrincipal.innerHTML = "";

                for (var i = 0; i < data.results.length; i++) {
                    let html_temporal2 =
                        `<div class="btn-group btn-group-sm" role="group">
                            <button type="button" class="btn btn-outline-dark" onclick="cargarDetalle('${data.results[i].url}')">${data.results[i].name}</button>
                        </div>`;

                    contentPrincipal.innerHTML += html_temporal2;
                }
            });
    } else {
        // No hay conexión a Internet, muestra el GIF de carga
        mostrarGifCarga();
    }
}

function btn_atras() {
    if (offset >= limit) {
        offset -= limit; 
        let endpoint_anterior = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;

        fetch(endpoint_anterior)
        .then(res => res.json()).then(data => {
            contentPrincipal.innerHTML = ""; 

            
            for(var i = 0; i < data.results.length; i++){
                let html_temporal = 
                `<div class="btn-group btn-group-sm" role="group" aria-label="Small button group">
                    <button type="button" class="btn btn-outline-dark" onclick="cargarDetalle('${data.results[i].url}')">${data.results[i].name}</button>
                </div>`

                contentPrincipal.innerHTML += html_temporal;
            }
        });
    }
}



// Botones de siguiente y atras. ademas del gif de cargar


// let contentPrincipal;

// window.onload = function(){
//     // Cuando la ventana se carga completamente, se asigna el elemento con el ID "contentPrincipal" a la variable contentPrincipal.
//     contentPrincipal = document.getElementById("contentPrincipal")
    
// }

// Esta función realiza una llamada a la API de Pokémon y muestra los nombres de los Pokémon.
// function consumoAPI(){
//     let endpoint = "https://pokeapi.co/api/v2/pokemon";
    
//     // Se realiza una solicitud a la API utilizando fetch.
//     fetch(endpoint)
//     // Una vez que se recibe la respuesta, se convierte a formato JSON.
//     .then(res => res.json())
//     .then(data => {
//         // Cada vez que se recibe el JSON de la API, se limpia el contenido del elemento con el ID "contentPrincipal".
//         contentPrincipal.innerHTML ="";
//         // Se itera sobre los resultados de la API y se crea un botón para cada Pokémon.
//         for(var i = 0; i < data.results.length; i++){
//             let html_temporal = `<div>
//                                     <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12">${data.results[i].name}</button>
//                                 </div>`
//             // Se añade el HTML generado al contenido del elemento con el ID "contentPrincipal".
//             contentPrincipal.innerHTML += html_temporal;
//         }                       
//     });
// }

// // Esta función se encarga de cargar los detalles de un Pokémon específico cuando se hace clic en su botón.
// function cargarDetalle(endpoint){
//     // Se realiza una solicitud a la API para obtener los detalles del Pokémon.
//     fetch(endpoint)
//     .then(res => res.json())
//     .then(data => {
//         // Se actualiza el nombre del Pokémon en un elemento con el ID "nombrePokemon".
//         nombrePokemon.innerText = data.name;
//         // Se actualiza la imagen del Pokémon en un elemento con el ID "imgPokemon".
//         imgPokemon.src = data.sprites.other.dream_world.front_default;
//     })
// };
