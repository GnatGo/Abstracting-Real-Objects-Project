
<img width="264" height="571" alt="ClassDiagram drawio" src="https://github.com/user-attachments/assets/51088551-a58b-4e7b-9670-ed1b2d402333" />


# Refrigerator Simulation Program

## Description
This program simulates the behavior of a refrigerator using object-oriented programming principles in Java. It models a `Refrigerator` class with various attributes and methods to represent and manipulate the state of a refrigerator.
## Features
- **Attributes**:
  - `color`: The color of the refrigerator.
  - `temperature`: The current temperature  of the refrigerator.
  - `material`: The material the refrigerator is made of.
  - `size`: The size of the refrigerator.
  - `technology`: The technology used in the refrigerator (e.g., "Basic Cooling", "Advanced Cooling").
  - `iceTray`: An `IceTray` object representing the ice tray in the refrigerator.

- **Methods**:
  - `changeTemp(double newTemp)`: Changes the temperature of the refrigerator.
  - `ageRefrigerator()`: Simulates aging the refrigerator.
  - `dispenseWater()`: Simulates dispensing water from the refrigerator.
  - `upgradeTechnology(String newTechnology)`: Upgrades the refrigerator's technology.

## How It Works
1. A `Refrigerator` object is created with initial attributes such as color, temperature, material, size, and technology.
2. The program tests the following methods:
   - **`changeTemp`**: Adjusts the refrigerator's temperature.
   - **`ageRefrigerator`**: Simulates the aging process of the refrigerator and changes the material.
   - **`dispenseWater`**: Dispenses water from the refrigerator.
   - **`upgradeTechnology`**: Upgrades the refrigerator's technology to a new level, changes the technology of the refrigerator.
3. The results of each method are printed.
