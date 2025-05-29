<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Página creada con JavaScript</title>
</head>
<body>
  <script>
    // Crear y dar estilo al encabezado
    const header = document.createElement('div');
    header.textContent = "Página de la Profesora";
    header.style.textAlign = "center";
    header.style.backgroundColor = "#333";
    header.style.color = "white";
    header.style.padding = "15px";
    header.style.fontSize = "24px";
    header.style.fontWeight = "bold";
    document.body.appendChild(header);

    // Crear título principal
    const h1 = document.createElement('h1');
    h1.textContent = "Doctora Erika Yunuen Morales Mateos";
    h1.style.textAlign = "center";
    document.body.appendChild(h1);

    // Crear subtítulo
    const h2 = document.createElement('h2');
    h2.textContent = "La Doctora Erika, Docente de la universidad UJAT en la División de Tecnologías de la Información";
    h2.style.textAlign = "center";
    document.body.appendChild(h2);

    // Línea divisoria
    document.body.appendChild(document.createElement('hr'));

    // Crear párrafo
    const p = document.createElement('p');
    p.textContent = "Durante su trayectoria como docente ha impartido diversas asignaturas en esta división, siendo la programación una de sus asignaturas más fuertes.";
    p.style.textAlign = "center";
    p.style.color = "blue";
    p.style.fontSize = "20px";
    document.body.appendChild(p);

    // Crear imagen centrada
    const imgDiv = document.createElement('div');
    imgDiv.style.textAlign = "center";
    const img = document.createElement('img');
    img.src = "avatar1.jpg"; // Asegúrate de tener esta imagen en el mismo directorio
    img.alt = "Doctora Erika Yunuen";
    img.width = 340;
    imgDiv.appendChild(img);
    document.body.appendChild(imgDiv);

    // Línea divisoria
    document.body.appendChild(document.createElement('hr'));

    // Crear sección de enlaces
    const enlacesDiv = document.createElement('div');
    enlacesDiv.style.textAlign = "right";
    enlacesDiv.style.margin = "30px";

    const enlaces = [
      { texto: "Ir a Tiktok", url: "https://www.tiktok.com" },
      { texto: "Ir a Facebook", url: "https://www.facebook.com" },
      { texto: "Ir a Instagram", url: "https://www.instagram.com" },
      { texto: "Ir a Correo", url: "https://www.gmail.com" }
    ];

    enlaces.forEach(enlace => {
      const a = document.createElement('a');
      a.href = enlace.url;
      a.textContent = enlace.texto;
      a.style.display = "block";
      a.style.margin = "5px 0";
      a.target = "_blank";
      enlacesDiv.appendChild(a);
    });

    document.body.appendChild(enlacesDiv);
  </script>
</body>
</html>
