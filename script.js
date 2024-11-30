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
