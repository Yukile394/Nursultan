package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class class04079 extends class05765<class04067> {
   public static final int N = 100;
   public static final int y = 6;
   public static final int L = 10;
   private static final float R = 1.75F;
   private static final float Z = 0.75F;
   public static final int u = 100;
   public static final int i = 5;
   private int z;
   private int U;
   private final class04891 E;
   private final class04891 W;
   private class04102 m = class04102.field_37494;

   protected void L(class04782 var1, class04067 var2, long var3) {
      var2.method_18868().y(class05378.s);
      var2.B();
      var2.method_18380(class01312.field_18076);
   }

   public class04079(class04891 var1, class04891 var2) {
      super(
         ImmutableMap.of(
            class05378.m,
            class05367.field_18457,
            class05378.P,
            class05367.field_18458,
            class05378.s,
            class05367.field_18456,
            class05378.NN,
            class05367.field_18457
         ),
         100
      );
      this.E = var1;
      this.W = var2;
   }

   protected void u(class04782 var1, class04067 var2, long var3) {
      class07438 class07438 = var2.method_18868().L(class05378.s).get();
      var2.L(class07438);
      switch (this.m) {
         case field_37492:
            if (class07438.method_5739(var2) < 1.75F) {
               var1.method_43129(null, var2, this.E, class04911.field_15254, 2.0F, 1.0F);
               var2.method_18380(class01312.field_37423);
               class07438.method_18799(class07438.method_73189().N(var2.method_73189()).u().L(0.75));
               this.z = 0;
               this.m = class04102.field_38415;
            } else if (this.U <= 0) {
               var2.method_18868().N(class05378.m, new class05352(class07438.method_73189(), 2.0F, 0));
               this.U = 10;
            } else {
               this.U--;
            }
            break;
         case field_38415:
            if (this.z++ >= 6) {
               this.m = class04102.field_37493;
               this.y(var1, var2);
            }
            break;
         case field_37493:
            if (this.z >= 10) {
               this.m = class04102.field_37494;
            } else {
               this.z++;
            }
         case field_37494:
      }
   }

   private void y(class04067 var1, class07438 var2) {
      List<UUID> list = var1.method_18868().L(class05378.Ny).orElseGet(ArrayList::new);
      boolean flag = !list.contains(var2.method_5667());
      if (list.size() == 5 && flag) {
         list.remove(0);
      }

      if (flag) {
         list.add(var2.method_5667());
      }

      var1.method_18868().N(class05378.Ny, list, 100L);
   }

   private void y(class04782 var1, class04067 var2) {
      var1.method_43129(null, var2, this.W, class04911.field_15254, 2.0F, 1.0F);
      Optional<class07049> optional = var2.W();
      if (optional.isPresent()) {
         class07049 class07049 = optional.get();
         if (class07049.method_5805()) {
            var2.method_6121(var1, class07049);
            if (!class07049.method_5805()) {
               class07049.method_5650(class07062.field_26998);
            }
         }
      }
   }

   protected void y(class04782 var1, class04067 var2, long var3) {
      class07438 class07438 = var2.method_18868().L(class05378.s).get();
      class06293.N(var2, class07438);
      var2.L(class07438);
      var2.method_18868().N(class05378.m, new class05352(class07438.method_73189(), 2.0F, 0));
      this.U = 10;
      this.m = class04102.field_37492;
   }

   private boolean N(class04067 var1, class07438 var2) {
      class00143 class00143 = var1.f().N(var2, 0);
      return class00143 != null && class00143.W() < 1.75F;
   }

   protected boolean N(class04782 var1, class04067 var2) {
      class07438 class07438 = var2.method_18868().L(class05378.s).get();
      boolean flag = this.N(var2, class07438);
      if (!flag) {
         var2.method_18868().y(class05378.s);
         this.y(var2, class07438);
      }

      return flag && var2.method_18376() != class01312.field_37422 && class04067.N(class07438);
   }

   protected boolean N(class04782 var1, class04067 var2, long var3) {
      return var2.method_18868().N(class05378.s) && this.m != class04102.field_37494 && !var2.method_18868().N(class05378.NN);
   }
}
