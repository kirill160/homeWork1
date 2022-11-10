package itStep.Interval;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    private int pointA;
    private int pointB;
    private int size;
    private int firstElementInterval;
    private int lastElementInterval;
    private List<Integer> points = new ArrayList<>(size);

    public Interval(int pointA, int pointB, int size, int firstElement, int lastElement) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.size = size;
        this.firstElementInterval = firstElement;
        this.lastElementInterval = lastElement;
    }
    public Interval(){

    }
    public Interval(int pointA, int pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public int getPointA() {
        return pointA;
    }

    public void setPointA(int pointA) {
        this.pointA = pointA;
    }

    public int getPointB() {
        return pointB;
    }

    public void setPointB(int pointB) {
        this.pointB = pointB;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLastElement() {
        return lastElementInterval;
    }

    public void setLastElement(int lastElement) {
        this.lastElementInterval = lastElement;
    }

    public List<Integer> getPoints() {
        return points;
    }

    public void setPoints(List<Integer> points) {
        this.points = points;
    }

    public int getFirstElement() {
        return firstElementInterval;
    }

    public void setFirstElement(int firstElement) {
        this.firstElementInterval = firstElement;
    }
    private void initArr(){
        for (int i = this.firstElementInterval; i < lastElementInterval; i++) {
            this.points.add(i);
        }
    }
    public List<Integer> concatenationOfValues(@NotNull Interval other){
        List<Integer> res = new ArrayList<>();
        this.initArr();
        other.initArr();
        for (int i = pointA; i < other.size; i++) {
            if(!this.points.get(i).equals(other.points.get(i))){
                res.add(other.points.get(i));
            }
            if(other.points.get(i) == pointB){
                break;
            }


        }
        this.points.addAll(res);
        return this.points;
    }
    public List<Integer> intersectionsOfNumber(Interval other) {
        this.initArr();
        other.initArr();
        for (int i = 0; i < other.size; i++) {
            if (this.points.get(pointA).equals(other.points.get(pointA))) {
                other.points.remove(pointA);
            }
            pointA++;
            if (other.points.get(i) == pointB) {
                break;
            }

        }
        return other.points;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", size=" + size +
                ", firstElementInterval=" + firstElementInterval +
                ", lastElementInterval=" + lastElementInterval +
                ", points=" + points +
                '}';
    }
}
