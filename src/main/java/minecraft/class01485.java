package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class01485 extends class05765<class07633> {
   private static final int N = 3;
   private static final int y = 60;
   private static final int L = 110;
   private final class07078<? extends class07633> u;
   private final float i;
   private final int R;
   private static final int Z = 2;
   private long z;

   protected void L(class04782 var1, class07633 var2, long var3) {
      class07633 class07633 = this.N(var2);
      class06293.N(var2, (class07438)class07633, this.i, this.R);
      if (var2.method_24516(class07633, 3.0)) {
         if (var3 >= this.z) {
            var2.N(var1, class07633);
            var2.method_18868().y(class05378.j);
            class07633.method_18868().y(class05378.j);
         }
      }
   }

   private Optional<? extends class07633> L(class07633 var1) {
      return var1.method_18868()
         .L(class05378.B)
         .get()
         .N(var2 -> var2.method_5864() == this.u && var2 instanceof class07633 class07633 && var1.N(class07633) && !class07633.Nk())
         .map(class07633.class::cast);
   }

   public class01485(class07078<? extends class07633> var1) {
      this(var1, 1.0F, 2);
   }

   public class01485(class07078<? extends class07633> var1, float var2, int var3) {
      super(
         ImmutableMap.of(
            class05378.B,
            class05367.field_18456,
            class05378.j,
            class05367.field_18457,
            class05378.m,
            class05367.field_18458,
            class05378.P,
            class05367.field_18458,
            class05378.NN,
            class05367.field_18457
         ),
         110
      );
      this.u = var1;
      this.i = var2;
      this.R = var3;
   }

   protected void u(class04782 var1, class07633 var2, long var3) {
      var2.method_18868().y(class05378.j);
      var2.method_18868().y(class05378.m);
      var2.method_18868().y(class05378.P);
      this.z = 0L;
   }

   private boolean y(class07633 var1) {
      class01289<?> class01289 = var1.method_18868();
      return class01289.N(class05378.j) && class01289.L(class05378.j).get().method_5864() == this.u;
   }

   protected boolean y(class04782 var1, class07633 var2, long var3) {
      if (!this.y(var2)) {
         return false;
      } else {
         class07633 class07633 = this.N(var2);
         return class07633.method_5805()
            && var2.N(class07633)
            && class06293.N(var2.method_18868(), class07633)
            && var3 <= this.z
            && !var2.Nk()
            && !class07633.Nk();
      }
   }

   protected void N(class04782 var1, class07633 var2, long var3) {
      class07633 class07633 = this.L(var2).get();
      var2.method_18868().N(class05378.j, class07633);
      class07633.method_18868().N(class05378.j, var2);
      class06293.N(var2, (class07438)class07633, this.i, this.R);
      int ix = 60 + var2.method_59922().y(50);
      this.z = var3 + ix;
   }

   protected boolean N(class04782 var1, class07633 var2) {
      return var2.NX() && this.L(var2).isPresent();
   }

   private class07633 N(class07633 var1) {
      return (class07633)var1.method_18868().L(class05378.j).get();
   }
}
