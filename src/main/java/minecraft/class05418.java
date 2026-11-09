package minecraft;

import org.jspecify.annotations.Nullable;

public final class class05418 {
   public static final class05418 N = N("all");
   public static final class05418 y = N("texture", N);
   public static final class05418 L = N("particle", y);
   public static final class05418 u = N("end", N);
   public static final class05418 i = N("bottom", u);
   public static final class05418 R = N("top", u);
   public static final class05418 M = N("front", N);
   public static final class05418 B = N("back", N);
   public static final class05418 Z = N("side", N);
   public static final class05418 z = N("north", Z);
   public static final class05418 U = N("south", Z);
   public static final class05418 E = N("east", Z);
   public static final class05418 W = N("west", Z);
   public static final class05418 m = N("up");
   public static final class05418 P = N("down");
   public static final class05418 s = N("cross");
   public static final class05418 T = N("cross_emissive");
   public static final class05418 b = N("plant");
   public static final class05418 j = N("wall", N);
   public static final class05418 v = N("rail");
   public static final class05418 n = N("wool");
   public static final class05418 t = N("pattern");
   public static final class05418 G = N("pane");
   public static final class05418 l = N("edge");
   public static final class05418 d = N("fan");
   public static final class05418 w = N("stem");
   public static final class05418 k = N("upperstem");
   public static final class05418 Y = N("crop");
   public static final class05418 Q = N("dirt");
   public static final class05418 O = N("fire");
   public static final class05418 g = N("lantern");
   public static final class05418 I = N("platform");
   public static final class05418 J = N("unsticky");
   public static final class05418 o = N("torch");
   public static final class05418 q = N("layer0");
   public static final class05418 K = N("layer1");
   public static final class05418 V = N("layer2");
   public static final class05418 e = N("lit_log");
   public static final class05418 H = N("candle");
   public static final class05418 c = N("inside");
   public static final class05418 X = N("content");
   public static final class05418 a = N("inner_top");
   public static final class05418 p = N("flowerbed");
   public static final class05418 F = N("tentacles");
   public static final class05418 A = N("bars");
   private final String f;
   @Nullable
   private final class05418 C;

   private class05418(String var1, @Nullable class05418 var2) {
      super();
      this.f = var1;
      this.C = var2;
   }

   @Override
   public String toString() {
      return "#" + this.f;
   }

   @Nullable
   public class05418 y() {
      return this.C;
   }

   public static class05418 N(String var0) {
      return new class05418(var0, null);
   }

   public String N() {
      return this.f;
   }

   public static class05418 N(String var0, class05418 var1) {
      return new class05418(var0, var1);
   }
}
