package minecraft;

import com.mojang.serialization.Codec;

public class class03541 {
   public class03541() {
      super();
   }

   public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> var0, boolean var1) {
      return class03521.N(var0, class03539.N(var0), var1);
   }

   public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> var0) {
      return N(var0, false);
   }

   public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> var0, Codec<E> var1, boolean var2) {
      return class03521.N(var0, class01281.N(var0, var1), var2);
   }

   public static <E> Codec<class03543<E>> N(class05946<? extends class00751<E>> var0, Codec<E> var1) {
      return N(var0, var1, false);
   }
}
