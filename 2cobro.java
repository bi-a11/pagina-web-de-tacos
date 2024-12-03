// Script básico para manejar el formulario de pedidos
document.getElementById('pedido-form').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const direccion = document.getElementById('direccion').value;
    const metodoPago = document.getElementById('metodo-pago').value;

    alert(`¡Pedido confirmado!\nDirección: ${direccion}\nMétodo de Pago: ${metodoPago}`);
});

// Script básico para manejar el formulario de contacto
document.getElementById('contacto-form').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const nombre = document.getElementById('nombre').value;
    const email = document.getElementById('email').value;
    const mensaje = document.getElementById('mensaje').value;

    alert(`¡Gracias por tu mensaje, ${nombre}!\nNos pondremos en contacto contigo pronto.`);
});
