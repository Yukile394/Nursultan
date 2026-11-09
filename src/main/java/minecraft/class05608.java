package minecraft;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.function.Function;
import org.slf4j.Logger;

public class class05608 implements class05598 {
   private static final Logger L = LogUtils.getLogger();
   static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.data.block.invalid"));
   public static final Function<String, class05622> y = var0 -> new class05600(var0);
   private final class00394 u;
   private final class07209 i;

   public class05608(class00394 var1, class07209 var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   @Override
   public class00392 y() {
      return class00392.N("commands.data.block.modified", this.i.method_10263(), this.i.method_10264(), this.i.method_10260());
   }

   @Override
   public class00392 N(class07793 var1, double var2, int var4) {
      return class00392.N(
         "commands.data.block.get",
         var1.N(),
         this.i.method_10263(),
         this.i.method_10264(),
         this.i.method_10260(),
         String.format(Locale.ROOT, "%.2f", var2),
         var4
      );
   }

   @Override
   public class00392 N(class07709 var1) {
      return class00392.N("commands.data.block.query", this.i.method_10263(), this.i.method_10264(), this.i.method_10260(), class07717.y(var1));
   }

   @Override
   public void N(class07001 var1) {
      class00500 class00500 = this.u.G().method_8320(this.i);

      try (class04495 class04495 = new class04495(this.u.J(), L)) {
         this.u.y_1(class08308.N(class04495, this.u.G().method_30349(), var1));
         this.u.method_5431();
         this.u.G().method_8413(this.i, class00500, class00500, 3);
      }
   }

   @Override
   public class07001 N() {
      return this.u.y_2(this.u.G().method_30349());
   }
}
