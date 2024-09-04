# Pong 2D Game

# Overview

Pong 2D Game is a modern take on the classic arcade game, developed in Java using Android Studio. This project is designed to offer a simple yet engaging gaming experience, where the player competes against an AI-controlled opponent. The game is built to be lightweight, responsive, and easy to play, making it suitable for a wide range of devices.

# Features
- Single-Player Mode: Play against a challenging AI opponent.
- Smooth Controls: Intuitive touch-based controls for easy gameplay.
- Dynamic Gameplay: The ball's speed increases with every rally, adding difficulty over time.
- Responsive UI: The game adapts seamlessly to various screen sizes and resolutions.
- Pause and Resume: Players can pause the game and resume later.
- Score Tracking: Keep track of your high scores and improve your game.

# Installation

- Clone the repository:
git clone https://github.com/your-username/pong-2d-game.git
- Open the project in Android Studio:
- Navigate to File > Open and select the project folder.
Build the project:
- Click on the "Build" button or select Build > Make Project from the menu.
- Run the app:
- Connect an Android device or start an emulator and click on the "Run" button.

# How to Play

- Objective: The main goal is to prevent the ball from passing your slider while aiming to score by getting the ball past the opponent's slider.

- Controls: Use your finger to drag the slider vertically on your side of the screen.

- Scoring: Each time you succeed in scoring against the opponent, you earn a point. The first to reach a predefined score (e.g., 10 points) wins the game.

- Game Over: The game ends when either you or the AI reaches the winning score.

# Game Mechanics

- Ball Movement: The ball moves at a constant speed, which increases slightly with each successful rally.
- AI Opponent: The computer slider is controlled by an AI that predicts the ball's movement and adjusts accordingly. The AI difficulty is balanced to provide a fair challenge.
- Collision Detection: The game uses precise collision detection to ensure realistic interactions between the ball and the sliders.

# Technical Details

Language: Java

IDE: Android Studio

Min SDK: 21 (Android 5.0 Lollipop)

Target SDK: 33 (Android 13)

# Libraries Used:

AndroidX for UI components.

ConstraintLayout for responsive UI design.

VectorDrawables for scalable graphics.

# Project Structure
src/main/java/com/example/pong2dgame:

- MainActivity.java: Entry point of the application.
- PongActivity.java: Core game logic and rendering.
- GameActivity.java: Menu and navigation handling.

src/main/res/layout:

- activity_main.xml: Layout for the main menu.
- activity_game.xml: Layout for the game screen.

src/main/res/drawable:

- Custom drawable resources such as the play_button_bg and pong_logo.

src/main/res/values:

- Strings, colors, and other resources.

# Future Enhancements

- Multiplayer Mode: Add local or online multiplayer capabilities to compete against other players.
- Difficulty Levels: Implement multiple difficulty settings (Easy, Medium, Hard) to cater to players of different skill levels.
- Power-Ups: Introduce power-ups that add an extra layer of strategy to the game.
- Custom Themes: Allow players to choose from different themes or skins for their sliders and ball.
- Sound Effects: Add sound effects and background music to enhance the gaming experience.

# Bugs and Issues
If you encounter any bugs or issues, please report them by creating an issue on the GitHub Issue Tracker. Contributions and pull requests are also welcome.

# License
This project is licensed under the MIT License - see the LICENSE file for details.

# Credits
- Development: Sachin Maurya
- Graphics: Custom-designed using Android Studio’s vector tools.

# Contributing
Contributions are welcome! Please follow these steps:

# Fork the repository.
- Create a new branch (git checkout -b feature-branch).
- Commit your changes (git commit -m 'Add new feature').
- Push to the branch (git push origin feature-branch).
- Open a Pull Request.