package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class class05973 {
   static final class01894 N = class01894.y("spectator/close");
   static final class01894 y = class01894.y("spectator/scroll_left");
   static final class01894 L = class01894.y("spectator/scroll_right");
   private static final class01262 Z = new class05965();
   private static final class01262 z = new class05958(-1, true);
   private static final class01262 U = new class05958(1, true);
   private static final class01262 E = new class05958(1, false);
   private static final int W = 8;
   static final class00392 u = class00392.L("spectatorMenu.close");
   static final class00392 i = class00392.L("spectatorMenu.previous_page");
   static final class00392 R = class00392.L("spectatorMenu.next_page");
   public static final class01262 M = new class05937();
   private final class01239 m;
   private class05971 P;
   private int s = -1;
   int B;

   public class05971 L() {
      return this.P;
   }

   public class05973(class01239 var1) {
      super();
      this.P = new class05938();
      this.m = var1;
   }

   public int i() {
      return this.s;
   }

   public void u() {
      this.m.N(this);
   }

   public void y(int var1) {
      class01262 class01262 = this.N(var1);
      if (class01262 != M) {
         if (this.s == var1 && class01262.ax_()) {
            class01262.N(this);
         } else {
            this.s = var1;
         }
      }
   }

   public class01262 y() {
      return this.N(this.s);
   }

   public List<class01262> N() {
      ArrayList arraylist = Lists.newArrayList();

      for (int ix = 0; ix <= 8; ix++) {
         arraylist.add(this.N(ix));
      }

      return arraylist;
   }

   public void N(class05971 var1) {
      this.P = var1;
      this.s = -1;
      this.B = 0;
   }

   public class01262 N(int var1) {
      int ix = var1 + this.B * 6;
      if (this.B > 0 && var1 == 0) {
         return z;
      } else if (var1 == 7) {
         return ix < this.P.N().size() ? U : E;
      } else if (var1 == 8) {
         return Z;
      } else {
         return ix >= 0 && ix < this.P.N().size() ? (class01262)MoreObjects.firstNonNull(this.P.N().get(ix), M) : M;
      }
   }

   public class01271 R() {
      return new class01271(this.N(), this.s);
   }
}
