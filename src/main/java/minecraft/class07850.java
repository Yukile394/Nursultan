package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class class07850 extends class08088 {
   public static final MapCodec<class07850> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01584.N.fieldOf("settings").forGetter(class07850::B)).apply(var0, var0.stable(class07850::new))
   );
   private final class01584 i;

   @Override
   public int M() {
      return 0;
   }

   public class07850(class01584 var1) {
      super(new class00782(var1.u()), class07536.y_4(var1::N));
      this.i = var1;
   }

   public class01584 B() {
      return this.i;
   }

   @Override
   public int i() {
      return 384;
   }

   @Override
   protected MapCodec<? extends class08088> y() {
      return u;
   }

   @Override
   public class02045 N(class01905<class04412> var1, class04084 var2, long var3) {
      Stream stream = this.i.L().map(class03543::N).orElseGet(() -> var1.z().map(var0x -> (class03556)var0x));
      return class02045.N(var2, var3, this.y, stream);
   }

   @Override
   public void N(class01607 var1, long var2, class04084 var4, class05517 var5, class05324 var6, class08050 var7) {
   }

   @Override
   public int N(int var1, int var2, class07830 var3, class05474 var4, class04084 var5) {
      List list = this.i.R();

      for (int ix = Math.min(list.size() - 1, var4.method_31600()); ix >= 0; ix--) {
         class00500 class00500 = (class00500)list.get(ix);
         if (class00500 != null && var3.u().test(class00500)) {
            return var4.method_31607() + ix + 1;
         }
      }

      return var4.method_31607();
   }

   @Override
   public CompletableFuture<class08050> N(class03001 var1, class04084 var2, class05324 var3, class08050 var4) {
      List list = this.i.R();
      class07218 class07218 = new class07218();
      class07841 class07841x = var4.N(class07830.field_13195);
      class07841 class07841x = var4.N(class07830.field_13194);

      for (int ix = 0; ix < Math.min(var4.method_31605(), list.size()); ix++) {
         class00500 class00500 = (class00500)list.get(ix);
         if (class00500 != null) {
            int j = var4.method_31607() + ix;

            for (int k = 0; k < 16; k++) {
               for (int l = 0; l < 16; l++) {
                  var4.N(class07218.N(k, j, l), class00500);
                  class07841x.N(k, j, l, class00500);
                  class07841x.N(k, j, l, class00500);
               }
            }
         }
      }

      return CompletableFuture.completedFuture(var4);
   }

   @Override
   public int N(class05474 var1) {
      return var1.method_31607() + Math.min(var1.method_31605(), this.i.R().size());
   }

   @Override
   public void N(class01607 var1, class05324 var2, class04084 var3, class08050 var4) {
   }

   @Override
   public void N(class01607 var1) {
   }

   @Override
   public void N(List<String> var1, class04084 var2, class07209 var3) {
   }

   @Override
   public class01376 N(int var1, int var2, class05474 var3, class04084 var4) {
      return new class01376(
         var3.method_31607(), this.i.R().stream().limit(var3.method_31605()).map(var0 -> var0 == null ? class00869.N.W() : var0).toArray(class00500[]::new)
      );
   }

   @Override
   public int R() {
      return -63;
   }
}
