package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class class03583 extends class03940<class07830> {
   private static final Codec<class07830> N = class05033.N(class03583::y, var0 -> var0.toLowerCase(Locale.ROOT));

   private class03583() {
      super(N, class03583::y);
   }

   private static class07830[] y() {
      return Arrays.stream(class07830.values()).filter(class07830::L).toArray(class07830[]::new);
   }

   @Override
   protected String N(String var1) {
      return var1.toLowerCase(Locale.ROOT);
   }

   public static class03583 N() {
      return new class03583();
   }

   public static class07830 N(CommandContext<class07701> var0, String var1) {
      return (class07830)var0.getArgument(var1, class07830.class);
   }
}
