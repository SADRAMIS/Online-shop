# 🛍️ Online-shop

> A Modern E-Commerce Platform Built with Spring Boot | RESTful API | Microservices-Ready Architecture

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=flat&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-316192?style=flat&logo=postgresql)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

---

## 🎯 Overview

Online-shop is a scalable e-commerce platform providing comprehensive product catalog, shopping cart, order management, and payment integration capabilities. Built with Spring Boot 3 and designed for high availability.

### Key Features
- ✅ **Product Catalog** with advanced search & filtering
- ✅ **Shopping Cart** with persistent storage
- ✅ **Order Management** system
- ✅ **User Authentication** with roles (Customer, Admin)
- ✅ **Payment Integration** (Stripe/PayPal)
- ✅ **Admin Dashboard** for inventory management
- ✅ **Inventory Tracking** with stock management

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|----------|
| **Java 17** | Core language |
| **Spring Boot 3** | REST API framework |
| **Spring Data JPA** | Database abstraction |
| **PostgreSQL** | Relational database |
| **Spring Security** | Authentication & authorization |
| **Docker** | Containerization |
| **Maven** | Build tool |

---

## ✨ Features

### Product Management
- 📋 **Catalog Management**
  - Product listing with pagination
  - Category organization
  - Product reviews & ratings
  - Inventory tracking
- 🔍 **Advanced Search**
  - Search by name, category, price
  - Filter by attributes
  - Sort options (price, rating, new)
- 📸 **Product Details**
  - Images & descriptions
  - Specifications
  - Availability status

### Shopping Experience
- 🛍️ **Shopping Cart**
  - Add/remove items
  - Quantity management
  - Persistent cart (DB stored)
  - Cart totals calculation
- 💳 **Checkout Process**
  - Order creation
  - Shipping address management
  - Payment gateway integration
  - Order confirmation

### Order Management
- 📄 **Order Tracking**
  - Order history
  - Order status updates
  - Invoice generation
  - Return management (optional)
- 📦 **Delivery Management**
  - Shipping tracking
  - Status notifications
  - Delivery confirmation

### Admin Features
- 💸 **Inventory Management**
  - Stock tracking
  - Low stock alerts
  - Product bulk actions
- 📈 **Analytics**
  - Sales reports
  - Top products
  - User statistics
- 👤 **User Management**
  - User roles & permissions
  - Account management
  - Activity logs

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- PostgreSQL 13+
- Maven 3.8+
- Docker (optional)

### Installation

```bash
# Clone repository
git clone https://github.com/SADRAMIS/Online-shop.git
cd Online-shop

# Configure database
cp src/main/resources/application.properties.example src/main/resources/application.properties
# Edit application.properties with your DB credentials

# Build
mvn clean package

# Run
mvn spring-boot:run
```

### Docker
```bash
docker-compose up
```

---

## 📖 API Documentation

**Swagger UI**: http://localhost:8080/swagger-ui.html

### Main Endpoints

#### Products
- `GET /api/products` - Get all products (paginated)
- `GET /api/products/{id}` - Get product details
- `GET /api/products/search?q=...` - Search products
- `GET /api/categories` - Get all categories

#### Shopping Cart
- `GET /api/cart` - Get current cart
- `POST /api/cart/items` - Add item to cart
- `PUT /api/cart/items/{itemId}` - Update item quantity
- `DELETE /api/cart/items/{itemId}` - Remove from cart
- `DELETE /api/cart` - Clear cart

#### Orders
- `GET /api/orders` - Get user's orders
- `POST /api/orders` - Create order
- `GET /api/orders/{id}` - Get order details
- `PUT /api/orders/{id}/status` - Update order status (admin)

#### Users
- `POST /api/auth/register` - Register user
- `POST /api/auth/login` - Login
- `GET /api/users/profile` - Get profile
- `PUT /api/users/profile` - Update profile

---

## 📊 Database Schema

### Key Tables
- **users** - User accounts
- **products** - Product catalog
- **categories** - Product categories
- **cart_items** - Shopping cart items
- **orders** - Customer orders
- **order_items** - Items in orders
- **inventory** - Stock tracking

---

## 🔐 Security

- ✅ JWT authentication
- ✅ Role-based access control
- ✅ CORS configuration
- ✅ Input validation
- ✅ SQL injection prevention
- ✅ HTTPS ready

---

## 🧪 Testing

```bash
# Run tests
mvn test

# Coverage report
mvn clean test jacoco:report
```

---

## 🚧 Future Enhancements

- [ ] Wishlist feature
- [ ] Product recommendations
- [ ] Multiple payment methods
- [ ] Coupon/discount system
- [ ] Email notifications
- [ ] SMS alerts
- [ ] Mobile app
- [ ] Real-time inventory updates

---

## 🤝 Contributing

1. Fork the repository
2. Create feature branch: `git checkout -b feature/new-feature`
3. Commit changes: `git commit -m 'Add new feature'`
4. Push: `git push origin feature/new-feature`
5. Open Pull Request

---

## 📄 License

MIT License - see [LICENSE](LICENSE) file

---

## 👨‍💼 Author

**SADRAMIS**
- [GitHub](https://github.com/SADRAMIS)
- [Email](mailto:ramis.sadykov.99@mail.ru)
- [Telegram](https://t.me/Ramzes196)

<div align="center">

### ⭐ If you find this project useful, please consider starring it!

*Made with ❤️ by SADRAMIS*

**Last Updated: December 2025**

</div>
