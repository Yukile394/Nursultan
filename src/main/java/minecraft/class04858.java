package minecraft;

import com.mojang.serialization.Codec;

public class class04858 extends class00394 {
   public static final Codec<class05946<class05281>> N = class05946.N(class04227.yv);
   public static final class01894 y = class01894.y("empty");
   private static final int P = 0;
   private static final int s = 0;
   public static final String L = "target";
   public static final String u = "pool";
   public static final String i = "joint";
   public static final String R = "placement_priority";
   public static final String M = "selection_priority";
   public static final String B = "name";
   public static final String Z = "final_state";
   public static final String m = "minecraft:air";
   private class01894 T = y;
   private class01894 b = y;
   private class05946<class05281> j = class01019.N;
   private class04853 v = class04853.field_23329;
   private String n = "minecraft:air";
   private int t = 0;
   private int G = 0;

   public class01894 L() {
      return this.b;
   }

   public class04853 M() {
      return this.v;
   }

   public class04858(class07209 var1, class00500 var2) {
      super(class00404.field_16549, var1, var2);
   }

   public int B() {
      return this.t;
   }

   public int Z() {
      return this.G;
   }

   public class07269 i() {
      return class07269.N(this);
   }

   public class05946<class05281> u() {
      return this.j;
   }

   public void y(int var1) {
      this.G = var1;
   }

   public void y(class01894 var1) {
      this.b = var1;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("name", class01894.N, this.T);
      var1.N("target", class01894.N, this.b);
      var1.N("pool", N, this.j);
      var1.N("final_state", this.n);
      var1.N("joint", class04853.field_54790, this.v);
      var1.N("placement_priority", this.t);
      var1.N("selection_priority", this.G);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.T = var1.<class01894>N("name", class01894.N).orElse(y);
      this.b = var1.<class01894>N("target", class01894.N).orElse(y);
      this.j = var1.<class05946<class05281>>N("pool", N).orElse(class01019.N);
      this.n = var1.N("final_state", "minecraft:air");
      this.v = var1.<class04853>N("joint", class04853.field_54790).orElseGet(() -> class01207.N(this.w()));
      this.t = var1.N("placement_priority", 0);
      this.G = var1.N("selection_priority", 0);
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public void N(class04782 var1, int var2, boolean var3) {
      class07209 class07209 = this.d().method_10093(this.w().L(class04884.y).N());
      class03529 class03529 = var1.method_30349().L(class04227.yv).y(this.j);
      class04848.N(var1, class03529, this.b, var2, class07209, var3);
   }

   public void N(int var1) {
      this.t = var1;
   }

   public void N(class01894 var1) {
      this.T = var1;
   }

   public void N(class05946<class05281> var1) {
      this.j = var1;
   }

   public void N(String var1) {
      this.n = var1;
   }

   public void N(class04853 var1) {
      this.v = var1;
   }

   public class01894 N() {
      return this.T;
   }

   public String R() {
      return this.n;
   }
}
