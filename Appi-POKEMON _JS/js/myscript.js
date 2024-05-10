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
            
            document.getElementById('imgPokemon').src = data.sprites.front_default;
        })
        .catch(error => {
            
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
