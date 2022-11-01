# OOP
1. Створити клас Hero, що представляє собою героя і містить поле name.
    Додати конструктор, який приймає ім'я героя та геттер для імені (Сетер не потрібен).
    Додати метод attackEnemy(), що виводить у консоль повідомлення про те, що герой атакує ворога.
    Створити клас TrainingGround, що містить метод main. Протестувати створення героя та його атаку.

2.Створити класи Warrior, Mage та Archer, що являють собою спадкоємців класу Hero
    Перевизначити в них метод attackEnemy() для виведення спеціалізованого для цього класу повідомлення про атаку.
    Протестувати створення героїв різних класів та їх атаки у класі TrainingGround.

3. Створити клас Enemy, що є ворогом і містить поле health (кількість здоров'я).
    Додати конструктор, який приймає кількість здоров'я, а також сетер та геттер.
    Додати метод takeDamage(int damage), який зменшує кількість здоров'я відповідно до отриманої шкоди.
    Переписати метод attackEnemy класу Hero, додавши йому параметр типу Enemy.
    Метод повинен викликати у ворога метод takeDamage і передавати в нього певну кількість втрат.
    Перевизначити метод у підкласах Warrior, Mage та Archer так, щоб кожен герой завдавав ворогові різну кількість шкоди.

4. Зробити клас Hero та його метод attackEnemy абстрактними.

5. Створити інтерфейс Mortal, що містить метод isAlive().    Зробити те щоб клас Enemy реалізовував інтерфейс Mortal.
    Визначити метод isAlive в класі Enemy так, щоб той повертав true, якщо кількість здоров'я ворога більша за 0.

6. Створити клас BattleGround із методом main, у якому створити симуляцію героя, що атакує ворога.
