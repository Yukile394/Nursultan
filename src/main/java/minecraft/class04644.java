package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class04644 extends class05787 {
   @Override
   public int L(class05487 var1) {
      return 1;
   }

   @Override
   protected float L() {
      return 100.0F;
   }

   public class04644() {
      super();
   }

   @Nullable
   @Override
   public class07126 B() {
      return class07107.W;
   }

   @Override
   public class04651 i() {
      return class04684.L;
   }

   @Override
   public Optional<class04891> z() {
      return Optional.of(class04909.ut);
   }

   @Override
   public class04651 u() {
      return class04684.y;
   }

   @Override
   public class00500 y(class04688 var1) {
      return class00869.K.W().y(class07117.y, i(var1));
   }

   @Override
   public int y(class05487 var1) {
      return 4;
   }

   @Override
   public int N(class05487 var1) {
      return 5;
   }

   @Override
   public class06581 N() {
      return class06570.jE;
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class07049 var3, class08400 var4) {
      var4.N(class08397.field_56645);
   }

   @Override
   public boolean N(class04688 var1, class07290 var2, class07209 var3, class04651 var4, class07211 var5) {
      return var5 == class07211.field_11033 && !var4.N(class01231.N);
   }

   @Override
   protected boolean N(class04782 var1) {
      return var1.method_64395().N(class07305.NM);
   }

   @Override
   protected void N(class07284 var1, class07209 var2, class00500 var3) {
      class00394 class00394 = var3.k() ? var1.method_8321(var2) : null;
      class00891.N(var3, var1, var2, class00394);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class04688 var3, class06069 var4) {
      if (!var3.u() && !var3.L(N)) {
         if (var4.y(64) == 0) {
            var1.method_8486(
               var2.method_10263() + 0.5,
               var2.method_10264() + 0.5,
               var2.method_10260() + 0.5,
               class04909.It,
               class04911.field_15256,
               var4.z() * 0.25F + 0.75F,
               var4.z() + 0.5F,
               false
            );
         }
      } else if (var4.y(10) == 0) {
         var1.method_8406(class07107.Ns, var2.method_10263() + var4.U(), var2.method_10264() + var4.U(), var2.method_10260() + var4.U(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean N(class04651 var1) {
      return var1 == class04684.L || var1 == class04684.y;
   }
}
