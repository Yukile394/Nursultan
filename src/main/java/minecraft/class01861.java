package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class01861 {
   private final List<class01857> N = new ArrayList<>();
   private long y;

   public class01861() {
      super();
      this.N();
   }

   public static Optional<class07049> N(@Nullable class07049 var0, int var1) {
      if (var0 == null) {
         return Optional.empty();
      } else {
         class06889 class06889xx = var0.method_33571();
         class06889 class06889x = var0.method_5828(1.0F).L((double)var1);
         class06889 class06889xx = class06889xx.i(class06889x);
         class00734 class00734 = var0.method_5829().y(class06889x).M(1.0);
         int i = var1 * var1;
         class06145 class06145 = class08038.N(var0, class06889xx, class06889xx, class00734, class07042.B, i);
         if (class06145 == null) {
            return Optional.empty();
         } else {
            return class06889xx.M(class06145.y()) > i ? Optional.empty() : Optional.of(class06145.L());
         }
      }
   }

   private static class06889 N(float var0) {
      float f = 5.99999F;
      int i = (int)(class04995.N(var0, 0.0F, 1.0F) * 5.99999F);
      float f1 = var0 * 5.99999F - i;

      return switch (i) {
         case 0 -> new class06889(1.0, f1, 0.0);
         case 1 -> new class06889(1.0F - f1, 1.0, 0.0);
         case 2 -> new class06889(0.0, 1.0, f1);
         case 3 -> new class06889(0.0, 1.0 - f1, 1.0);
         case 4 -> new class06889(f1, 0.0, 1.0);
         case 5 -> new class06889(1.0, 0.0, 1.0 - f1);
         default -> throw new IllegalStateException("Unexpected value: " + i);
      };
   }

   private static class06889 N(float var0, float var1, float var2, float var3) {
      class06889 class06889xxx = N(var3).L((double)var0);
      class06889 class06889x = N((var3 + 0.33333334F) % 1.0F).L((double)var1);
      class06889 class06889xx = N((var3 + 0.6666667F) % 1.0F).L((double)var2);
      class06889 class06889xxx = class06889xxx.i(class06889x).i(class06889xx);
      double d0 = Math.max(Math.max(1.0, class06889xxx.M), Math.max(class06889xxx.B, class06889xxx.Z));
      return new class06889(class06889xxx.M / d0, class06889xxx.B / d0, class06889xxx.Z / d0);
   }

   public void N(class01383 var1, double var2, double var4, double var6, float var8) {
      class06202 class06202 = class06202.Nq();
      class00457 class00457 = class06202.NE().g();
      if (((class05731)class06202.L_0).R() != this.y) {
         this.y = ((class05731)class06202.L_0).R();
         this.N();
      }

      Iterator<class01857> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var2, var4, var6, class00457, var1, var8);
      }
   }

   public void N() {
      class06202 class06202 = class06202.Nq();
      this.N.clear();
      if (((class05731)class06202.L_0).y(class06134.l)) {
         this.N.add(new class04194(class06202));
      }

      if (((class05731)class06202.L_0).y(class06134.Q)) {
         this.N.add(new class08206(class06202));
      }

      if (class07529.k) {
         this.N.add(new class01645());
      }

      if (((class05731)class06202.L_0).y(class06134.O)) {
         this.N.add(new class01649(class06202));
      }

      if (((class05731)class06202.L_0).y(class06134.g)) {
         this.N.add(new class01873(class06202));
      }

      if (((class05731)class06202.L_0).y(class06134.I)) {
         this.N.add(new class01872(class06202));
      }

      if (((class05731)class06202.L_0).y(class06134.J)) {
         this.N.add(new class03472(class06202));
      }

      if (class07529.O) {
         this.N.add(new class01648());
      }

      if (class07529.g) {
         this.N.add(new class02804());
      }

      if (class07529.I) {
         this.N.add(new class01665());
      }

      if (((class05731)class06202.L_0).y(class06134.o) || ((class05731)class06202.L_0).y(class06134.q)) {
         this.N.add(new class01867(class06202, ((class05731)class06202.L_0).y(class06134.o), ((class05731)class06202.L_0).y(class06134.q)));
      }

      if (((class05731)class06202.L_0).y(class06134.K)) {
         this.N.add(new class01642(class06202));
      }

      if (class07529.a) {
         this.N.add(new class01502());
      }

      if (class07529.p) {
         this.N.add(new class05375(class06202));
      }

      if (class07529.F) {
         this.N.add(new class06972(new class05375(class06202)));
      }

      if (class07529.A) {
         this.N.add(new class05916(class06202));
      }

      if (class07529.f) {
         this.N.add(new class05687(class06202));
      }

      if (class07529.X) {
         this.N.add(new class05366(class06202));
      }

      if (((class05731)class06202.L_0).y(class06134.V)) {
         this.N.add(new class04172(class06202));
      }

      if (class07529.J) {
         this.N.add(new class01149());
      }

      if (((class05731)class06202.L_0).y(class06134.e)) {
         this.N.add(new class03473(class06202, class00772.field_9284));
      }

      if (class07529.NM) {
         this.N.add(new class01778(class06202));
      }

      if (class07529.Nt) {
         this.N.add(new class06978());
      }

      if (((class05731)class06202.L_0).y(class06134.G)) {
         this.N.add(new class06735(class06202));
      }

      this.N.add(new class02783(class06202));
   }
}
