package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
@Value("#{33+21}")
private int x;

@Value("#{99-67}")
private int y;

@Value("#{T(java.lang.Math).sqrt(144)}")
private double a;

@Value("#{T(java.lang.Math).PI}")
private double e;

@Value("#{new String('Brijesh')}")
private String name;

@Value("#{10-6>5}")
private boolean isactive;

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", a=" + a + ", e=" + e + ", name=" + name + ", isactive=" + isactive + "]";
}



}
