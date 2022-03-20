package de.tekzup.db.entities;

public enum OrderStatus {
 CREATE (0),
 SHIPPING(1),
 DELIVRED(2),
 PAID(3);

private final int value;
OrderStatus(int i) {
value=i;}
public int getValue() { return value; }
}
