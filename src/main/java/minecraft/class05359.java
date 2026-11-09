package minecraft;

public class class05359 {
   public static final class05359 N = N("core");
   public static final class05359 y = N("idle");
   public static final class05359 L = N("work");
   public static final class05359 u = N("play");
   public static final class05359 i = N("rest");
   public static final class05359 R = N("meet");
   public static final class05359 M = N("panic");
   public static final class05359 B = N("raid");
   public static final class05359 Z = N("pre_raid");
   public static final class05359 z = N("hide");
   public static final class05359 U = N("fight");
   public static final class05359 E = N("celebrate");
   public static final class05359 W = N("admire_item");
   public static final class05359 m = N("avoid");
   public static final class05359 P = N("ride");
   public static final class05359 s = N("play_dead");
   public static final class05359 T = N("long_jump");
   public static final class05359 b = N("ram");
   public static final class05359 j = N("tongue");
   public static final class05359 v = N("swim");
   public static final class05359 n = N("lay_spawn");
   public static final class05359 t = N("sniff");
   public static final class05359 G = N("investigate");
   public static final class05359 l = N("roar");
   public static final class05359 d = N("emerge");
   public static final class05359 w = N("dig");
   private final String k;
   private final int Y;

   public class05359(String var1) {
      super();
      this.k = var1;
      this.Y = var1.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class05359 class05359 = (class05359)var1;
         return this.k.equals(class05359.k);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.N();
   }

   @Override
   public int hashCode() {
      return this.Y;
   }

   public String N() {
      return this.k;
   }

   private static class05359 N(String var0) {
      return class00751.N(class04206.Q, var0, new class05359(var0));
   }
}
