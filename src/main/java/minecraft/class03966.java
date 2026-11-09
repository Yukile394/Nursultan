package minecraft;

import com.mojang.brigadier.context.CommandContext;

public class class03966 extends class03940<class07111> {
   private class03966() {
      super(class07111.field_39311, class07111::values);
   }

   public static class03940<class07111> N() {
      return new class03966();
   }

   public static class07111 N(CommandContext<class07701> var0, String var1) {
      return (class07111)var0.getArgument(var1, class07111.class);
   }
}
