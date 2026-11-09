package minecraft;

import java.util.Optional;

public interface class01229<T> {
   Optional<? extends T> get(class01894 var1, boolean var2);

   static <T> class01229<class03556<T>> N(class07099<T> var0) {
      return (var2, var3) -> ((class02055<T>)(var3 ? var0x : var0)).N(class05946.N(var0.i(), var2));
   }

   static <T> class01229<? extends class03556<T>> N(class00751<T> var0) {
      return (var1, var2) -> var0.L(var1);
   }
}
