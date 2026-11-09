package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import org.jspecify.annotations.Nullable;

class class01679 implements class07263<class03461> {
   class01679() {
      super();
   }

   @Override
   public ArgumentBuilder<class03461, ?> N(ArgumentBuilder<class03461, ?> var1, boolean var2, boolean var3) {
      if (var2) {
         var1.executes(var0 -> 0);
      }

      if (var3) {
         var1.requires(class07686.N(class01683.y));
      }

      return var1;
   }

   @Override
   public ArgumentBuilder<class03461, ?> N(String var1, ArgumentType<?> var2, @Nullable class01894 var3) {
      RequiredArgumentBuilder requiredargumentbuilder = RequiredArgumentBuilder.argument(var1, var2);
      if (var3 != null) {
         requiredargumentbuilder.suggests(class06791.N(var3));
      }

      return requiredargumentbuilder;
   }

   @Override
   public ArgumentBuilder<class03461, ?> N(String var1) {
      return LiteralArgumentBuilder.literal(var1);
   }
}
