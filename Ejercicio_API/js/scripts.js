function cargarPersonas() {
    let endpoint = "https://codetesthub.com/API/Obtener.php";
    fetch(endpoint)
    .then(res => res.json())
    .then(data => {
        console.log("Datos JSON recibidos:", data);
        if (!Array.isArray(data)) {
            console.error("Formato inesperado de datos. Se esperaba un array. Datos recibidos:", data);
            return;
        }

        const tbody = document.getElementById('datos');
        tbody.innerHTML = ""; 

        data.forEach(persona => {
            const fila = document.createElement('tr');
            fila.innerHTML = `
                <td>${persona.cedula}</td>
                <td>${persona.nombres}</td>
                <td>${persona.apellidos}</td>
                <td>${persona.telefono}</td>
                <td>${persona.direccion}</td>
                <td>${persona.email}</td>
                <td><img src="${persona.foto}" alt="Foto de ${persona.nombres}" /></td>
            `;
            tbody.appendChild(fila);
        });

        console.log("Tabla actualizada con los datos recibidos");
    })
    .catch(error => {
        console.error('Error al obtener los datos:', error);
    });
}

function insertarPersona() {
    let datos = {
        cedula: "123456789",
        nombres: "Algo",
        apellidos: "No se",
        telefono: "123456789",
        direccion: "AV3333",
        email: "nose@example.com"
    };

    fetch("URL_DEL_ENDPOINT_PARA_INSERTAR_PERSONA", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(datos)
    })
    .then(response => response.json())
    .then(data => {
        console.log("Respuesta del servidor al insertar persona:", data);
    })
    .catch(error => {
        console.error("Error al insertar persona:", error);
    });
}

function actualizarPersona() {
    let datos = {
        cedula: "123456789",
        nombres: "Alguien",
        apellidos: "NN",
        telefono: "987654321",
        direccion: "Avenida 30 AG ",
        email: "algo@example.com"
    };

    fetch("URL_DEL_ENDPOINT_PARA_ACTUALIZAR_PERSONA", {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(datos)
    })
    .then(response => response.json())
    .then(data => {
        console.log("Respuesta del servidor al actualizar persona:", data);
        
    })
    .catch(error => {
        console.error("Error al actualizar persona:", error);
    });
}

function eliminarPersona() {
    let cedula = "123456789";

    fetch(`URL_DEL_ENDPOINT_PARA_ELIMINAR_PERSONA?cedula=${cedula}`, {
        method: "DELETE" 
    })
    .then(response => response.json())
    .then(data => {
        console.log("Respuesta del servidor al eliminar persona:", data);
        
    })
    .catch(error => {
        console.error("Error al eliminar persona:", error);
    });
}
