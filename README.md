# System Design Repository by Rohit Gawande

Welcome to the **System Design Repository**! Here, I document my journey through various modules of system design, covering essential principles, design patterns, and complex system architecture concepts. This repository will serve as a comprehensive guide for anyone interested in building a strong foundation in system design, with detailed explanations of design principles, patterns, key system concepts, and real-world design problems.

---

## Modules Overview

### Module 1: Design Principles
This module introduces fundamental design principles that help build maintainable, scalable, and efficient systems.

- **DRY (Don't Repeat Yourself) Principle**: Ensures minimal duplication within code.
- **KISS (Keep It Simple, Stupid) Principle**: Advocates for simplicity in design to avoid complexity.
- **SOLID Principles**:
  - **Single Responsibility Principle**
  - **Open/Closed Principle**
  - **Liskov Substitution Principle**
  - **Interface Segregation Principle**
  - **Dependency Inversion Principle**
- **CUPID Principles**:
  - **Composability**
  - **Uniformity**
  - **Predictability**
  - **Idempotency**
  - **Discoverability**

---

### Module 2: Introduction to Design Patterns and Types
In this module, I cover Object-Oriented Programming (OOP) essentials and dive into one of the most common design patterns:

- **OOP Overview**: Key concepts of object-oriented programming that form the foundation for design patterns.
- **The Singleton Pattern**:
  - Part 1: Basics of Singleton Pattern
  - Part 2: Thread-safety in Singleton
  - Part 3: Best practices and use cases

---

### Module 3: Creational Patterns
This module focuses on patterns that handle object creation in a way that enhances flexibility and reuse.

- **The Factory Pattern**: A method for creating instances without specifying the exact class.
- **The Factory Method Pattern**: Defines an interface for creating objects, allowing subclasses to alter the type.
- **The Abstract Factory Pattern**: Creates families of related objects without specifying concrete classes.
- **The Singleton Pattern**: Ensures only one instance of a class is created.
- **The Builder Pattern**: Allows step-by-step construction of complex objects.
- **The Prototype Pattern**: Uses cloning for object creation, avoiding repetitive initialization.
- **Summary of Creational Patterns**: A recap and comparison of each creational pattern.

---

### Module 4: Structural Patterns
These patterns help compose classes and objects to form larger structures, adding flexibility to system architecture.

---

### Module 5: Behavioral Patterns
This module covers patterns that help manage complex behaviors and communications between objects.

- **The Adapter Pattern**: Converts an interface to a form expected by the client.
- **The Bridge Pattern**: Decouples an abstraction from its implementation.
- **The Composite Pattern**: Treats individual objects and compositions uniformly.
- **The Decorator Pattern**: Adds responsibilities to objects dynamically.
- **The Façade Pattern**: Simplifies interaction with complex systems.
- **The Flyweight Pattern**: Minimizes memory usage by sharing common parts of objects.
- **The Proxy Pattern**: Controls access to objects, adding security and management layers.
- **Summary of Structural Patterns**: A review and analysis of each structural pattern.

---

### Module 6: Important System Design Concepts
This module covers core concepts essential to designing reliable, high-performance distributed systems.

- **System Design Basics**: Overview of system design fundamentals.
- **Key Characteristics of Distributed Systems**: Characteristics such as scalability, reliability, and fault tolerance.
- **Load Balancing**: Distributing workloads to optimize performance and avoid overloading.
- **Client—Server Model**: Architecture dividing roles between clients and servers.
- **Network Protocols**: Essential protocols for system communication.
- **Storage**: Storage systems, including SQL and NoSQL databases.
- **Latency and Throughput**: Performance metrics crucial to system responsiveness.
- **Availability**: Ensuring uptime and reliability of systems.
- **Caching**: Strategies for storing frequently accessed data.
- **Data Partitioning**: Dividing data across multiple systems for scalability.
- **Indexes**: Optimizing data retrieval in databases.
- **Replication**: Copying data to improve availability and fault tolerance.
- **Sharding**: Splitting data across servers to handle large datasets.
- **Proxies**: Intermediaries in communication, improving security and scalability.
- **Redundancy**: Backup mechanisms to enhance system reliability.
- **SQL vs. NoSQL**: Comparing relational and non-relational databases.
- **CAP Theorem and PACELC Theorem**: Understanding consistency, availability, and partition tolerance in distributed systems.
- **Consistent Hashing**: A technique for scalable and fault-tolerant data distribution.
- **Long Polling vs. WebSockets vs. Server Sent Events**: Techniques for real-time data updates.
- **Bloom Filters**: Space-efficient data structures for probabilistic checks.
- **Quorum, Leader and Follower, Heartbeat, Checksum**: Essential concepts in distributed systems.
- **Rate Limiting**: Controlling resource usage to prevent abuse.
- **Logging and Monitoring**: Tracking system performance and issues.
- **Security and HTTPS**: Protecting data in transit and ensuring secure access.
- **API Design**: Best practices for designing APIs for maintainable and scalable systems.

---

### Module 7: System Design Problems
Here, I work through common system design interview questions and real-world problem scenarios.

- **System Design Interviews: A Step-by-Step Guide**: A framework for approaching design problems.
- **Real-World Design Scenarios**:
  - **Designing a URL Shortening Service like TinyURL**
  - **Designing Pastebin**
  - **Designing Instagram**
  - **Designing Dropbox**
  - **Designing Facebook Messenger**
  - **Designing Twitter**
  - **Designing YouTube**
  - **Designing Netflix**
  - **Designing Typeahead Suggestion**
  - **Designing an API Rate Limiter**
  - **Designing Twitter Search**
  - **Designing a Web Crawler**
  - **Designing Facebook’s Newsfeed**
  - **Designing Yelp or Nearby Friends**
  - **Designing Uber Backend**
  - **Designing Ticketmaster**

---

## How to Use This Repository
Each module contains detailed explanations, example code, and diagrams where applicable to clarify concepts. This repository is organized by modules, with each module folder containing markdown files, code snippets, and any additional resources.

### Contributions
Feel free to contribute to this repository by suggesting new topics, design patterns, or improvements to the explanations and examples.

### Contact
Connect with me on:
- **LinkedIn**: [Rohit Gawande](https://www.linkedin.com/in/rohit-singh-b079192a9/)
- **GitHub**: [RohitGawande](https://leetcode.com/u/ROHIT_GAWANDE/)

Happy learning and coding!
