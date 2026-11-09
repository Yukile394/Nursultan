package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public interface class08524<T extends Exception> {
   T create(String var1, int var2);

   static class08524<CommandSyntaxException> N(DynamicCommandExceptionType var0, String var1) {
      return (var2, var3) -> var0.createWithContext(class02179.N(var2, var3), var1);
   }

   static class08524<CommandSyntaxException> N(SimpleCommandExceptionType var0) {
      return (var1, var2) -> var0.createWithContext(class02179.N(var1, var2));
   }
}
