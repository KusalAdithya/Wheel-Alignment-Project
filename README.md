# Wheel-Alignment-Project
Java Swing Application developed for Wheel Alignment Shop.

## Tools and Technologies Used
- **Programming Language**: Java
- **Reports**: JasperReports for generating printable reports
- **Hardware Integration**:
  - Barcode readers
  - Payment terminals
  - Printers

---

## Functional Requirements

### 1. Sign In
- Admin can log in to the system using a valid **username** and **password**.
- On successful login, the home page is displayed.

### 2. Home Page
- Provides navigation to all other pages using buttons.
- Displays:
  - **Company logo**
  - **Current date and time**

### 3. Invoice Page
- Select customer via **Customer Selection Dialog**.
- Select service via **Service Section Dialog**.
- Retrieve product details using:
  - Barcode reader
  - Manual product ID input
- Generate and print invoices.

### 4. GRN Page
- Select supplier via **Supplier Selection Dialog**.
- Retrieve product details using:
  - Barcode reader
  - Manual product ID input
- Generate and print GRN invoices.

### 5. Stock Page
- View and search stock items using various filters:
  - Product ID, name, category, brand
  - Selling price range (min and max)
  - Manufacture date range
  - Expiry date range
- Sort products based on search criteria.
- Generate stock reports:
  - General stock report
  - Report for products with quantities below 10
- Update the selling price of a product.

### 6. Manage Customers
- **Functionality**:
  - Register new customers
  - View, search, update, and delete customers
- **Restrictions**:
  - Only customers with car number changes can be deleted.
  - Deleted customers cannot be reactivated.

### 7. Manage Suppliers
- **Functionality**:
  - Register, view, update, search, delete, and make suppliers active
- **Restrictions**:
  - Only the supplier's mobile number and email can be updated.

### 8. Manage Services
- **Functionality**:
  - Add, view, update, delete, and make services active
- **Updates allowed**:
  - Service name
  - Service price

### 9. Manage Products
- **Functionality**:
  - Add, view, update, delete, and make products active
- Product details can be retrieved using a **barcode** or manual input.

### 10. Supplier Report
- Select suppliers and display details in a table.
- Generate reports for selected suppliers.

### 11. Payment History
- View and sort payment history by:
  - Invoice ID
  - Car number
  - Selling date
- View, update, and generate reports for due balances.

### 12. Selling History
- View and sort selling history based on:
  - Invoice ID
  - Car number
  - Selling date

### 13. Service History
- View and sort service history based on:
  - Invoice ID
  - Car number
  - Selling date

---

## System Overview
This system allows an admin to efficiently manage customers, suppliers, products, services, stock, and billing processes. With advanced search, sorting, and reporting features, the system streamlines operations such as generating invoices, updating due balances, and managing inventory. The integration of barcode readers and card payment terminals ensures seamless usability and data retrieval.

---

## How to Run the System

### 1. Install Required Software
- Install **Java Development Kit (JDK)** 8 or above.
- Install **JasperReports Library**.

### 2. Setup Database
- Configure the MySQL database.

### 3. Run the Application
- Compile the Java source code.
- Run the application using an IDE (e.g., **NetBeans**, **IntelliJ**) or command line.

### 4. Hardware Configuration
- Connect **barcode readers**, **payment terminals**, and **printers** to the system.

---

## Troubleshooting
- **Hardware Issues**:
  - Verify that all hardware devices are properly connected.
- **Database Issues**:
  - Check database connections and configurations.
- **General Errors**:
  - Refer to logs for detailed error information.

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
