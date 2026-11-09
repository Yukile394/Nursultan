package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01958 extends class00394 implements class01986, class03136 {
   public static final String N = "sherds";
   public static final String y = "item";
   public static final int u = 1;
   public long i;
   @Nullable
   public class01967 R;
   private class03490 Z;
   private class06584 m = class06584.E;
   @Nullable
   protected class05946<class05074> M;
   protected long B;

   public class07269 i() {
      return class07269.N(this);
   }

   @Nullable
   @Override
   public class05946<class05074> M() {
      return this.M;
   }

   public class01958(class07209 var1, class00500 var2) {
      super(class00404.field_42781, var1, var2);
      this.Z = class03490.N;
   }

   @Override
   public long B() {
      return this.B;
   }

   @Override
   public class00394 Z() {
      return this;
   }

   public class03490 z() {
      return this.Z;
   }

   public class07211 u() {
      return this.w().L(class06665.f);
   }

   @Override
   public void y(class08329 var1) {
      super.y(var1);
      var1.L("sherds");
      var1.L("item");
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.Z.equals(class03490.N)) {
         var1.N("sherds", class03490.y, this.Z);
      }

      if (!this.a_(var1) && !this.m.R()) {
         var1.N("item", class06584.y, this.m);
      }
   }

   @Override
   public void N(class06584 var1) {
      this.y(null);
      this.m = var1;
   }

   @Override
   public class06584 N(int var1) {
      this.y(null);
      class06584 class06584 = this.m.N(var1);
      if (this.m.R()) {
         this.m = class06584.E;
      }

      return class06584;
   }

   @Override
   public class06584 N() {
      this.y(null);
      return this.m;
   }

   public void N(class01967 var1) {
      if (this.z != null && !this.z.method_8608()) {
         this.z.method_8427(this.d(), this.w().i(), 1, var1.ordinal());
      }
   }

   @Override
   public boolean N(int var1, int var2) {
      if (this.z != null && var1 == 1 && var2 >= 0 && var2 < class01967.values().length) {
         this.i = this.z.N();
         this.R = class01967.values()[var2];
         return true;
      } else {
         return super.N(var1, var2);
      }
   }

   @Override
   public void N(long var1) {
      this.B = var1;
   }

   @Override
   public void N(@Nullable class05946<class05074> var1) {
      this.M = var1;
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.Z = var1.<class03490>N("sherds", class03490.y).orElse(class03490.N);
      if (!this.c_(var1)) {
         this.m = var1.<class06584>N("item", class06584.y).orElse(class06584.E);
      } else {
         this.m = class06584.E;
      }
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.Nt, this.Z);
      var1.N(class02484.NG, class02854.N(List.of(this.m)));
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.Z = var1.a_(class02484.Nt, class03490.N);
      this.m = var1.a_(class02484.NG, class02854.N).N();
   }

   public static class06584 N(class03490 var0) {
      class06584 class06584 = class06570.RB.E();
      class06584.N(class02484.Nt, var0);
      return class06584;
   }
}
