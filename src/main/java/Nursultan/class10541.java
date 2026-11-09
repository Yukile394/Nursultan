package Nursultan;

import minecraft.class05865;

public class class10541 extends class05865 {
   public class10541(int[] var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public int y() {
      return this.N[this.y];
   }

   @Override
   public void N(int var1) {
      this.N[this.y] = var1;
   }
}
