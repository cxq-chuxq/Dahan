package com.banyuan.club.snake;


import java.util.Arrays;
import java.util.Random;

public class Grid {
    public final boolean status[][];
    private final int width;
    private final int height;

    private Snake snake;
    private Node food;

    // 初始方向设置为向左
    private Direction snakeDirection = Direction.LEFT;

    public Grid(int width, int height) {  //初始化棋盘

        this.width = width;
        this.height = height;
        status = new boolean[width][height];

        init();
    }

    public void init() {  //初始化蛇的朝向
        for (int i = 0; i < width; ++i) {
            Arrays.fill(status[i], false);
        }

        snakeDirection = Direction.LEFT;
        initSnake();
        createFood();
    }

    /**
     * 初始化棋盘上的贪吃蛇
     * @return
     */
    private Snake initSnake() { //初始化的贪吃蛇的长度不能过长 自己可以定义
        snake = new Snake();
        int x = width / 2;
        for (int i = 0; i < 3; i++) {
            snake.addTail(new Node(x,height / 2));
            x += 1;
        }
        snake.getBody().forEach(this::occupy);

        return snake;
    }

    /**
     * 随机产生一个食物（Node类型），并返回该Node
     * @return
     */
    public Node createFood() {//创建的事务必须是在棋盘中...
        int x,y;
        do{
            Random r=new Random();
            x=r.nextInt(width);
            y=r.nextInt(height);
        }while (status[x][y]);
        food=new Node(x,y);

        return food;
    }

    /**
     * 贪吃蛇往snakeDirection方向移动一格
     *
     * @return 如果游戏结束，返回false，否则返回true
     */
    public boolean nextRound() {
        occupy(snake.getHead());

        // 吃到食物
        if (isFood(snake.getHead())) {
            snake.addTail(snake.move(snakeDirection));
            createFood();
        } else {
            dispose(snake.move(snakeDirection));
        }



        return false;




    }

    public void changeDirection(Direction newDirection) {
        if (snakeDirection.compatibleWith(newDirection)) {
            snakeDirection = newDirection;
        }
    }

    public boolean validPosition(Node area) {
        int x = area.getX(), y = area.getY();
        return x >= 0 && x < width && y >= 0 && y < height && !status[x][y];
    }

    private void dispose(Node node) {
        status[node.getX()][node.getY()] = false;
    }

    private void occupy(Node node) {
        status[node.getX()][node.getY()] = true;
    }


    public boolean isFood(Node area) {
        int x = area.getX(), y = area.getY();
        return x == food.getX() && y == food.getY();
    }

    public Node getFood() {
        return food;
    }

    public Snake getSnake() {
        return snake;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
