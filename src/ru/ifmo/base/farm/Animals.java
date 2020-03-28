package ru.ifmo.base.farm;

public class Animals {
   protected String name;
   protected int weight;
   protected int speed;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      if (name.length() > 3 && name != null)  {
         this.name = name;
      }
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      if (weight > 0) {
      this.weight = weight;
      }
   }

   public int getSpeed() {
      return speed;
   }

   public void setSpeed(int speed) {
      if (speed > 0) {
         this.speed = speed;
      }
   }
}
