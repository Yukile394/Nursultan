package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class01894 implements Comparable<class01894> {
   public static final Codec<class01894> N = Codec.STRING.comapFlatMap(class01894::u, class01894::toString).stable();
   public static final class02362<ByteBuf, class01894> y = class02389.s.N_10(class01894::N, class01894::toString);
   public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("argument.id.invalid"));
   public static final char u = ':';
   public static final String i = "minecraft";
   public static final String R = "realms";
   private final String B;
   private final String Z;

   @Nullable
   public static class01894 L(String var0) {
      return y(var0, ':');
   }

   public String L(String var1, String var2) {
      return var1 + "." + this.u() + "." + var2;
   }

   private static String L(StringReader var0) {
      int ix = var0.getCursor();

      while (var0.canRead() && N(var0.peek())) {
         var0.skip();
      }

      return var0.getString().substring(ix, var0.getCursor());
   }

   public String L() {
      return this.toString().replace('/', '_').replace(':', '_');
   }

   private static boolean L(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.';
   }

   public class01894 M(String var1) {
      return this.i(this.Z + var1);
   }

   private class01894(String var1, String var2) {
      super();

      assert z(var1);

      assert Z(var2);

      this.B = var1;
      this.Z = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class01894 class01894) ? false : this.B.equals(class01894.B) && this.Z.equals(class01894.Z);
      }
   }

   @Override
   public String toString() {
      return this.B + ":" + this.Z;
   }

   @Override
   public int hashCode() {
      return 31 * this.B.hashCode() + this.Z.hashCode();
   }

   public String B(String var1) {
      return var1 + "." + this.u();
   }

   public static boolean Z(String var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         for (int ix = 0; ix < var0.length(); ix++) {
            if (!y(var0.charAt(ix))) {
               return false;
            }
         }

         return true;
      }
   }

   public String i() {
      return this.B.equals("minecraft") ? this.Z : this.u();
   }

   private static String i(String var0, String var1) {
      if (!z(var0)) {
         throw new class00719("Non [a-z0-9_.-] character in namespace of location: " + var0 + ":" + var1);
      } else {
         return var0;
      }
   }

   public class01894 i(String var1) {
      return new class01894(this.B, R(this.B, var1));
   }

   public static boolean z(String var0) {
      for (int ix = 0; ix < var0.length(); ix++) {
         if (!L(var0.charAt(ix))) {
            return false;
         }
      }

      return true;
   }

   private static class01894 u(String var0, String var1) {
      return new class01894(i(var0, var1), R(var0, var1));
   }

   public String u() {
      return this.B + "." + this.Z;
   }

   public static DataResult<class01894> u(String var0) {
      try {
         return DataResult.success(N(var0));
      } catch (class00719 class00719) {
         return DataResult.error(() -> "Not a valid resource location: " + var0 + " " + class00719.getMessage());
      }
   }

   public static boolean y(char var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '/' || var0 == '.';
   }

   public String y() {
      return this.B;
   }

   public static class01894 y(StringReader var0) throws CommandSyntaxException {
      int ix = var0.getCursor();
      String s = L(var0);
      if (s.isEmpty()) {
         throw L.createWithContext(var0);
      } else {
         try {
            return N(s);
         } catch (class00719 class00719) {
            var0.setCursor(ix);
            throw L.createWithContext(var0);
         }
      }
   }

   @Nullable
   public static class01894 y(String var0, String var1) {
      return z(var0) && Z(var1) ? new class01894(var0, var1) : null;
   }

   @Nullable
   public static class01894 y(String var0, char var1) {
      int ix = var0.indexOf(var1);
      if (ix >= 0) {
         String s = var0.substring(ix + 1);
         if (!Z(s)) {
            return null;
         } else if (ix != 0) {
            String s1 = var0.substring(0, ix);
            return z(s1) ? new class01894(s1, s) : null;
         } else {
            return new class01894("minecraft", s);
         }
      } else {
         return Z(var0) ? new class01894("minecraft", var0) : null;
      }
   }

   public static class01894 y(String var0) {
      return new class01894("minecraft", R("minecraft", var0));
   }

   private static void N(String var0, CallbackInfoReturnable var1) {
      if (var0.equals("DUMMY")) {
         var1.setReturnValue(false);
      }
   }

   private static void N(char var0, CallbackInfoReturnable var1) {
      if (var0 >= 'A' && var0 <= 'Z') {
         var1.setReturnValue(true);
      }
   }

   public static class01894 N(String var0, char var1) {
      int ix = var0.indexOf(var1);
      if (ix >= 0) {
         String s = var0.substring(ix + 1);
         return ix != 0 ? u(var0.substring(0, ix), s) : y(s);
      } else {
         return y(var0);
      }
   }

   public String N() {
      return this.Z;
   }

   public int compareTo(class01894 var1) {
      int ix = this.Z.compareTo(var1.Z);
      if (ix == 0) {
         ix = this.B.compareTo(var1.B);
      }

      return ix;
   }

   public class01894 N(UnaryOperator<String> var1) {
      return this.i(var1.apply(this.Z));
   }

   public static boolean N(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'a' && var0 <= 'z' || var0 == '_' || var0 == ':' || var0 == '/' || var0 == '.' || var0 == '-';
   }

   public static class01894 N(StringReader var0) throws CommandSyntaxException {
      int ix = var0.getCursor();
      String s = L(var0);

      try {
         return N(s);
      } catch (class00719 class00719) {
         var0.setCursor(ix);
         throw L.createWithContext(var0);
      }
   }

   public static class01894 N(String var0, String var1) {
      return u(var0, var1);
   }

   public static class01894 N(String var0) {
      return N(var0, ':');
   }

   private static String R(String var0, String var1) {
      if (!Z(var1)) {
         throw new class00719("Non [a-z0-9/._-] character in path of location: " + var0 + ":" + var1);
      } else {
         return var1;
      }
   }

   public class01894 R(String var1) {
      return this.i(var1 + this.Z);
   }

   public String R() {
      return this.B.equals("minecraft") ? this.Z : this.toString();
   }
}
