package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class05776 extends class05765<class08041> {
   private long N;

   protected void L(class04782 var1, class08041 var2, long var3) {
      class08041 class08041 = (class08041)var2.method_18868().L(class05378.j).get();
      if (!(var2.method_5858(class08041) > 5.0)) {
         class06293.N(var2, class08041, 0.5F, 2);
         if (var3 >= this.N) {
            var2.d();
            class08041.d();
            this.N(var1, var2, class08041);
         } else if (var2.method_59922().y(35) == 0) {
            var1.method_8421(class08041, (byte)12);
            var1.method_8421(var2, (byte)12);
         }
      }
   }

   public class05776() {
      super(ImmutableMap.of(class05378.j, class05367.field_18456, class05378.B, class05367.field_18456), 350, 350);
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      var2.method_18868().y(class05378.j);
   }

   private Optional<class07209> y(class04782 var1, class08041 var2) {
      return var1.method_19494().N(var0 -> var0.N(class03927.m), (var2x, var3) -> this.N(var2, var3, var2x), var2.method_24515(), 48);
   }

   private Optional<class08041> y(class04782 var1, class08041 var2, class08041 var3) {
      class08041 class08041 = var2.y(var1, var3);
      if (class08041 == null) {
         return Optional.empty();
      } else {
         var2.u(6000);
         var3.u(6000);
         class08041.u(-24000);
         class08041.method_5808(var2.method_23317(), var2.method_23318(), var2.method_23321(), 0.0F, 0.0F);
         var1.y(class08041);
         var1.method_8421(class08041, (byte)12);
         return Optional.of(class08041);
      }
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      class07077 class07077 = var2.method_18868().L(class05378.j).get();
      class06293.N(var2, class07077, 0.5F, 2);
      var1.method_8421(class07077, (byte)18);
      var1.method_8421(var2, (byte)18);
      int i = 275 + var2.method_59922().y(50);
      this.N = var3 + i;
   }

   protected boolean N(class04782 var1, class08041 var2) {
      return this.N(var2);
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return var3 <= this.N && this.N(var2);
   }

   private boolean N(class08041 var1) {
      class01289<class08041> class01289 = var1.method_18868();
      Optional<class07077> optional = class01289.L(class05378.j).filter(var0 -> var0.method_5864() == class07078.ye);
      return optional.isEmpty() ? false : class06293.N(class01289, class05378.j, class07078.ye) && var1.q() && optional.get().q();
   }

   private boolean N(class08041 var1, class07209 var2, class03556<class05369> var3) {
      class00143 class00143 = var1.f().N(var2, ((class05369)var3.N()).L());
      return class00143 != null && class00143.z();
   }

   private void N(class04782 var1, class08041 var2, class08041 var3) {
      Optional<class07209> optional = this.y(var1, var2);
      if (optional.isEmpty()) {
         var1.method_8421(var3, (byte)13);
         var1.method_8421(var2, (byte)13);
      } else {
         Optional<class08041> optional1 = this.y(var1, var2, var3);
         if (optional1.isPresent()) {
            this.N(var1, optional1.get(), optional.get());
         } else {
            var1.method_19494().y(optional.get());
            var1.method_74535().y(optional.get());
         }
      }
   }

   private void N(class04782 var1, class08041 var2, class07209 var3) {
      class06289 class06289 = class06289.N(var1.method_27983(), var3);
      var2.method_18868().N(class05378.y, class06289);
   }
}
