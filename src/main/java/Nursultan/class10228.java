package Nursultan;

import minecraft.class01028;

public record class10228(class01028 contents, int width) {
   public class10228(class01028 contents, int width) {
      this.contents = contents;
      this.width = width;
   }

   public int y() {
      return this.width;
   }

   public class01028 N() {
      return this.contents;
   }
}
