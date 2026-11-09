package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05780 extends class05765<class08041> {
   private static final int N = 900;
   private static final int y = 40;
   @Nullable
   private class06584 L;
   private final List<class06584> u = Lists.newArrayList();
   private int i;
   private int R;
   private int Z;

   public void L(class04782 var1, class08041 var2, long var3) {
      class07438 class07438 = this.u(var2);
      this.N(class07438, var2);
      if (!this.u.isEmpty()) {
         this.i(var2);
      } else {
         L(var2);
         this.Z = Math.min(this.Z, 40);
      }

      this.Z--;
   }

   private static void L(class08041 var0) {
      var0.method_5673(class07085.field_6173, class06584.E);
      var0.N(class07085.field_6173, 0.085F);
   }

   public class05780(int var1, int var2) {
      super(ImmutableMap.of(class05378.b, class05367.field_18456), var1, var2);
   }

   private void i(class08041 var1) {
      if (this.u.size() >= 2 && ++this.i >= 40) {
         this.R++;
         this.i = 0;
         if (this.R > this.u.size() - 1) {
            this.R = 0;
         }

         N(var1, this.u.get(this.R));
      }
   }

   private class07438 u(class08041 var1) {
      class01289<class08041> class01289 = var1.method_18868();
      class07438 class07438 = class01289.L(class05378.b).get();
      class01289.N(class05378.P, new class05751(class07438, true));
      return class07438;
   }

   public void u(class04782 var1, class08041 var2, long var3) {
      super.y(var1, var2, var3);
      var2.method_18868().y(class05378.b);
      L(var2);
      this.L = null;
   }

   public void y(class04782 var1, class08041 var2, long var3) {
      super.u(var1, var2, var3);
      this.u(var2);
      this.i = 0;
      this.R = 0;
      this.Z = 40;
   }

   private void y(class08041 var1) {
      for (class07324 class07324 : var1.y()) {
         if (!class07324.b() && this.N(class07324)) {
            this.u.add(class07324.B());
         }
      }
   }

   private boolean N(class07324 var1) {
      return class06584.y(this.L, var1.y()) || class06584.y(this.L, var1.L());
   }

   public boolean N(class04782 var1, class08041 var2) {
      class01289<class08041> class01289 = var2.method_18868();
      if (class01289.L(class05378.b).isEmpty()) {
         return false;
      } else {
         class07438 class07438 = class01289.L(class05378.b).get();
         return class07438.method_5864() == class07078.Ly
            && var2.method_5805()
            && class07438.method_5805()
            && !var2.method_6109()
            && var2.method_5858(class07438) <= 17.0;
      }
   }

   private void N(class08041 var1) {
      N(var1, this.u.get(0));
   }

   private void N(class07438 var1, class08041 var2) {
      boolean flag = false;
      class06584 class06584 = var1.method_6047();
      if (this.L == null || !class06584.y(this.L, class06584)) {
         this.L = class06584;
         flag = true;
         this.u.clear();
      }

      if (flag && !this.L.R()) {
         this.y(var2);
         if (!this.u.isEmpty()) {
            this.Z = 900;
            this.N(var2);
         }
      }
   }

   private static void N(class08041 var0, class06584 var1) {
      var0.method_5673(class07085.field_6173, var1);
      var0.N(class07085.field_6173, 0.0F);
   }

   public boolean N(class04782 var1, class08041 var2, long var3) {
      return this.N(var1, var2) && this.Z > 0 && var2.method_18868().L(class05378.b).isPresent();
   }
}
