package minecraft;

import Nursultan.class10461;
import org.jspecify.annotations.Nullable;

public class class04610 extends class05096 {
   private static final class00392 Z = class00392.L("gui.stats");
   static final class01894 N = class01894.y("container/slot");
   static final class01894 y = class01894.y("statistics/header");
   static final class01894 L = class01894.y("statistics/sort_up");
   static final class01894 u = class01894.y("statistics/sort_down");
   private static final class00392 z = class00392.L("multiplayer.downloadingStats");
   static final class00392 i = class00392.L("stats.none");
   private static final class00392 U = class00392.L("stat.generalButton");
   private static final class00392 E = class00392.L("stat.itemsButton");
   private static final class00392 W = class00392.L("stat.mobsButton");
   protected final class05096 R;
   private static final int m = 280;
   public final class03686 M = new class03686(this);
   private final class03271 P = new class03271(var1x -> {
      class06478 class06478 = this.method_37063(var1x);
   }, var1x -> this.method_37066(var1x));
   @Nullable
   private class03281 s;
   final class01205 B;
   private boolean T = true;

   public class04610(class05096 var1, class01205 var2) {
      super(Z);
      this.R = var1;
      this.B = var2;
   }

   public void N() {
      if (this.T) {
         if (this.s != null) {
            this.method_37066(this.s);
         }

         this.s = class03281.method_48623(this.P, this.field_22789)
            .N(
               new class10461(this, U, new class04597(this, this.field_22787)),
               new class10461(this, E, new class04611(this, this.field_22787)),
               new class10461(this, W, new class04607(this, this.field_22787))
            )
            .N();
         this.method_25395(this.s);
         this.method_37063(this.s);
         this.N(1);
         this.N(2);
         this.s.method_48987(0, false);
         this.method_48640();
         this.T = false;
      }
   }

   static String N(class04907<class01894> var0) {
      return "stat." + ((class01894)var0.R()).toString().replace(':', '.');
   }

   private void N(int var1) {
      if (this.s != null) {
         Object object = this.s.method_71284().get(var1);
         boolean flag = object instanceof class10461 && !((class10461)object).N.method_25396().isEmpty();
         this.s.method_71522(var1, flag);
         if (flag) {
            this.s.method_71521(var1, null);
         } else {
            this.s.method_71521(var1, class04141.N(class00392.L("gui.stats.none_found")));
         }
      }
   }

   @Override
   public void method_25426() {
      class00392 class00392 = z;
      this.s = class03281.method_48623(this.P, this.field_22789)
         .N(
            new class08745(this.method_64506(), U, class00392),
            new class08745(this.method_64506(), E, class00392),
            new class08745(this.method_64506(), W, class00392)
         )
         .N();
      this.method_37063(this.s);
      this.M.y(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(200).N());
      this.s.method_71522(0, true);
      this.s.method_71522(1, false);
      this.s.method_71522(2, false);
      this.M.method_48206(var1x -> {
         var1x.method_48591(1);
         this.method_37063(var1x);
      });
      this.s.method_48987(0, false);
      this.method_48640();
      this.field_22787.NE().N(new class00535(class00569.field_12775));
   }

   @Override
   public boolean method_25404(class06601 var1) {
      return this.s != null && this.s.method_25404(var1) ? true : super.method_25404(var1);
   }

   @Override
   public void method_48640() {
      if (this.s != null) {
         this.s.method_48618(this.field_22789);
         this.s.method_49613();
         int ix = this.s.method_48202().L();
         class03255 class03255 = new class03255(0, ix, this.field_22789, this.field_22790 - this.M.y() - ix);
         this.s.method_71284().forEach(var1x -> var1x.method_48612(var1xx -> var1xx.method_53533(class03255.B())));
         this.P.N(class03255);
         this.M.y(ix);
         this.M.N();
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(class08394.Na, class05096.field_49896, 0, this.field_22790 - this.M.y(), 0.0F, 0.0F, this.field_22789, 2, 32, 2);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }

   @Override
   protected void method_57735(class01054 var1) {
      var1.N(class08394.Na, class05213.i, 0, 0, 0.0F, 0.0F, this.field_22789, this.M.L(), 16, 16);
      this.method_57736(var1, 0, this.M.L(), this.field_22789, this.field_22790);
   }
}
