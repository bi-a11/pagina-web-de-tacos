# pagina-web-de-tacos
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Tacos</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Bienvenidos a Tacos Deliciosos</h1>
    </header>

    <section class="tacos">
        <h2>Tacos de Carne Asada</h2>
        <img src="taco1.jpg" alt="Taco de Carne Asada">
        <p>Disfruta de nuestros deliciosos tacos de carne asada. Precio: <span class="precio">$50</span></p>
        <button onclick="addToCart('Taco de Carne Asada', 50)">Añadir al carrito</button>
    </section>

    <section class="tacos">
        <h2>Tacos al Pastor</h2>
        <img src="taco2.jpg" alt="Taco al Pastor">
        <p>Prueba nuestros tacos al pastor. Precio: <span class="precio">$45</span></p>
        <button onclick="addToCart('Taco al Pastor', 45)">Añadir al carrito</button>
    </section>

    <section class="tacos">
        <h2>Tacos de Pollo</h2>
        <img src="taco3.jpg" alt="Taco de Pollo">
        <p>Tacos de pollo jugosos y sabrosos. Precio: <span class="precio">$40</span></p>
        <button onclick="addToCart('Taco de Pollo', 40)">Añadir al carrito</button>
    </section>

    <section id="cart">
        <h3>Carrito</h3>
        <ul id="cartItems"></ul>
        <p>Total: $<span id="total">0</span></p>
        <button onclick="checkout()">Pagar</button>
    </section>

    <footer>
        <p>&copy; 2024 Tacos Deliciosos. Todos los derechos reservados.</p>
    </footer>

    <script src="script.js"></script>
</body>
</html>
/* styles.css */
body {
    font-family: Arial, sans-serif;
    background-color: #fff8e1;
    color: #333;
    margin: 0;
    padding: 0;
}

header {
    background-color: #ff6347;
    color: white;
    text-align: center;
    padding: 20px;
}

h1 {
    margin: 0;
}

section.tacos {
    background-color: white;
    padding: 20px;
    margin: 20px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
    color: #ff6347;
}

img {
    max-width: 100%;
    height: auto;
    border-radius: 8px;
}

button {
    background-color: #ff6347;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 1em;
}

button:hover {
    background-color: #e5533b;
}

#cart {
    background-color: #f7f7f7;
    padding: 20px;
    margin-top: 40px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

#cart ul {
    list-style-type: none;
    padding: 0;
}

#cart ul li {
    background-color: #fff;
    margin-bottom: 10px;
    padding: 10px;
    border-radius: 5px;
}

#cart p {
    font-weight: bold;
}

footer {
    background-color: #333;
    color: white;
    text-align: center;
    padding: 10px 0;
    position: fixed;
    width: 100%;
    bottom: 0;
}
// script.js
let cart = [];
let total = 0;

function addToCart(item, price) {
    cart.push({ item: item, price: price });
    total += price;
    updateCart();
}

function updateCart() {
    const cartItems = document.getElementById("cartItems");
    cartItems.innerHTML = ''; // Limpiar carrito
    cart.forEach(function (product) {
        const li = document.createElement("li");
        li.textContent = `${product.item} - $${product.price}`;
        cartItems.appendChild(li);
    });

    const totalDisplay = document.getElementById("total");
    totalDisplay.textContent = total;
}

function checkout() {
    if (cart.length === 0) {
        alert("El carrito está vacío.");
    } else {
        alert(`Gracias por tu compra. El total es $${total}`);
        cart = [];
        total = 0;
        updateCart();
    }
}
