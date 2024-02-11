class Product:
    def __init__(self, product_id, name, price, quantity):
        self.product_id = product_id
        self.name = name
        self.price = price
        self.quantity = quantity

    def display_details(self):
        print(f"Product ID: {self.product_id}")
        print(f"Name: {self.name}")
        print(f"Price: ${self.price}")
        print(f"Quantity: {self.quantity}")


class InventoryManagementSystem:
    def __init__(self):
        self.products = []

    def add_product(self, product_id, name, price, quantity):
        product = Product(product_id, name, price, quantity)
        self.products.append(product)
        print(f"Product '{name}' added successfully.")

    def display_products(self):
        print("Available Products:")
        for product in self.products:
            product.display_details()

    def update_quantity(self, product_id, new_quantity):
        for product in self.products:
            if product.product_id == product_id:
                product.quantity = new_quantity
                print(f"Quantity updated for product '{product.name}'.")
                return
        print(f"Error: Product with ID '{product_id}' not found.")


def main():
    inventory_system = InventoryManagementSystem()

    # Add products to inventory
    inventory_system.add_product(101, "Laptop", 999, 10)
    inventory_system.add_product(102, "Mouse", 20, 50)

    # Display available products
    inventory_system.display_products()

    # Update quantity of a product
    inventory_system.update_quantity(101, 8)

    # Display updated products
    inventory_system.display_products()


if __name__ == "__main__":
    main()
