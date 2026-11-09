package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05866 {
   private static final Logger N = LogUtils.getLogger();
   private static final Map<class05851<?>, class05877<?, ?>> y = Maps.newHashMap();

   public class05866() {
      super();
   }

   static {
      N(class05851.field_18664, class06026::new);
      N(class05851.field_18665, class06026::new);
      N(class05851.field_17326, class06026::new);
      N(class05851.field_18666, class06026::new);
      N(class05851.field_18667, class06026::new);
      N(class05851.field_17327, class06026::new);
      N(class05851.field_17328, class01529::new);
      N(class05851.field_46790, class03133::new);
      N(class05851.field_17329, class05889::new);
      N(class05851.field_17330, class01454::new);
      N(class05851.field_17331, class05661::new);
      N(class05851.field_17332, class05907::new);
      N(class05851.field_17333, class05984::new);
      N(class05851.field_17334, class04946::new);
      N(class05851.field_17335, class06274::new);
      N(class05851.field_17336, class05254::new);
      N(class05851.field_17337, class04963::new);
      N(class05851.field_17338, class05876::new);
      N(class05851.field_17339, class05385::new);
      N(class05851.field_17340, class05417::new);
      N(class05851.field_17341, class01341::new);
      N(class05851.field_22484, class05419::new);
      N(class05851.field_17342, class06239::new);
      N(class05851.field_17343, class05870::new);
      N(class05851.field_17625, class06178::new);
   }

   public static <M extends class07482, U extends class05096 & class05868<M>> void N(class05851<? extends M> var0, class05877<M, U> var1) {
      if ((class05877)y.put(var0, var1) != null) {
         throw new IllegalStateException("Duplicate registration for " + class04206.T.y(var0));
      }
   }

   public static boolean N() {
      boolean flag = false;

      for (class05851<?> class05851 : class04206.T) {
         if (!y.containsKey(class05851)) {
            N.debug("Menu {} has no matching screen", class04206.T.y(class05851));
            flag = true;
         }
      }

      return flag;
   }

   public static <T extends class07482> void N(class05851<T> var0, class06202 var1, int var2, class00392 var3) {
      class05877 class05877 = N(var0);
      if (class05877 == null) {
         N.warn("Failed to create screen for menu type: {}", class04206.T.y(var0));
      } else {
         class05877.N(var3, var0, var1, var2);
      }
   }

   @Nullable
   public static <T extends class07482> class05877<T, ?> N(class05851<T> var0) {
      return (class05877<T, ?>)y.get(var0);
   }
}
