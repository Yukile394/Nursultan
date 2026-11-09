package minecraft;

import Nursultan.class09118;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class00097 {
   private static final Map<MapCodec<? extends class09037>, class09118<?>> N = new HashMap<>();

   public class00097() {
      super();
   }

   private static <T extends class09037> void N(MapCodec<T> var0, class09118<? super T> var1) {
      N.put(var0, var1);
   }

   public static void N() {
      N(class09031.N, class00113::new);
      N(class09024.B, class00113::new);
      N(class09040.N, class00123::new);
      N(class09007.N, class00118::new);
      N(class09001.N, class00135::new);
   }

   @Nullable
   public static <T extends class09037> class00134<T> N(T var0, @Nullable class05096 var1, class08781 var2) {
      class09118<?> class09118 = N.get(var0.N());
      return (class00134<T>)(class09118 != null ? ((class09118<class09037>)class09118).create(var1, var0, var2) : null);
   }
}
