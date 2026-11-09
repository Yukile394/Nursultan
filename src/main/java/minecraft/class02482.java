package minecraft;

import Nursultan.class09709;
import com.mojang.serialization.Codec;

public class class02482 {
   public static final class02487<class02476> N = N("damage", class02476.N);
   public static final class02487<class02490> y = N("enchantments", class02490.N);
   public static final class02487<class02468> L = N("stored_enchantments", class02468.N);
   public static final class02487<class02469> u = N("potion_contents", class02469.N);
   public static final class02487<class02483> i = N("custom_data", class02483.N);
   public static final class02487<class02902> R = N("container", class02902.N);
   public static final class02487<class02913> M = N("bundle_contents", class02913.N);
   public static final class02487<class02926> B = N("firework_explosion", class02926.N);
   public static final class02487<class02921> Z = N("fireworks", class02921.N);
   public static final class02487<class02939> z = N("writable_book_content", class02939.N);
   public static final class02487<class02945> U = N("written_book_content", class02945.N);
   public static final class02487<class02935> E = N("attribute_modifiers", class02935.N);
   public static final class02487<class02923> W = N("trim", class02923.N);
   public static final class02487<class02208> m = N("jukebox_playable", class02208.N);

   public class02482() {
      super();
   }

   private static <T extends class02500> class02487<T> N(String var0, Codec<T> var1) {
      return class00751.N(class04206.Ns, var0, new class09709<>(var1));
   }

   public static class02487<?> N(class00751<class02487<?>> var0) {
      return N;
   }
}
