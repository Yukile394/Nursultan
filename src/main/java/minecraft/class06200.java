package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.slf4j.Logger;

public class class06200 {
   private static final Logger N = LogUtils.getLogger();

   public class06200() {
      super();
   }

   public static void N(Collection<String> var0, class07701 var1) {
      var1.W().N(var0).exceptionally(var1x -> {
         N.warn("Failed to execute reload", var1x);
         var1.y(class00392.L("commands.reload.failure"));
         return null;
      });
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("reload").requires(class07686.N(class07686.u))).executes(var0x -> {
         class07701 class07701 = (class07701)var0x.getSource();
         class02796 class02796 = class07701.W();
         class01623 class01623 = class02796.yy();
         class05081 class05081 = class02796.yn();
         Collection<String> collection = class01623.i();
         Collection<String> collection1 = N(class01623, class05081, collection);
         class07701.N(() -> class00392.L("commands.reload.success"), true);
         N(collection1, class07701);
         return 0;
      }));
   }

   private static Collection<String> N(class01623 var0, class05081 var1, Collection<String> var2) {
      var0.N();
      ArrayList arraylist = Lists.newArrayList(var2);
      List<String> list = var1.Q().N().y();

      for (String s : var0.L()) {
         if (!list.contains(s) && !arraylist.contains(s)) {
            arraylist.add(s);
         }
      }

      return arraylist;
   }
}
