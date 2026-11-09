package minecraft;

import java.util.Locale;

public enum class04701 {
   field_20200,
   field_20201,
   field_20202,
   field_20203;

   private static final int field_32055 = 1024;

   private class04701() {
   }

   public static String y(long var0) {
      short short1 = 1024;
      if (var0 < 1024L) {
         return var0 + " B";
      } else {
         int i = (int)(Math.log(var0) / Math.log(1024.0));
         String s = "KMGTPE".charAt(i - 1) + "";
         return String.format(Locale.ROOT, "%.1f %sB", var0 / Math.pow(1024.0, i), s);
      }
   }

   public static String y(long var0, class04701 var2) {
      return String.format(Locale.ROOT, "%." + (var2 == field_20203 ? "1" : "0") + "f %s", N(var0, var2), var2.name());
   }

   public static double N(long var0, class04701 var2) {
      return var2 == field_20200 ? var0 : var0 / Math.pow(1024.0, var2.ordinal());
   }

   public static class04701 N(long var0) {
      if (var0 < 1024L) {
         return field_20200;
      } else {
         try {
            int i = (int)(Math.log(var0) / Math.log(1024.0));
            return valueOf("KMGTPE".charAt(i - 1) + "B");
         } catch (Exception exception) {
            return field_20203;
         }
      }
   }
}
