function handlebtnSubmit() {
    var productName = document.getElementById("product_name").value;
    var productAmount = document.getElementById("product_amount").value;
    var productPrice = document.getElementById("product_price").value;
    var productDescription = document.getElementById("product_description").value;   
    
    if (productName == "" || productAmount == null || productPrice == null || productDescription == "") {
        handleClearShowProductError()
        document.getElementById("show_error").innerText = `The field input cannot be blank !`;
    }
    else if (productName == productDescription) {
        handleClearShowProductError()
        document.getElementById("show_error").innerText = `Product name and Product description cannot be same`;
    } else if (productAmount == productPrice) {
        handleClearShowProductError()
        document.getElementById("show_error").innerText = `Product amount and Product price cannot be same`;
    } else {
        document.getElementById("show_error").innerText = ``;
        handleShowProductSuccess(productName, productAmount, productPrice,productDescription)
    }
    clearInformationProduct()
}

function handleShowProductSuccess(producttName, productAmount, productPrice,productDescription) {
    document.getElementById("show_productName").innerText = `Product Name: ${producttName}`;
    document.getElementById("show_productPrice").innerText = `Product Price: ${productPrice}`;;
    document.getElementById("show_productAmount").innerText = `Product Amount: ${productAmount}`;;
    document.getElementById("show_productDescription").innerText = `Product Description: ${productDescription}`;
}

function handleClearShowProductError() {
    document.getElementById("show_productName").innerText = ``
    document.getElementById("show_productPrice").innerText = ''
    document.getElementById("show_productAmount").innerText = ``
    document.getElementById("show_productDescription").innerText = ``
}

function clearInformationProduct() {
    document.getElementById("product_name").value = ""
    document.getElementById("product_amount").value = ""
    document.getElementById("product_price").value = ""
    document.getElementById("product_description").value = ""
}