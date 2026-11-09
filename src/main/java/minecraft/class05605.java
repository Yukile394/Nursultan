package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05605 implements class05598 {
   private static final Logger y = LogUtils.getLogger();
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.data.entity.invalid"));
   public static final Function<String, class05622> N = var0 -> new class05614(var0);
   private final class07049 u;

   public class05605(class07049 var1) {
      super();
      this.u = var1;
   }

   @Override
   public class00392 y() {
      return class00392.N("commands.data.entity.modified", this.u.method_5476());
   }

   private void N(class07001 var1, CallbackInfo var2) {
      class07049 class07049 = this.u;
      if (class07049 instanceof class00717) {
         class07049.getChangeListener().N();
      }
   }

   @Override
   public class00392 N(class07793 var1, double var2, int var4) {
      return class00392.N("commands.data.entity.get", var1.N(), this.u.method_5476(), String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   @Override
   public class00392 N(class07709 var1) {
      return class00392.N("commands.data.entity.query", this.u.method_5476(), class07717.y(var1));
   }

   @Override
   public class07001 N() {
      return class00809.y(this.u);
   }

   @Override
   public void N(class07001 var1) throws CommandSyntaxException {
      if (this.u instanceof class08036) {
         throw L.create();
      } else {
         UUID uuid = this.u.method_5667();

         try (class04495 class04495 = new class04495(this.u.method_71370(), y)) {
            this.u.method_5651(class08308.N(class04495, this.u.method_56673(), var1));
            this.u.method_5826(uuid);
            this.N(var1, null);
         }
      }
   }
}
