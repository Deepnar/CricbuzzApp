/* ---------------- Nav Highlight ---------------- */
const currentPage = window.location.pathname.split("/").pop();
document.querySelectorAll("nav a").forEach(a => {
    if (a.href.includes(currentPage)) a.classList.add("active");
});

/* ---------------- Random Match Display ---------------- */
const matches = [
    { title: "Mumbai Indians vs Chennai Super Kings", score: "MI 180/7 - CSK 175/8", winner: "Winner: Mumbai Indians" },
    { title: "RCB vs KKR", score: "RCB 202/6 - KKR 198/9", winner: "Winner: Royal Challengers Bangalore" },
    { title: "Delhi Capitals vs Punjab Kings", score: "DC 155/6 - PBKS 160/7", winner: "Winner: Punjab Kings" }
];

document.getElementById("showMatchBtn")?.addEventListener("click", () => {
    const match = matches[Math.floor(Math.random() * matches.length)];
    document.getElementById("matchTitle").innerText = match.title;
    document.getElementById("matchScore").innerText = match.score;
    document.getElementById("matchWinner").innerText = match.winner;
    document.getElementById("matchResult").classList.remove("hidden");
});

/* ---------------- Login / Signup ---------------- */
function fakeLogin() {
    document.getElementById("loginMsg").innerText = "✅ Login successful! (Demo only)";
}
function fakeSignup() {
    document.getElementById("signupMsg").innerText = "🎉 Account created successfully! (Demo only)";
}

/* ---------------- Match Tabs ---------------- */
const tabButtons = document.querySelectorAll(".tab-btn");
const tabContents = document.querySelectorAll(".tab-content");

tabButtons.forEach(btn => {
    btn.addEventListener("click", () => {
        tabButtons.forEach(b => b.classList.remove("active"));
        tabContents.forEach(c => c.classList.add("hidden"));
        btn.classList.add("active");
        document.getElementById(btn.dataset.tab).classList.remove("hidden");
    });
});

/* ---------------- Commentary ---------------- */
const commentaryLines = [
    "Rohit hits a massive six!",
    "Bumrah bowls a perfect yorker!",
    "Dhoni finishes it off!",
    "Jadeja with a diving stop!",
    "Suryakumar’s scoop shot for four!",
    "Close call for LBW!",
    "Kieron Pollard smashes a boundary!",
    "Deepak Chahar takes an amazing catch!"
];

const commentaryBox = document.getElementById("commentaryBox");
document.getElementById("addCommentBtn")?.addEventListener("click", () => {
    const line = commentaryLines[Math.floor(Math.random() * commentaryLines.length)];
    const p = document.createElement("p");
    p.innerText = line;
    commentaryBox.appendChild(p);
    commentaryBox.scrollTop = commentaryBox.scrollHeight; // auto-scroll
});

/* ---------------- Additional Interactivity ---------------- */
// Example: hover effect to highlight team cards dynamically
const teamCards = document.querySelectorAll(".team-card");
teamCards.forEach(card => {
    card.addEventListener("mouseenter", () => card.style.transform = "scale(1.03)");
    card.addEventListener("mouseleave", () => card.style.transform = "scale(1)");
});
