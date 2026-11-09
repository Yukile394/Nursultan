package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00549 {
   public static final int N = 8;
   private static final EnumSet<class07830> s = EnumSet.of(class07830.field_13195, class07830.field_13194);
   public static final EnumSet<class07830> y = EnumSet.of(class07830.field_13200, class07830.field_13202, class07830.field_13197, class07830.field_13203);
   public static final class00549 L = N("empty", null, s, class00544.field_12808);
   public static final class00549 u = N("structure_starts", L, s, class00544.field_12808);
   public static final class00549 i = N("structure_references", u, s, class00544.field_12808);
   public static final class00549 R = N("biomes", i, s, class00544.field_12808);
   public static final class00549 M = N("noise", R, s, class00544.field_12808);
   public static final class00549 B = N("surface", M, s, class00544.field_12808);
   public static final class00549 Z = N("carvers", B, y, class00544.field_12808);
   public static final class00549 z = N("features", Z, y, class00544.field_12808);
   public static final class00549 U = N("initialize_light", z, y, class00544.field_12808);
   public static final class00549 E = N("light", U, y, class00544.field_12808);
   public static final class00549 W = N("spawn", E, y, class00544.field_12808);
   public static final class00549 m = N("full", W, y, class00544.field_12807);
   public static final Codec<class00549> P = class04206.W.T();
   private final int T;
   private final class00549 b;
   private final class00544 j;
   private final EnumSet<class07830> v;

   public class00549 L() {
      return this.b;
   }

   public boolean L(class00549 var1) {
      return this.y() <= var1.y();
   }

   protected class00549(@Nullable class00549 var1, EnumSet<class07830> var2, class00544 var3) {
      super();
      this.b = var1 == null ? this : var1;
      this.j = var3;
      this.v = var2;
      this.T = var1 == null ? 0 : var1.y() + 1;
   }

   @Override
   public String toString() {
      return this.R();
   }

   public EnumSet<class07830> i() {
      return this.v;
   }

   public boolean u(class00549 var1) {
      return this.y() < var1.y();
   }

   public class00544 u() {
      return this.j;
   }

   public boolean y(class00549 var1) {
      return this.y() > var1.y();
   }

   public int y() {
      return this.T;
   }

   private static class00549 N(String var0, @Nullable class00549 var1, EnumSet<class07830> var2, class00544 var3) {
      return class00751.N(class04206.W, var0, new class00549(var1, var2, var3));
   }

   public static class00549 N(class00549 var0, class00549 var1) {
      return var0.y(var1) ? var0 : var1;
   }

   public static List<class00549> N() {
      ArrayList arraylist = Lists.newArrayList();

      class00549 class00549;
      for (class00549 = m; class00549.L() != class00549; class00549 = class00549.L()) {
         arraylist.add(class00549);
      }

      arraylist.add(class00549);
      Collections.reverse(arraylist);
      return arraylist;
   }

   public static class00549 N(String var0) {
      return class04206.W.N(class01894.L(var0));
   }

   public boolean N(class00549 var1) {
      return this.y() >= var1.y();
   }

   public String R() {
      return class04206.W.y(this).toString();
   }
}
