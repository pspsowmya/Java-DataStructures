package com.datastruct;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Orange"));
        balls.add(new Ball("Orange"));
        balls.remove(new Ball("Yellow"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

//    record Ball(String color){
//    }

    static class Ball{
        public Ball(String color) {
            this.color = color;
        }

        String color;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

}
