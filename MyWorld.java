import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 20, 30);
        
        createApple();
    }
    public void gameOver(){
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel,300, 200);
    }
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
}
