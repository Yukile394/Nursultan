package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.keybinding.CategoryComparator;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public record class06384(class01894 id) {
   static final List<class06384> N = new ArrayList<>();
   public static final class06384 y = N("movement");
   public static final class06384 L = N("misc");
   public static final class06384 u = N("multiplayer");
   public static final class06384 i = N("gameplay");
   public static final class06384 R = N("inventory");
   public static final class06384 M = N("creative");
   public static final class06384 B = N("spectator");
   public static final class06384 Z = N("debug");

   public class06384(class01894 id) {
      this.id = id;
   }

   public class01894 y() {
      return this.id;
   }

   private static void N(class01894 var0, CallbackInfoReturnable var1) {
      N.sort(CategoryComparator.INSTANCE);
   }

   private static class06384 N(String var0) {
      return N(class01894.y(var0));
   }

   public class00392 N() {
      return class00392.L(this.id.B("key.category"));
   }

   public static class06384 N(class01894 var0) {
      class06384 class06384 = new class06384(var0);
      if (N.contains(class06384)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Category '%s' is already registered.", var0));
      } else {
         N.add(class06384);
         N(var0, null);
         return class06384;
      }
   }
}
