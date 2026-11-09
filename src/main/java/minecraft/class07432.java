package minecraft;

import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class07432 extends class07473 {
   private int N;
   private final class07475 y;
   @Nullable
   private class08036 L;
   private class07456 u;

   @Override
   public void L() {
      Iterator<class00250> iterator = this.y.method_73183().N(class00250.class, this.y.method_5829().M(5.0)).iterator();

      while (iterator.hasNext()) {
         if (iterator.next().method_5642() instanceof class08036 class08036) {
            this.L = class08036;
            break;
         }
      }

      this.N = 0;
      this.u = class07456.field_6401;
   }

   public class07432(class07475 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void i() {
      float f = this.u == class07456.field_6400 ? 0.01F : 0.015F;
      this.y
         .method_5724(
            f,
            new class06889(
               this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue(),
               this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_1.floatValue(),
               this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue()
            )
         );
      this.y.method_5784(class07451.field_6308, this.y.method_18798());
      if (--this.N <= 0) {
         this.N = this.N(10);
         if (this.u == class07456.field_6401) {
            class07209 class07209x = this.L.method_24515().method_10093(this.L.method_5735().b());
            class07209x = class07209x.method_10069(0, -1, 0);
            this.y.f().N((double)class07209x.method_10263(), (double)class07209x.method_10264(), (double)class07209x.method_10260(), 1.0);
            if (this.y.method_5739(this.L) < 4.0F) {
               this.N = 0;
               this.u = class07456.field_6400;
            }
         } else if (this.u == class07456.field_6400) {
            class07211 class07211 = this.L.method_5755();
            class07209 class07209 = this.L.method_24515().method_10079(class07211, 10);
            this.y.f().N((double)class07209.method_10263(), (double)(class07209.method_10264() - 1), (double)class07209.method_10260(), 1.0);
            if (this.y.method_5739(this.L) > 12.0F) {
               this.N = 0;
               this.u = class07456.field_6401;
            }
         }
      }
   }

   @Override
   public void u() {
      this.L = null;
   }

   @Override
   public boolean y() {
      return this.L != null && this.L.method_5765() && this.L.method_76798();
   }

   @Override
   public boolean N() {
      if (this.L != null && this.L.method_76798()) {
         return true;
      } else {
         Iterator<class00250> iterator = this.y.method_73183().N(class00250.class, this.y.method_5829().M(5.0)).iterator();

         while (iterator.hasNext()) {
            class07438 class07438 = iterator.next().method_5642();
            if (class07438 instanceof class08036 && ((class08036)class07438).method_76798()) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean O_() {
      return true;
   }
}
