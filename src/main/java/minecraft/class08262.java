package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record class08262(String y, class06794 L) {
   public static final Codec<class08262> N = Codec.STRING.comapFlatMap(class08262::N, class08262::a);

   public class08262(String y, class06794 L) {
      this.y = y;
      this.L = L;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class08262 class08262 && this.y.equals(class08262.y);
   }

   @Override
   public String toString() {
      return this.y;
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   public class06794 y() {
      return this.L;
   }

   public String N() {
      return this.y;
   }

   public static DataResult<class08262> N(String var0) {
      try {
         class06790 class06790 = new class06790(new StringReader(var0), true);
         return DataResult.success(new class08262(var0, class06790.v()));
      } catch (CommandSyntaxException commandsyntaxexception) {
         return DataResult.error(() -> "Invalid selector component: " + var0 + ": " + commandsyntaxexception.getMessage());
      }
   }

   public String a() {
      return this.y;
   }
}
