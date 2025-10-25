# CricbuzzApp

A cricket match simulation project with a Java backend and a **standalone frontend UI**.  
This project is a demo application for showcasing cricket matches, teams, and players, with an interactive and visually appealing frontend.

---

## 🔗 Live Frontend Demo

Check out the live frontend UI hosted on GitHub Pages:  
[https://deepnar.github.io/CricbuzzApp/index.html](https://deepnar.github.io/CricbuzzApp/index.html)

---

## 🏗️ Project Structure
CricbuzzApp/
│
├─ src/ ← Java backend source files
│ ├─ main/
│ │ ├─ matches/ ← Match types (T20, ODI, OneDay)
│ │ ├─ players/ ← Player types (Batsman, Bowler, All-Rounder)
│ │ ├─ Cricbuzz.java ← Main entry point
│ │ └─ teams.java ← Team management
│
├─ docs/ ← Frontend files for GitHub Pages
│ ├─ index.html
│ ├─ teams.html
│ ├─ match.html
│ ├─ login.html
│ ├─ signup.html
│ ├─ styles.css
│ └─ script.js
│
└─ README.md
---

## 💻 Features

### Backend (Java)
- Create teams and players (Batsman, Bowler, All-Rounder)
- Schedule and start matches (T20, ODI, OneDay)
- Add scores and wickets dynamically
- Calculate match results and update team wins
- Display player statistics and ratings

### Frontend (HTML/CSS/JS)
- Modern and colorful UI with header, main, and footer
- Interactive elements like:
  - Random match display
  - Tabs for team/player info
  - Add commentary (demo only)
  - Login/Signup pages (UI only)
- Responsive layout using Flexbox
- Navigation links and clickable "Cricbuzz" logo to go home

---

## 🎨 Frontend Pages

- `index.html` → Home page
- `teams.html` → Team details page
- `match.html` → Match details & commentary page
- `login.html` → Login page (UI only)
- `signup.html` → Signup page (UI only)

---

## ⚡ Usage

1.  **Clone the repository:**

    ```bash
    git clone [https://github.com/deepnar/CricbuzzApp.git](https://github.com/deepnar/CricbuzzApp.git)
    ```

2.  **Backend:**

    Navigate to `src/` and compile the Java code:

    ```bash
    cd CricbuzzApp/src
    javac main/Cricbuzz.java
    java main.Cricbuzz
    ```

3.  **Frontend:**

    Open any HTML page in the browser from `docs/` folder, or visit the live demo:
    [https://deepnar.github.io/CricbuzzApp/signup.html](https://deepnar.github.io/CricbuzzApp/signup.html)

    *Note: Frontend UI is fully functional visually, but login/signup and adding commentary are demo-only.*

---

## 🔧 Technologies Used
**Backend:** Java (OOP concepts: inheritance, abstraction, polymorphism)

**Frontend:** HTML, CSS, JavaScript

**Hosting:** GitHub Pages

---

## 📸 Screenshots
(Optional: Add screenshots of the pages here if you want to impress teachers)

---

## 💡 Future Improvements
- Connect frontend with backend using a proper API
- Enable real-time match updates on frontend
- Add player statistics charts
- Improve interactivity and animations
