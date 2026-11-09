package minecraft;

import com.mojang.brigadier.context.CommandContext;

public class class03935 extends class03940<class06993> {
   private class03935() {
      super(class06993.field_39313, class06993::values);
   }

   public static class03935 N() {
      return new class03935();
   }

   public static class06993 N(CommandContext<class07701> var0, String var1) {
      return (class06993)var0.getArgument(var1, class06993.class);
   }
}
