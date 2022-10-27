async function init(){

cargarSuministros();
}


function cargarSuministros(){

  const request = await fetch('suministros', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const suministros = await request.json();

    let listadoHtml='';
    const tablaSuministros = document.getElementById('#suministrosTable');

    for(let suministro for suministros){
    let suministroHtml = '<tr><td>'+suministro.nombre+'</td><td>'+suministro.tipo+'</td> <td>'+suministro.cantidad+'</td></tr>';

    listadoHtml = listadoHtml + suministroHtml;
    }

tablaSuministros.innerHTML = listadoHtml;

}