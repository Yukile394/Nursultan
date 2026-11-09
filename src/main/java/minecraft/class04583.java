package minecraft;

import org.jspecify.annotations.Nullable;

public class class04583 {
   @Nullable
   private static byte[] N;

   public class04583() {
      super();
   }

   public static void y() {
      if (N != null) {
         N = null;

         try {
            System.gc();
            System.gc();
            System.gc();
         } catch (Throwable throwable) {
         }
      }
   }

   public static void N() {
      N = new byte[10485760];
   }
}
