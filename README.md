# ⚔️ Let the Battle Commence

> Assignment 1 - Advanced Programming  
> Vietnam National University, Ho Chi Minh City  
> Ho Chi Minh City University of Technology

---

## 🧠 Mô tả bài toán

**Let the Battle Commence** là một mô phỏng chiến đấu giữa các nhân vật thuộc nhiều chủng loại khác nhau, mỗi loại có cách tính **Combat Score** riêng biệt. Dự án này triển khai các class Java dựa trên sơ đồ UML được cung cấp, nhằm mô phỏng chiến trường nơi các nhân vật chiến đấu theo quy tắc cụ thể.

---

## 🧱 Cấu trúc bài làm

```bash
/
└── YourName_StudentID/
    ├── class/
    │   ├── Battle.class
    │   ├── Combatable.class
    │   ├── Fighter.class
    │   ├── Human.class
    │   ├── Main.class
    │   └── Monster.class
    ├── source/
    │   ├── Knight.java
    │   ├── Warrior.java
    │   ├── Paladin.java
    │   └── DeathEater.java
    └── util/
        ├── Complex.java
        ├── TeamMaker.java
        └── Utility.java
⚔️ Quy tắc tính CombatScore
🛡️ Knight & Warrior
Nếu ground là số nguyên tố → Warrior được x2 baseHP

Nếu ground là số chính phương → Knight được x2 baseHP

Bình thường:

Nếu WP = 1 → CombatScore = baseHP

Nếu WP ≠ 1 → CombatScore = baseHP / 10

✨ Paladin
CombatScore mặc định: 3 × baseHP

Nếu baseHP là số Fibonacci Fn (n > 2) → CombatScore = 1000 + n

CombatScore có thể vượt 999

💀 DeathEater
Không có HP, chỉ có MP là số phức C = (real, imaginary)

CombatScore = real! + imaginary!

📦 Nội dung phần giao
Phần	Nội dung	Ghi chú
Part A	Các class bytecode đã được cung cấp	Không sửa
Part B	Các class cần implement: Knight, Warrior, Paladin, DeathEater	Bắt buộc
Part C	Có thể chỉnh sửa: Complex.java, TeamMaker.java	Tùy chỉnh để đáp ứng yêu cầu

🧪 Kiểm thử
Việc test sẽ dựa trên file TeamMaker.java được thay đổi khi chấm điểm

Bạn không cần chỉnh sửa Main.java hoặc Battle.class
