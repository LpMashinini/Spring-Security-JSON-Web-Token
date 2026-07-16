# Spring Boot JSON WEB Token 🔐

This repository is the result of my journey learning **JWT (JSON Web Token)** and how to integrate it with **Spring Boot**.  
---

## What I Learned
- **Why JWT exists**: I realized that JWT is a way to securely transmit information between parties as a JSON object. It’s compact, self-contained, and digitally signed.
- **Structure of a JWT**:
  - Header → algorithm & token type
  - Payload → claims - like user info, role
  - Signature → ensures integrity
- **Stateless Authentication**: Stores user information in a token, reducing the need for server-side session storage.
- **Secure Data Exchange**: Uses digital signatures to verify that the token has not been altered.
- **Security pitfalls**: Tokens can be stolen if not handled properly.

---

## Implementation
- Creating REST API's
- JWT token generation and validation
- Role-based access control 
- Token expiration handling
